package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class asz extends asm {
    private final CameraCaptureSession.StateCallback a;

    public asz(CameraCaptureSession.StateCallback stateCallback) {
        this.a = stateCallback;
    }

    @Override // defpackage.asm
    public final void a(asn asnVar) {
        this.a.onConfigureFailed(asnVar.l().a());
    }

    @Override // defpackage.asm
    public final void b(asn asnVar) {
        this.a.onConfigured(asnVar.l().a());
    }

    @Override // defpackage.asm
    public final void c(asn asnVar) {
        this.a.onReady(asnVar.l().a());
    }

    @Override // defpackage.asm
    public final void f(asn asnVar) {
        this.a.onActive(asnVar.l().a());
    }

    @Override // defpackage.asm
    public final void g(asn asnVar) {
        this.a.onCaptureQueueEmpty(asnVar.l().a());
    }

    @Override // defpackage.asm
    public final void h(asn asnVar) {
        this.a.onClosed(asnVar.l().a());
    }

    @Override // defpackage.asm
    public final void i(asn asnVar, Surface surface) {
        this.a.onSurfacePrepared(asnVar.l().a(), surface);
    }

    @Override // defpackage.asm
    public final void d(asn asnVar) {
    }
}
