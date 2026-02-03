package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wif extends fcyz implements fdat {
    int a;
    final /* synthetic */ dltd b;
    final /* synthetic */ wiq c;
    final /* synthetic */ wig d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wif(dltd dltdVar, wiq wiqVar, wig wigVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dltdVar;
        this.c = wiqVar;
        this.d = wigVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wif) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ekrw ekrwVarH = wiq.a.h();
            ekrwVarH.X(eksq.a, "BugleComposeRow2");
            ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentController$hugoDraftAttachmentsController$1$send$1", "invokeSuspend", 518, "DraftAttachmentController.kt");
            dltd dltdVar = this.b;
            ekrdVar.t("Direct sending %s", dltdVar);
            wiq wiqVar = this.c;
            wig wigVar = this.d;
            vwj vwjVarA = wiqVar.a();
            vvs vvsVarA = wigVar.a(dltdVar, vuc.a(), false);
            this.a = 1;
            obj = vwjVarA.a(vvsVarA, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            ekrw ekrwVarI = wiq.a.i();
            ekrwVarI.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarI.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentController$hugoDraftAttachmentsController$1$send$1", "invokeSuspend", 527, "DraftAttachmentController.kt")).t("Direct sending failed %s", this.b);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new wif(this.b, this.c, this.d, fcxyVar);
    }
}
