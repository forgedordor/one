package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgak extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        febu febuVar = (febu) obj;
        int iOrdinal = febuVar.ordinal();
        if (iOrdinal == 0) {
            return ezkt.UNKNOWN_MESSAGE_ORIGIN;
        }
        if (iOrdinal == 1) {
            return ezkt.COLLIDER_FIRST_FANOUT_ATTEMPT;
        }
        if (iOrdinal == 2) {
            return ezkt.COLLIDER_SECOND_FANOUT_ATTEMPT;
        }
        if (iOrdinal == 3) {
            return ezkt.INITIAL_PULL_MESSAGES;
        }
        if (iOrdinal == 4) {
            return ezkt.UNRECOGNIZED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(febuVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        ezkt ezktVar = (ezkt) obj;
        int iOrdinal = ezktVar.ordinal();
        if (iOrdinal == 0) {
            return febu.UNKNOWN_MESSAGE_ORIGIN;
        }
        if (iOrdinal == 1) {
            return febu.COLLIDER_FIRST_FANOUT_ATTEMPT;
        }
        if (iOrdinal == 2) {
            return febu.COLLIDER_SECOND_FANOUT_ATTEMPT;
        }
        if (iOrdinal == 3) {
            return febu.INITIAL_PULL_MESSAGES;
        }
        if (iOrdinal == 4) {
            return febu.UNRECOGNIZED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(ezktVar.toString()));
    }
}
