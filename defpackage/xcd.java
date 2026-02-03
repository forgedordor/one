package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xcd extends fcyz implements fdat {
    final /* synthetic */ xci a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xcd(xci xciVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = xciVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xcd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekrw ekrwVarF = xci.a.f();
        ekrwVarF.X(eksq.a, "BugleComposeRow2");
        ((ekrd) ekrwVarF.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/subjecturgent/SubjectUrgentUiAdapterImpl$onDismiss$1", "invokeSuspend", 175, "SubjectUrgentUiAdapterImpl.kt")).q("Dismissing subject/urgent row");
        fdap fdapVar = new fdap() { // from class: xcc
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                return vvw.c((vvw) obj2, null, null, null, false, null, null, false, 0, null, 2035);
            }
        };
        xci xciVar = this.a;
        xciVar.c.c(fdapVar);
        xciVar.d.f(false);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xcd(this.a, fcxyVar);
    }
}
