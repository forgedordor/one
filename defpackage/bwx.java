package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bwx extends bzj {
    private final int e;
    private final bdn f;
    private final int g;

    public bwx(int i, int i2, bdn bdnVar) {
        this.e = i;
        this.g = i2;
        this.f = bdnVar;
    }

    @Override // defpackage.bzj
    public final int a() {
        return this.e;
    }

    @Override // defpackage.bzj
    public final bdn b() {
        return this.f;
    }

    @Override // defpackage.bzj
    public final int c() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        bdn bdnVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bzj) {
            bzj bzjVar = (bzj) obj;
            if (this.e == bzjVar.a() && this.g == bzjVar.c() && ((bdnVar = this.f) != null ? bdnVar.equals(bzjVar.b()) : bzjVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        bdn bdnVar = this.f;
        return (bdnVar == null ? 0 : bdnVar.hashCode()) ^ ((((this.e ^ 1000003) * 1000003) ^ this.g) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamInfo{id=");
        sb.append(this.e);
        sb.append(", streamState=");
        sb.append((Object) (this.g != 1 ? "INACTIVE" : "ACTIVE"));
        sb.append(", inProgressTransformationInfo=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
}
