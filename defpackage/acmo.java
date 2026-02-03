package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackDataView;
import com.google.android.material.card.MaterialCardView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class acmo extends MaterialCardView implements eyhy {
    private eyhq g;
    private boolean h;

    acmo(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        i();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhy
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final eyhq ba() {
        if (this.g == null) {
            this.g = new eyhq(this, false);
        }
        return this.g;
    }

    protected final void i() {
        if (this.h) {
            return;
        }
        this.h = true;
        ((acli) bb()).j((AdvancedFeedbackDataView) this);
    }

    public acmo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        i();
    }

    acmo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        i();
    }
}
