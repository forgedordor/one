package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wjp implements fdap {
    final /* synthetic */ wjy a;
    final /* synthetic */ List b;

    public wjp(wjy wjyVar, List list) {
        this.a = wjyVar;
        this.b = list;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        final vvs vvsVar = (vvs) this.b.get(((Number) obj).intValue());
        ekrw ekrwVarG = wjy.a.g();
        ekrwVarG.X(eksq.a, "BugleComposeRow2");
        ((ekrd) ekrwVarG.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentUiAdapterImpl", "onRemove", 158, "DraftAttachmentUiAdapterImpl.kt")).t("Attachments onRemove %s", vvsVar);
        wjy wjyVar = this.a;
        ((vth) wjyVar.h.b()).g(vvsVar.a(), 2);
        wjyVar.f.h(new fdap() { // from class: wjh
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                vvs vvsVar2 = (vvs) obj2;
                vvsVar2.getClass();
                return Boolean.valueOf(dlth.a(vvsVar2, vvsVar));
            }
        });
        return fctx.a;
    }
}
