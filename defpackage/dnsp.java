package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.emoji.ui.views.SingleEmojiView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnsp extends wv {
    public final SingleEmojiView s;
    private final View t;

    public dnsp(View view) {
        super(view);
        this.t = view;
        View viewFindViewById = view.findViewById(R.id.emoji);
        viewFindViewById.getClass();
        this.s = (SingleEmojiView) viewFindViewById;
    }
}
