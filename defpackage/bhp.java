package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhp extends bmv {
    public final bmu a;
    private final long c;
    private final int d;

    public bhp(int i, bmu bmuVar, long j) {
        this.d = i;
        if (bmuVar == null) {
            throw new NullPointerException("Null configSize");
        }
        this.a = bmuVar;
        this.c = j;
    }

    @Override // defpackage.bmv
    public final long a() {
        return this.c;
    }

    @Override // defpackage.bmv
    public final bmu b() {
        return this.a;
    }

    @Override // defpackage.bmv
    public final int c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bmv) {
            bmv bmvVar = (bmv) obj;
            if (this.d == bmvVar.c() && this.a.equals(bmvVar.b()) && this.c == bmvVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.d ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ ((int) this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceConfig{configType=");
        int i = this.d;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "RAW" : "JPEG_R" : "JPEG" : "YUV" : "PRIV"));
        sb.append(", configSize=");
        sb.append(this.a);
        sb.append(", streamUseCase=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
