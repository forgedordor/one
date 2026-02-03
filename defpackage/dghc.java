package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dghc extends fcyz implements fdat {
    final /* synthetic */ dghi a;
    final /* synthetic */ String b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dghc(fcxy fcxyVar, dghi dghiVar, String str) {
        super(2, fcxyVar);
        this.a = dghiVar;
        this.b = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dghc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        chza chzaVar = (chza) this.a.b.a();
        String str = this.b;
        enwr enwrVarV = chzaVar.v(new dggp(str));
        enwrVarV.getClass();
        ekrw ekrwVarH = dghi.a.h();
        ekrwVarH.X(eksq.a, "IdentityMappingPopulator");
        ((ekrd) ekrwVarH.h("com/google/android/ims/provisioning/api/identitymapping/IdentityMappingProducerImpl$getAvailabilityForSimId$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 110, "IdentityMappingProducerImpl.kt")).D("Availability: %s for sim id: %s", enwrVarV, dhiz.SIM_ID.c(str));
        return enwrVarV;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dghc dghcVar = new dghc(fcxyVar, this.a, this.b);
        dghcVar.c = obj;
        return dghcVar;
    }
}
