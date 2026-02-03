package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsmh extends dqqf implements bsln {
    @Deprecated
    public bsmh(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bsmo bsmoVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bsmv.a, dqwjVar, dqtmVar, bsmoVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bsjt();
    }

    @Override // defpackage.bsln
    public final basd c() {
        return basd.a(getString(cO(0, bsmv.a)));
    }

    @Override // defpackage.bsln
    public final ekgb e() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            if (o() != null) {
                ekfwVar.h(o());
            }
        }
        return ekfwVar.g();
    }

    public final int f() {
        return getInt(cO(9, bsmv.a));
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x04b1  */
    @Override // defpackage.dqqf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ekgb fI(defpackage.dqth r31) {
        /*
            Method dump skipped, instructions count: 1421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsmh.fI(dqth):ekgb");
    }

    public final long g() {
        return getLong(cO(7, bsmv.a));
    }

    public final long h() {
        return getLong(cO(6, bsmv.a));
    }

    public final long i() {
        return getLong(cO(10, bsmv.a));
    }

    public final bvdv j() {
        bvdv[] bvdvVarArrValues = bvdv.values();
        int i = getInt(cO(11, bsmv.a));
        if (i < bvdvVarArrValues.length) {
            return bvdvVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final eyga k() {
        byte[] blob = getBlob(cO(12, bsmv.a));
        if (blob == null) {
            return null;
        }
        try {
            return (eyga) evsn.parseFrom(eyga.a, blob, evrr.a());
        } catch (Throwable unused) {
            return eyga.a;
        }
    }

    public final String l() {
        return getString(cO(15, bsmv.a));
    }

    public final String m() {
        return getString(cO(4, bsmv.a));
    }

    public final String n() {
        return getString(cO(14, bsmv.a));
    }

    public final String o() {
        return getString(cO(3, bsmv.a));
    }

    public final String p() {
        return getString(cO(5, bsmv.a));
    }

    public final String q() {
        return getString(cO(1, bsmv.a));
    }

    public final String r() {
        return getString(cO(2, bsmv.a));
    }

    public final String s() {
        return getString(cO(8, bsmv.a));
    }

    public final boolean t() {
        return getInt(cO(16, bsmv.a)) == 1;
    }

    public final boolean u() {
        return getInt(cO(17, bsmv.a)) == 1;
    }

    public final boolean v() {
        return getInt(cO(13, bsmv.a)) == 1;
    }

    public final boolean w() {
        return getInt(cO(18, bsmv.a)) == 1;
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
