package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlwy {
    public static final MediaCodec a(MediaFormat mediaFormat) throws IOException {
        String strFindEncoderForFormat = new MediaCodecList(0).findEncoderForFormat(mediaFormat);
        if (strFindEncoderForFormat == null) {
            throw new IOException("Unable to find audio encoder for ".concat(String.valueOf(mediaFormat.getString("mime"))));
        }
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(strFindEncoderForFormat);
        mediaCodecCreateByCodecName.getClass();
        return mediaCodecCreateByCodecName;
    }
}
