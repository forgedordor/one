package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddat extends ddav {
    public final String a;
    public final int b;
    public final String c;

    public ddat(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    @Override // defpackage.ddav
    public final int a() {
        return this.b;
    }

    @Override // defpackage.ddav
    public final String b() {
        return this.c;
    }

    @Override // defpackage.ddav
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ddav) {
            ddav ddavVar = (ddav) obj;
            if (this.a.equals(ddavVar.c()) && this.b == ddavVar.a() && this.c.equals(ddavVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "UdevsSpec{hostName=" + this.a + ", hostPort=" + this.b + ", apiKey=" + this.c + "}";
    }
}
