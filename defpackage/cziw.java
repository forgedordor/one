package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import com.google.android.apps.messaging.ui.mediapicker.camera.CameraTextureView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cziw extends TextureView implements eyhy {
    private eyhq a;
    private boolean b;

    cziw(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        g();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhy
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final eyhq ba() {
        if (this.a == null) {
            this.a = new eyhq(this, false);
        }
        return this.a;
    }

    protected final void g() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((czil) bb()).q((CameraTextureView) this);
    }

    public cziw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        g();
    }

    cziw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        g();
    }

    cziw(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        g();
    }
}
