package defpackage;

import com.google.android.apps.messaging.R;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqdk {
    public final domv a;
    public final dqdi b;
    public final dqdj c;
    public final boolean d;
    public final Duration e;
    public final Duration f;
    private final int g = R.string.audio_recording_start_failed;
    private final int h = R.string.audio_recording_error;
    private final Integer i = null;
    private final Integer j = null;

    public dqdk(domv domvVar, dqdi dqdiVar, dqdj dqdjVar, boolean z, Duration duration, Duration duration2) {
        this.a = domvVar;
        this.b = dqdiVar;
        this.c = dqdjVar;
        this.d = z;
        this.e = duration;
        this.f = duration2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqdk)) {
            return false;
        }
        dqdk dqdkVar = (dqdk) obj;
        if (!fdbq.f(this.a, dqdkVar.a) || !fdbq.f(this.b, dqdkVar.b) || !fdbq.f(this.c, dqdkVar.c)) {
            return false;
        }
        int i = dqdkVar.g;
        int i2 = dqdkVar.h;
        Integer num = dqdkVar.i;
        if (!fdbq.f(null, null)) {
            return false;
        }
        Integer num2 = dqdkVar.j;
        return fdbq.f(null, null) && this.d == dqdkVar.d && fdbq.f(this.e, dqdkVar.e) && fdbq.f(this.f, dqdkVar.f);
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + R.string.audio_recording_start_failed) * 31) + R.string.audio_recording_error) * 29791) + (true != this.d ? 1237 : 1231)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "VoiceRecordingConfiguration(outputFileProvider=" + this.a + ", encoding=" + this.b + ", eventObserver=" + this.c + ", recordingStartErrorMessage=2132082985, recordingErrorMessage=2132082983, recordingStartedSound=null, recordingStoppedSound=null, enableSavingAudioLevels=" + this.d + ", minimumAttachmentDuration=" + this.e + ", audioLevelPollInterval=" + this.f + ")";
    }
}
