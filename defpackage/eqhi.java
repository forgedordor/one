package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eqhi extends fcyz implements fdap {
    int a;
    final /* synthetic */ eqhr b;
    final /* synthetic */ String c;
    final /* synthetic */ ezol d;
    final /* synthetic */ eqgk e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqhi(eqhr eqhrVar, String str, ezol ezolVar, int i, eqgk eqgkVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = eqhrVar;
        this.c = str;
        this.d = ezolVar;
        this.f = i;
        this.e = eqgkVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        int i;
        fcyl fcylVar = fcyl.a;
        int i2 = this.a;
        fctl.b(obj);
        if (i2 == 0) {
            eqhr eqhrVar = this.b;
            String str = this.c;
            this.a = 1;
            obj = eqhrVar.l(str, null, this);
            if (obj != fcylVar) {
            }
        }
        if (i2 != 1) {
            return obj;
        }
        ezol ezolVar = this.d;
        int i3 = this.f;
        ezpp ezppVar = (ezpp) obj;
        ezka ezkaVar = (ezka) ezkb.a.createBuilder();
        ezkaVar.getClass();
        ezppVar.getClass();
        ezkaVar.copyOnWrite();
        ezkb ezkbVar = (ezkb) ezkaVar.instance;
        ezkbVar.c = ezppVar;
        ezkbVar.b |= 1;
        DesugarCollections.unmodifiableList(ezkbVar.d).getClass();
        ezolVar.getClass();
        ezkaVar.copyOnWrite();
        ezkb ezkbVar2 = (ezkb) ezkaVar.instance;
        evtg evtgVar = ezkbVar2.d;
        if (!evtgVar.c()) {
            ezkbVar2.d = evsn.mutableCopy(evtgVar);
        }
        ezkbVar2.d.add(ezolVar);
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        if (i4 == 0) {
            i = 5;
        } else {
            if (i4 != 1) {
                throw new fctg();
            }
            i = 10;
        }
        ezkaVar.copyOnWrite();
        ((ezkb) ezkaVar.instance).e = i;
        evsn evsnVarBuild = ezkaVar.build();
        evsnVarBuild.getClass();
        eqhr eqhrVar2 = this.b;
        eqhrVar2.a.a(this.e.b());
        this.a = 2;
        Object objC = eqhrVar2.c.a.b().c((ezkb) evsnVarBuild, new fbrg(), this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new eqhi(this.b, this.c, this.d, this.f, this.e, (fcxy) obj).b(fctx.a);
    }
}
