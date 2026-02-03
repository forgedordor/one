package defpackage;

import com.google.mediapipe.framework.ProtoUtil;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class evab implements AutoCloseable {
    public static final /* synthetic */ int d = 0;
    public final euzo a;
    public final String b = "image_in";
    public final String c = "norm_rect_in";

    static {
        ProtoUtil.b(euwx.class, "mediapipe.NormalizedRect");
    }

    public evab(euzo euzoVar) {
        this.a = euzoVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
