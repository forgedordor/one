package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlre {
    public final String a;
    public final fdae b;
    private final boolean c = false;
    private final boolean d = true;

    public dlre(String str, fdae fdaeVar) {
        this.a = str;
        this.b = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlre)) {
            return false;
        }
        dlre dlreVar = (dlre) obj;
        boolean z = dlreVar.c;
        if (!fdbq.f(this.a, dlreVar.a)) {
            return false;
        }
        boolean z2 = dlreVar.d;
        return fdbq.f(this.b, dlreVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iA = dlrd.a(false);
        fdae fdaeVar = this.b;
        return (((((iA * 31) + iHashCode) * 31) + dlrd.a(true)) * 31) + (fdaeVar != null ? fdaeVar.hashCode() : 0);
    }

    public final String toString() {
        return "VideoControlsUiData(isPlaying=false, formattedTimeString=" + this.a + ", showPlayPauseButton=true, onPlayButtonClick=" + this.b + ")";
    }
}
