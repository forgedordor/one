package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eesh {
    public eerv a;
    public eerv b;
    public eerv c;
    public eerv d;
    public eeru e;
    public eeru f;
    public eeru g;
    public eeru h;
    public eerx i;
    public eerx j;
    public eerx k;
    public eerx l;

    public eesh() {
        this.a = new eesg();
        this.b = new eesg();
        this.c = new eesg();
        this.d = new eesg();
        this.e = new eerr(0.0f);
        this.f = new eerr(0.0f);
        this.g = new eerr(0.0f);
        this.h = new eerr(0.0f);
        this.i = new eerx();
        this.j = new eerx();
        this.k = new eerx();
        this.l = new eerx();
    }

    private static void l(eerv eervVar) {
        if (eervVar instanceof eesg) {
            float f = ((eesg) eervVar).a;
        } else if (eervVar instanceof eerw) {
            float f2 = ((eerw) eervVar).a;
        }
    }

    public final void a(eerv eervVar) {
        this.d = eervVar;
        l(eervVar);
    }

    public final void b(float f) {
        this.h = new eerr(f);
    }

    public final void c(eerv eervVar) {
        this.c = eervVar;
        l(eervVar);
    }

    public final void d(float f) {
        this.g = new eerr(f);
    }

    public final void e(eerv eervVar) {
        this.a = eervVar;
        l(eervVar);
    }

    public final void f(float f) {
        this.e = new eerr(f);
    }

    public final void g(eerv eervVar) {
        this.b = eervVar;
        l(eervVar);
    }

    public final void h(float f) {
        this.f = new eerr(f);
    }

    public final void i(float f) {
        f(f);
        h(f);
        d(f);
        b(f);
    }

    public final void j(float f) {
        e(eesd.a(0));
        f(f);
    }

    public final void k(float f) {
        g(eesd.a(0));
        h(f);
    }

    public eesh(eesj eesjVar) {
        this.a = new eesg();
        this.b = new eesg();
        this.c = new eesg();
        this.d = new eesg();
        this.e = new eerr(0.0f);
        this.f = new eerr(0.0f);
        this.g = new eerr(0.0f);
        this.h = new eerr(0.0f);
        this.i = new eerx();
        this.j = new eerx();
        this.k = new eerx();
        this.l = new eerx();
        this.a = eesjVar.b;
        this.b = eesjVar.c;
        this.c = eesjVar.d;
        this.d = eesjVar.e;
        this.e = eesjVar.f;
        this.f = eesjVar.g;
        this.g = eesjVar.h;
        this.h = eesjVar.i;
        this.i = eesjVar.j;
        this.j = eesjVar.k;
        this.k = eesjVar.l;
        this.l = eesjVar.m;
    }
}
