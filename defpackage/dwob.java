package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwob extends dwrg {
    public dwjr a;
    private String b;
    private ejwi c;
    private ejwi d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private byte i;

    public dwob() {
        ejud ejudVar = ejud.a;
        this.c = ejudVar;
        this.d = ejudVar;
    }

    @Override // defpackage.dwrg
    public final dwrh a() {
        String str;
        dwjr dwjrVar;
        if (this.i == 15 && (str = this.b) != null && (dwjrVar = this.a) != null) {
            return new dwoc(str, this.c, this.d, dwjrVar, this.e, this.f, this.g, this.h);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" text");
        }
        if (this.a == null) {
            sb.append(" action");
        }
        if ((this.i & 1) == 0) {
            sb.append(" textColor");
        }
        if ((this.i & 2) == 0) {
            sb.append(" backgroundColor");
        }
        if ((this.i & 4) == 0) {
            sb.append(" borderColor");
        }
        if ((this.i & 8) == 0) {
            sb.append(" enabled");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwrg
    public final void b(String str) {
        this.c = ejwi.j(str);
    }

    @Override // defpackage.dwrg
    public final void c(int i) {
        this.f = i;
        this.i = (byte) (this.i | 2);
    }

    @Override // defpackage.dwrg
    public final void d(int i) {
        this.g = i;
        this.i = (byte) (this.i | 4);
    }

    @Override // defpackage.dwrg
    public final void e(boolean z) {
        this.h = z;
        this.i = (byte) (this.i | 8);
    }

    @Override // defpackage.dwrg
    public final void f(dwqf dwqfVar) {
        this.d = ejwi.j(dwqfVar);
    }

    @Override // defpackage.dwrg
    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null text");
        }
        this.b = str;
    }

    @Override // defpackage.dwrg
    public final void h(int i) {
        this.e = i;
        this.i = (byte) (this.i | 1);
    }
}
