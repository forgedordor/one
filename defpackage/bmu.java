package defpackage;

import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum bmu {
    VGA(0, new Size(640, 480)),
    X_VGA(1, new Size(1024, 768)),
    S720P_16_9(2, new Size(1280, 720)),
    PREVIEW(3),
    S1080P_4_3(4, new Size(1440, 1080)),
    S1080P_16_9(5, new Size(1920, 1080)),
    S1440P_4_3(6, new Size(1920, 1440)),
    S1440P_16_9(7, new Size(2560, 1440)),
    UHD(8, new Size(3840, 2160)),
    RECORD(9),
    MAXIMUM(10),
    MAXIMUM_4_3(11),
    MAXIMUM_16_9(12),
    ULTRA_MAXIMUM(13),
    NOT_SUPPORT(14);

    final int p;
    final Size q;

    bmu(int i) {
        this(i, null);
    }

    bmu(int i, Size size) {
        this.p = i;
        this.q = size;
    }
}
