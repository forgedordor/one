package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drro extends wv {
    private final EmojiView s;

    public drro(ViewGroup viewGroup, LayoutInflater layoutInflater, int i, int i2, drtj drtjVar) {
        super(layoutInflater.inflate(R.layout.emoji_view_holder, viewGroup, false));
        this.a.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
        EmojiView emojiView = (EmojiView) this.a.findViewById(R.id.emoji_view);
        this.s = emojiView;
        emojiView.d = null;
        emojiView.e = null;
        emojiView.setClickable(true);
        emojiView.setOnTouchListener(drtjVar);
        emojiView.setOnHoverListener(drtjVar);
        emojiView.setOnClickListener(drtjVar);
        if (drtjVar != null) {
            ley.t(emojiView, ldr.a(emojiView.getContext()));
        }
        emojiView.setOnLongClickListener(drtjVar);
    }

    public final void C(drti drtiVar, ekgb ekgbVar) {
        EmojiView emojiView = this.s;
        emojiView.c(drtiVar);
        emojiView.b = ekgbVar;
    }
}
