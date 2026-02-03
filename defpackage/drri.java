package defpackage;

import android.view.View;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drri implements View.OnClickListener {
    final /* synthetic */ drrj a;

    public drri(drrj drrjVar) {
        this.a = drrjVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!(view instanceof EmojiView)) {
            ((ekrd) ((ekrd) drrj.a.i()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerPopupViewController$1", "onClick", 82, "EmojiPickerPopupViewController.java")).t("Clicked view is not EmojiView: %s", view);
            return;
        }
        druo.a(view.getContext()).d(view);
        drrj drrjVar = this.a;
        View.OnClickListener onClickListener = drrjVar.c;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        drrjVar.b();
    }
}
