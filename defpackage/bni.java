package defpackage;

import android.util.Range;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface bni extends brm, bkr {
    public static final bjo p = new bhd("camerax.core.useCase.defaultSessionConfig", bml.class, null);
    public static final bjo q = new bhd("camerax.core.useCase.defaultCaptureConfig", bjl.class, null);
    public static final bjo r = new bhd("camerax.core.useCase.sessionConfigUnpacker", bmg.class, null);
    public static final bjo s = new bhd("camerax.core.useCase.captureConfigUnpacker", bjk.class, null);
    public static final bjo t = new bhd("camerax.core.useCase.surfaceOccupancyPriority", Integer.TYPE, null);
    public static final bjo u = new bhd("camerax.core.useCase.targetFrameRate", Range.class, null);
    public static final bjo v = new bhd("camerax.core.useCase.targetHighSpeedFrameRate", Range.class, null);
    public static final bjo w = new bhd("camerax.core.useCase.zslDisabled", Boolean.TYPE, null);
    public static final bjo x = new bhd("camerax.core.useCase.highResolutionDisabled", Boolean.TYPE, null);
    public static final bjo y = new bhd("camerax.core.useCase.captureType", bnk.class, null);
    public static final bjo z = new bhd("camerax.core.useCase.previewStabilizationMode", Integer.TYPE, null);
    public static final bjo A = new bhd("camerax.core.useCase.videoStabilizationMode", Integer.TYPE, null);
    public static final bjo B = new bhd("camerax.core.useCase.takePictureManagerProvider", bgj.class, null);

    boolean A();

    int b();

    int d();

    Range e(Range range);

    Range f(Range range);

    bgj h();

    bml k();

    bnk l();

    bml w();

    bmg x();

    int y();

    boolean z();
}
