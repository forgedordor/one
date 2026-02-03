package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.ui.generic.spannedautocomplete.SpannedMultiAutoCompleteTextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cytw extends qx implements eyhy {
    private eyhq a;
    private boolean b;

    cytw(Context context) {
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

    public final void e() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((cyul) bb()).W((SpannedMultiAutoCompleteTextView) this);
    }

    public cytw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        e();
    }

    cytw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        e();
    }
}
