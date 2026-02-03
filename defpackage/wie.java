package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wie extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ wiq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wie(wiq wiqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = wiqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wie) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ekrd ekrdVar;
        Iterator it;
        fcyl fcylVar = fcyl.a;
        int i = this.b;
        if (i != 0) {
            Iterator it2 = i != 1 ? this.a : this.a;
            fctl.b(obj);
            it = it2;
        } else {
            fctl.b(obj);
            wiq wiqVar = this.c;
            ekrg ekrgVar = wiq.a;
            List list = wiqVar.f.a(new fdap() { // from class: wid
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    vvw vvwVar = (vvw) obj2;
                    return vvwVar.b.isEmpty() ? vvwVar : vvw.c(vvwVar, null, fcvo.a, null, false, null, null, false, 0, null, 2045);
                }
            }).b;
            boolean zIsEmpty = list.isEmpty();
            if (zIsEmpty) {
                ekrw ekrwVarE = wiq.a.e();
                ekrwVarE.X(eksq.a, "BugleComposeRow2");
                ekrdVar = (ekrd) ekrwVarE;
            } else {
                ekrw ekrwVarG = wiq.a.g();
                ekrwVarG.X(eksq.a, "BugleComposeRow2");
                ekrdVar = (ekrd) ekrwVarG;
            }
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentController$hugoDraftAttachmentsController$1$clearAttachments$1", "invokeSuspend", 500, "DraftAttachmentController.kt")).t("clearAttachments oldIsEmpty: %b", Boolean.valueOf(zIsEmpty));
            it = list.iterator();
        }
        while (it.hasNext()) {
            vvs vvsVar = (vvs) it.next();
            wiq wiqVar2 = this.c;
            ekrg ekrgVar2 = wiq.a;
            if (((eoth) ((aqdl) wiqVar2.l).a.b()).a("bugle.clean_up_attachments_on_clear")) {
                this.a = it;
                this.b = 1;
                if (wiqVar2.d(vvsVar, this) == fcylVar) {
                    return fcylVar;
                }
            } else {
                this.a = it;
                this.b = 2;
                if (wiqVar2.f(vvsVar, this) == fcylVar) {
                    return fcylVar;
                }
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new wie(this.c, fcxyVar);
    }
}
