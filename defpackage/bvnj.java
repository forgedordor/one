package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvnj extends fcyz implements fdap {
    int a;
    final /* synthetic */ bvmw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvnj(bvmw bvmwVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = bvmwVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            bvmw bvmwVar = this.b;
            eieu eieuVarH = eiiy.h("GaiaDevicePairingManagerImpl#registerTachyon");
            try {
                ekrw ekrwVarH = bvmwVar.l.h();
                ekrwVarH.X(eksq.a, "BugleGDitto");
                ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl", "registerTachyon", 548, "GaiaDevicePairingManagerDelegateImpl.kt")).q("tachyonReceiver registerTachyon");
                eiju eijuVarC = auvw.c(bvmwVar.h, fcyi.a, fdjz.a, new bvnv(bvmwVar, null));
                fczl.a(eieuVarH, null);
                this.a = 1;
                if (fdxs.c(eijuVarC, this) == fcylVar) {
                    return fcylVar;
                }
            } finally {
            }
        }
        ekrw ekrwVarH2 = this.b.l.h();
        ekrwVarH2.X(eksq.a, "BugleGDitto");
        ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl$optInGaiaPairing$2", "invokeSuspend", 600, "GaiaDevicePairingManagerDelegateImpl.kt")).q("Tachyon has been registered for Gaia device pairing");
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new bvnj(this.b, (fcxy) obj).b(fctx.a);
    }
}
