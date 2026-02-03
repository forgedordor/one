package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anv implements aok {
    public final amb a;
    public final axh b;
    private final int c;
    private boolean d = false;

    public anv(amb ambVar, int i, axh axhVar) {
        this.a = ambVar;
        this.c = i;
        this.b = axhVar;
    }

    @Override // defpackage.aok
    public final ListenableFuture a(TotalCaptureResult totalCaptureResult) {
        boolean z = this.a.k;
        if (!apj.e(this.c, totalCaptureResult)) {
            return bqk.b(false);
        }
        bbs.a("Camera2CapturePipeline", "Trigger AE");
        this.d = true;
        return bqk.f(bpw.a(kol.a(new koi() { // from class: ant
            @Override // defpackage.koi
            public final Object a(kog kogVar) {
                anv anvVar = this.a;
                anvVar.a.d.j(kogVar);
                anvVar.b.b = true;
                return "AePreCapture";
            }
        })), new akv() { // from class: anu
            @Override // defpackage.akv
            public final Object a(Object obj) {
                return true;
            }
        }, bpc.a());
    }

    @Override // defpackage.aok
    public final void b() {
        if (this.d) {
            bbs.a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
            this.a.d.d(false, true);
            this.b.b = false;
        }
    }

    @Override // defpackage.aok
    public final boolean c() {
        return this.c == 0;
    }
}
