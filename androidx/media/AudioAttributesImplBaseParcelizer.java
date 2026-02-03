package androidx.media;

import defpackage.por;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(por porVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = porVar.b(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = porVar.b(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = porVar.b(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = porVar.b(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, por porVar) {
        porVar.s(audioAttributesImplBase.a, 1);
        porVar.s(audioAttributesImplBase.b, 2);
        porVar.s(audioAttributesImplBase.c, 3);
        porVar.s(audioAttributesImplBase.d, 4);
    }
}
