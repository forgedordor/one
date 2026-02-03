package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
class awk extends awi {
    public awk(Surface surface) {
        super(new awj(new OutputConfiguration(-1, surface)));
    }

    @Override // defpackage.awi, defpackage.awo
    public Object b() {
        Object obj = this.a;
        lcg.a(obj instanceof awj);
        return ((awj) obj).a;
    }

    @Override // defpackage.awo
    public String c() {
        return ((awj) this.a).b;
    }

    @Override // defpackage.awo
    public final void d(Surface surface) {
        aky$$ExternalSyntheticApiModelOutline0.m(b()).addSurface(surface);
    }

    @Override // defpackage.awo
    public final void e() {
        aky$$ExternalSyntheticApiModelOutline0.m(b()).enableSurfaceSharing();
    }

    @Override // defpackage.awo
    public void f(long j) {
        ((awj) this.a).c = j;
    }

    @Override // defpackage.awo
    public void g(String str) {
        ((awj) this.a).b = str;
    }

    public awk(Object obj) {
        super(obj);
    }
}
