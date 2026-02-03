package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ars {
    public final Object a;
    public boolean b;
    public boolean c;
    final ama d;
    private final amb e;
    private final boolean f;

    public ars(amb ambVar, auy auyVar) {
        new AtomicInteger(-1);
        this.a = new Object();
        this.b = false;
        this.e = ambVar;
        boolean zA = a(auyVar);
        this.f = zA;
        new lvy(-1);
        ama amaVar = new ama() { // from class: arr
            @Override // defpackage.ama
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return false;
            }
        };
        this.d = amaVar;
        if (zA) {
            ambVar.n(amaVar);
        }
    }

    static boolean a(auy auyVar) {
        int[] iArr;
        if (Build.VERSION.SDK_INT > 34 && (iArr = (int[]) auyVar.c(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES)) != null) {
            for (int i : iArr) {
                if (i == 6) {
                    return true;
                }
            }
        }
        return false;
    }
}
