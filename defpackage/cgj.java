package defpackage;

import android.media.MediaCodecInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cgj implements cgi {
    protected final MediaCodecInfo.CodecCapabilities a;

    public cgj(MediaCodecInfo mediaCodecInfo, String str) throws cgm {
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            capabilitiesForType.getClass();
            this.a = capabilitiesForType;
        } catch (RuntimeException e) {
            throw new cgm("Unable to get CodecCapabilities for mime: ".concat(String.valueOf(str)), e);
        }
    }
}
