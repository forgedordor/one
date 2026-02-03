package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerBodyRecyclerView;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drqn implements drtj {
    final /* synthetic */ drqt a;

    public drqn(drqt drqtVar) {
        this.a = drqtVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        druo.a(view.getContext()).d(view);
        if (!(view instanceof EmojiView)) {
            ((ekrd) ((ekrd) drqt.a.i()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController$2", "onClick", 299, "EmojiPickerController.java")).t("Clicked view is not EmojiView: %s", view);
            return;
        }
        drqt drqtVar = this.a;
        drti drtiVar = ((EmojiView) view).c;
        drqt drqtVar2 = ((drqm) drqtVar.B).a;
        if (drqtVar2.n) {
            ekgb ekgbVar = drqtVar2.g;
            for (int i = 0; i < ((ekoe) ekgbVar).c; i++) {
                ((dros) ekgbVar.get(i)).d(drsy.a(drtiVar.b));
            }
        }
        drpv drpvVar = drqtVar2.z;
        if (drpvVar != null) {
            drpvVar.I(drtiVar, false);
        }
        drqr drqrVar = drqtVar2.c;
        if (drqrVar != null) {
            drqrVar.a(drtiVar);
        }
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        boolean z;
        EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView;
        final drqm drqmVar = (drqm) this.a.B;
        drqt drqtVar = drqmVar.a;
        drqr drqrVar = drqtVar.c;
        if (drqrVar != null) {
            drqrVar.d(view);
            z = true;
        } else {
            z = false;
        }
        EmojiView emojiView = (EmojiView) view.findViewById(R.id.emoji_view);
        if (emojiView == null || (emojiPickerBodyRecyclerView = drqtVar.x) == null) {
            return z;
        }
        boolean z2 = z;
        ekgb ekgbVar = emojiView.b;
        if (ekgbVar.isEmpty()) {
            return z2;
        }
        Context context = drqtVar.b;
        drjt.a(context).b(R.string.open_popup_content_desc);
        emojiPickerBodyRecyclerView.a(false);
        drrs drrsVar = drqtVar.s;
        drrsVar.b();
        int[] iArr = {0, context.getResources().getDisplayMetrics().widthPixels};
        drrsVar.c(view, emojiPickerBodyRecyclerView, ekgbVar, new PopupWindow.OnDismissListener() { // from class: drql
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                drqt drqtVar2 = drqmVar.a;
                drjt.a(drqtVar2.b).b(R.string.close_popup_content_desc);
                EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView2 = drqtVar2.x;
                if (emojiPickerBodyRecyclerView2 != null) {
                    emojiPickerBodyRecyclerView2.a(true);
                }
            }
        }, drqtVar.A, view.getWidth(), view.getHeight(), iArr[0], iArr[1], emojiView.c, drqtVar.d.h());
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((drqm) this.a.B).a.c == null) {
            return false;
        }
        view.getClass();
        motionEvent.getClass();
        return false;
    }
}
