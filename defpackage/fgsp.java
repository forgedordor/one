package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgsp extends fgsu {
    final StringBuilder a = new StringBuilder();
    String b = null;
    final StringBuilder c = new StringBuilder();
    final StringBuilder d = new StringBuilder();
    boolean e = false;

    public fgsp() {
        this.h = 1;
    }

    @Override // defpackage.fgsu
    public final void a() {
        r(this.a);
        this.b = null;
        r(this.c);
        r(this.d);
        this.e = false;
    }

    final String b() {
        return this.a.toString();
    }

    public final String toString() {
        return "<!doctype " + b() + ">";
    }
}
