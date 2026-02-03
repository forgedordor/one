package defpackage;

import android.util.Size;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface bku extends bma {
    public static final bjo F = new bhd("camerax.core.imageOutput.targetAspectRatio", ayn.class, null);
    public static final bjo G = new bhd("camerax.core.imageOutput.targetRotation", Integer.TYPE, null);
    public static final bjo H = new bhd("camerax.core.imageOutput.appTargetRotation", Integer.TYPE, null);
    public static final bjo I = new bhd("camerax.core.imageOutput.mirrorMode", Integer.TYPE, null);
    public static final bjo J = new bhd("camerax.core.imageOutput.targetResolution", Size.class, null);
    public static final bjo K = new bhd("camerax.core.imageOutput.defaultResolution", Size.class, null);
    public static final bjo L = new bhd("camerax.core.imageOutput.maxResolution", Size.class, null);
    public static final bjo M = new bhd("camerax.core.imageOutput.supportedResolutions", List.class, null);
    public static final bjo N = new bhd("camerax.core.imageOutput.resolutionSelector", bvc.class, null);
    public static final bjo O = new bhd("camerax.core.imageOutput.customOrderedResolutions", List.class, null);

    int B();

    int C(int i);

    bvc E();

    boolean F();

    int G();

    List I();

    Size J();

    Size K();

    int L();

    bvc M();

    List N();

    Size O();
}
