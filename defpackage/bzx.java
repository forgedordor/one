package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bzx extends bhr {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ kog b;
    final /* synthetic */ bmd c;
    private boolean d = true;

    public bzx(AtomicBoolean atomicBoolean, kog kogVar, bmd bmdVar) {
        this.a = atomicBoolean;
        this.b = kogVar;
        this.c = bmdVar;
    }

    @Override // defpackage.bhr
    public final void b(int i, bib bibVar) {
        Object objC;
        if (this.d) {
            this.d = false;
            bbs.a("VideoCapture", "cameraCaptureResult timestampNs = " + bibVar.a() + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
        }
        AtomicBoolean atomicBoolean = this.a;
        if (atomicBoolean.get() || (objC = bibVar.f().c("androidx.camera.video.VideoCapture.streamUpdate")) == null) {
            return;
        }
        int iIntValue = ((Integer) objC).intValue();
        kog kogVar = this.b;
        if (iIntValue == kogVar.hashCode() && kogVar.b(null) && !atomicBoolean.getAndSet(true)) {
            final bmd bmdVar = this.c;
            bpn.a().execute(new Runnable() { // from class: bzw
                @Override // java.lang.Runnable
                public final void run() {
                    bmdVar.p(this.a);
                }
            });
        }
    }
}
