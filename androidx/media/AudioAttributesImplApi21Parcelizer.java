package androidx.media;

import android.media.AudioAttributes;
import defpackage.por;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(por porVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) porVar.d(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = porVar.b(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, por porVar) {
        porVar.u(audioAttributesImplApi21.a, 1);
        porVar.s(audioAttributesImplApi21.b, 2);
    }
}
