import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

class Checksum1 extends DefaultTask {

	@Input
	String input;

	@TaskAction
	def checksum() {
		println "$input: ${sha256 input.bytes}"
	}

	def sha256(byte[] bytes) {
		def digest = java.security.MessageDigest.getInstance("SHA-256")
		digest.update( bytes )
		new BigInteger(1, digest.digest()).toString(16).padLeft(64, '0');
	}
}
