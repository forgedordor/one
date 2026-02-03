package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acce extends fcyz implements fdat {
    int a;
    final /* synthetic */ accf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acce(accf accfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = accfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((acce) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarG = ((bvll) this.b.d.b()).g();
            this.a = 1;
            obj = fdxs.c(eijuVarG, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            accf accfVar = this.b;
            if (!((cdio) accfVar.c.b()).a()) {
                ekrw ekrwVarJ = accf.a.j();
                ekrwVarJ.X(eksq.a, "BugleGDitto");
                ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/gaia/listener/DittoBugleGaiaPairingFlagChangeListener$logTelemetryIfGaiaPairingEnabledWhenFlagsDisabled$unused$1", "invokeSuspend", 88, "DittoBugleGaiaPairingFlagChangeListener.kt")).q("enable_gaia_pairing_ui disabled, but gaia device pairing enabled");
                ((ains) accfVar.e.b()).c("Bugle.Gaia.Pairing.Enabled.When.Gaia.Pairing.Phenotype.Flag.Disabled.Count");
            }
            if (!((Boolean) accfVar.b.b()).booleanValue()) {
                ekrw ekrwVarJ2 = accf.a.j();
                ekrwVarJ2.X(eksq.a, "BugleGDitto");
                ((ekrd) ekrwVarJ2.h("com/google/android/apps/messaging/gaia/listener/DittoBugleGaiaPairingFlagChangeListener$logTelemetryIfGaiaPairingEnabledWhenFlagsDisabled$unused$1", "invokeSuspend", 98, "DittoBugleGaiaPairingFlagChangeListener.kt")).q("check_device_gaia_pairing_when_phenotype_flags_are_synced_enabled false, but gaia device pairing enabled");
                ((ains) accfVar.e.b()).c("Bugle.Gaia.Pairing.Enabled.When.Canary.Phenotype.Flag.Disabled.Count");
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new acce(this.b, fcxyVar);
    }
}
