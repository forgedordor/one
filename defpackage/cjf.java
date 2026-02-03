package defpackage;

import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cjf implements SurfaceHolder.Callback {
    public Size a;
    public bdp b;
    public boolean c = false;
    public boolean d = false;
    final /* synthetic */ cjg e;
    public cil f;
    private bdp g;
    private Size h;

    public cjf(cjg cjgVar) {
        this.e = cjgVar;
    }

    public final void a() {
        if (this.b != null) {
            bdp bdpVar = this.b;
            Objects.toString(bdpVar);
            bbs.a("SurfaceViewImpl", "Request canceled: ".concat(String.valueOf(bdpVar)));
            this.b.f();
        }
    }

    public final boolean b() {
        cjg cjgVar = this.e;
        Surface surface = cjgVar.d.getHolder().getSurface();
        if (this.c || this.b == null || !j$.util.Objects.equals(this.a, this.h)) {
            return false;
        }
        bbs.a("SurfaceViewImpl", "Surface set on Preview.");
        final cil cilVar = this.f;
        bdp bdpVar = this.b;
        bdpVar.getClass();
        bdpVar.b(surface, kxj.e(cjgVar.d.getContext()), new lbz() { // from class: cje
            @Override // defpackage.lbz
            public final void accept(Object obj) {
                bbs.a("SurfaceViewImpl", "Safe to release surface.");
                cil cilVar2 = cilVar;
                if (cilVar2 != null) {
                    cilVar2.a();
                }
            }
        });
        this.c = true;
        cjgVar.f();
        return true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        bbs.a("SurfaceViewImpl", a.s(i3, i2, "Surface changed. Size: ", "x"));
        this.h = new Size(i2, i3);
        b();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        bdp bdpVar;
        bbs.a("SurfaceViewImpl", "Surface created.");
        if (!this.d || (bdpVar = this.g) == null) {
            return;
        }
        bdpVar.e();
        this.g = null;
        this.d = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        bbs.a("SurfaceViewImpl", "Surface destroyed.");
        if (!this.c) {
            a();
        } else if (this.b != null) {
            bdp bdpVar = this.b;
            Objects.toString(bdpVar);
            bbs.a("SurfaceViewImpl", "Surface closed ".concat(String.valueOf(bdpVar)));
            this.b.j.d();
        }
        this.d = true;
        bdp bdpVar2 = this.b;
        if (bdpVar2 != null) {
            this.g = bdpVar2;
        }
        this.c = false;
        this.b = null;
        this.f = null;
        this.h = null;
        this.a = null;
    }
}
