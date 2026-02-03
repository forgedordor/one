package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cvcb extends ConstraintLayout implements eyhy {
    private ehol i;
    private boolean j;

    public cvcb(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        g();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhy
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final ehol ba() {
        if (this.i == null) {
            this.i = new ehol(this);
        }
        return this.i;
    }

    protected final void g() {
        if (this.j) {
            return;
        }
        this.j = true;
        ((cuxc) bb()).ap();
    }

    public cvcb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        g();
    }

    public cvcb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        g();
    }

    public cvcb(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        g();
    }
}
