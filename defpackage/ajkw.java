package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajkw {
    private static final ekgp a;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("audio/aac", emkh.AUDIO_AAC);
        ekgiVar.i("audio/mp3", emkh.AUDIO_MP3);
        ekgiVar.i("audio/mpeg", emkh.AUDIO_MPEG);
        ekgiVar.i("audio/mpg", emkh.AUDIO_MPG);
        ekgiVar.i("audio/mp4", emkh.AUDIO_MP4);
        ekgiVar.i("audio/mp4-latm", emkh.AUDIO_MP4_LATM);
        ekgiVar.i("application/ogg", emkh.AUDIO_OGG);
        ekgiVar.i("video/3gp", emkh.VIDEO_3GP);
        ekgiVar.i("video/3gpp", emkh.VIDEO_3GPP);
        ekgiVar.i("video/3gpp2", emkh.VIDEO_3G2);
        ekgiVar.i("video/m4v", emkh.VIDEO_M4V);
        ekgiVar.i("video/mp4", emkh.VIDEO_MP4);
        ekgiVar.i("video/mpeg", emkh.VIDEO_MPEG);
        ekgiVar.i("video/mpeg4", emkh.VIDEO_MPEG4);
        ekgiVar.i("video/avc", emkh.VIDEO_MPEG4);
        ekgiVar.i("video/webm", emkh.VIDEO_WEBM);
        ekgiVar.i("video/hevc", emkh.VIDEO_HEVC);
        a = ekgiVar.c();
    }

    public static emkh a(String str) {
        if (!TextUtils.isEmpty(str)) {
            ekgp ekgpVar = a;
            if (ekgpVar.containsKey(str)) {
                return (emkh) ekgpVar.get(str);
            }
            if (le.f(str) || le.z(str)) {
                return emkh.MIME_OTHER;
            }
        }
        return emkh.MIME_UNKNOWN;
    }
}
