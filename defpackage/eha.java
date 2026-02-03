package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eha implements ehc {
    private final String a;
    private final hox b;

    public eha(efk efkVar, String str) {
        this.a = str;
        this.b = new hpl(efkVar, hsi.a);
    }

    @Override // defpackage.ehc
    public final int a(kio kioVar) {
        return e().d;
    }

    @Override // defpackage.ehc
    public final int b(kio kioVar, kji kjiVar) {
        return e().a;
    }

    @Override // defpackage.ehc
    public final int c(kio kioVar, kji kjiVar) {
        return e().c;
    }

    @Override // defpackage.ehc
    public final int d(kio kioVar) {
        return e().b;
    }

    public final efk e() {
        return (efk) this.b.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eha) {
            return fdbq.f(e(), ((eha) obj).e());
        }
        return false;
    }

    public final void f(efk efkVar) {
        this.b.b(efkVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a + "(left=" + e().a + ", top=" + e().b + ", right=" + e().c + ", bottom=" + e().d + ')';
    }
}
