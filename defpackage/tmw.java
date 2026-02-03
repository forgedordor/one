package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tmw extends fcyz implements fdat {
    int a;
    final /* synthetic */ tmx b;
    final /* synthetic */ epmp c;
    final /* synthetic */ long d;
    final /* synthetic */ evqs e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmw(tmx tmxVar, epmp epmpVar, long j, evqs evqsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = tmxVar;
        this.c = epmpVar;
        this.d = j;
        this.e = evqsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tmw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            tmx tmxVar = this.b;
            epmp epmpVar = this.c;
            tnq tnqVar = (tnq) tmxVar.b.get(epmr.a((epmpVar.b == 11 ? (epms) epmpVar.c : epms.a).b));
            if (tnqVar == null) {
                ekrw ekrwVarJ = tmx.a.j();
                ekrwVarJ.X(eksq.a, "BugleAlphaverse");
                ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/cloudstore/cmsrpc/DeviceOnboardingDelegate$handleCmsRpcPayload$1", "invokeSuspend", 43, "DeviceOnboardingDelegate.kt")).t("No DeviceOnboardingPayloadDelegate registered for payloadCase: %s", epmr.a((epmpVar.b == 11 ? (epms) epmpVar.c : epms.a).b));
                return Optional.empty();
            }
            String str = epmpVar.d;
            str.getClass();
            long j = this.d;
            evqs evqsVar = this.e;
            epms epmsVar = epmpVar.b == 11 ? (epms) epmpVar.c : epms.a;
            epmsVar.getClass();
            eiju eijuVarA = tnqVar.a(str, j, evqsVar, epmsVar);
            this.a = 1;
            obj = fdxs.c(eijuVarA, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            return Optional.empty();
        }
        epmp epmpVar2 = this.c;
        epmn epmnVar = (epmn) epmp.a.createBuilder();
        epmnVar.getClass();
        String str2 = epmpVar2.d;
        str2.getClass();
        epmnVar.copyOnWrite();
        ((epmp) epmnVar.instance).d = str2;
        epms epmsVar2 = (epms) optional.get();
        epmnVar.copyOnWrite();
        epmp epmpVar3 = (epmp) epmnVar.instance;
        epmpVar3.c = epmsVar2;
        epmpVar3.b = 11;
        evsn evsnVarBuild = epmnVar.build();
        evsnVarBuild.getClass();
        return Optional.of((epmp) evsnVarBuild);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new tmw(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
