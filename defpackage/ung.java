package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.emoji.widget.EmojiAppCompatTextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ung extends wv implements ufe {
    public final EmojiAppCompatTextView s;
    public final TextView t;

    public ung(View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.reaction);
        viewFindViewById.getClass();
        this.s = (EmojiAppCompatTextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.reaction_count);
        viewFindViewById2.getClass();
        this.t = (TextView) viewFindViewById2;
    }

    @Override // defpackage.ufe
    public final uer a() {
        return uer.CUSTOM_REACTION_BADGE;
    }

    @Override // defpackage.ufe
    public final void b() {
    }
}
