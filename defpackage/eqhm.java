package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eqhm extends fcyz implements fdap {
    int a;
    final /* synthetic */ eqhr b;
    final /* synthetic */ String c;
    final /* synthetic */ eqeq d;
    final /* synthetic */ eqgt e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqhm(eqhr eqhrVar, String str, eqeq eqeqVar, eqgt eqgtVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = eqhrVar;
        this.c = str;
        this.d = eqeqVar;
        this.e = eqgtVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eqhr eqhrVar = this.b;
            String str = this.c;
            this.a = 1;
            obj = eqhrVar.l(str, null, this);
            if (obj != fcylVar) {
            }
        }
        if (i != 1) {
            return obj;
        }
        eqeq eqeqVar = this.d;
        ezpp ezppVar = (ezpp) obj;
        ezlu ezluVar = (ezlu) ezlv.a.createBuilder();
        ezluVar.getClass();
        ezppVar.getClass();
        ezluVar.copyOnWrite();
        ezlv ezlvVar = (ezlv) ezluVar.instance;
        ezlvVar.c = ezppVar;
        ezlvVar.b |= 1;
        ezluVar.copyOnWrite();
        ezlv ezlvVar2 = (ezlv) ezluVar.instance;
        ezlvVar2.e = eqeqVar.c;
        ezlvVar2.b |= 2;
        DesugarCollections.unmodifiableList(ezlvVar2.d).getClass();
        ezluVar.copyOnWrite();
        ezlv ezlvVar3 = (ezlv) ezluVar.instance;
        evtg evtgVar = ezlvVar3.d;
        if (!evtgVar.c()) {
            ezlvVar3.d = evsn.mutableCopy(evtgVar);
        }
        ezlvVar3.d.add(eqeqVar.a);
        evsn evsnVarBuild = ezluVar.build();
        evsnVarBuild.getClass();
        eqhr eqhrVar2 = this.b;
        eqhrVar2.a.a(eqgt.d(this.e, 11));
        this.a = 2;
        Object objE = eqhrVar2.c.a.b().e((ezlv) evsnVarBuild, new fbrg(), this);
        return objE == fcylVar ? fcylVar : objE;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new eqhm(this.b, this.c, this.d, this.e, (fcxy) obj).b(fctx.a);
    }
}
