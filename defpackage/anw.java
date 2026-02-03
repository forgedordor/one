package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anw implements aok {
    private final amb a;
    private boolean b = false;

    public anw(amb ambVar) {
        this.a = ambVar;
    }

    @Override // defpackage.aok
    public final ListenableFuture a(TotalCaptureResult totalCaptureResult) {
        Integer num;
        int iIntValue;
        ListenableFuture listenableFutureB = bqk.b(true);
        if (totalCaptureResult != null && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) != null && ((iIntValue = num.intValue()) == 1 || iIntValue == 2)) {
            bbs.a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
            Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num2 != null && num2.intValue() == 0) {
                bbs.a("Camera2CapturePipeline", "Trigger AF");
                this.b = true;
                this.a.d.m(false);
            }
        }
        return listenableFutureB;
    }

    @Override // defpackage.aok
    public final void b() {
        if (this.b) {
            bbs.a("Camera2CapturePipeline", "cancel TriggerAF");
            this.a.d.d(true, false);
        }
    }

    @Override // defpackage.aok
    public final boolean c() {
        return true;
    }
}
