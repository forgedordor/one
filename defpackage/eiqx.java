package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiqx extends eiqz {
    private final int a;
    private final int b;

    public eiqx(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.eiqz
    public final int a() {
        return this.b;
    }

    @Override // defpackage.eiqz
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eiqz) {
            eiqz eiqzVar = (eiqz) obj;
            if (this.a == eiqzVar.b() && this.b == eiqzVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return a.d(Integer.toString(this.b - 2), Integer.toString(this.a - 2), "RequestMetadata{requestType=", ", syncStatus=", "}");
    }
}
