package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.shared.ui.AsyncImageView;
import com.google.android.apps.messaging.shared.ui.RoundedImageView;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class cpar extends RoundedImageView implements eyhy {
    private eyhq a;
    private boolean b;

    public cpar(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        l();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhy
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final eyhq ba() {
        if (this.a == null) {
            this.a = new eyhq(this, false);
        }
        return this.a;
    }

    protected void l() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((cpaj) bb()).n((AsyncImageView) this);
    }

    public cpar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        l();
    }
}
