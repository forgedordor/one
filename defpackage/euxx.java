package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euxx extends euxz {
    private static final String n = "euxx";
    private final int o;

    public euxx(euxy euxyVar, int i) {
        super(euxyVar, 10000L, 0L, 23219L);
        this.o = i;
    }

    public final boolean a() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < MediaCodecList.getCodecCount(); i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                for (String str : codecInfoAt.getSupportedTypes()) {
                    if (str.equalsIgnoreCase("audio/mp4a-latm")) {
                        arrayList.add(codecInfoAt.getName());
                    }
                }
            }
        }
        String str2 = arrayList.size() > 0 ? (String) arrayList.get(0) : null;
        if (str2 == null) {
            return false;
        }
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", 44100, 12);
        mediaFormatCreateAudioFormat.setInteger("aac-profile", 2);
        mediaFormatCreateAudioFormat.setInteger("sample-rate", 44100);
        mediaFormatCreateAudioFormat.setInteger("bitrate", 64000);
        mediaFormatCreateAudioFormat.setInteger("channel-count", 2);
        mediaFormatCreateAudioFormat.setInteger("max-input-size", this.o);
        this.i = new MediaCodec.BufferInfo();
        try {
            this.g = MediaCodec.createByCodecName(str2);
            this.g.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            this.g.start();
            this.j = true;
            this.k = false;
            this.l = false;
            return true;
        } catch (MediaCodec.CodecException e) {
            Log.e(n, "Exception in media codec while creating audio encoder!".concat(String.valueOf(e.toString())));
            return false;
        } catch (IOException unused) {
            Log.e(n, "Exception while creating audio format!");
            return false;
        }
    }
}
