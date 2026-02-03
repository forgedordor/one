package defpackage;

import android.content.Context;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cvtl extends lox implements eyhy {
    private eyhq a;
    private boolean b;

    cvtl(Context context) {
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
    public final eyhq ba() {
        if (this.a == null) {
            this.a = new eyhq(this, false);
        }
        return this.a;
    }

    protected final void e() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((cvto) bb()).ak();
    }

    public cvtl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        e();
    }

    cvtl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        e();
    }
}
