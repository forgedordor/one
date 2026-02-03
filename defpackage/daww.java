package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class daww extends ConstraintLayout implements eyhy {
    private ehol i;
    private boolean j;

    public daww(Context context) {
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
        if (this.i == null) {
            this.i = new ehol(this);
        }
        return this.i;
    }

    protected final void f() {
        if (this.j) {
            return;
        }
        this.j = true;
        ((daxc) bb()).aw();
    }

    public daww(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        f();
    }

    public daww(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        f();
    }

    public daww(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        f();
    }
}
