package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsbk {
    public static final dssp a(etli etliVar) {
        if (etliVar != null) {
            int iOrdinal = etliVar.ordinal();
            if (iOrdinal == 1) {
                return dssp.ACTION_POSITIVE;
            }
            if (iOrdinal == 2) {
                return dssp.ACTION_NEGATIVE;
            }
            if (iOrdinal == 3) {
                return dssp.ACTION_DISMISS;
            }
            if (iOrdinal == 4) {
                return dssp.ACTION_ACKNOWLEDGE;
            }
        }
        return dssp.ACTION_UNKNOWN;
    }

    public static final int b(etnj etnjVar) {
        etnjVar.getClass();
        int i = etnjVar.c;
        if (i == 5) {
            return 6;
        }
        if (i == 3) {
            return 4;
        }
        int iA = etlv.a((i == 2 ? (etly) etnjVar.d : etly.a).m);
        if (iA != 0 && iA == 5) {
            return 3;
        }
        int i2 = etnjVar.c;
        int iA2 = etlv.a((i2 == 2 ? (etly) etnjVar.d : etly.a).m);
        if (iA2 != 0 && iA2 == 7) {
            return 2;
        }
        if (i2 == 6) {
            return 5;
        }
        if (i2 == 11) {
            return 7;
        }
        etni etniVarB = etni.b(etnjVar.e);
        if (etniVarB == null) {
            etniVarB = etni.UITYPE_NONE;
        }
        return etniVarB == etni.UITYPE_RATING_NATIVE_STORE_REVIEW_DIALOG ? 8 : 1;
    }
}
