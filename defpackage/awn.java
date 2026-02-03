package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awn extends awm {
    public awn(Surface surface) {
        super(new OutputConfiguration(-1, surface));
    }

    @Override // defpackage.awm, defpackage.awk, defpackage.awi, defpackage.awo
    public final Object b() {
        Object obj = this.a;
        lcg.a(aky$$ExternalSyntheticApiModelOutline0.m184m(obj));
        return obj;
    }

    @Override // defpackage.awm, defpackage.awk, defpackage.awo
    public final /* bridge */ /* synthetic */ String c() {
        return null;
    }

    @Override // defpackage.awm, defpackage.awk, defpackage.awo
    public final void f(long j) {
        aky$$ExternalSyntheticApiModelOutline0.m(b()).setDynamicRangeProfile(j);
    }

    @Override // defpackage.awo
    public final void h(int i) {
        aky$$ExternalSyntheticApiModelOutline0.m(b()).setMirrorMode(i);
    }

    @Override // defpackage.awo
    public final void i(long j) {
        if (j == -1) {
            return;
        }
        aky$$ExternalSyntheticApiModelOutline0.m(b()).setStreamUseCase(j);
    }

    public awn(Object obj) {
        super(obj);
    }
}
