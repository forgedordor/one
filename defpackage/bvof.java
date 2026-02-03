package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvof extends fcyz implements fdap {
    Object a;
    int b;
    final /* synthetic */ bvmw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvof(bvmw bvmwVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.c = bvmwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ?? r0;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            r0 = this.a;
            try {
                fctl.b(obj);
                r0 = r0;
            } catch (Throwable th) {
                th = th;
                try {
                    throw th;
                } catch (Throwable th2) {
                    fczl.a(r0, th);
                    throw th2;
                }
            }
        } else {
            fctl.b(obj);
            bvmw bvmwVar = this.c;
            eieu eieuVarH = eiiy.h("GaiaDevicePairingManagerImpl#unregisterTachyon");
            try {
                ekrw ekrwVarH = bvmwVar.l.h();
                ekrwVarH.X(eksq.a, "BugleGDitto");
                ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl$unregisterTachyon$2", "invokeSuspend", 573, "GaiaDevicePairingManagerDelegateImpl.kt")).q("tachyonReceiver stopBind");
                ((cfze) bvmwVar.f.b()).e();
                eiju eijuVarR = ((ceff) bvmwVar.g.b()).r();
                this.a = eieuVarH;
                this.b = 1;
                obj = fdxs.c(eijuVarR, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
                r0 = eieuVarH;
            } catch (Throwable th3) {
                th = th3;
                r0 = eieuVarH;
                throw th;
            }
        }
        fczl.a(r0, null);
        ekrw ekrwVarH2 = this.c.l.h();
        ekrwVarH2.X(eksq.a, "BugleGDitto");
        ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl$unregisterTachyon$2", "invokeSuspend", 577, "GaiaDevicePairingManagerDelegateImpl.kt")).q("Tachyon has been unregistered for Gaia device pairing");
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new bvof(this.c, (fcxy) obj).b(fctx.a);
    }
}
