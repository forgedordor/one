package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxez extends fcyz implements fdat {
    int a;
    final /* synthetic */ baiy b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxez(baiy baiyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = baiyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bxez) c((fdos) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdos fdosVar = (fdos) this.c;
            final baiy baiyVar = this.b;
            baiyVar.c = new bxey(fdosVar);
            baiyVar.fY("createVCardContentUiData");
            fdae fdaeVar = new fdae() { // from class: bxex
                @Override // defpackage.fdae
                public final Object invoke() {
                    ((ekrd) bxfa.a.e().h("com/google/android/apps/messaging/shared/datamodel/media/VCardCallbackFlow$get$1", "invokeSuspend$lambda$0", 36, "VCardCallbackFlow.kt")).q("Unbinding listener to vcard");
                    baiyVar.g("createVCardContentUiData");
                    return fctx.a;
                }
            };
            this.a = 1;
            if (fdor.b(fdosVar, fdaeVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bxez bxezVar = new bxez(this.b, fcxyVar);
        bxezVar.c = obj;
        return bxezVar;
    }
}
