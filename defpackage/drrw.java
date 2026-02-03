package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class drrw extends vo {
    private static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/emoji/picker/ItemListHolderAdapter");
    public final Context s;

    public drrw(Context context) {
        this.s = context;
    }

    public static final void K(int i, int i2, View view) {
        if (i <= 0) {
            return;
        }
        int iRound = Math.round(i / i2);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(iRound, view.getHeight());
        } else {
            layoutParams.width = iRound;
        }
        view.setLayoutParams(layoutParams);
    }

    static final int L(ViewGroup viewGroup) {
        ((ekrd) ((ekrd) a.f()).h("com/google/android/libraries/inputmethod/emoji/picker/ItemListHolderAdapter", "getParentWidth", 61, "ItemListHolderAdapter.java")).K("Calculating parent width. parentClass: %s, holderTargetWidth: %d, parentWidth: %d, parentPadding: (%d, %d)", viewGroup.getClass().getName(), -1, Integer.valueOf(viewGroup.getMeasuredWidth()), Integer.valueOf(viewGroup.getPaddingLeft()), Integer.valueOf(viewGroup.getPaddingRight()));
        return (viewGroup.getMeasuredWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight();
    }

    final void J(View view, drrn drrnVar) {
        ImageView imageView = (ImageView) view.findViewById(R.id.variant_availability_indicator);
        if (imageView == null) {
            ((ekrd) ((ekrd) a.j()).h("com/google/android/libraries/inputmethod/emoji/picker/ItemListHolderAdapter", "updateVisibilityOfVariantAvailabilityIndicator", 47, "ItemListHolderAdapter.java")).q("Unable to find variant availability indicator view");
        } else if (drrnVar.e.isEmpty()) {
            imageView.setImageDrawable(null);
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(this.s.getDrawable(R.drawable.ic_signal_cellular_4_bar_auto_mirrored));
            imageView.setVisibility(0);
        }
    }

    @Override // defpackage.vo
    public final void k(wv wvVar) {
        if (wvVar instanceof drrv) {
            drrt drrtVar = ((drrv) wvVar).t;
            return;
        }
        EmojiView emojiView = (EmojiView) wvVar.a.findViewById(R.id.emoji_view);
        if (emojiView != null) {
            emojiView.c = drti.a;
            emojiView.a = emojiView.a.a("");
            emojiView.a();
            emojiView.b(null);
        }
    }
}
