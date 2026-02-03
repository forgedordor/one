package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.ui.conversation.richcard.ConversationRichCardView;
import com.google.android.material.card.MaterialCardView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cwos extends MaterialCardView implements eyhy {
    private eyhq g;
    private boolean h;

    cwos(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        g();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhy
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final eyhq ba() {
        if (this.g == null) {
            this.g = new eyhq(this, false);
        }
        return this.g;
    }

    protected final void g() {
        if (this.h) {
            return;
        }
        this.h = true;
        ((cwoq) bb()).y((ConversationRichCardView) this);
    }

    public cwos(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        g();
    }

    public cwos(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        g();
    }
}
