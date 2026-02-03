package defpackage;

import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class wjx extends fdbo implements fdat {
    public wjx(Object obj) {
        super(2, obj, wjy.class, "onMagicEdit", "onMagicEdit(Ljava/util/List;I)V", 0);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        List list = (List) obj;
        int iIntValue = ((Number) obj2).intValue();
        list.getClass();
        wjy wjyVar = (wjy) this.g;
        ekrw ekrwVarG = wjy.a.g();
        ekrwVarG.X(eksq.a, "BugleComposeRow2");
        ((ekrd) ekrwVarG.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentUiAdapterImpl", "onMagicEdit", 153, "DraftAttachmentUiAdapterImpl.kt")).w("Attachments onMagicEdit %d, %s", iIntValue, list);
        wkn wknVar = wjyVar.d;
        if (list.isEmpty() || iIntValue < 0 || iIntValue >= list.size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        vvs vvsVar = (vvs) list.get(iIntValue);
        dltd dltdVarB = wko.b(vvsVar);
        if (dltdVarB instanceof dohs) {
            vvr vvrVar = vvsVar instanceof vvr ? (vvr) vvsVar : null;
            Uri uri = vvrVar != null ? vvrVar.b.c : null;
            if (uri == null) {
                uri = Uri.parse(doij.c((dohs) dltdVarB, wknVar.d, null).f());
            }
            wknVar.c.h(new ageg(uri, Integer.valueOf(iIntValue)));
        } else {
            ((ekrd) wkn.a.h().h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentViewer", "magicEdit", 77, "DraftAttachmentViewer.kt")).w("No-op for magicEdit() on position %d of %s", iIntValue, list);
        }
        return fctx.a;
    }
}
