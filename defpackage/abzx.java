package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abzx extends fcyz implements fdat {
    int a;
    final /* synthetic */ acaa b;
    final /* synthetic */ egbe c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abzx(acaa acaaVar, egbe egbeVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = acaaVar;
        this.c = egbeVar;
        this.d = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abzx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                acaa acaaVar = this.b;
                egbe egbeVar = this.c;
                String str = this.d;
                this.a = 1;
                obj = acaaVar.c(egbeVar, str, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            return (abzu) obj;
        } catch (Throwable th) {
            ekrw ekrwVarJ = acaa.a.j();
            ekrwVarJ.X(eksq.a, "BugleGaia");
            ((ekrd) ((ekrd) ekrwVarJ).g(th).h("com/google/android/apps/messaging/gaia/capability/GmsGaiaCapabilityRetriever$hasCapability$2$1", "invokeSuspend", 91, "GmsGaiaCapabilityRetriever.kt")).q("Retrieving capability failed");
            this.b.d(1);
            return abzu.FAILED;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new abzx(this.b, this.c, this.d, fcxyVar);
    }
}
