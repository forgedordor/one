package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dsil extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        etnw etnwVar = (etnw) obj;
        int iOrdinal = etnwVar.ordinal();
        if (iOrdinal == 0) {
            return evmr.PULSE_WITH_INNER_CIRCLE;
        }
        if (iOrdinal == 1) {
            return evmr.PULSE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(etnwVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        evmr evmrVar = (evmr) obj;
        int iOrdinal = evmrVar.ordinal();
        if (iOrdinal == 1) {
            return etnw.PULSE_WITH_INNER_CIRCLE;
        }
        if (iOrdinal == 2) {
            return etnw.PULSE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(evmrVar.toString()));
    }
}
