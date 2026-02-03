package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class acue extends MaterialCardView implements eyhy {
    private ehol g;
    private boolean h;

    public acue(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        h();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhy
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final ehol ba() {
        if (this.g == null) {
            this.g = new ehol(this);
        }
        return this.g;
    }

    protected final void h() {
        if (this.h) {
            return;
        }
        this.h = true;
        ((acuc) bb()).C();
    }

    public acue(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        h();
    }

    public acue(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        h();
    }
}
