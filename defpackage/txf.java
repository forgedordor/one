package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class txf extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        eqli eqliVar = (eqli) obj;
        int iOrdinal = eqliVar.ordinal();
        if (iOrdinal == 0) {
            return epkj.NOT_SET;
        }
        if (iOrdinal == 1) {
            return epkj.RESTORE;
        }
        if (iOrdinal == 2) {
            return epkj.BACKUP;
        }
        if (iOrdinal == 3) {
            return epkj.FAILED;
        }
        if (iOrdinal == 4) {
            return epkj.COMPLETE;
        }
        if (iOrdinal == 5) {
            return epkj.UNRECOGNIZED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(eqliVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        epkj epkjVar = (epkj) obj;
        int iOrdinal = epkjVar.ordinal();
        if (iOrdinal == 0) {
            return eqli.INITIAL_SYNC_STATE_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return eqli.RESTORE;
        }
        if (iOrdinal == 2) {
            return eqli.BACKUP;
        }
        if (iOrdinal == 3) {
            return eqli.FAILED;
        }
        if (iOrdinal == 4) {
            return eqli.COMPLETE;
        }
        if (iOrdinal == 5) {
            return eqli.UNRECOGNIZED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(epkjVar.toString()));
    }
}
