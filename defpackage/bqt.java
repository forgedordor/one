package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqt extends bqz {
    private final String a;
    private final bkn b;

    public bqt(String str, bkn bknVar) {
        this.a = str;
        this.b = bknVar;
    }

    @Override // defpackage.bqz
    public final bkn a() {
        return this.b;
    }

    @Override // defpackage.bqz
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqz) {
            bqz bqzVar = (bqz) obj;
            if (this.a.equals(bqzVar.b()) && this.b.equals(bqzVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "CameraId{cameraIdString=" + this.a + ", cameraConfigId=" + this.b + "}";
    }
}
