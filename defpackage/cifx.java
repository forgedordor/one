package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
class cifx extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        ciga cigaVar = (ciga) obj;
        int iOrdinal = cigaVar.ordinal();
        if (iOrdinal == 0) {
            return aucp.SUBJECT_UPDATE;
        }
        if (iOrdinal == 1) {
            return aucp.REMOVE_PARTICIPANT_BY_ALL;
        }
        if (iOrdinal == 2) {
            return aucp.REMOVE_PARTICIPANT_BY_ADMIN;
        }
        if (iOrdinal == 3) {
            return aucp.ICON_UPDATE;
        }
        if (iOrdinal == 4) {
            return aucp.INVITE_LINK_UPDATE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(cigaVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        aucp aucpVar = (aucp) obj;
        ciga cigaVar = ciga.NAME_CHANGE;
        int iOrdinal = aucpVar.ordinal();
        if (iOrdinal == 1) {
            return ciga.NAME_CHANGE;
        }
        if (iOrdinal == 2) {
            return ciga.REMOVE_USER_BY_ALL;
        }
        if (iOrdinal == 3) {
            return ciga.REMOVE_USER_BY_ADMIN;
        }
        if (iOrdinal == 4) {
            return ciga.ICON_CHANGE;
        }
        if (iOrdinal == 5) {
            return ciga.INVITE_LINK_CHANGE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(aucpVar.toString()));
    }
}
