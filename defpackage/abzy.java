package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abzy extends fcyz implements fdat {
    int a;
    final /* synthetic */ egbe b;
    final /* synthetic */ acaa c;
    final /* synthetic */ String d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abzy(fcxy fcxyVar, egbe egbeVar, acaa acaaVar, String str) {
        super(2, fcxyVar);
        this.b = egbeVar;
        this.c = acaaVar;
        this.d = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abzy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        egbe egbeVar = this.b;
        String str = egbeVar.b().k;
        int iHashCode = str.hashCode();
        if (iHashCode != -1425037495) {
            if (iHashCode == -1240244679 && str.equals("google")) {
                acaa acaaVar = this.c;
                efwo efwoVarA = egbeVar.a();
                String str2 = this.d;
                this.a = 1;
                Object objA = fdin.a(eicg.a(acaaVar.b), new abzz(null, acaaVar, efwoVarA, str2), this);
                return objA == fcylVar ? fcylVar : objA;
            }
        } else if (str.equals("pseudonymous")) {
            ekrw ekrwVarH = acaa.a.h();
            ekrwVarH.X(eksq.a, "BugleGaia");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/gaia/capability/GmsGaiaCapabilityRetriever$hasCapabilityInternal$$inlined$withLegacyPropagatingContext$2", "invokeSuspend", 136, "GmsGaiaCapabilityRetriever.kt")).q("Skipped retrieving capability. Pseudonymous account.");
            return abzu.SKIPPED_PSEUDONYMOUS_ACCOUNT;
        }
        this.c.d(9);
        ekrw ekrwVarJ = acaa.a.j();
        ekrwVarJ.X(eksq.a, "BugleGaia");
        ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/gaia/capability/GmsGaiaCapabilityRetriever$hasCapabilityInternal$$inlined$withLegacyPropagatingContext$2", "invokeSuspend", 143, "GmsGaiaCapabilityRetriever.kt")).t("Failed retrieving capability. Unknown account type: %s", egbeVar.b().k);
        return abzu.FAILED;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        abzy abzyVar = new abzy(fcxyVar, this.b, this.c, this.d);
        abzyVar.e = obj;
        return abzyVar;
    }
}
