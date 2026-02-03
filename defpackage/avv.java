package defpackage;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avv {
    public final axg a;
    public final avx b;
    private final Map c = new HashMap();

    public avv(StreamConfigurationMap streamConfigurationMap, axg axgVar) {
        new HashMap();
        new HashMap();
        this.b = new avw(streamConfigurationMap);
        this.a = axgVar;
    }

    public final StreamConfigurationMap a() {
        return this.b.a;
    }

    public final Range[] b(Size size) {
        return this.b.a.getHighSpeedVideoFpsRangesFor(size);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Size[] c(int r17) {
        /*
            Method dump skipped, instructions count: 959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avv.c(int):android.util.Size[]");
    }
}
