package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aqh implements bpu {
    final /* synthetic */ aql a;

    public aqh(aql aqlVar) {
        this.a = aqlVar;
    }

    @Override // defpackage.bpu
    public final void a(Throwable th) {
        aql aqlVar = this.a;
        synchronized (aqlVar.a) {
            aqlVar.c.e();
            int i = aqlVar.j;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if ((i2 == 4 || i2 == 5 || i2 == 6) && !(th instanceof CancellationException)) {
                bbs.g("CaptureSession", "Opening session with fail " + ((Object) aqj.a(aqlVar.j)), th);
                aqlVar.g();
            }
        }
    }

    @Override // defpackage.bpu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }
}
