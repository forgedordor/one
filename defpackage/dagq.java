package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dagq extends ScrollView implements eyhy {
    private ehol a;
    private boolean b;

    public dagq(Context context) {
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
        ((dahh) bb()).ay();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    public dagq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    public dagq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    public dagq(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        b();
    }
}
