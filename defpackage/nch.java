package defpackage;

import android.media.MediaCodec;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nch extends miv {
    public final int a;

    public nch(Throwable th, nci nciVar) {
        int errorCode;
        super("Decoder failed: ".concat(String.valueOf(nciVar == null ? null : nciVar.a)), th);
        if (th instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
            codecException.getDiagnosticInfo();
            errorCode = codecException.getErrorCode();
        } else {
            errorCode = 0;
        }
        this.a = errorCode;
    }
}
