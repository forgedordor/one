package defpackage;

import android.content.Context;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cvca extends eegq implements eyhy {
    private ehol a;
    private boolean f;

    public cvca(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        e();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhy
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ehol ba() {
        if (this.a == null) {
            this.a = new ehol(this);
        }
        return this.a;
    }

    protected final void e() {
        if (this.f) {
            return;
        }
        this.f = true;
        ((cuvj) bb()).ao();
    }

    public cvca(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        e();
    }

    public cvca(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        e();
    }
}
