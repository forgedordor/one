package defpackage;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mjr {
    public static final /* synthetic */ int a = 0;
    private static final Map b;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("TransformerInternal", ekgb.r("Start"));
        ekgiVar.i("AssetLoader", ekgb.s("InputFormat", "OutputFormat"));
        ekgiVar.i("AudioDecoder", ekgb.w("InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"));
        ekgiVar.i("AudioGraph", ekgb.s("RegisterNewInputStream", "OutputEnded"));
        ekgiVar.i("AudioMixer", ekgb.t("RegisterNewInputStream", "OutputFormat", "ProducedOutput"));
        ekgiVar.i("AudioEncoder", ekgb.w("InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"));
        ekgiVar.i("VideoDecoder", ekgb.w("InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"));
        ekgiVar.i("VideoFrameProcessor", ekgb.z("RegisterNewInputStream", "SurfaceTextureInput", "QueueFrame", "QueueBitmap", "QueueTexture", "RenderedToOutputSurface", "OutputTextureRendered", "ReceiveEndOfAllInput", "SignalEnded"));
        ekgiVar.i("ExternalTextureManager", ekgb.s("SignalEOS", "SurfaceTextureTransformFix"));
        ekgiVar.i("BitmapTextureManager", ekgb.r("SignalEOS"));
        ekgiVar.i("TexIdTextureManager", ekgb.r("SignalEOS"));
        ekgiVar.i("Compositor", ekgb.r("OutputTextureRendered"));
        ekgiVar.i("VideoEncoder", ekgb.w("InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"));
        ekgiVar.i("Muxer", ekgb.v("InputFormat", "CanWriteSample", "AcceptedInput", "InputEnded", "OutputEnded"));
        ekgiVar.c();
        b = new LinkedHashMap();
        SystemClock.elapsedRealtime();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static synchronized String a() {
        return "\"Tracing disabled\"";
    }

    public static synchronized void b() {
        b.clear();
        SystemClock.elapsedRealtime();
    }
}
