package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class unu extends RecyclerView implements eyhy {
    private eyhq ab;
    private boolean ac;

    unu(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        aO();
    }

    @Override // defpackage.eyhy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eyhq ba() {
        if (this.ab == null) {
            this.ab = new eyhq(this, false);
        }
        return this.ab;
    }

    protected final void aO() {
        if (this.ac) {
            return;
        }
        this.ac = true;
        ((uoa) bb()).e();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    public unu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        aO();
    }

    unu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        aO();
    }
}
