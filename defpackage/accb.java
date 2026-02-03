package defpackage;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class accb extends ConstraintLayout implements eyhy {
    private ehol d;
    private boolean e;

    public accb(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    @Override // defpackage.eyhy
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ehol ba() {
        if (this.d == null) {
            this.d = new ehol(this);
        }
        return this.d;
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    protected final void c() {
        if (this.e) {
            return;
        }
        this.e = true;
        ((acbw) bb()).w();
    }

    public accb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    public accb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        c();
    }
}
