package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agkg extends fcyz implements fdat {
    int a;
    final /* synthetic */ agkh b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agkg(agkh agkhVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = agkhVar;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agkg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ajjs ajjsVar = (ajjs) this.b.b.b();
            this.a = 1;
            obj = ajjsVar.a(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        int i2 = this.c;
        elud eludVar = (elud) obj;
        elio elioVar = (elio) elip.a.createBuilder();
        elioVar.getClass();
        elqh elqhVar = (elqh) elqj.a.createBuilder();
        elqhVar.getClass();
        DesugarCollections.unmodifiableList(((elqj) elqhVar.instance).c).getClass();
        elqd elqdVar = (elqd) elqg.a.createBuilder();
        elqdVar.getClass();
        elqdVar.copyOnWrite();
        elqg elqgVar = (elqg) elqdVar.instance;
        elqgVar.c = 1;
        elqgVar.b |= 1;
        elqdVar.copyOnWrite();
        elqg elqgVar2 = (elqg) elqdVar.instance;
        elqgVar2.d = i2 - 1;
        elqgVar2.b |= 4;
        evsn evsnVarBuild = elqdVar.build();
        evsnVarBuild.getClass();
        elqhVar.copyOnWrite();
        elqj elqjVar = (elqj) elqhVar.instance;
        elqjVar.a();
        elqjVar.c.add((elqg) evsnVarBuild);
        evsn evsnVarBuild2 = elqhVar.build();
        evsnVarBuild2.getClass();
        elioVar.copyOnWrite();
        elip elipVar = (elip) elioVar.instance;
        elipVar.f = (elqj) evsnVarBuild2;
        elipVar.b |= 16;
        evsn evsnVarBuild3 = elioVar.build();
        evsnVarBuild3.getClass();
        eludVar.copyOnWrite();
        eluz eluzVar = (eluz) eludVar.instance;
        eluz eluzVar2 = eluz.a;
        eluzVar.p = (elip) evsnVarBuild3;
        eluzVar.b |= 32768;
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_USER_AND_DEVICE_INFO;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        eluz eluzVar3 = (eluz) eludVar.build();
        eluzVar3.getClass();
        ellhVar2.q = eluzVar3;
        ellhVar2.b |= 256;
        ((aimb) this.b.c.b()).a().j(ellgVar, aioj.LOG_SPEC_NOTIFICATION_EVENTS);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new agkg(this.b, this.c, fcxyVar);
    }
}
