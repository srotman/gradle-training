import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class Checksum2 extends DefaultTask {

	def String input;
	def File file;

	@TaskAction
	def checksum() {
		if (input) {
			println "$input: ${sha256 input.bytes}"
		}
		if (file && file.exists()) {
			println "$file.name: ${sha256 file.bytes}"
		}
	}

	def sha256(byte[] bytes) {
		def digest = java.security.MessageDigest.getInstance("SHA-256")
		digest.update( bytes )
		new BigInteger(1, digest.digest()).toString(16).padLeft(64, '0');
	}
}
