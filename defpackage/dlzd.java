package defpackage;

import android.media.AudioFormat;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlzd {
    public final fduj b;
    public final AudioFormat c;
    public final String a = "denoise_seanet_16khz_android_messages";
    private final int d = 100;

    public dlzd(fduj fdujVar, AudioFormat audioFormat) {
        this.b = fdujVar;
        this.c = audioFormat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlzd)) {
            return false;
        }
        dlzd dlzdVar = (dlzd) obj;
        if (!fdbq.f(this.a, dlzdVar.a) || !fdbq.f(this.b, dlzdVar.b) || !fdbq.f(this.c, dlzdVar.c)) {
            return false;
        }
        int i = dlzdVar.d;
        return true;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + 100;
    }

    public final String toString() {
        return "XenoAudioProcessorConfiguration(effectId=" + this.a + ", inputFlow=" + this.b + ", audioFormat=" + this.c + ", extraBufferCapacity=100)";
    }
}
