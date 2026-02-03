package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwhn extends dwhp {
    public ejwi a;
    private int b;
    private ejwi c;
    private ejwi d;
    private ejwi e;
    private ejwi f;
    private ejwi g;
    private ejwi h;
    private ejwi i;
    private ejwi j;
    private ejwi k;
    private ekgb l;
    private final ejwi m;
    private ejwi n;
    private ejwi o;
    private ejwi p;
    private ejwi q;
    private byte r;

    public dwhn() {
        ejud ejudVar = ejud.a;
        this.c = ejudVar;
        this.d = ejudVar;
        this.e = ejudVar;
        this.f = ejudVar;
        this.g = ejudVar;
        this.h = ejudVar;
        this.i = ejudVar;
        this.j = ejudVar;
        this.k = ejudVar;
        this.a = ejudVar;
        this.m = ejudVar;
        this.n = ejudVar;
        this.o = ejudVar;
        this.p = ejudVar;
        this.q = ejudVar;
    }

    @Override // defpackage.dwhp
    public final dwhq a() {
        ekgb ekgbVar;
        if (this.r == 1 && (ekgbVar = this.l) != null) {
            return new dwho(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.a, ekgbVar, this.m, this.n, this.o, this.p, this.q);
        }
        StringBuilder sb = new StringBuilder();
        if (this.r == 0) {
            sb.append(" eventType");
        }
        if (this.l == null) {
            sb.append(" experimentIds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwhp
    public final void b(dwig dwigVar) {
        this.q = ejwi.j(dwigVar);
    }

    @Override // defpackage.dwhp
    public final void c(dwpk dwpkVar) {
        this.f = ejwi.j(dwpkVar);
    }

    @Override // defpackage.dwhp
    public final void d(dwpx dwpxVar) {
        this.g = ejwi.j(dwpxVar);
    }

    @Override // defpackage.dwhp
    public final void e(long j) {
        this.o = ejwi.j(Long.valueOf(j));
    }

    @Override // defpackage.dwhp
    public final void f(int i) {
        this.i = ejwi.j(Integer.valueOf(i));
    }

    @Override // defpackage.dwhp
    public final void g(int i) {
        this.b = i;
        this.r = (byte) 1;
    }

    @Override // defpackage.dwhp
    public final void h(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null experimentIds");
        }
        this.l = ekgbVar;
    }

    @Override // defpackage.dwhp
    public final void i(dwik dwikVar) {
        this.p = ejwi.j(dwikVar);
    }

    @Override // defpackage.dwhp
    public final void j(int i) {
        this.h = ejwi.j(Integer.valueOf(i));
    }

    @Override // defpackage.dwhp
    public final void k(int i) {
        this.n = ejwi.j(Integer.valueOf(i));
    }

    @Override // defpackage.dwhp
    public final void l(int i) {
        this.k = ejwi.j(Integer.valueOf(i));
    }

    @Override // defpackage.dwhp
    public final void m(Integer num) {
        this.j = ejwi.j(num);
    }

    @Override // defpackage.dwhp
    public final void n(dwpk dwpkVar) {
        this.c = ejwi.j(dwpkVar);
    }

    @Override // defpackage.dwhp
    public final void o(String str) {
        this.d = ejwi.j(str);
    }

    @Override // defpackage.dwhp
    public final void p(String str) {
        this.e = ejwi.j(str);
    }
}
