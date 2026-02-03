package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aqk extends asm {
    final /* synthetic */ aql a;

    public aqk(aql aqlVar) {
        this.a = aqlVar;
    }

    @Override // defpackage.asm
    public final void a(asn asnVar) {
        aql aqlVar = this.a;
        synchronized (aqlVar.a) {
            int i = aqlVar.j;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            switch (i2) {
                case 0:
                case 2:
                case 3:
                case 7:
                    throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + ((Object) aqj.a(aqlVar.j)));
                case 1:
                    bbs.a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                    break;
                case 4:
                case 5:
                case 6:
                    aqlVar.g();
                    break;
            }
            bbs.c("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + ((Object) aqj.a(aqlVar.j)));
        }
    }

    @Override // defpackage.asm
    public final void b(asn asnVar) {
        aql aqlVar = this.a;
        synchronized (aqlVar.a) {
            int i = aqlVar.j;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            switch (i2) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 7:
                    throw new IllegalStateException("onConfigured() should not be possible in state: " + ((Object) aqj.a(aqlVar.j)));
                case 4:
                    asnVar.o();
                    break;
                case 5:
                    aqlVar.d = asnVar;
                    break;
                case 6:
                    aqlVar.m(8);
                    aqlVar.d = asnVar;
                    bbs.a("CaptureSession", "Attempting to send capture request onConfigured");
                    aqlVar.o(aqlVar.e);
                    aqlVar.i();
                    break;
            }
            bbs.a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + ((Object) aqj.a(aqlVar.j)));
        }
    }

    @Override // defpackage.asm
    public final void c(asn asnVar) {
        aql aqlVar = this.a;
        synchronized (aqlVar.a) {
            int i = aqlVar.j;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                throw new IllegalStateException("onReady() should not be possible in state: " + ((Object) aqj.a(aqlVar.j)));
            }
            bbs.a("CaptureSession", "CameraCaptureSession.onReady() " + ((Object) aqj.a(aqlVar.j)));
        }
    }

    @Override // defpackage.asm
    public final void d(asn asnVar) {
        aql aqlVar = this.a;
        synchronized (aqlVar.a) {
            if (aqlVar.j == 1) {
                throw new IllegalStateException("onSessionFinished() should not be possible in state: " + ((Object) aqj.a(aqlVar.j)));
            }
            bbs.a("CaptureSession", "onSessionFinished()");
            aqlVar.g();
        }
    }
}
