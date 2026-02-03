package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsbe extends dqqf implements brzj {
    @Deprecated
    public bsbe(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bsbm bsbmVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, ParticipantsTable.a, dqwjVar, dqtmVar, bsbmVar);
    }

    public final int A() {
        return getInt(cO(26, ParticipantsTable.a));
    }

    public final long B() {
        return getLong(cO(34, ParticipantsTable.a));
    }

    public final long C() {
        return getLong(cO(10, ParticipantsTable.a));
    }

    public final Uri D() {
        String string = getString(cO(15, ParticipantsTable.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final alwm E() {
        return alwm.b(getInt(cO(39, ParticipantsTable.a)));
    }

    public final anuc F() {
        byte[] blob = getBlob(cO(44, ParticipantsTable.a));
        if (blob == null) {
            return null;
        }
        try {
            return (anuc) evsn.parseFrom(anuc.a, blob, evrr.a());
        } catch (Throwable unused) {
            return anuc.a;
        }
    }

    public final axcm G() {
        return axcn.a(getString(cO(1, ParticipantsTable.a)));
    }

    public final axcm H() {
        return axcn.a(getString(cO(2, ParticipantsTable.a)));
    }

    public final bbaj I() {
        return bbam.a(getString(cO(40, ParticipantsTable.a)));
    }

    public final chpm J() {
        return chpm.b(getInt(cO(43, ParticipantsTable.a)));
    }

    public final chpq K() {
        return chpq.b(getInt(cO(41, ParticipantsTable.a)));
    }

    public final String L() {
        return getString(cO(27, ParticipantsTable.a));
    }

    public final String M() {
        return getString(cO(30, ParticipantsTable.a));
    }

    public final String N() {
        return cssq.a(getString(cO(8, ParticipantsTable.a)));
    }

    public final String O() {
        return getString(cO(24, ParticipantsTable.a));
    }

    public final String P() {
        return cssq.a(getString(cO(9, ParticipantsTable.a)));
    }

    public final String Q() {
        return cssb.a(getString(cO(7, ParticipantsTable.a)));
    }

    public final String R() {
        return getString(cO(37, ParticipantsTable.a));
    }

    public final String S() {
        return cssq.a(getString(cO(13, ParticipantsTable.a)));
    }

    public final String T() {
        return cssq.a(getString(cO(12, ParticipantsTable.a)));
    }

    public final String U() {
        return getString(cO(17, ParticipantsTable.a));
    }

    public final String V() {
        return getString(cO(32, ParticipantsTable.a));
    }

    public final String W() {
        return getString(cO(11, ParticipantsTable.a));
    }

    public final String X() {
        return getString(cO(22, ParticipantsTable.a));
    }

    public final boolean Y() {
        return getInt(cO(35, ParticipantsTable.a)) == 1;
    }

    public final boolean Z() {
        return getInt(cO(45, ParticipantsTable.a)) == 1;
    }

    public final boolean aa() {
        return getInt(cO(36, ParticipantsTable.a)) == 1;
    }

    public final byte[] ab() {
        return getBlob(cO(33, ParticipantsTable.a));
    }

    public final cpyi[] ac() {
        int[] iArrDs = ds(getString(cO(38, ParticipantsTable.a)));
        cpyi[] cpyiVarArrValues = cpyi.values();
        int length = cpyiVarArrValues.length;
        cpyi[] cpyiVarArr = new cpyi[iArrDs.length];
        for (int i = 0; i < iArrDs.length; i++) {
            int i2 = iArrDs[i];
            if (i2 >= length) {
                throw new IllegalStateException();
            }
            cpyiVarArr[i] = cpyiVarArrValues[i2];
        }
        return (cpyi[]) dqru.D(null, cpyiVarArr, new cpyi[0]);
    }

    public final String[] ad() {
        return (String[]) dqru.D(null, du(getString(cO(27, ParticipantsTable.a))), new String[0]);
    }

    public final String[] ae() {
        return (String[]) dqru.D(null, du(getString(cO(30, ParticipantsTable.a))), new String[0]);
    }

    public final boolean[] af() {
        return dqru.E(null, dv(getString(cO(21, ParticipantsTable.a))));
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new brvl();
    }

    @Override // defpackage.brzj
    public final int c() {
        return getInt(cO(29, ParticipantsTable.a));
    }

    @Override // defpackage.brzj
    public final long e() {
        return getLong(cO(16, ParticipantsTable.a));
    }

    @Override // defpackage.brzj
    public final Uri f() {
        String string = getString(cO(14, ParticipantsTable.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:511:0x0c49 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.dqqf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ekgb fI(defpackage.dqth r59) {
        /*
            Method dump skipped, instructions count: 3549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsbe.fI(dqth):ekgb");
    }

    @Override // defpackage.brzj
    public final bvdz g() {
        bvdz[] bvdzVarArrValues = bvdz.values();
        int i = getInt(cO(31, ParticipantsTable.a));
        if (i < bvdzVarArrValues.length) {
            return bvdzVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.brzj
    public final chpq h() {
        return chpq.b(getInt(cO(42, ParticipantsTable.a)));
    }

    @Override // defpackage.brzj
    public final cpyi i() {
        cpyi[] cpyiVarArrValues = cpyi.values();
        int i = getInt(cO(38, ParticipantsTable.a));
        if (i < cpyiVarArrValues.length) {
            return cpyiVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.brzj
    public final ekgb j() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            if (M() != null) {
                ekfwVar.h(M());
            }
        }
        return ekfwVar.g();
    }

    @Override // defpackage.brzj
    public final ekgb k() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            if (o() != null) {
                ekfwVar.h(o());
            }
        }
        return ekfwVar.g();
    }

    @Override // defpackage.brzj
    public final ekgb l() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            if (p() != null) {
                ekfwVar.h(p());
            }
        }
        return ekfwVar.g();
    }

    @Override // defpackage.brzj
    public final ekgb m() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            if (q() != null) {
                ekfwVar.h(q());
            }
        }
        return ekfwVar.g();
    }

    @Override // defpackage.brzj
    public final ekgb n() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            y();
            ekfwVar.h(Integer.valueOf(y()));
        }
        return ekfwVar.g();
    }

    @Override // defpackage.brzj
    public final String o() {
        return getString(cO(0, ParticipantsTable.a));
    }

    @Override // defpackage.brzj
    public final String p() {
        return cssb.a(getString(cO(5, ParticipantsTable.a)));
    }

    @Override // defpackage.brzj
    public final String q() {
        return cssb.a(getString(cO(6, ParticipantsTable.a)));
    }

    @Override // defpackage.brzj
    public final boolean r() {
        return getInt(cO(21, ParticipantsTable.a)) == 1;
    }

    @Override // defpackage.brzj
    public final boolean s() {
        return getInt(cO(28, ParticipantsTable.a)) == 1;
    }

    public final int t() {
        return getInt(cO(18, ParticipantsTable.a));
    }

    public final int u() {
        return getInt(cO(19, ParticipantsTable.a));
    }

    public final int v() {
        return getInt(cO(20, ParticipantsTable.a));
    }

    public final int w() {
        return getInt(cO(25, ParticipantsTable.a));
    }

    public final int x() {
        return getInt(cO(4, ParticipantsTable.a));
    }

    public final int y() {
        return getInt(cO(3, ParticipantsTable.a));
    }

    public final int z() {
        return getInt(cO(23, ParticipantsTable.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
