package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amvt extends fcyz implements fdat {
    int a;
    final /* synthetic */ ajlk b;
    final /* synthetic */ amsv c;
    final /* synthetic */ amvu d;
    final /* synthetic */ boolean e;
    final /* synthetic */ long f;
    final /* synthetic */ boolean g;
    final /* synthetic */ String h;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amvt(fcxy fcxyVar, ajlk ajlkVar, amsv amsvVar, amvu amvuVar, boolean z, long j, boolean z2, String str) {
        super(2, fcxyVar);
        this.b = ajlkVar;
        this.c = amsvVar;
        this.d = amvuVar;
        this.e = z;
        this.f = j;
        this.g = z2;
        this.h = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amvt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Optional optionalO;
        alqm alqmVar;
        Optional optionalE;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ajlk ajlkVar = this.b;
        aoer aoerVarH = ajlkVar.h();
        aubq aubqVar = null;
        if (aoerVarH != null && (optionalO = aoerVarH.o()) != null && (alqmVar = (alqm) optionalO.orElse(null)) != null && (optionalE = alqmVar.e()) != null) {
            aubqVar = (aubq) optionalE.orElse(null);
        }
        amsv amsvVar = this.c;
        String strB = amsvVar.b();
        strB.getClass();
        aubx aubxVarC = auby.c(strB);
        ((eksl) amvu.a.h()).D("Original content type: %s. Resolved content type: %s", amsvVar.b(), aubxVarC);
        amvu amvuVar = this.d;
        athi athiVar = (athi) athj.a.createBuilder();
        athiVar.getClass();
        String string = amsvVar.e().toString();
        string.getClass();
        athiVar.copyOnWrite();
        athj athjVar = (athj) athiVar.instance;
        athjVar.b |= 1;
        athjVar.c = string;
        athiVar.copyOnWrite();
        athj athjVar2 = (athj) athiVar.instance;
        athjVar2.d = aubxVarC;
        athjVar2.b |= 2;
        boolean z = this.e;
        athiVar.copyOnWrite();
        athj athjVar3 = (athj) athiVar.instance;
        athjVar3.b |= 8;
        athjVar3.f = z;
        long j = this.f;
        athiVar.copyOnWrite();
        athj athjVar4 = (athj) athiVar.instance;
        athjVar4.b |= 4;
        athjVar4.e = j;
        if (aubqVar != null) {
            athiVar.copyOnWrite();
            athj athjVar5 = (athj) athiVar.instance;
            athjVar5.g = aubqVar;
            athjVar5.b |= 16;
        }
        atgt atgtVar = amvuVar.c;
        boolean z2 = this.g;
        athiVar.copyOnWrite();
        athj athjVar6 = (athj) athiVar.instance;
        athjVar6.b |= 32;
        athjVar6.h = z2;
        String str = this.h;
        str.getClass();
        athiVar.copyOnWrite();
        athj athjVar7 = (athj) athiVar.instance;
        athjVar7.b |= 64;
        athjVar7.i = str;
        cbqz cbqzVar = cbqz.a;
        long jA = cbqy.a(ajlkVar.j());
        athiVar.copyOnWrite();
        athj athjVar8 = (athj) athiVar.instance;
        athjVar8.b |= 128;
        athjVar8.j = jA;
        boolean z3 = ajlkVar.c() == ajlj.GROUP;
        athiVar.copyOnWrite();
        athj athjVar9 = (athj) athiVar.instance;
        athjVar9.b |= 256;
        athjVar9.k = z3;
        evsn evsnVarBuild = athiVar.build();
        evsnVarBuild.getClass();
        this.a = 1;
        Object objE = ((atgs) atgtVar).c.e((athj) evsnVarBuild, this);
        return objE == fcylVar ? fcylVar : objE;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        amvt amvtVar = new amvt(fcxyVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        amvtVar.i = obj;
        return amvtVar;
    }
}
