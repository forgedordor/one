package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bel extends bgi {
    private final int a;
    private final bbg b;

    public bel(int i, bbg bbgVar) {
        this.a = i;
        this.b = bbgVar;
    }

    @Override // defpackage.bgi
    public final int a() {
        return this.a;
    }

    @Override // defpackage.bgi
    public final bbg b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bgi) {
            bgi bgiVar = (bgi) obj;
            if (this.a == bgiVar.a() && this.b.equals(bgiVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "CaptureError{requestId=" + this.a + ", imageCaptureException=" + this.b + "}";
    }
}
