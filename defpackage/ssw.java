package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.audio.attachment.AudioAttachmentView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ssw extends LinearLayout implements eyhy {
    private ehol a;
    private boolean b;

    ssw(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        f();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhy
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final ehol ba() {
        if (this.a == null) {
            this.a = new ehol(this);
        }
        return this.a;
    }

    protected final void f() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((sst) bb()).a((AudioAttachmentView) this);
    }

    public ssw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        f();
    }

    ssw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        f();
    }

    ssw(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        f();
    }
}
