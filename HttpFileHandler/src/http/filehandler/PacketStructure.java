package http.filehandler;

public class PacketStructure {

	public  int sentPackets = 0;
	public int receivedPackets = 0;
	
	@Override
	public boolean equals(Object obj) {
		if (obj== null) return false;
		if (obj == this) return true;
		if (!(obj instanceof PacketStructure))return false;
		PacketStructure instance = (PacketStructure)obj;
		if (instance.sentPackets == this.sentPackets && instance.receivedPackets == this.receivedPackets) {
			return true;
		}
		return false;
	}

	
}