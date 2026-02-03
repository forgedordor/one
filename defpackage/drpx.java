package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerBodyRecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drpx extends wg {
    private static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyScrollListener");
    private final drqr b;
    private int c = -1;

    public drpx(drqr drqrVar) {
        this.b = drqrVar;
    }

    @Override // defpackage.wg
    public final void a(RecyclerView recyclerView, int i, int i2) {
        int iK;
        if (!(recyclerView instanceof EmojiPickerBodyRecyclerView)) {
            ((ekrd) a.a(drub.a).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyScrollListener", "onScrolled", 28, "EmojiPickerBodyScrollListener.java")).q("Scroll listener not attached to EmojiPickerBodyRecyclerView.");
            return;
        }
        EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView = (EmojiPickerBodyRecyclerView) recyclerView;
        vo voVar = emojiPickerBodyRecyclerView.n;
        if (!(voVar instanceof drpv)) {
            ((ekrd) a.a(drub.a).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyScrollListener", "onScrolled", 36, "EmojiPickerBodyScrollListener.java")).q("EmojiPickerBodyRecyclerView's adapter is not an EmojiPickerBodyAdapter.");
            return;
        }
        drpv drpvVar = (drpv) voVar;
        wb wbVar = emojiPickerBodyRecyclerView.o;
        if (wbVar instanceof GridLayoutManager) {
            iK = ((GridLayoutManager) wbVar).K();
        } else {
            ((ekrd) ((ekrd) EmojiPickerBodyRecyclerView.ab.i()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyRecyclerView", "findFirstCompletelyVisibleItemPosition", 193, "EmojiPickerBodyRecyclerView.java")).q("findFirstCompletelyVisibleItemPosition() : Cannot find layout manager.");
            iK = -1;
        }
        int i3 = this.c;
        if (i3 == iK || iK == -1) {
            return;
        }
        int iL = i3 == -1 ? 0 : drpvVar.l(i3);
        int iL2 = drpvVar.l(iK);
        int i4 = emojiPickerBodyRecyclerView.ad;
        drqr drqrVar = this.b;
        drpvVar.G(iL2);
        if ((iL != iL2 || iL2 != i4) && (i != 0 || i2 != 0)) {
            drqrVar.c(iL2, 5);
            emojiPickerBodyRecyclerView.ad = iL2;
        }
        this.c = iK;
    }
}
