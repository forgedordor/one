package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tnl extends fcyz implements fdat {
    int a;
    final /* synthetic */ tnp b;
    final /* synthetic */ epms c;
    final /* synthetic */ String d;
    final /* synthetic */ long e;
    final /* synthetic */ evqs f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tnl(tnp tnpVar, epms epmsVar, String str, long j, evqs evqsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = tnpVar;
        this.c = epmsVar;
        this.d = str;
        this.e = j;
        this.f = evqsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tnl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ekrw ekrwVarE = tnp.a.e();
        ekrwVarE.X(eksq.a, "BugleAlphaverse");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/cloudstore/cmsrpc/deviceonboarding/CreatePairingDelegate$handleDeviceOnboardingPayload$1", "invokeSuspend", 78, "CreatePairingDelegate.kt")).q("Processing deviceOnboardingMessage");
        tnp tnpVar = this.b;
        epms epmsVar = this.c;
        String str = this.d;
        long j = this.e;
        evqs evqsVar = this.f;
        this.a = 1;
        Object objK = tnpVar.k(epmsVar, str, j, evqsVar, this);
        return objK == fcylVar ? fcylVar : objK;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new tnl(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
