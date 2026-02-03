package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.ui.conversation.richcard.RichCardVideoOverlayView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cwow extends FrameLayout implements eyhy {
    private eyhq a;
    private boolean b;

    cwow(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        d();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhy
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final eyhq ba() {
        if (this.a == null) {
            this.a = new eyhq(this, false);
        }
        return this.a;
    }

    protected final void d() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((cwpk) bb()).S((RichCardVideoOverlayView) this);
    }

    public cwow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        d();
    }

    cwow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        d();
    }

    cwow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        d();
    }
}
