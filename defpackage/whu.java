package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class whu extends fcyz implements fdat {
    int a;
    final /* synthetic */ wiq b;
    final /* synthetic */ vvs c;
    final /* synthetic */ wlk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public whu(wiq wiqVar, vvs vvsVar, wlk wlkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = wiqVar;
        this.c = vvsVar;
        this.d = wlkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((whu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final wiq wiqVar = this.b;
            vvs vvsVar = this.c;
            wlk wlkVar = this.d;
            fdap fdapVar = new fdap() { // from class: wht
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    vvp vvpVar = (vvp) obj2;
                    ekrw ekrwVarE = wiq.a.e();
                    ekrwVarE.X(eksq.a, "BugleComposeRow2");
                    ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentController$addSizedAttachment$2$1", "invokeSuspend$lambda$0", 246, "DraftAttachmentController.kt")).t("addAttachment receiving trimmed video: %s", vvpVar);
                    wiqVar.r.a(vvpVar);
                    return fctx.a;
                }
            };
            this.a = 1;
            if (wiqVar.i.c(vvsVar, wlkVar, fdapVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new whu(this.b, this.c, this.d, fcxyVar);
    }
}
