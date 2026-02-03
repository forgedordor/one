package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.apps.messaging.ui.conversation.message.MessageMetadataDetailsView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cwma extends ViewGroup implements eyhy {
    private eyhq a;
    private boolean b;

    cwma(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    @Override // defpackage.eyhy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eyhq ba() {
        if (this.a == null) {
            this.a = new eyhq(this, false);
        }
        return this.a;
    }

    protected final void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((cwmm) bb()).M((MessageMetadataDetailsView) this);
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    cwma(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    public cwma(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    cwma(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        b();
    }
}
