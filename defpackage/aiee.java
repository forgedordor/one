package defpackage;

import android.content.Context;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aiee extends eedc implements eyhy {
    private ehol g;
    private boolean h;

    public aiee(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    @Override // defpackage.eyhy
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ehol ba() {
        if (this.g == null) {
            this.g = new ehol(this);
        }
        return this.g;
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    protected final void c() {
        if (this.h) {
            return;
        }
        this.h = true;
        ((aidx) bb()).ak();
    }

    public aiee(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    public aiee(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        c();
    }
}
