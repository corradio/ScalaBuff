// Generated by ScalaBuff, the Scala Protocol Buffers compiler. DO NOT EDIT!
// source: multi_one.proto

package resources.generated

final case class MutiMessageOne (

) extends com.google.protobuf.GeneratedMessageLite
	with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[MutiMessageOne]
	with net.sandrogrzicic.scalabuff.Parser[MutiMessageOne] {



	def writeTo(output: com.google.protobuf.CodedOutputStream) {
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var __size = 0

		__size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): MutiMessageOne = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}

		def __newMerged = MutiMessageOne(

		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: MutiMessageOne) = {
		MutiMessageOne(

		)
	}

	def getDefaultInstanceForType = MutiMessageOne.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
	override def getParserForType = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
	def toJson(indent: Int = 0): String = "ScalaBuff JSON generation not enabled. Use --generate_json_method to enable."
}

object MutiMessageOne {
	@beans.BeanProperty val defaultInstance = new MutiMessageOne()

	def parseFrom(data: Array[Byte]): MutiMessageOne = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): MutiMessageOne = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf.ByteString): MutiMessageOne = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): MutiMessageOne = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[MutiMessageOne] = defaultInstance.mergeDelimitedFromStream(stream)


	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: MutiMessageOne) = defaultInstance.mergeFrom(prototype)

}

object MultiOne {
	def registerAllExtensions(registry: com.google.protobuf.ExtensionRegistryLite) {
	}

}
