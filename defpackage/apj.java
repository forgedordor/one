package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class apj {
    public final Executor a;
    public int b = 1;
    private final amb c;
    private final axv d;
    private final boolean e;
    private final bly f;
    private final ScheduledExecutorService g;
    private final boolean h;

    public apj(amb ambVar, final auy auyVar, bly blyVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.c = ambVar;
        Integer num = (Integer) auyVar.c(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.h = num != null && num.intValue() == 2;
        this.a = executor;
        this.g = scheduledExecutorService;
        this.f = blyVar;
        this.d = new axv(blyVar);
        auyVar.getClass();
        this.e = axb.a(new awx() { // from class: ans
            @Override // defpackage.awx
            public final Object a(CameraCharacteristics.Key key) {
                return auyVar.c(key);
            }
        });
    }

    static ListenableFuture b(final amb ambVar, aom aomVar) {
        final aon aonVar = new aon(aomVar);
        ambVar.n(aonVar);
        ListenableFuture listenableFuture = aonVar.b;
        listenableFuture.b(new Runnable() { // from class: anr
            @Override // java.lang.Runnable
            public final void run() {
                ambVar.y(aonVar);
            }
        }, ambVar.b);
        return listenableFuture;
    }

    static ListenableFuture c(long j, ScheduledExecutorService scheduledExecutorService, amb ambVar, aom aomVar) {
        return bqk.k(TimeUnit.NANOSECONDS.toMillis(j), scheduledExecutorService, b(ambVar, aomVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean d(android.hardware.camera2.TotalCaptureResult r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apj.d(android.hardware.camera2.TotalCaptureResult, boolean):boolean");
    }

    static boolean e(int i, TotalCaptureResult totalCaptureResult) {
        bbs.a("Camera2CapturePipeline", a.g(i, "isFlashRequired: flashMode = "));
        if (i == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            Objects.toString(num);
            bbs.a("Camera2CapturePipeline", "isFlashRequired: aeState = ".concat(String.valueOf(num)));
            return num != null && num.intValue() == 4;
        }
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i != 3) {
                throw new AssertionError(i);
            }
        }
        return true;
    }

    final aoj a(int i, int i2, int i3) {
        bly blyVar = this.f;
        axh axhVar = new axh(blyVar);
        int i4 = this.b;
        amb ambVar = this.c;
        Executor executor = this.a;
        ScheduledExecutorService scheduledExecutorService = this.g;
        aoj aojVar = new aoj(i4, executor, scheduledExecutorService, ambVar, this.h, axhVar);
        boolean z = false;
        if (i == 0) {
            aojVar.b(new anw(ambVar));
            i = 0;
        }
        if (i2 == 3) {
            aojVar.b(new apc(ambVar, executor, scheduledExecutorService, new axu(blyVar)));
        } else if (this.e) {
            boolean z2 = this.d.a;
            if (z2 || this.b == 3 || i3 == 1) {
                if (!z2) {
                    int i5 = ambVar.i.b.get();
                    bbs.a("Camera2CameraControlImp", a.g(i5, "isInVideoUsage: mVideoUsageControl value = "));
                    if (i5 <= 0) {
                        z = true;
                    }
                }
                aojVar.b(new api(ambVar, i2, executor, scheduledExecutorService, z));
            } else {
                aojVar.b(new anv(ambVar, i2, axhVar));
            }
        }
        bbs.a("Camera2CapturePipeline", "createPipeline: captureMode = " + i + ", flashMode = " + i2 + ", flashType = " + i3 + ", pipeline tasks = " + aojVar.i);
        return aojVar;
    }
}
