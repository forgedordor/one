package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aylh extends fcyz implements fdat {
    int a;
    final /* synthetic */ ayll b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aylh(ayll ayllVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ayllVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aylh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ayll ayllVar = this.b;
            this.a = 1;
            if (ayllVar.b(this) == fcylVar) {
                return fcylVar;
            }
        }
        ekrw ekrwVarG = ayll.a.g();
        ekrwVarG.X(eksq.a, "Bugle");
        ((ekrd) ekrwVarG.h("com/google/android/apps/messaging/shared/datamodel/action/WaitForRcsServiceConnectionAsyncAction$execute$2$1", "invokeSuspend", 47, "WaitForRcsServiceConnectionAsyncAction.kt")).q("Done waiting for Rcs services connection");
        return true;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aylh(this.b, fcxyVar);
    }
}
