package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwok extends dwsd {
    private int a;
    private String b;
    private ejwi c = ejud.a;
    private dwjr d;
    private String e;
    private byte f;

    @Override // defpackage.dwsd
    public final dwse a() {
        if (this.f == 1 && this.b != null && this.d != null && this.e != null) {
            return new dwol(this.a, this.b, this.c, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == 0) {
            sb.append(" id");
        }
        if (this.b == null) {
            sb.append(" text");
        }
        if (this.d == null) {
            sb.append(" action");
        }
        if (this.e == null) {
            sb.append(" secondaryText");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwsd
    public final void b(dwjr dwjrVar) {
        if (dwjrVar == null) {
            throw new NullPointerException("Null action");
        }
        this.d = dwjrVar;
    }

    @Override // defpackage.dwsd
    public final void c(int i) {
        this.a = i;
        this.f = (byte) 1;
    }

    @Override // defpackage.dwsd
    public final void d(dwqf dwqfVar) {
        this.c = ejwi.j(dwqfVar);
    }

    @Override // defpackage.dwsd
    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null secondaryText");
        }
        this.e = str;
    }

    @Override // defpackage.dwsd
    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null text");
        }
        this.b = str;
    }
}
