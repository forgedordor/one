package androidx.media;

import android.media.AudioAttributes;
import defpackage.por;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(por porVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) porVar.d(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = porVar.b(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, por porVar) {
        porVar.u(audioAttributesImplApi26.a, 1);
        porVar.s(audioAttributesImplApi26.b, 2);
    }
}
