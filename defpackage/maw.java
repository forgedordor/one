package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class maw implements mcg {
    public final mcg a;

    public maw(mcg mcgVar) {
        this.a = mcgVar;
    }

    @Override // defpackage.mcg
    public final long A() {
        throw null;
    }

    @Override // defpackage.mcg
    public final long B() {
        throw null;
    }

    @Override // defpackage.mcg
    public final long C() {
        throw null;
    }

    @Override // defpackage.mcg
    public final Looper D() {
        return ((mrn) this.a).k;
    }

    @Override // defpackage.mcg
    public final mbr E() {
        throw null;
    }

    @Override // defpackage.mcg
    public final mca F() {
        throw null;
    }

    @Override // defpackage.mcg
    public final mcc G() {
        throw null;
    }

    @Override // defpackage.mcg
    public final mcl H() {
        return this.a.H();
    }

    @Override // defpackage.mcg
    public final mcq I() {
        throw null;
    }

    @Override // defpackage.mcg
    public final mcs J() {
        return this.a.J();
    }

    @Override // defpackage.mcg
    public final mde K() {
        throw null;
    }

    @Override // defpackage.mcg
    public final mdw L() {
        throw null;
    }

    @Override // defpackage.mcg
    public final void M(mce mceVar) {
        this.a.M(new mav(this, mceVar));
    }

    @Override // defpackage.mcg
    public final void N(SurfaceView surfaceView) {
        throw null;
    }

    @Override // defpackage.mcg
    public final void O() {
        this.a.O();
    }

    @Override // defpackage.mcg
    public final void P(mce mceVar) {
        this.a.P(new mav(this, mceVar));
    }

    @Override // defpackage.mcg
    public void Q(boolean z) {
        throw null;
    }

    @Override // defpackage.mcg
    public final void R(int i) {
        throw null;
    }

    @Override // defpackage.mcg
    public final void S(boolean z) {
        throw null;
    }

    @Override // defpackage.mcg
    public final void T(mcq mcqVar) {
        throw null;
    }

    @Override // defpackage.mcg
    public final void U(SurfaceView surfaceView) {
        throw null;
    }

    @Override // defpackage.mcg
    public final void V(TextureView textureView) throws CloneNotSupportedException {
        mrn mrnVar = (mrn) this.a;
        mrnVar.ap();
        if (textureView == null) {
            mrnVar.af();
            return;
        }
        mrnVar.ah();
        mrnVar.v = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            mff.f("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(mrnVar.m);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            mrnVar.al(null);
            mrnVar.ag(0, 0);
        } else {
            mrnVar.ak(surfaceTexture);
            mrnVar.ag(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // defpackage.mcg
    public final boolean W() {
        return this.a.W();
    }

    @Override // defpackage.mcg
    public final boolean X() {
        return this.a.X();
    }

    @Override // defpackage.mcg
    public final boolean Y() {
        return this.a.Y();
    }

    @Override // defpackage.mcg
    public final int aC() {
        throw null;
    }

    @Override // defpackage.mcg
    public final int aD() {
        throw null;
    }

    @Override // defpackage.mcg
    public final int aE() {
        return this.a.aE();
    }

    @Override // defpackage.mcg
    public final int aF() {
        throw null;
    }

    @Override // defpackage.mcg
    public final long c() {
        throw null;
    }

    @Override // defpackage.mcg
    public void d() {
        this.a.d();
    }

    @Override // defpackage.mcg
    public void e() {
        this.a.e();
    }

    @Override // defpackage.mcg
    public final void f() {
        this.a.f();
    }

    @Override // defpackage.mcg
    public final void g() {
        this.a.g();
    }

    @Override // defpackage.mcg
    public final void h() {
        this.a.h();
    }

    @Override // defpackage.mcg
    public final void i() {
        this.a.i();
    }

    @Override // defpackage.mcg
    public final void j() {
        this.a.j();
    }

    @Override // defpackage.mcg
    public final boolean k() {
        throw null;
    }

    @Override // defpackage.mcg
    public final boolean l() {
        throw null;
    }

    @Override // defpackage.mcg
    public final boolean m(int i) {
        return this.a.m(i);
    }

    @Override // defpackage.mcg
    public final boolean n() {
        throw null;
    }

    @Override // defpackage.mcg
    public final boolean o() {
        throw null;
    }

    @Override // defpackage.mcg
    public final boolean p() {
        throw null;
    }

    @Override // defpackage.mcg
    public final boolean q() {
        throw null;
    }

    @Override // defpackage.mcg
    public final int t() {
        return this.a.t();
    }

    @Override // defpackage.mcg
    public final int u() {
        return this.a.u();
    }

    @Override // defpackage.mcg
    public final int v() {
        return this.a.v();
    }

    @Override // defpackage.mcg
    public final long w() {
        throw null;
    }

    @Override // defpackage.mcg
    public final long x() {
        throw null;
    }

    @Override // defpackage.mcg
    public final long y() {
        throw null;
    }

    @Override // defpackage.mcg
    public final long z() {
        throw null;
    }
}
