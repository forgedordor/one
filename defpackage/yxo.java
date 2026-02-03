package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yxo extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdae b;
    final /* synthetic */ yxg c;
    final /* synthetic */ yya d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxo(fdae fdaeVar, yxg yxgVar, yya yyaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdaeVar;
        this.c = yxgVar;
        this.d = yyaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yxo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdae fdaeVar = this.b;
            if (fdaeVar != null) {
                fdaeVar.invoke();
            } else {
                ekrd ekrdVar = (ekrd) yya.a.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/progress/ProgressBarOverlayUiAdapter$createDownloadableUiData$1$1", "invokeSuspend", 299, "ProgressBarOverlayUiAdapter.kt");
                ajlt ajltVar = this.c.a;
                ekrdVar.t("Resuming file transfer for messageId=%s", ajltVar.b());
                eiju eijuVarF = this.d.c.F(ajltVar.b());
                this.a = 1;
                obj = fdxs.c(eijuVarF, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new yxo(this.b, this.c, this.d, fcxyVar);
    }
}
