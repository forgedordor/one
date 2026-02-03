package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cwly extends FrameLayout implements eyhy {
    private eyhq a;
    private boolean b;

    cwly(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        t();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhy
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final eyhq ba() {
        if (this.a == null) {
            this.a = new eyhq(this, false);
        }
        return this.a;
    }

    protected final void t() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((cwlt) bb()).w((ConversationMessageView) this);
    }

    public cwly(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        t();
    }

    cwly(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        t();
    }

    cwly(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        t();
    }
}
