package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvmg extends fcyz implements fdat {
    int a;
    final /* synthetic */ bvmh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvmg(bvmh bvmhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bvmhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvmg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        try {
        } catch (bvpp e) {
            ekrw ekrwVarJ = bvmh.a.j();
            ekrwVarJ.X(eksq.a, "BugleGDitto");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/DisableGaiaDevicePairingOnNonPrimarySynclet$sync$1", "invokeSuspend", 67, "DisableGaiaDevicePairingOnNonPrimarySynclet.kt")).q("Error while opting out Gaia device pairing in the Synclet execution");
            fcsu fcsuVar = this.b.d;
            ((ains) fcsuVar.b()).e("Bugle.Gaia.Pairing.Disabled.Count", 2);
            ains ainsVar = (ains) fcsuVar.b();
            int i2 = e.b;
            if (i2 == 0) {
                throw null;
            }
            ainsVar.e("Bugle.Gaia.Pairing.Disabled.From.Synclet.Failure.Count", i2 - 1);
        } catch (Throwable th) {
            ekrw ekrwVarJ2 = bvmh.a.j();
            ekrwVarJ2.X(eksq.a, "BugleGDitto");
            ((ekrd) ((ekrd) ekrwVarJ2).g(th).h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/DisableGaiaDevicePairingOnNonPrimarySynclet$sync$1", "invokeSuspend", 84, "DisableGaiaDevicePairingOnNonPrimarySynclet.kt")).q("Error while opting out Gaia device pairing in the Synclet execution");
            fcsu fcsuVar2 = this.b.d;
            ((ains) fcsuVar2.b()).e("Bugle.Gaia.Pairing.Disabled.Count", 2);
            ((ains) fcsuVar2.b()).e("Bugle.Gaia.Pairing.Disabled.From.Synclet.Failure.Count", 0);
        }
        if (i == 0) {
            fctl.b(obj);
            bvmh bvmhVar = this.b;
            this.a = 1;
            obj = bvmhVar.b(this);
            if (obj != fcylVar) {
            }
            return fcylVar;
        }
        if (i != 1) {
            fctl.b(obj);
            ((ains) this.b.d.b()).c("Bugle.Gaia.Pairing.Disabled.From.Synclet.Success.Count");
            return fctx.a;
        }
        fctl.b(obj);
        String str = (String) obj;
        if (str == null) {
            ekrw ekrwVarH = bvmh.a.h();
            ekrwVarH.X(eksq.a, "BugleGDitto");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/DisableGaiaDevicePairingOnNonPrimarySynclet$sync$1", "invokeSuspend", 99, "DisableGaiaDevicePairingOnNonPrimarySynclet.kt")).t("%s: No new primary device found. No action taken.", bvmh.b);
            return fctx.a;
        }
        ekrw ekrwVarH2 = bvmh.a.h();
        ekrwVarH2.X(eksq.a, "BugleGDitto");
        ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/DisableGaiaDevicePairingOnNonPrimarySynclet$sync$1", "invokeSuspend", 48, "DisableGaiaDevicePairingOnNonPrimarySynclet.kt")).t("%s: Found a new primary device. Opting out of Gaia device pairing on this device.", bvmh.b);
        bvmv bvmvVar = (bvmv) this.b.c.b();
        this.a = 2;
        if (bvmvVar.k(6, str, true, this) == fcylVar) {
            return fcylVar;
        }
        ((ains) this.b.d.b()).c("Bugle.Gaia.Pairing.Disabled.From.Synclet.Success.Count");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvmg(this.b, fcxyVar);
    }
}
