package defpackage;

import android.graphics.Bitmap;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class moj implements mmi {
    private final Object a = new Object();
    private mot b;
    protected final mou n;

    public moj(mou mouVar) {
        this.n = mouVar;
    }

    @Override // defpackage.mmi
    public /* synthetic */ void c() {
        throw null;
    }

    public abstract int d();

    protected void e() {
        synchronized (this.a) {
            mot motVar = this.b;
            if (motVar != null) {
                this.n.f(motVar);
            }
        }
    }

    public abstract void g();

    public abstract void h(mmk mmkVar);

    public abstract void i();

    public void j(Bitmap bitmap, max maxVar, men menVar) {
        throw new UnsupportedOperationException();
    }

    public void n(max maxVar) {
        throw new UnsupportedOperationException();
    }

    public final void s(mot motVar) {
        synchronized (this.a) {
            this.b = motVar;
        }
    }

    public Surface v() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.mmi
    public final void w() {
        this.n.d(new mot() { // from class: moi
            @Override // defpackage.mot
            public final void a() {
                this.a.e();
            }
        });
    }

    public void y(int i, long j) {
        throw new UnsupportedOperationException();
    }

    public void z(mmw mmwVar) {
        throw new UnsupportedOperationException();
    }

    public void l() {
    }

    public void o() {
    }

    @Override // defpackage.mmi
    public /* synthetic */ void b(maz mazVar) {
    }

    public void r(max maxVar, boolean z) {
    }
}
