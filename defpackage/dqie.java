package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqie {
    private final boolean a = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqie)) {
            return false;
        }
        boolean z = ((dqie) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1231;
    }

    public final String toString() {
        return "VoiceScreenFlags(keepScreenOnDuringVoiceRecording=true)";
    }
}
