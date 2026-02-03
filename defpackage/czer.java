package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.ui.mediapicker.c2o.selectable.SelectableContentItemView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class czer extends FrameLayout implements eyhy {
    private eyhq a;
    private boolean b;

    czer(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        a();
    }

    public void a() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((czew) bb()).T((SelectableContentItemView) this);
    }

    @Override // defpackage.eyhy
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final eyhq ba() {
        if (this.a == null) {
            this.a = new eyhq(this, false);
        }
        return this.a;
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    public czer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        a();
    }

    czer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        a();
    }

    czer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        a();
    }
}
