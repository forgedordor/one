package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqlo extends cqlq {
    private final ezol a;
    private final epnq b;
    private final bajj c;

    public cqlo(ezol ezolVar, epnq epnqVar, bajj bajjVar) {
        if (ezolVar == null) {
            throw new NullPointerException("Null desktopId");
        }
        this.a = ezolVar;
        this.b = epnqVar;
        this.c = bajjVar;
    }

    @Override // defpackage.cqlq
    public final bajj a() {
        return this.c;
    }

    @Override // defpackage.cqlq
    public final epnq b() {
        return this.b;
    }

    @Override // defpackage.cqlq
    public final ezol c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        epnq epnqVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqlq) {
            cqlq cqlqVar = (cqlq) obj;
            if (this.a.equals(cqlqVar.c()) && ((epnqVar = this.b) != null ? epnqVar.equals(cqlqVar.b()) : cqlqVar.b() == null) && this.c.equals(cqlqVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        epnq epnqVar = this.b;
        return (((iHashCode * 1000003) ^ (epnqVar == null ? 0 : epnqVar.hashCode())) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        bajj bajjVar = this.c;
        epnq epnqVar = this.b;
        return "DittoPairingResult{desktopId=" + this.a.toString() + ", pairingData=" + String.valueOf(epnqVar) + ", encryptionKeys=" + bajjVar.toString() + "}";
    }
}
