package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
class awm extends awk {
    public awm(Surface surface) {
        super(new awl(new OutputConfiguration(-1, surface)));
    }

    @Override // defpackage.awk, defpackage.awi, defpackage.awo
    public Object b() {
        Object obj = this.a;
        lcg.a(obj instanceof awl);
        return ((awl) obj).a;
    }

    @Override // defpackage.awk, defpackage.awo
    public String c() {
        return null;
    }

    @Override // defpackage.awk, defpackage.awo
    public void f(long j) {
        ((awl) this.a).b = j;
    }

    @Override // defpackage.awk, defpackage.awo
    public final void g(String str) {
        aky$$ExternalSyntheticApiModelOutline0.m(b()).setPhysicalCameraId(str);
    }

    public awm(Object obj) {
        super(obj);
    }
}
