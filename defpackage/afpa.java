package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afpa implements fdap {
    final /* synthetic */ afpe a;
    final /* synthetic */ List b;

    public afpa(afpe afpeVar, List list) {
        this.a = afpeVar;
        this.b = list;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        final vvs vvsVar = (vvs) this.b.get(((Number) obj).intValue());
        ((ekrd) afpe.a.g().h("com/google/android/apps/messaging/multishare/editmessage/bottomcontent/composerow/attachments/DraftAttachmentUiAdapterImpl", "onRemove", 93, "DraftAttachmentUiAdapterImpl.kt")).t("Attachments onRemove %s", vvsVar);
        fdap fdapVar = new fdap() { // from class: afop
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                vvs vvsVar2 = (vvs) obj2;
                vvsVar2.getClass();
                return Boolean.valueOf(dlth.a(vvsVar2, vvsVar));
            }
        };
        afpe afpeVar = this.a;
        auvw.k(afpeVar.c, null, null, new afou(afpeVar, fdapVar, null), 3);
        return fctx.a;
    }
}
