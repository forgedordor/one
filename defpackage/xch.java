package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xch extends fcyz implements fdat {
    final /* synthetic */ boolean a;
    final /* synthetic */ xci b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xch(boolean z, xci xciVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = z;
        this.b = xciVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xch) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekrw ekrwVarF = xci.a.f();
        ekrwVarF.X(eksq.a, "BugleComposeRow2");
        ekrd ekrdVar = (ekrd) ekrwVarF.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/subjecturgent/SubjectUrgentUiAdapterImpl$onUrgentChange$1", "invokeSuspend", 168, "SubjectUrgentUiAdapterImpl.kt");
        final boolean z = this.a;
        ekrdVar.t("Urgent changed %b", Boolean.valueOf(z));
        this.b.c.c(new fdap() { // from class: xcg
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                return vvw.c((vvw) obj2, null, null, null, z, null, null, false, 0, null, 2039);
            }
        });
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xch(this.a, this.b, fcxyVar);
    }
}
