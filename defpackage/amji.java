package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amji {
    public final String a;
    public final int b;
    private final Locale c;

    public amji(String str, int i, Locale locale) {
        this.a = str;
        this.b = i;
        this.c = locale;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amji)) {
            return false;
        }
        amji amjiVar = (amji) obj;
        return fdbq.f(this.a, amjiVar.a) && this.b == amjiVar.b && fdbq.f(this.c, amjiVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i = this.b;
        Locale locale = this.c;
        return (((iHashCode * 31) + i) * 31) + (locale != null ? locale.hashCode() : 0);
    }

    public final String toString() {
        String str;
        String str2 = this.a;
        CharSequence charSequenceC = str2 != null ? cqcy.c(str2) : null;
        int i = this.b;
        Locale locale = this.c;
        StringBuilder sb = new StringBuilder("VoiceTranscription(transcription=");
        sb.append((Object) charSequenceC);
        sb.append(", status=");
        switch (i) {
            case 1:
                str = "VMT_STATUS_UNKNOWN";
                break;
            case 2:
                str = "VMT_STATUS_QUEUED";
                break;
            case 3:
                str = "VMT_STATUS_IN_PROGRESS";
                break;
            case 4:
                str = "VMT_STATUS_COMPLETE";
                break;
            case 5:
                str = "VMT_STATUS_ERROR_UNKNOWN";
                break;
            case 6:
                str = "VMT_STATUS_ERROR_TEMPORARY";
                break;
            default:
                str = "VMT_STATUS_ERROR_PERMANENT";
                break;
        }
        sb.append((Object) str);
        sb.append(", locale=");
        sb.append(locale);
        sb.append(")");
        return sb.toString();
    }
}
