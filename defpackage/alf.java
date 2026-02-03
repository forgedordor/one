package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.Range;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alf implements atp {
    private final auy a;
    private final Range b;
    private kog d;
    private boolean f;
    private float c = 1.0f;
    private float e = 1.0f;

    public alf(auy auyVar) {
        int[] iArr;
        boolean z = false;
        this.f = false;
        this.a = auyVar;
        this.b = (Range) auyVar.c(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        if (Build.VERSION.SDK_INT >= 34 && (iArr = (int[]) auyVar.b.a(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES)) != null) {
            int i = 0;
            while (true) {
                if (i >= iArr.length) {
                    break;
                }
                if (iArr[i] == 1) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.f = z;
    }

    @Override // defpackage.atp
    public final float a() {
        return ((Float) this.b.getUpper()).floatValue();
    }

    @Override // defpackage.atp
    public final float b() {
        return ((Float) this.b.getLower()).floatValue();
    }

    @Override // defpackage.atp
    public final Rect c() {
        Rect rect = (Rect) this.a.c(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        lcg.i(rect);
        return rect;
    }

    @Override // defpackage.atp
    public final void d(ald aldVar) {
        CaptureRequest.Key key = CaptureRequest.CONTROL_ZOOM_RATIO;
        Float fValueOf = Float.valueOf(this.c);
        bjp bjpVar = bjp.REQUIRED;
        aldVar.e(key, fValueOf, bjpVar);
        if (this.f) {
            bjpVar.getClass();
            if (Build.VERSION.SDK_INT >= 34) {
                aldVar.e(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1, bjpVar);
            }
        }
    }

    @Override // defpackage.atp
    public final void e(TotalCaptureResult totalCaptureResult) {
        if (this.d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f == null) {
                return;
            }
            if (this.e == f.floatValue()) {
                this.d.b(null);
                this.d = null;
            }
        }
    }

    @Override // defpackage.atp
    public final void f() {
        this.c = 1.0f;
        kog kogVar = this.d;
        if (kogVar != null) {
            kogVar.c(new ayw("Camera is not active."));
            this.d = null;
        }
    }

    @Override // defpackage.atp
    public final void g(float f, kog kogVar) {
        this.c = f;
        kog kogVar2 = this.d;
        if (kogVar2 != null) {
            kogVar2.c(new ayw("There is a new zoomRatio being set"));
        }
        this.e = this.c;
        this.d = kogVar;
    }
}
