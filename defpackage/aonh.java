package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.shared.audio.attachment.ui.AudioPlaybackSeekBar;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class aonh extends rh implements eyhy {
    private eyhq a;
    private boolean b;

    aonh(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    @Override // defpackage.eyhy
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final eyhq ba() {
        if (this.a == null) {
            this.a = new eyhq(this, false);
        }
        return this.a;
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    protected final void c() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((aong) bb()).p((AudioPlaybackSeekBar) this);
    }

    public aonh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    aonh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        c();
    }
}
