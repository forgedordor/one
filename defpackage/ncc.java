package defpackage;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncc {
    public final HashSet a = new HashSet();
    public LoudnessCodecController b;

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.b;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            mee.c(this.a.add(mediaCodec));
        }
    }

    public final void b(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.a.remove(mediaCodec) || (loudnessCodecController = this.b) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }
}
