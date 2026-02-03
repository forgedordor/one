package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efim {
    final String a;
    public int b = 0;

    public efim(String str) {
        this.a = str;
    }

    public final char a() {
        ejwl.l(d());
        String str = this.a;
        str.getClass();
        return str.charAt(this.b);
    }

    public final String b(ejvf ejvfVar) {
        ejwl.l(d());
        int i = this.b;
        String strC = c(ejvfVar);
        ejwl.l(this.b != i);
        return strC;
    }

    public final String c(ejvf ejvfVar) {
        String str = this.a;
        str.getClass();
        int i = this.b;
        this.b = ejvfVar.f().e(str, i);
        return d() ? str.substring(i, this.b) : str.substring(i);
    }

    public final boolean d() {
        String str = this.a;
        str.getClass();
        int i = this.b;
        return i >= 0 && i < str.length();
    }

    public final void e(char c) {
        ejwl.l(d());
        ejwl.l(a() == c);
        this.b++;
    }
}
