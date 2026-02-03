package defpackage;

import java.util.Objects;
import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
final class byi implements bpu {
    final /* synthetic */ can a;
    final /* synthetic */ bzf b;

    public byi(bzf bzfVar, can canVar) {
        this.b = bzfVar;
        this.a = canVar;
    }

    @Override // defpackage.bpu
    public final void a(Throwable th) {
        Objects.toString(th);
        bbs.a("Recorder", "Error in ReadyToReleaseFuture: ".concat(th.toString()));
    }

    @Override // defpackage.bpu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        cef cefVar;
        cef cefVar2 = (cef) obj;
        Objects.toString(cefVar2);
        bbs.a("Recorder", "VideoEncoder can be released: ".concat(String.valueOf(cefVar2)));
        if (cefVar2 == null) {
            return;
        }
        bzf bzfVar = this.b;
        ScheduledFuture scheduledFuture = bzfVar.T;
        if (scheduledFuture != null && scheduledFuture.cancel(false) && (cefVar = bzfVar.D) != null && cefVar == cefVar2) {
            bzf.k(cefVar);
        }
        bzfVar.X = this.a;
        bzfVar.o(null);
        bzfVar.G();
    }
}
