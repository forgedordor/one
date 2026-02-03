package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xil extends fcyz implements fdat {
    int a;
    final /* synthetic */ xir b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xil(xir xirVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xirVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xil) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ekrw ekrwVarG = xir.b.g();
            ekrwVarG.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarG.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/files/FilesShortcutHandler$1", "invokeSuspend", 75, "FilesShortcutHandler.kt")).q("Checking to recover file picker result");
            xir xirVar = this.b;
            this.a = 1;
            if (xirVar.d(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xil(this.b, fcxyVar);
    }
}
