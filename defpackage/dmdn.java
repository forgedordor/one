package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmdn extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ dmdo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmdn(dmdo dmdoVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = dmdoVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dmdn dmdnVar = new dmdn(this.c, (fcxy) obj3);
        dmdnVar.a = (dmck) obj;
        dmdnVar.b = (Duration) obj2;
        return dmdnVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        boolean z = obj2 instanceof dmcf;
        Object obj3 = this.b;
        if (z) {
            dmdo dmdoVar = this.c;
            return new dmgv(new dmde(dmdoVar), new dmdf(dmdoVar), new dmdg(dmdoVar), dmdoVar, new dmdh(dmdoVar), 16);
        }
        if (obj2 instanceof dmch) {
            dmdo dmdoVar2 = this.c;
            Duration duration = dmdoVar2.e.a;
            Duration durationMinus = duration != null ? duration.minus((Duration) obj3) : null;
            return new dmhc(new dmdi(dmdoVar2), new dmdj(dmdoVar2), new dmdk(dmdoVar2), dmdoVar2, new dmdl(dmdoVar2), durationMinus != null ? new Integer((int) durationMinus.getSeconds()) : null, 16);
        }
        if (obj2 instanceof dmci) {
            dmdo dmdoVar3 = this.c;
            return new dmhh(new dmdm(dmdoVar3), new dmcv(dmdoVar3), dmdoVar3, dmdoVar3.a().a(), new dmcw(dmdoVar3));
        }
        if (obj2 instanceof dmcg) {
            dmdo dmdoVar4 = this.c;
            return new dmgw(new dmcx(dmdoVar4), new dmcy(dmdoVar4), dmdoVar4, eoob.g(3), new dmcz(dmdoVar4), ((dmcg) obj2).a);
        }
        if (!(obj2 instanceof dmcj)) {
            throw new fctg();
        }
        dmdo dmdoVar5 = this.c;
        return new dmhc(new dmda(dmdoVar5), new dmdb(dmdoVar5), new dmdc(dmdoVar5), dmdoVar5, new dmdd(dmdoVar5), null, 16);
    }
}
