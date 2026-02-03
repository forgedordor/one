package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnq extends icr implements jbr, jbp, jfy, jew {
    public fdap a;
    public fdap b;
    public dot i;
    public View j;
    public kio k;
    public fdoa n;
    public dou o;
    private hsf p;
    private kjg q;
    public float c = Float.NaN;
    public boolean d = true;
    public long e = 9205357640488583168L;
    public float f = Float.NaN;
    public float g = Float.NaN;
    public boolean h = true;
    public final hox l = new hpl(null, hpb.a);
    public long m = 9205357640488583168L;

    public dnq(fdap fdapVar, fdap fdapVar2, dot dotVar) {
        this.a = fdapVar;
        this.b = fdapVar2;
        this.i = dotVar;
    }

    private final long e() {
        if (this.p == null) {
            fdae fdaeVar = new fdae() { // from class: dnn
                @Override // defpackage.fdae
                public final Object invoke() {
                    ivy ivyVar = (ivy) this.a.l.a();
                    return new ihs(ivyVar != null ? ivz.a(ivyVar) : 9205357640488583168L);
                }
            };
            hxn hxnVar = hrp.a;
            this.p = new hnt(fdaeVar, null);
        }
        hsf hsfVar = this.p;
        if (hsfVar != null) {
            return ((ihs) hsfVar.a()).a;
        }
        return 9205357640488583168L;
    }

    private final void g() {
        kio kioVar;
        dou douVar = this.o;
        if (douVar == null || (kioVar = this.k) == null || kjg.d(douVar.a(), this.q)) {
            return;
        }
        fdap fdapVar = this.b;
        if (fdapVar != null) {
            fdapVar.invoke(new kiw(kioVar.eq(kjh.d(douVar.a()))));
        }
        this.q = new kjg(douVar.a());
    }

    public final void a() {
        dou douVar = this.o;
        if (douVar != null) {
            douVar.b();
        }
        View viewA = this.j;
        if (viewA == null) {
            viewA = jbh.a(this);
        }
        View view = viewA;
        this.j = view;
        kio kioVarG = this.k;
        if (kioVarG == null) {
            kioVarG = jbg.g(this);
        }
        kio kioVar = kioVarG;
        this.k = kioVar;
        this.o = this.i.b(view, this.d, this.e, this.f, this.g, this.h, kioVar, this.c);
        g();
    }

    public final void b() {
        kio kioVarG = this.k;
        if (kioVarG == null) {
            kioVarG = jbg.g(this);
            this.k = kioVarG;
        }
        long j = ((ihs) this.a.invoke(kioVarG)).a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & e()) == 9205357640488583168L) {
            this.m = 9205357640488583168L;
            dou douVar = this.o;
            if (douVar != null) {
                douVar.b();
                return;
            }
            return;
        }
        this.m = ihs.e(e(), j);
        if (this.o == null) {
            a();
        }
        dou douVar2 = this.o;
        if (douVar2 != null) {
            douVar2.c(this.m, this.c);
        }
        g();
    }

    @Override // defpackage.jfy
    public final /* synthetic */ boolean dP() {
        return false;
    }

    @Override // defpackage.jfy
    public final void dQ(jto jtoVar) {
        jtoVar.e(dnr.a, new fdae() { // from class: dnm
            @Override // defpackage.fdae
            public final Object invoke() {
                return new ihs(this.a.m);
            }
        });
    }

    @Override // defpackage.jbr
    public final void dR(ivy ivyVar) {
        this.l.b(ivyVar);
    }

    @Override // defpackage.icr
    public final void dU() {
        n();
        this.n = fdod.a(0, 0, 7);
        fdil.d(E(), null, fdjz.d, new dnp(this, null), 1);
    }

    @Override // defpackage.jew
    public final void n() {
        jex.a(this, new fdae() { // from class: dnl
            @Override // defpackage.fdae
            public final Object invoke() {
                this.a.b();
                return fctx.a;
            }
        });
    }

    @Override // defpackage.jbp
    public final void r(imw imwVar) {
        imwVar.p();
        fdoa fdoaVar = this.n;
        if (fdoaVar != null) {
            fdoaVar.b(fctx.a);
        }
    }

    @Override // defpackage.icr
    public final void s() {
        dou douVar = this.o;
        if (douVar != null) {
            douVar.b();
        }
        this.o = null;
    }

    @Override // defpackage.jfy
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // defpackage.jbp
    public final /* synthetic */ void t() {
    }
}
