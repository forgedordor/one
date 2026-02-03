package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
class fgst extends fgsu {
    protected String a;
    protected String b;
    public String d;
    fgrh g;
    private String j;
    public final StringBuilder c = new StringBuilder();
    public boolean e = false;
    private final StringBuilder i = new StringBuilder();
    private boolean k = false;
    private boolean l = false;
    boolean f = false;

    private final void b() {
        this.k = true;
        String str = this.j;
        if (str != null) {
            this.i.append(str);
            this.j = null;
        }
    }

    @Override // defpackage.fgsu
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a() {
        this.a = null;
        this.b = null;
        r(this.c);
        this.d = null;
        this.e = false;
        r(this.i);
        this.j = null;
        this.l = false;
        this.k = false;
        this.f = false;
        this.g = null;
    }

    final String d() {
        String str = this.a;
        boolean z = true;
        if (str != null && str.length() != 0) {
            z = false;
        }
        fgqz.b(z);
        return this.a;
    }

    final String e() {
        String str = this.a;
        return str != null ? str : "[unset]";
    }

    final void f(char c) {
        l();
        this.c.append(c);
    }

    final void g(char c) {
        b();
        this.i.append(c);
    }

    final void h(String str) {
        b();
        StringBuilder sb = this.i;
        if (sb.length() == 0) {
            this.j = str;
        } else {
            sb.append(str);
        }
    }

    final void i(int[] iArr) {
        b();
        for (int i : iArr) {
            this.i.appendCodePoint(i);
        }
    }

    final void j(char c) {
        k(String.valueOf(c));
    }

    final void k(String str) {
        String strReplace = str.replace((char) 0, (char) 65533);
        String str2 = this.a;
        if (str2 != null) {
            strReplace = str2.concat(strReplace);
        }
        this.a = strReplace;
        this.b = fgsj.a(strReplace);
    }

    public final void l() {
        this.e = true;
        String str = this.d;
        if (str != null) {
            this.c.append(str);
            this.d = null;
        }
    }

    final void m() {
        String string;
        if (this.g == null) {
            this.g = new fgrh();
        }
        if (this.e && this.g.a < 512) {
            StringBuilder sb = this.c;
            String strTrim = (sb.length() > 0 ? sb.toString() : this.d).trim();
            if (strTrim.length() > 0) {
                if (this.k) {
                    StringBuilder sb2 = this.i;
                    string = sb2.length() > 0 ? sb2.toString() : this.j;
                } else {
                    string = this.l ? "" : null;
                }
                this.g.i(strTrim, string);
            }
        }
        r(this.c);
        this.d = null;
        this.e = false;
        r(this.i);
        this.j = null;
        this.k = false;
        this.l = false;
    }

    final void n() {
        this.l = true;
    }

    final boolean o(String str) {
        fgrh fgrhVar = this.g;
        return fgrhVar != null && fgrhVar.l(str);
    }

    final boolean p() {
        return this.g != null;
    }

    final void q(String str) {
        this.a = str;
        this.b = fgsj.a(str);
    }
}
