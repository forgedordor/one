package defpackage;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bzc implements bpu {
    final /* synthetic */ can a;
    final /* synthetic */ bzd b;

    public bzc(bzd bzdVar, can canVar) {
        this.b = bzdVar;
        this.a = canVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.bpu
    public final void a(Throwable th) {
        byz byzVar;
        Objects.toString(th);
        bbs.g("Recorder", "VideoEncoder Setup error: ".concat(th.toString()), th);
        bzd bzdVar = this.b;
        int i = bzdVar.d;
        if (i < bzdVar.b) {
            bzdVar.d = i + 1;
            bzdVar.e = bzf.h(new Runnable() { // from class: bzb
                @Override // java.lang.Runnable
                public final void run() {
                    bzd bzdVar2 = this.a.b;
                    if (bzdVar2.c) {
                        return;
                    }
                    bbs.a("Recorder", "Retry setupVideo #" + bzdVar2.d);
                    bzdVar2.b(bzdVar2.a, bzdVar2.g);
                }
            }, bzdVar.f.h, bzf.e, TimeUnit.MILLISECONDS);
            return;
        }
        bzf bzfVar = bzdVar.f;
        synchronized (bzfVar.i) {
            byzVar = null;
            switch (bzfVar.l) {
                case CONFIGURING:
                    bzfVar.q(-1);
                    bzfVar.p(bze.ERROR);
                    break;
                case PENDING_RECORDING:
                case PENDING_PAUSED:
                    byz byzVar2 = bzfVar.o;
                    bzfVar.o = null;
                    byzVar = byzVar2;
                    bzfVar.q(-1);
                    bzfVar.p(bze.ERROR);
                    break;
                case IDLING:
                case RECORDING:
                case PAUSED:
                case STOPPING:
                case RESETTING:
                    throw new AssertionError("Encountered encoder setup error while in unexpected state " + bzfVar.l + ": " + th);
            }
        }
        if (byzVar != null) {
            bzfVar.j(byzVar, 7, th);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dc A[Catch: all -> 0x011d, TryCatch #0 {, blocks: (B:22:0x008e, B:23:0x0094, B:47:0x00fc, B:26:0x009d, B:27:0x00a5, B:30:0x00aa, B:31:0x00b1, B:34:0x00b5, B:35:0x00bf, B:36:0x00d2, B:39:0x00d6, B:42:0x00dc, B:44:0x00e1, B:45:0x00eb, B:46:0x00f6), top: B:62:0x008e }] */
    @Override // defpackage.bpu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void b(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzc.b(java.lang.Object):void");
    }
}
