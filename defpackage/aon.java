package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aon implements ama {
    public kog a;
    public final ListenableFuture b = kol.a(new koi() { // from class: aol
        @Override // defpackage.koi
        public final Object a(kog kogVar) {
            this.a.a = kogVar;
            return "waitFor3AResult";
        }
    });
    private final aom c;

    public aon(aom aomVar) {
        this.c = aomVar;
    }

    @Override // defpackage.ama
    public final boolean a(TotalCaptureResult totalCaptureResult) {
        aom aomVar = this.c;
        if (aomVar != null && !aomVar.a(totalCaptureResult)) {
            return false;
        }
        this.a.b(totalCaptureResult);
        return true;
    }
}
