package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ocp extends Exception {
    static final ekfk a;
    public final int b;

    static {
        ekfi ekfiVar = new ekfi();
        ekfiVar.d("ERROR_CODE_FAILED_RUNTIME_CHECK", 1001);
        ekfiVar.d("ERROR_CODE_IO_UNSPECIFIED", 2000);
        ekfiVar.d("ERROR_CODE_IO_NETWORK_CONNECTION_FAILED", 2001);
        ekfiVar.d("ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT", 2002);
        ekfiVar.d("ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE", 2003);
        ekfiVar.d("ERROR_CODE_IO_BAD_HTTP_STATUS", 2004);
        ekfiVar.d("ERROR_CODE_IO_FILE_NOT_FOUND", 2005);
        ekfiVar.d("ERROR_CODE_IO_NO_PERMISSION", 2006);
        ekfiVar.d("ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED", 2007);
        ekfiVar.d("ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE", 2008);
        ekfiVar.d("ERROR_CODE_DECODER_INIT_FAILED", 3001);
        ekfiVar.d("ERROR_CODE_DECODING_FAILED", 3002);
        ekfiVar.d("ERROR_CODE_DECODING_FORMAT_UNSUPPORTED", 3003);
        ekfiVar.d("ERROR_CODE_ENCODER_INIT_FAILED", 4001);
        ekfiVar.d("ERROR_CODE_ENCODING_FAILED", 4002);
        ekfiVar.d("ERROR_CODE_ENCODING_FORMAT_UNSUPPORTED", 4003);
        ekfiVar.d("ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED", 5001);
        ekfiVar.d("ERROR_CODE_AUDIO_PROCESSING_FAILED", 6001);
        ekfiVar.d("ERROR_CODE_MUXING_FAILED", 7001);
        ekfiVar.d("ERROR_CODE_MUXING_TIMEOUT", 7002);
        ekfiVar.d("ERROR_CODE_MUXING_APPEND", 7003);
        a = ekfiVar.c();
    }

    public ocp(String str, Throwable th, int i) {
        this(str, th, i, null);
    }

    public static ocp a(mdl mdlVar, String str) {
        return new ocp("Audio error: " + str + ", audioFormat=" + String.valueOf(mdlVar.a), mdlVar, 6001);
    }

    public static ocp b(Throwable th, int i, oco ocoVar) {
        return new ocp("Codec exception: ".concat(ocoVar.toString()), th, i, null);
    }

    private ocp(String str, Throwable th, int i, byte[] bArr) {
        super(str, th);
        this.b = i;
        SystemClock.elapsedRealtime();
    }
}
