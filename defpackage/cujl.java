package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.ui.ImeDetectCoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cujl extends CoordinatorLayout implements eyhy {
    private eyhq j;
    private boolean k;

    cujl(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        o();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhy
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final eyhq ba() {
        if (this.j == null) {
            this.j = new eyhq(this, false);
        }
        return this.j;
    }

    protected final void o() {
        if (this.k) {
            return;
        }
        this.k = true;
        ((cujo) bb()).K((ImeDetectCoordinatorLayout) this);
    }

    public cujl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        o();
    }

    cujl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        o();
    }
}
