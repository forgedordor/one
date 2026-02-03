package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum ajlq {
    SENDING,
    SENT,
    DELIVERED,
    SEEN,
    ERROR,
    RETRYING;

    public final boolean a(ajlq ajlqVar) {
        if (this == ajlqVar) {
            return false;
        }
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return ajlqVar == ERROR || ajlqVar == SEEN;
                }
                if (iOrdinal != 4 && iOrdinal != 5) {
                    return false;
                }
            } else if (ajlqVar != ERROR && ajlqVar != DELIVERED && ajlqVar != RETRYING && ajlqVar != SEEN) {
                return false;
            }
        }
        return true;
    }

    public final boolean b() {
        return this == SEEN;
    }
}
