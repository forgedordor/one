package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dko {
    public ijp a;
    public ijb b;
    public imu c;
    private ikd d;

    public dko() {
        this(null);
    }

    public final ikd a() {
        ikd ikdVar = this.d;
        if (ikdVar != null) {
            return ikdVar;
        }
        iik iikVar = new iik((byte[]) null);
        this.d = iikVar;
        return iikVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dko)) {
            return false;
        }
        dko dkoVar = (dko) obj;
        return fdbq.f(this.a, dkoVar.a) && fdbq.f(this.b, dkoVar.b) && fdbq.f(this.c, dkoVar.c) && fdbq.f(this.d, dkoVar.d);
    }

    public final int hashCode() {
        ijp ijpVar = this.a;
        int iHashCode = ijpVar == null ? 0 : ijpVar.hashCode();
        ijb ijbVar = this.b;
        int iHashCode2 = ijbVar == null ? 0 : ijbVar.hashCode();
        int i = iHashCode * 31;
        imu imuVar = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (imuVar == null ? 0 : imuVar.hashCode())) * 31;
        ikd ikdVar = this.d;
        return iHashCode3 + (ikdVar != null ? ikdVar.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }

    public /* synthetic */ dko(byte[] bArr) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
