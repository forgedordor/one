package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.inputmethod.emoji.view.CustomImageView;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drpg implements drtj {
    final /* synthetic */ drpl a;

    public drpg(drpl drplVar) {
        this.a = drplVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [dror, dros] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!(view instanceof EmojiView)) {
            ((ekrd) ((ekrd) drpl.a.i()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiListController$1", "onClick", 77, "EmojiListController.java")).t("Clicked view is not EmojiView: %s", view);
            return;
        }
        druo.a(view.getContext()).d(view);
        EmojiView emojiView = (EmojiView) view;
        drpl drplVar = this.a;
        droq.b(drplVar.i, drsy.a(emojiView.c.b));
        drplVar.f.a(emojiView.c);
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (!(view instanceof EmojiView)) {
            if (view instanceof CustomImageView) {
                this.a.f.d(view);
                return true;
            }
            ((ekrd) ((ekrd) drpl.a.i()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiListController$1", "onLongClick", 102, "EmojiListController.java")).t("Long Clicked view is not EmojiView or CustomImageView: %s", view);
            return false;
        }
        EmojiView emojiView = (EmojiView) view;
        ekgb ekgbVar = emojiView.b;
        if (ekgbVar.isEmpty()) {
            this.a.f.d(view);
            return true;
        }
        final drpl drplVar = this.a;
        ((ekrd) ((ekrd) drpl.a.e()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiListController", "showEmojiVariantsPopupView", 229, "EmojiListController.java")).q("Show emoji variants popup view.");
        if (emojiView.getParent() != null) {
            Context context = drplVar.b;
            drjt.a(context).b(R.string.open_popup_content_desc);
            drrs drrsVar = drplVar.d;
            drrsVar.b();
            RecyclerView recyclerView = drplVar.e;
            int[] iArr = new int[2];
            if (recyclerView != null) {
                recyclerView.getLocationInWindow(iArr);
                iArr[1] = iArr[0] + recyclerView.getWidth();
            } else {
                iArr[0] = 0;
                iArr[1] = context.getResources().getDisplayMetrics().widthPixels;
            }
            drrj drrjVar = (drrj) drrsVar;
            drrjVar.c(emojiView, (View) emojiView.getParent(), ekgbVar, new PopupWindow.OnDismissListener() { // from class: drpe
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    drjt.a(drplVar.b).b(R.string.close_popup_content_desc);
                }
            }, drplVar.h, emojiView.getWidth(), emojiView.getHeight(), iArr[0], iArr[1], emojiView.c, null);
        }
        drplVar.f.d(view);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }
}
