package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cflf extends fcyz implements fdat {
    int a;
    final /* synthetic */ cflh b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cflf(cflh cflhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cflhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cflf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        fdjx fdjxVar = (fdjx) this.c;
        ekrw ekrwVarE = cflh.a.e();
        ekrwVarE.X(eksq.a, "BugleDittoRcs");
        ekrd ekrdVar = (ekrd) ekrwVarE;
        ekrdVar.X(cqnc.S, fdjxVar.getClass().getSimpleName());
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/net/handler/ditto/LinkIdentityDelegate$handleRequestInternal$2", "invokeSuspend", 56, "LinkIdentityDelegate.kt")).q("Link RCS to Gaia account.");
        cflh cflhVar = this.b;
        this.a = 1;
        Object objD = cflhVar.d(this);
        return objD == fcylVar ? fcylVar : objD;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cflf cflfVar = new cflf(this.b, fcxyVar);
        cflfVar.c = obj;
        return cflfVar;
    }
}
