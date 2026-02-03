package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xia extends fcyz implements fdat {
    int a;
    final /* synthetic */ xij b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xia(xij xijVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xijVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xia) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ekrw ekrwVarG = xij.b.g();
            ekrwVarG.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarG.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/contacts/ContactsShortcutHandler$1", "invokeSuspend", 99, "ContactsShortcutHandler.kt")).q("Checking to recover contact picker result");
            xij xijVar = this.b;
            this.a = 1;
            if (xijVar.d(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xia(this.b, fcxyVar);
    }
}
