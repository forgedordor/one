package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsiv extends dqqf implements bsgt {
    @Deprecated
    public bsiv(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bsjc bsjcVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, PartsTable.a, dqwjVar, dqtmVar, bsjcVar);
    }

    public final long A() {
        return getLong(cO(12, PartsTable.a));
    }

    public final long B() {
        return getLong(cO(10, PartsTable.a));
    }

    public final Uri C() {
        String string = getString(cO(6, PartsTable.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri D() {
        String string = getString(cO(7, PartsTable.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final ConversationIdType E() {
        return new ConversationIdType(getLong(cO(15, PartsTable.a)));
    }

    public final MessageIdType F() {
        return new MessageIdType(getLong(cO(1, PartsTable.a)));
    }

    public final bvdg G() {
        return bvdf.a(getString(cO(17, PartsTable.a)));
    }

    public final bvdg H() {
        return bvdf.a(getString(cO(16, PartsTable.a)));
    }

    public final bvdl I() {
        bvdl[] bvdlVarArrValues = bvdl.values();
        int i = getInt(cO(14, PartsTable.a));
        if (i < bvdlVarArrValues.length) {
            return bvdlVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final bvdq J() {
        bvdq[] bvdqVarArrValues = bvdq.values();
        int i = getInt(cO(51, PartsTable.a));
        if (i < bvdqVarArrValues.length) {
            return bvdqVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final bvdr K() {
        bvdr[] bvdrVarArrValues = bvdr.values();
        int i = getInt(cO(46, PartsTable.a));
        if (i < bvdrVarArrValues.length) {
            return bvdrVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final bvdt L() {
        bvdt[] bvdtVarArrValues = bvdt.values();
        int i = getInt(cO(13, PartsTable.a));
        if (i < bvdtVarArrValues.length) {
            return bvdtVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final bvdy M() {
        bvdy[] bvdyVarArrValues = bvdy.values();
        int i = getInt(cO(50, PartsTable.a));
        if (i < bvdyVarArrValues.length) {
            return bvdyVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final bvef N() {
        bvef[] bvefVarArrValues = bvef.values();
        int i = getInt(cO(48, PartsTable.a));
        if (i < bvefVarArrValues.length) {
            return bvefVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final dqbw O() {
        byte[] blob = getBlob(cO(47, PartsTable.a));
        if (blob == null) {
            return null;
        }
        try {
            return (dqbw) evsn.parseFrom(dqbw.a, blob, evrr.a());
        } catch (Throwable unused) {
            return dqbw.a;
        }
    }

    public final String P() {
        return getString(cO(27, PartsTable.a));
    }

    public final String Q() {
        return getString(cO(5, PartsTable.a));
    }

    public final String R() {
        return getString(cO(33, PartsTable.a));
    }

    public final String S() {
        return getString(cO(34, PartsTable.a));
    }

    public final String T() {
        return getString(cO(22, PartsTable.a));
    }

    public final String U() {
        return getString(cO(3, PartsTable.a));
    }

    public final String V() {
        return cssq.a(getString(cO(2, PartsTable.a)));
    }

    public final boolean W() {
        return getInt(cO(43, PartsTable.a)) == 1;
    }

    public final boolean X() {
        return getInt(cO(31, PartsTable.a)) == 1;
    }

    public final boolean Y() {
        return getInt(cO(38, PartsTable.a)) == 1;
    }

    public final boolean Z() {
        return getInt(cO(42, PartsTable.a)) == 1;
    }

    public final String[] aA() {
        return (String[]) dqru.D(null, du(getString(cO(45, PartsTable.a))), new String[0]);
    }

    public final boolean[] aB() {
        return dqru.E(null, dv(getString(cO(43, PartsTable.a))));
    }

    public final boolean[] aC() {
        return dqru.E(null, dv(getString(cO(31, PartsTable.a))));
    }

    public final boolean[] aD() {
        return dqru.E(null, dv(getString(cO(38, PartsTable.a))));
    }

    public final byte[][] aE() {
        return dqru.F(null, dD(getString(cO(30, PartsTable.a))));
    }

    public final byte[][] aF() {
        return dqru.F(null, dD(getString(cO(29, PartsTable.a))));
    }

    public final byte[][] aG() {
        return dqru.F(null, dD(getString(cO(41, PartsTable.a))));
    }

    public final boolean aa() {
        return getInt(cO(52, PartsTable.a)) == 1;
    }

    public final byte[] ab() {
        return getBlob(cO(30, PartsTable.a));
    }

    public final byte[] ac() {
        return getBlob(cO(29, PartsTable.a));
    }

    public final byte[] ad() {
        return getBlob(cO(41, PartsTable.a));
    }

    public final byte[] ae() {
        return getBlob(cO(40, PartsTable.a));
    }

    public final double[] af() {
        return dqru.H(dq(getString(cO(20, PartsTable.a))));
    }

    public final int[] ag() {
        return dqru.A(null, ds(getString(cO(25, PartsTable.a))));
    }

    public final int[] ah() {
        return dqru.A(null, ds(getString(cO(9, PartsTable.a))));
    }

    public final long[] ai() {
        return dqru.C(null, dt(getString(cO(32, PartsTable.a))));
    }

    public final long[] aj() {
        return dqru.C(null, dt(getString(cO(39, PartsTable.a))));
    }

    public final long[] ak() {
        return dqru.C(null, dt(getString(cO(35, PartsTable.a))));
    }

    public final long[] al() {
        return dqru.C(null, dt(getString(cO(44, PartsTable.a))));
    }

    public final Uri[] am() {
        String[] strArrDu = du(getString(cO(23, PartsTable.a)));
        int length = strArrDu.length;
        Uri[] uriArr = new Uri[length];
        int i = 0;
        int i2 = 0;
        while (true) {
            Uri uri = null;
            if (i >= length) {
                return (Uri[]) dqru.D(null, uriArr, new Uri[0]);
            }
            String str = strArrDu[i];
            int i3 = i2 + 1;
            if (str != null && str.length() != 0) {
                uri = Uri.parse(str);
            }
            uriArr[i2] = uri;
            i++;
            i2 = i3;
        }
    }

    public final ConversationIdType[] an() {
        long[] jArrDt = dt(getString(cO(15, PartsTable.a)));
        int length = jArrDt.length;
        ConversationIdType[] conversationIdTypeArr = new ConversationIdType[length];
        for (int i = 0; i < length; i++) {
            conversationIdTypeArr[i] = new ConversationIdType(jArrDt[i]);
        }
        return (ConversationIdType[]) dqru.D(null, conversationIdTypeArr, new ConversationIdType[0]);
    }

    public final bvdl[] ao() {
        int[] iArrDs = ds(getString(cO(14, PartsTable.a)));
        bvdl[] bvdlVarArrValues = bvdl.values();
        int length = bvdlVarArrValues.length;
        bvdl[] bvdlVarArr = new bvdl[iArrDs.length];
        for (int i = 0; i < iArrDs.length; i++) {
            int i2 = iArrDs[i];
            if (i2 >= length) {
                throw new IllegalStateException();
            }
            bvdlVarArr[i] = bvdlVarArrValues[i2];
        }
        return (bvdl[]) dqru.D(null, bvdlVarArr, new bvdl[0]);
    }

    public final bvdq[] ap() {
        int[] iArrDs = ds(getString(cO(51, PartsTable.a)));
        bvdq[] bvdqVarArrValues = bvdq.values();
        int length = bvdqVarArrValues.length;
        bvdq[] bvdqVarArr = new bvdq[iArrDs.length];
        for (int i = 0; i < iArrDs.length; i++) {
            int i2 = iArrDs[i];
            if (i2 >= length) {
                throw new IllegalStateException();
            }
            bvdqVarArr[i] = bvdqVarArrValues[i2];
        }
        return (bvdq[]) dqru.D(null, bvdqVarArr, new bvdq[0]);
    }

    public final bvdr[] aq() {
        int[] iArrDs = ds(getString(cO(46, PartsTable.a)));
        bvdr[] bvdrVarArrValues = bvdr.values();
        int length = bvdrVarArrValues.length;
        bvdr[] bvdrVarArr = new bvdr[iArrDs.length];
        for (int i = 0; i < iArrDs.length; i++) {
            int i2 = iArrDs[i];
            if (i2 >= length) {
                throw new IllegalStateException();
            }
            bvdrVarArr[i] = bvdrVarArrValues[i2];
        }
        return (bvdr[]) dqru.D(null, bvdrVarArr, new bvdr[0]);
    }

    public final String[] ar() {
        return (String[]) dqru.D(null, du(getString(cO(27, PartsTable.a))), new String[0]);
    }

    public final String[] as() {
        return (String[]) dqru.D(null, du(getString(cO(26, PartsTable.a))), new String[0]);
    }

    public final String[] at() {
        return (String[]) dqru.D(null, du(getString(cO(37, PartsTable.a))), new String[0]);
    }

    public final String[] au() {
        return (String[]) dqru.D(null, du(getString(cO(28, PartsTable.a))), new String[0]);
    }

    public final String[] av() {
        return (String[]) dqru.D(null, du(getString(cO(36, PartsTable.a))), new String[0]);
    }

    public final String[] aw() {
        return (String[]) dqru.D(null, du(getString(cO(5, PartsTable.a))), new String[0]);
    }

    public final String[] ax() {
        return (String[]) dqru.D(null, du(getString(cO(33, PartsTable.a))), new String[0]);
    }

    public final String[] ay() {
        return (String[]) dqru.D(null, du(getString(cO(34, PartsTable.a))), new String[0]);
    }

    public final String[] az() {
        return (String[]) dqru.D(null, du(getString(cO(0, PartsTable.a))), new String[0]);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bsch();
    }

    @Override // defpackage.bsgt
    public final int c() {
        return getInt(cO(24, PartsTable.a));
    }

    @Override // defpackage.bsgt
    public final long e() {
        return getLong(cO(44, PartsTable.a));
    }

    @Override // defpackage.bsgt
    public final Uri f() {
        String string = getString(cO(23, PartsTable.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:435:0x0c20  */
    @Override // defpackage.dqqf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ekgb fI(defpackage.dqth r65) {
        /*
            Method dump skipped, instructions count: 3549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsiv.fI(dqth):ekgb");
    }

    @Override // defpackage.bsgt
    public final Uri g() {
        String string = getString(cO(21, PartsTable.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    @Override // defpackage.bsgt
    public final Uri h() {
        String string = getString(cO(11, PartsTable.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    @Override // defpackage.bsgt
    public final Uri i() {
        String string = getString(cO(4, PartsTable.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    @Override // defpackage.bsgt
    public final athh j() {
        return athg.a(getString(cO(49, PartsTable.a)));
    }

    @Override // defpackage.bsgt
    public final ekgb k() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            if (V() != null) {
                ekfwVar.h(V());
            }
        }
        return ekfwVar.g();
    }

    @Override // defpackage.bsgt
    public final String l() {
        return getString(cO(26, PartsTable.a));
    }

    @Override // defpackage.bsgt
    public final String m() {
        return getString(cO(37, PartsTable.a));
    }

    @Override // defpackage.bsgt
    public final String n() {
        return getString(cO(28, PartsTable.a));
    }

    @Override // defpackage.bsgt
    public final String o() {
        return getString(cO(36, PartsTable.a));
    }

    @Override // defpackage.bsgt
    public final String p() {
        return getString(cO(0, PartsTable.a));
    }

    @Override // defpackage.bsgt
    public final String q() {
        return getString(cO(45, PartsTable.a));
    }

    public final double r() {
        return getDouble(cO(20, PartsTable.a));
    }

    public final double s() {
        return getDouble(cO(19, PartsTable.a));
    }

    public final int t() {
        return getInt(cO(25, PartsTable.a));
    }

    public final int u() {
        return getInt(cO(9, PartsTable.a));
    }

    public final int v() {
        return getInt(cO(8, PartsTable.a));
    }

    public final long w() {
        return getLong(cO(32, PartsTable.a));
    }

    public final long x() {
        return getLong(cO(39, PartsTable.a));
    }

    public final long y() {
        return getLong(cO(35, PartsTable.a));
    }

    public final long z() {
        return getLong(cO(18, PartsTable.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
