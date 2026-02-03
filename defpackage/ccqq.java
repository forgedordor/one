package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccqq {
    public static final ccqq a = new ccqq();

    private ccqq() {
    }

    private static final atav b(ccam ccamVar) {
        int iOrdinal = ccamVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return atav.SUCCESS;
        }
        if (iOrdinal == 3) {
            return atav.FAIL_RETRY;
        }
        if (iOrdinal == 4) {
            return atav.FAIL_NO_RETRY;
        }
        throw new fctg();
    }

    public final atav a(ccan ccanVar) {
        ccanVar.getClass();
        if (ccanVar instanceof ccah) {
            return b(((ccah) ccanVar).a);
        }
        if (ccanVar instanceof ccai) {
            return atav.SUCCESS;
        }
        if (ccanVar instanceof ccag) {
            return b(((ccag) ccanVar).a);
        }
        if (ccanVar instanceof ccak) {
            return b(((ccak) ccanVar).a);
        }
        if (ccanVar instanceof ccal) {
            return atav.SUCCESS;
        }
        if (ccanVar instanceof ccaj) {
            return atav.SUCCESS;
        }
        if (ccanVar instanceof ccae) {
            return atav.SUCCESS;
        }
        if (ccanVar instanceof ccaf) {
            return atav.SUCCESS;
        }
        throw new fctg();
    }
}
