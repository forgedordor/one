package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctku implements ctjx {
    public final ctmq a;
    public final Optional b;
    public final cudy c;
    public final ctuu d;
    public final fcsu e;
    public final fcsu f;
    public final asgz g;
    public final ctma h;
    public final ardr i;
    public final fdpl j;
    public final fdvc k;
    public final fdvc l;
    public final ctnu m;
    private final fdjx n;
    private final ctrc o;
    private final ctnn p;
    private final cton q;
    private final fcsu r;
    private final fcsu s;
    private final fduf t;
    private final fdpl u;
    private final fctc v;
    private final fctc w;
    private final ctoy x;
    private final ctxx y;

    public ctku(fdjx fdjxVar, ctrc ctrcVar, ctnu ctnuVar, ctmq ctmqVar, Optional optional, ctnn ctnnVar, ctxx ctxxVar, cudy cudyVar, ctoy ctoyVar, cton ctonVar, ctuu ctuuVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, asgz asgzVar, ctma ctmaVar, ardr ardrVar) {
        fdjxVar.getClass();
        ctrcVar.getClass();
        ctmqVar.getClass();
        ctnnVar.getClass();
        ctxxVar.getClass();
        cudyVar.getClass();
        ctoyVar.getClass();
        ctonVar.getClass();
        ctuuVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        ctmaVar.getClass();
        ardrVar.getClass();
        this.n = fdjxVar;
        this.o = ctrcVar;
        this.m = ctnuVar;
        this.a = ctmqVar;
        this.b = optional;
        this.p = ctnnVar;
        this.y = ctxxVar;
        this.c = cudyVar;
        this.x = ctoyVar;
        this.q = ctonVar;
        this.d = ctuuVar;
        this.r = fcsuVar;
        this.e = fcsuVar2;
        this.s = fcsuVar3;
        this.f = fcsuVar4;
        this.g = asgzVar;
        this.h = ctmaVar;
        this.i = ardrVar;
        fduf fdufVarA = fdvf.a(false);
        this.t = fdufVarA;
        fdpl fdplVarA = ardrVar.a() ? ctmaVar.a() : new auxs(new fdae() { // from class: ctjz
            @Override // defpackage.fdae
            public final Object invoke() {
                return fcvp.a;
            }
        });
        this.u = fdplVarA;
        Object objE = ctif.e.e();
        objE.getClass();
        int iIntValue = ((Number) objE).intValue();
        Object objE2 = ctif.d.e();
        objE2.getClass();
        int iIntValue2 = ((Number) objE2).intValue();
        Object objE3 = ctif.f.e();
        objE3.getClass();
        this.j = fdud.b(ooy.a(new ouu(new ouv(iIntValue, ((Number) objE3).intValue(), false, iIntValue2, 0, 0, 52), new fdae() { // from class: ctka
            @Override // defpackage.fdae
            public final Object invoke() {
                ctku ctkuVar = this.a;
                return ctkuVar.i.a() ? ctkuVar.m.a(new ctkf(ctkuVar.h)) : ctkuVar.m.a(new fdap() { // from class: ctns
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ((List) obj).getClass();
                        return fctx.a;
                    }
                });
            }
        }).a, fdjxVar), cudyVar.a(), fdplVarA, fdufVarA, new ctkh(this, null));
        this.v = fctd.a(new fdae() { // from class: ctkb
            @Override // defpackage.fdae
            public final Object invoke() {
                ctku ctkuVar = this.a;
                return ((aquo) ctkuVar.f.b()).a() ? ctkuVar.l : ctkuVar.k;
            }
        });
        this.k = fdtg.b(new ctkt(cudyVar.a(), this), fdjxVar, fdur.a(0L, 3), new ctlz(null, 7));
        this.l = fdtg.b(new fdua(cudyVar.a(), ((ctpr) fcsuVar3.b()).a(), new ctki(this, null)), fdjxVar, fdur.a(0L, 3), new ctlz(null, 7));
        this.w = fctd.a(new fdae() { // from class: ctkc
            @Override // defpackage.fdae
            public final Object invoke() {
                ctku ctkuVar = this.a;
                return new ctju(((asdu) ctkuVar.e.b()).a(), ctkuVar.g.a(), true);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ctnw, java.lang.Object] */
    private final fdpl g() {
        Optional optional = this.b;
        optional.isPresent();
        if (!((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue()) {
            return fdvf.a(null);
        }
        if (!((aquo) this.f.b()).a()) {
            return optional.get().a();
        }
        fdvc fdvcVarA = ((ctpr) this.s.b()).a();
        ctkq ctkqVar = new ctkq(null, this);
        int i = fdsn.a;
        return fdtg.b(new fdwg(ctkqVar, fdvcVarA), this.n, fdur.a(0L, 3), null);
    }

    private final fdvc h() {
        return (fdvc) this.v.a();
    }

    @Override // defpackage.ctjx
    public final ctjv a() {
        return new ctjv(this.o.a(), this.j, this.p.a, h(), this.q.a(), g(), ((cual) this.r.b()).a(), new ctkj(this), new ctkk(this), new ctkl(this.d), c());
    }

    @Override // defpackage.ctjx
    public final fdpl b() {
        return fdqq.a(avac.d(auyk.b(this.o.a(), "favorites"), auyk.b(this.p.a, "header-index"), auyk.b(h(), "create-group"), auyk.b(this.q.a(), "chatbot-directory"), auyk.a(fdqq.a(g()), "penpal"), auyk.b(((cual) this.r.b()).a(), "group-suggestions"), this.n, new ctkp(this, null)));
    }

    public final ctju c() {
        return (ctju) this.w.a();
    }

    public final void d(boolean z, boolean z2) {
        ctxx ctxxVar = this.y;
        ctxxVar.b.g(ajfo.x, null, null, dzua.SUCCESS);
        ctxxVar.d.c(ajfo.w, 0);
        ctxxVar.c.e(cqjd.h, null);
        ctxx.a.p("contact list is interactive");
        ctuu ctuuVar = this.d;
        int i = ctuuVar.f;
        ufx ufxVar = ctuuVar.b;
        ufxVar.c(5, i);
        if (z) {
            ufxVar.c(6, i);
        }
        ctuuVar.f(z2);
        ctuuVar.e = ctuuVar.c.b(176570, null);
    }

    public final void e(boolean z) {
        ctoy ctoyVar = this.x;
        if (z) {
            ((dzpl) ctoyVar.a.b()).f(cqjd.i);
        } else {
            ((dzpl) ctoyVar.a.b()).k(cqjd.i, null);
        }
        if (this.i.a() && z) {
            this.t.f(true);
            this.h.e();
        }
    }

    public final ctlz f(cudx cudxVar) {
        cueh cuehVar = cudxVar.d;
        return cuehVar.ordinal() != 0 ? new ctlz(cuehVar, 6) : new ctlz(cuehVar, new fdae() { // from class: ctkd
            @Override // defpackage.fdae
            public final Object invoke() {
                ctuu ctuuVar = this.a.d;
                ctuuVar.b.c(2, ctuuVar.f);
                return fctx.a;
            }
        }, new fdae() { // from class: ctke
            @Override // defpackage.fdae
            public final Object invoke() {
                ctku ctkuVar = this.a;
                ctkuVar.c.d(cueh.b);
                ctuu ctuuVar = ctkuVar.d;
                ufx.d(ctuuVar.b, 3, 0, ctuuVar.f, 0, false, 58);
                return fctx.a;
            }
        });
    }
}
