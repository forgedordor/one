package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class wjw extends fdbo implements fdat {
    public wjw(Object obj) {
        super(2, obj, wjy.class, "onClick", "onClick(Ljava/util/List;I)V", 0);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        List list = (List) obj;
        int iIntValue = ((Number) obj2).intValue();
        list.getClass();
        wjy wjyVar = (wjy) this.g;
        if (list.size() <= iIntValue) {
            throw new IllegalStateException("Clicked attachment position out of bounds.");
        }
        ekrw ekrwVarG = wjy.a.g();
        ekrwVarG.X(eksq.a, "BugleComposeRow2");
        ((ekrd) ekrwVarG.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentUiAdapterImpl", "onClick", 132, "DraftAttachmentUiAdapterImpl.kt")).w("Attachments onClick %d, %s", iIntValue, list);
        auvw.k(wjyVar.c, null, null, new wjv(wjyVar, list, iIntValue, null), 3);
        return fctx.a;
    }
}
