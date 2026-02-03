package defpackage;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cvnt extends ConstraintLayout implements eyhy {
    private ehol d;
    private boolean e;

    public cvnt(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        d();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhy
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ehol ba() {
        if (this.d == null) {
            this.d = new ehol(this);
        }
        return this.d;
    }

    protected final void d() {
        if (this.e) {
            return;
        }
        this.e = true;
        ((cvmp) bb()).ai();
    }

    public cvnt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        d();
    }

    public cvnt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        d();
    }
}
