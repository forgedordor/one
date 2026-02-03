package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wja extends fcyz implements fdat {
    final /* synthetic */ vvs a;
    final /* synthetic */ vvs b;
    final /* synthetic */ wjc c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wja(vvs vvsVar, vvs vvsVar2, wjc wjcVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = vvsVar;
        this.b = vvsVar2;
        this.c = wjcVar;
        this.d = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wja) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final vvs vvsVar = this.a;
        final vvs vvsVar2 = this.b;
        if (fdbq.f(vvsVar, vvsVar2)) {
            ekrw ekrwVarH = wjc.a.h();
            ekrwVarH.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentState$launchReplaceAttachment$1", "invokeSuspend", 250, "DraftAttachmentState.kt")).t("Skipping replacement of attachment %s with itself", vvsVar);
            return fctx.a;
        }
        ekrw ekrwVarH2 = wjc.a.h();
        ekrwVarH2.X(eksq.a, "BugleComposeRow2");
        ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentState$launchReplaceAttachment$1", "invokeSuspend", 254, "DraftAttachmentState.kt")).D("Replacing in draft state: %s with %s", vvsVar, vvsVar2);
        final fdcg fdcgVar = new fdcg();
        fdcgVar.a = -1;
        wjc wjcVar = this.c;
        wjcVar.b.c(new fdap() { // from class: wiz
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                vvw vvwVar = (vvw) obj2;
                List list = vvwVar.b;
                vvs vvsVar3 = vvsVar;
                int iIndexOf = list.indexOf(vvsVar3);
                fdcg fdcgVar2 = fdcgVar;
                fdcgVar2.a = iIndexOf;
                vvs vvsVar4 = vvsVar2;
                if (iIndexOf >= 0) {
                    List listAq = fcva.aq(list);
                    listAq.set(fdcgVar2.a, vvsVar4);
                    return vvw.c(vvwVar, null, listAq, null, false, null, null, false, 0, null, 2045);
                }
                ekrw ekrwVarJ = wjc.a.j();
                ekrwVarJ.X(eksq.a, "BugleComposeRow2");
                ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentState$launchReplaceAttachment$1", "invokeSuspend$lambda$0", 261, "DraftAttachmentState.kt")).D("Failed to replace attachment %s with %s", vvsVar3, vvsVar4);
                return vvwVar;
            }
        });
        if (fdcgVar.a < 0) {
            ((vth) wjcVar.e.b()).b(vvsVar, this.d);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new wja(this.a, this.b, this.c, this.d, fcxyVar);
    }
}
