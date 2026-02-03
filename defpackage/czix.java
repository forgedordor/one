package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AspectRatioLayout;
import com.google.android.apps.messaging.ui.mediapicker.camera.MiniCameraViewImpl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class czix extends AspectRatioLayout implements eyhy {
    private eyhq b;
    private boolean c;

    public czix(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode() || this.c) {
            return;
        }
        this.c = true;
        ((czju) bb()).N((MiniCameraViewImpl) this);
    }

    @Override // defpackage.eyhy
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final eyhq ba() {
        if (this.b == null) {
            this.b = new eyhq(this, false);
        }
        return this.b;
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }
}
