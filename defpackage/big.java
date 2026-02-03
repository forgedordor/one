package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface big extends bma {
    public static final bjo a = new bhd("camerax.core.camera.useCaseConfigFactory", bnm.class, null);
    public static final bjo b;
    public static final bjo c;
    public static final bjo d;
    public static final bjo e;
    public static final bjo f;
    public static final bif g;

    static {
        new bhd("camerax.core.camera.compatibilityId", bkn.class, null);
        b = new bhd("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class, null);
        c = new bhd("camerax.core.camera.SessionProcessor", bmm.class, null);
        new bhd("camerax.core.camera.isZslDisabled", Boolean.class, null);
        d = new bhd("camerax.core.camera.isPostviewSupported", Boolean.class, null);
        e = new bhd("camerax.core.camera.PostviewFormatSelector", bif.class, null);
        f = new bhd("camerax.core.camera.isCaptureProcessProgressSupported", Boolean.class, null);
        g = new bif() { // from class: bid
            @Override // defpackage.bif
            public final int a(List list) {
                int i = bie.a;
                if (list.contains(35)) {
                    return 35;
                }
                if (list.contains(256)) {
                    return 256;
                }
                return list.contains(4101) ? 4101 : 0;
            }
        };
    }

    bnm a();

    bmm b();
}
