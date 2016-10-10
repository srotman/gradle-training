import org.gradle.api.DefaultTask
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.tasks.TaskAction

class Checksum3 extends DefaultTask {

	def String input;

	def File checksumFile;
	def List<File> files = [];

	def file(File file) {
		files << file
	}

	@TaskAction
	def checksum() {
		if (input) {
			println "$input: ${sha256 input.bytes}"
		}
		if (files) {
			//Ensure checkusm file exists and is empty
			checksumFile.createNewFile();
			checksumFile.write ''
			// Append to checksumFile
			files.findAll( { it.exists() } ).each {
				checksumFile.append("$it.name: ${sha256 it.bytes}\n");
			} 
		}
	}

	def sha256(byte[] bytes) {
		def digest = java.security.MessageDigest.getInstance("SHA-256")
		digest.update( bytes )
		new BigInteger(1, digest.digest()).toString(16).padLeft(64, '0');
	}
}
