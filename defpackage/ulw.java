package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ulw extends RecyclerView implements eyhy {
    private ehol ab;
    private boolean ac;

    public ulw(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        aO();
    }

    @Override // defpackage.eyhy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ehol ba() {
        if (this.ab == null) {
            this.ab = new ehol(this);
        }
        return this.ab;
    }

    protected final void aO() {
        if (this.ac) {
            return;
        }
        this.ac = true;
        ((uls) bb()).i();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    public ulw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        aO();
    }

    public ulw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        aO();
    }
}
