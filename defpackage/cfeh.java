package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfeh {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;

    public cfeh(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
        fcsuVar4.getClass();
        this.d = fcsuVar4;
    }

    public final cfef a(bvks bvksVar, epby epbyVar) {
        cfei cfeiVar = (cfei) this.c.b();
        cfeiVar.getClass();
        cdio cdioVar = (cdio) this.b.b();
        cdioVar.getClass();
        epbyVar.getClass();
        return new cfef(cfeiVar, cdioVar, bvksVar, epbyVar);
    }

    public final cfef b(cfyv cfyvVar, epby epbyVar) {
        bvks bvksVar;
        cfei cfeiVar = (cfei) this.d.b();
        cfeiVar.getClass();
        cdio cdioVar = (cdio) this.b.b();
        cdioVar.getClass();
        cfyvVar.getClass();
        epbyVar.getClass();
        int i = cfeg.i;
        ezol ezolVar = cfyvVar.c;
        if (ezolVar == null) {
            ezolVar = ezol.a;
        }
        if (ezolVar.d.equals("GDitto")) {
            ezol ezolVar2 = cfyvVar.l;
            if (ezolVar2 == null) {
                ezolVar2 = ezol.a;
            }
            ezol ezolVar3 = cfyvVar.c;
            if (ezolVar3 == null) {
                ezolVar3 = ezol.a;
            }
            bvksVar = new bvks(ezolVar2, ezolVar3.c, Optional.of(cfyvVar.m));
        } else {
            ezol ezolVar4 = cfyvVar.c;
            ezol ezolVar5 = ezolVar4 == null ? ezol.a : ezolVar4;
            if (ezolVar4 == null) {
                ezolVar4 = ezol.a;
            }
            bvksVar = new bvks(ezolVar5, ezolVar4.c, Optional.empty());
        }
        return new cfef(cfeiVar, cdioVar, bvksVar, epbyVar);
    }

    public final cfef c(ezol ezolVar, Optional optional, epby epbyVar) {
        cfei cfeiVar = (cfei) this.a.b();
        cfeiVar.getClass();
        cdio cdioVar = (cdio) this.b.b();
        cdioVar.getClass();
        ezolVar.getClass();
        epbyVar.getClass();
        return new cfef(cfeiVar, cdioVar, ezolVar, optional, epbyVar);
    }
}
