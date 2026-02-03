package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class uff extends RecyclerView implements eyhy {
    private ehol ab;
    private boolean ac;

    public uff(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        aP();
    }

    @Override // defpackage.eyhy
    /* renamed from: aO, reason: merged with bridge method [inline-methods] */
    public final ehol ba() {
        if (this.ab == null) {
            this.ab = new ehol(this);
        }
        return this.ab;
    }

    protected final void aP() {
        if (this.ac) {
            return;
        }
        this.ac = true;
        ((ufc) bb()).g();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    public uff(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        aP();
    }

    public uff(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        aP();
    }
}
