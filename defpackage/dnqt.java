package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnqt extends dnqu {
    public final String a;
    private final int b;

    public dnqt(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.dnqu
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dnqu
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnqt)) {
            return false;
        }
        dnqt dnqtVar = (dnqt) obj;
        return fdbq.f(this.a, dnqtVar.a) && this.b == dnqtVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "Header(description=" + this.a + ", categoryId=" + this.b + ")";
    }
}
