package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvoo extends fcyz implements fdat {
    int a;
    final /* synthetic */ bvoq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvoo(bvoq bvoqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bvoqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvoo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                bvoq bvoqVar = this.b;
                if (!((bvkr) bvoqVar.d.b()).q()) {
                    ekrw ekrwVarH = this.b.i.h();
                    ekrwVarH.X(eksq.a, "BugleGDitto");
                    ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerImpl$optOutGaiaPairingIfQrExists$1", "invokeSuspend", 205, "GaiaDevicePairingManagerImpl.kt")).q("No need to disable Gaia device pairing as no QR paired device");
                    return fctx.a;
                }
                ekrw ekrwVarH2 = bvoqVar.i.h();
                ekrwVarH2.X(eksq.a, "BugleGDitto");
                ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerImpl$optOutGaiaPairingIfQrExists$1", "invokeSuspend", 185, "GaiaDevicePairingManagerImpl.kt")).q("Start opting out Gaia device pairing as QR paired device exists");
                eiju eijuVarJ = bvoqVar.f.j(3);
                this.a = 1;
                obj = fdxs.c(eijuVarJ, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                bvoq bvoqVar2 = this.b;
                ((ains) bvoqVar2.g.b()).c("Bugle.Gaia.Pairing.Disabled.When.Switching.To.Qr.Success.Count");
                ekrw ekrwVarH3 = bvoqVar2.i.h();
                ekrwVarH3.X(eksq.a, "BugleGDitto");
                ((ekrd) ekrwVarH3.h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerImpl$optOutGaiaPairingIfQrExists$1", "invokeSuspend", 195, "GaiaDevicePairingManagerImpl.kt")).q("Successfully disabled Gaia device pairing");
            }
            return fctx.a;
        } catch (bvpp e) {
            this.b.j("Bugle.Gaia.Pairing.Disabled.When.Switching.To.Qr.Failure.Count", e);
            throw e;
        } catch (Throwable th) {
            this.b.k("Bugle.Gaia.Pairing.Disabled.When.Switching.To.Qr.Failure.Count", th);
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvoo(this.b, fcxyVar);
    }
}
