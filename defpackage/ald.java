package defpackage;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ald implements azw {
    public final bli a = bli.a();

    public final ale a() {
        return new ale(blo.f(this.a));
    }

    public final void b(bjq bjqVar) {
        c(bjqVar, bjp.OPTIONAL);
    }

    public final void c(bjq bjqVar, bjp bjpVar) {
        for (bjo bjoVar : bjqVar.s()) {
            this.a.d(bjoVar, bjpVar, bjqVar.m(bjoVar));
        }
    }

    public final void d(CaptureRequest.Key key, Object obj) {
        this.a.c(ale.d(key), obj);
    }

    public final void e(CaptureRequest.Key key, Object obj, bjp bjpVar) {
        this.a.d(ale.d(key), bjpVar, obj);
    }

    @Override // defpackage.azw
    public final bli f() {
        throw null;
    }
}
