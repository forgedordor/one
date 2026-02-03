package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class luz {
    public static final lva a(lvb lvbVar) {
        lvbVar.getClass();
        int iOrdinal = lvbVar.ordinal();
        if (iOrdinal == 2) {
            return lva.ON_DESTROY;
        }
        if (iOrdinal == 3) {
            return lva.ON_STOP;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return lva.ON_PAUSE;
    }

    public static final lva b(lvb lvbVar) {
        lvbVar.getClass();
        int iOrdinal = lvbVar.ordinal();
        if (iOrdinal == 1) {
            return lva.ON_CREATE;
        }
        if (iOrdinal == 2) {
            return lva.ON_START;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return lva.ON_RESUME;
    }

    public static final lva c(lvb lvbVar) {
        lvbVar.getClass();
        int iOrdinal = lvbVar.ordinal();
        if (iOrdinal == 2) {
            return lva.ON_CREATE;
        }
        if (iOrdinal == 3) {
            return lva.ON_START;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return lva.ON_RESUME;
    }
}
