package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.shared.ui.AsyncImageView;
import com.google.android.apps.messaging.shared.ui.ContactIconView;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class cpas extends AsyncImageView {
    private boolean h;

    public cpas(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        l();
    }

    @Override // defpackage.cpar
    protected final void l() {
        if (this.h) {
            return;
        }
        this.h = true;
        ((cpaq) bb()).s((ContactIconView) this);
    }

    public cpas(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        l();
    }
}
