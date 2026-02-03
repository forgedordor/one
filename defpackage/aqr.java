package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aqr implements atp {
    private final auy a;
    private kog c;
    private Rect b = null;
    private Rect d = null;

    public aqr(auy auyVar) {
        this.a = auyVar;
    }

    private final Rect h() {
        Rect rect = (Rect) this.a.c(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        lcg.i(rect);
        return rect;
    }

    @Override // defpackage.atp
    public final float a() {
        Float f = (Float) this.a.c(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f != null && f.floatValue() >= 1.0f) {
            return f.floatValue();
        }
        return 1.0f;
    }

    @Override // defpackage.atp
    public final float b() {
        return 1.0f;
    }

    @Override // defpackage.atp
    public final Rect c() {
        Rect rect = this.b;
        return rect != null ? rect : h();
    }

    @Override // defpackage.atp
    public final void d(ald aldVar) {
        if (this.b != null) {
            aldVar.e(CaptureRequest.SCALER_CROP_REGION, this.b, bjp.REQUIRED);
        }
    }

    @Override // defpackage.atp
    public final void e(TotalCaptureResult totalCaptureResult) {
        if (this.c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.d;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.c.b(null);
            this.c = null;
            this.d = null;
        }
    }

    @Override // defpackage.atp
    public final void f() {
        this.d = null;
        this.b = null;
        kog kogVar = this.c;
        if (kogVar != null) {
            kogVar.c(new ayw("Camera is not active."));
            this.c = null;
        }
    }

    @Override // defpackage.atp
    public final void g(float f, kog kogVar) {
        Rect rectH = h();
        float fWidth = rectH.width();
        float fHeight = rectH.height();
        float fWidth2 = rectH.width();
        float f2 = fHeight / f;
        float fHeight2 = (rectH.height() - f2) / 2.0f;
        float f3 = fWidth / f;
        float f4 = (fWidth2 - f3) / 2.0f;
        this.b = new Rect((int) f4, (int) fHeight2, (int) (f3 + f4), (int) (f2 + fHeight2));
        kog kogVar2 = this.c;
        if (kogVar2 != null) {
            kogVar2.c(new ayw("There is a new zoomRatio being set"));
        }
        this.d = this.b;
        this.c = kogVar;
    }
}
