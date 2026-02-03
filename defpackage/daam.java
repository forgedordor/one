package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class daam extends GridLayout implements eyhy {
    private ehol a;
    private boolean b;

    public daam(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    @Override // defpackage.eyhy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ehol ba() {
        if (this.a == null) {
            this.a = new ehol(this);
        }
        return this.a;
    }

    protected final void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((daar) bb()).ax();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    public daam(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    public daam(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    public daam(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        b();
    }
}
