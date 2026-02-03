package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.ui.conversation.AudioButtonView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cvmv extends FrameLayout implements eyhy {
    private eyhq a;
    private boolean b;

    cvmv(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        i();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhy
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final eyhq ba() {
        if (this.a == null) {
            this.a = new eyhq(this, false);
        }
        return this.a;
    }

    protected final void i() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((cvkc) bb()).o((AudioButtonView) this);
    }

    public cvmv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        i();
    }

    cvmv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        i();
    }

    cvmv(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        i();
    }
}
