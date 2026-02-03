package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgug extends fcyz implements fdat {
    int a;
    final /* synthetic */ cgum b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgug(cgum cgumVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cgumVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgug) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cgum cgumVar = this.b;
            cguf cgufVar = new cguf(null);
            this.a = 1;
            if (cgumVar.d.a(cgufVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        ekrw ekrwVarH = cgum.a.h();
        ekrwVarH.X(eksq.a, "BugleGemini");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/penpal/settings/PenpalSettingsDataServiceImpl$setHasCreatedPenpalChat$1", "invokeSuspend", 78, "PenpalSettingsDataServiceImpl.kt")).q("User created Penpal chat");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cgug(this.b, fcxyVar);
    }
}
