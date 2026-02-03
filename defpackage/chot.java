package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chot {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    private final fcsu f;

    public chot(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        fcsuVar.getClass();
        this.f = fcsuVar;
        fcsuVar2.getClass();
        this.a = fcsuVar2;
        fcsuVar3.getClass();
        this.b = fcsuVar3;
        fcsuVar4.getClass();
        this.c = fcsuVar4;
        fcsuVar5.getClass();
        this.d = fcsuVar5;
        fcsuVar6.getClass();
        this.e = fcsuVar6;
    }

    public final chos a(final chpk chpkVar) {
        evvp evvpVar;
        chpkVar.getClass();
        cqsx cqsxVar = (cqsx) this.b.b();
        cqsxVar.getClass();
        fcyh fcyhVar = (fcyh) this.c.b();
        fcyhVar.getClass();
        Long l = (Long) this.d.b();
        l.getClass();
        long jLongValue = l.longValue();
        Long l2 = (Long) this.e.b();
        l2.getClass();
        long jLongValue2 = l2.longValue();
        chpe chpeVar = chpkVar.c;
        if (chpeVar == null) {
            chpeVar = chpe.a;
        }
        chpeVar.getClass();
        chpb chpbVarA = chpa.a(chpeVar);
        chph chphVar = chpkVar.d;
        if (chphVar == null) {
            chphVar = chph.a;
        }
        chphVar.getClass();
        chpc chpcVarB = chpa.b(chphVar);
        if ((chpkVar.b & 1024) != 0) {
            evvpVar = chpkVar.j;
            if (evvpVar == null) {
                evvpVar = evvp.a;
            }
        } else {
            evvpVar = null;
        }
        Instant instantD = evvpVar != null ? evxd.d(evvpVar) : null;
        fcsu fcsuVar = this.a;
        final fcsu fcsuVar2 = this.f;
        return new chos(chpbVarA, chpcVarB, instantD, chpkVar.h, !chpkVar.i, fctd.a(new fdae() { // from class: choo
            @Override // defpackage.fdae
            public final Object invoke() {
                chpk chpkVar2 = chpkVar;
                chpo chpoVar = chpkVar2.f;
                if (chpoVar == null) {
                    chpoVar = chpo.a;
                }
                fcsu fcsuVar3 = fcsuVar2;
                if (chpoVar.e) {
                    alrj alrjVar = (alrj) fcsuVar3.b();
                    chpo chpoVar2 = chpkVar2.f;
                    if (chpoVar2 == null) {
                        chpoVar2 = chpo.a;
                    }
                    return alrjVar.p(chpoVar2.c);
                }
                alrj alrjVar2 = (alrj) fcsuVar3.b();
                chpo chpoVar3 = chpkVar2.f;
                if (chpoVar3 == null) {
                    chpoVar3 = chpo.a;
                }
                return alrjVar2.n(chpoVar3.c);
            }
        }), fcsuVar, cqsxVar, fcyhVar, jLongValue, jLongValue2);
    }
}
