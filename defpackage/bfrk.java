package defpackage;

import android.database.Cursor;
import android.net.Uri;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bfrk extends dqqf implements bfrj {
    @Deprecated
    public bfrk(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bfrm bfrmVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bfrt.a, dqwjVar, dqtmVar, bfrmVar);
    }

    public final int A() {
        return getInt(cO(24, bfrt.a));
    }

    public final int B() {
        return getInt(cO(11, bfrt.a));
    }

    public final int C() {
        return getInt(cO(163, bfrt.a));
    }

    public final long D() {
        return getLong(cO(EnergyProfile.EVCONNECTOR_TYPE_OTHER, bfrt.a));
    }

    public final long E() {
        return getLong(cO(110, bfrt.a));
    }

    public final long F() {
        return getLong(cO(172, bfrt.a));
    }

    public final long G() {
        return getLong(cO(133, bfrt.a));
    }

    public final long H() {
        return getLong(cO(174, bfrt.a));
    }

    public final long I() {
        return getLong(cO(85, bfrt.a));
    }

    public final long J() {
        return getLong(cO(59, bfrt.a));
    }

    public final long K() {
        return getLong(cO(14, bfrt.a));
    }

    public final long L() {
        return getLong(cO(15, bfrt.a));
    }

    public final long M() {
        return getLong(cO(23, bfrt.a));
    }

    public final long N() {
        return getLong(cO(161, bfrt.a));
    }

    public final long O() {
        return getLong(cO(3, bfrt.a));
    }

    public final long P() {
        return getLong(cO(12, bfrt.a));
    }

    public final Uri Q() {
        String string = getString(cO(143, bfrt.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri R() {
        String string = getString(cO(52, bfrt.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri S() {
        String string = getString(cO(100, bfrt.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri T() {
        String string = getString(cO(10, bfrt.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri U() {
        String string = getString(cO(169, bfrt.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final athh V() {
        return athg.a(getString(cO(90, bfrt.a)));
    }

    public final ConversationIdType W() {
        return new ConversationIdType(getLong(cO(1, bfrt.a)));
    }

    public final ConversationIdType X() {
        return new ConversationIdType(getLong(cO(56, bfrt.a)));
    }

    public final MessageIdType Y() {
        return new MessageIdType(getLong(cO(131, bfrt.a)));
    }

    public final MessageIdType Z() {
        return new MessageIdType(getLong(cO(42, bfrt.a)));
    }

    public final String aA() {
        return getString(cO(178, bfrt.a));
    }

    public final String aB() {
        return getString(cO(171, bfrt.a));
    }

    public final String aC() {
        return cssq.a(getString(cO(99, bfrt.a)));
    }

    public final String aD() {
        return cssq.a(getString(cO(167, bfrt.a)));
    }

    public final String aE() {
        return cssq.a(getString(cO(98, bfrt.a)));
    }

    public final String aF() {
        return cssq.a(getString(cO(166, bfrt.a)));
    }

    public final String aG() {
        return getString(cO(113, bfrt.a));
    }

    public final String aH() {
        return getString(cO(162, bfrt.a));
    }

    public final String aI() {
        return getString(cO(120, bfrt.a));
    }

    public final String aJ() {
        return getString(cO(138, bfrt.a));
    }

    public final String aK() {
        return cssq.a(getString(cO(135, bfrt.a)));
    }

    public final String aL() {
        return getString(cO(137, bfrt.a));
    }

    public final String aM() {
        return getString(cO(136, bfrt.a));
    }

    public final String aN() {
        return getString(cO(176, bfrt.a));
    }

    public final String aO() {
        return cssq.a(getString(cO(134, bfrt.a)));
    }

    public final String aP() {
        return cssq.a(getString(cO(175, bfrt.a)));
    }

    public final String aQ() {
        return getString(cO(86, bfrt.a));
    }

    public final String aR() {
        return getString(cO(102, bfrt.a));
    }

    public final String aS() {
        return getString(cO(16, bfrt.a));
    }

    public final String aT() {
        return cssq.a(getString(cO(13, bfrt.a)));
    }

    public final String aU() {
        return getString(cO(141, bfrt.a));
    }

    public final String aV() {
        return cssb.a(getString(cO(95, bfrt.a)));
    }

    public final String aW() {
        return cssb.a(getString(cO(164, bfrt.a)));
    }

    public final String aX() {
        return getString(cO(144, bfrt.a));
    }

    public final String aY() {
        return getString(cO(40, bfrt.a));
    }

    public final String aZ() {
        return getString(cO(63, bfrt.a));
    }

    public final MessageIdType aa() {
        return new MessageIdType(getLong(cO(114, bfrt.a)));
    }

    public final MessageIdType ab() {
        return new MessageIdType(getLong(cO(121, bfrt.a)));
    }

    public final basd ac() {
        return basd.a(getString(cO(29, bfrt.a)));
    }

    public final basd ad() {
        return basd.a(getString(cO(19, bfrt.a)));
    }

    public final bvdg ae() {
        return bvdf.a(getString(cO(58, bfrt.a)));
    }

    public final bvdg af() {
        return bvdf.a(getString(cO(57, bfrt.a)));
    }

    public final bvdn ag() {
        bvdn[] bvdnVarArrValues = bvdn.values();
        int i = getInt(cO(33, bfrt.a));
        if (i < bvdnVarArrValues.length) {
            return bvdnVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final bvdq ah() {
        bvdq[] bvdqVarArrValues = bvdq.values();
        int i = getInt(cO(92, bfrt.a));
        if (i < bvdqVarArrValues.length) {
            return bvdqVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final bvdt ai() {
        bvdt[] bvdtVarArrValues = bvdt.values();
        int i = getInt(cO(54, bfrt.a));
        if (i < bvdtVarArrValues.length) {
            return bvdtVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final bvdy aj() {
        bvdy[] bvdyVarArrValues = bvdy.values();
        int i = getInt(cO(91, bfrt.a));
        if (i < bvdyVarArrValues.length) {
            return bvdyVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final bvdz ak() {
        bvdz[] bvdzVarArrValues = bvdz.values();
        int i = getInt(cO(109, bfrt.a));
        if (i < bvdzVarArrValues.length) {
            return bvdzVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final bvef al() {
        bvef[] bvefVarArrValues = bvef.values();
        int i = getInt(cO(89, bfrt.a));
        if (i < bvefVarArrValues.length) {
            return bvefVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final cgrd am() {
        cgrd[] cgrdVarArrValues = cgrd.values();
        int i = getInt(cO(32, bfrt.a));
        if (i < cgrdVarArrValues.length) {
            return cgrdVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final cgvx an() {
        byte[] blob = getBlob(cO(154, bfrt.a));
        if (blob == null) {
            return null;
        }
        try {
            return (cgvx) evsn.parseFrom(cgvx.a, blob, evrr.a());
        } catch (Throwable unused) {
            return cgvx.a;
        }
    }

    public final chpq ao() {
        return chpq.b(getInt(cO(111, bfrt.a)));
    }

    public final chpq ap() {
        return chpq.b(getInt(cO(112, bfrt.a)));
    }

    public final cpyi aq() {
        cpyi[] cpyiVarArrValues = cpyi.values();
        int i = getInt(cO(31, bfrt.a));
        if (i < cpyiVarArrValues.length) {
            return cpyiVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final Optional ar() {
        return basb.b(getLong(cO(150, bfrt.a)));
    }

    public final String as() {
        return getString(cO(179, bfrt.a));
    }

    public final String at() {
        return getString(cO(78, bfrt.a));
    }

    public final String au() {
        return getString(cO(69, bfrt.a));
    }

    public final String av() {
        return getString(cO(26, bfrt.a));
    }

    public final String aw() {
        return getString(cO(170, bfrt.a));
    }

    public final String ax() {
        return getString(cO(142, bfrt.a));
    }

    public final String ay() {
        return cssb.a(getString(cO(97, bfrt.a)));
    }

    public final String az() {
        return cssb.a(getString(cO(165, bfrt.a)));
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bdxn();
    }

    public final int[] bA() {
        return dqru.A(null, ds(getString(cO(128, bfrt.a))));
    }

    public final int[] bB() {
        return dqru.A(dt(getString(94)), ds(getString(cO(50, bfrt.a))));
    }

    public final int[] bC() {
        return dqru.A(null, ds(getString(cO(129, bfrt.a))));
    }

    public final int[] bD() {
        return dqru.A(dt(getString(94)), ds(getString(cO(65, bfrt.a))));
    }

    public final long[] bE() {
        return dqru.C(dt(getString(94)), dt(getString(cO(73, bfrt.a))));
    }

    public final long[] bF() {
        return dqru.C(dt(getString(94)), dt(getString(cO(80, bfrt.a))));
    }

    public final long[] bG() {
        return dqru.C(dt(getString(94)), dt(getString(cO(76, bfrt.a))));
    }

    public final long[] bH() {
        return dqru.C(null, dt(getString(cO(115, bfrt.a))));
    }

    public final long[] bI() {
        return dqru.C(null, dt(getString(cO(122, bfrt.a))));
    }

    public final long[] bJ() {
        return dqru.C(dt(getString(94)), dt(getString(cO(94, bfrt.a))));
    }

    public final long[] bK() {
        return dqru.C(null, dt(getString(cO(119, bfrt.a))));
    }

    public final long[] bL() {
        return dqru.C(null, dt(getString(cO(117, bfrt.a))));
    }

    public final long[] bM() {
        return dqru.C(null, dt(getString(cO(116, bfrt.a))));
    }

    public final long[] bN() {
        return dqru.C(dt(getString(94)), dt(getString(cO(53, bfrt.a))));
    }

    public final long[] bO() {
        return dqru.C(null, dt(getString(cO(123, bfrt.a))));
    }

    public final long[] bP() {
        return dqru.C(null, dt(getString(cO(130, bfrt.a))));
    }

    public final long[] bQ() {
        return dqru.C(dt(getString(159)), dt(getString(cO(159, bfrt.a))));
    }

    public final Uri[] bR() {
        String string = getString(cO(64, bfrt.a));
        long[] jArrDt = dt(getString(94));
        String[] strArrDu = du(string);
        int length = strArrDu.length;
        Uri[] uriArr = new Uri[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str = strArrDu[i];
            int i3 = i2 + 1;
            Uri uri = null;
            if (str != null && str.length() != 0) {
                uri = Uri.parse(str);
            }
            uriArr[i2] = uri;
            i++;
            i2 = i3;
        }
        return (Uri[]) dqru.D(jArrDt, uriArr, new Uri[0]);
    }

    public final Uri[] bS() {
        String string = getString(cO(47, bfrt.a));
        long[] jArrDt = dt(getString(94));
        String[] strArrDu = du(string);
        int length = strArrDu.length;
        Uri[] uriArr = new Uri[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str = strArrDu[i];
            int i3 = i2 + 1;
            Uri uri = null;
            if (str != null && str.length() != 0) {
                uri = Uri.parse(str);
            }
            uriArr[i2] = uri;
            i++;
            i2 = i3;
        }
        return (Uri[]) dqru.D(jArrDt, uriArr, new Uri[0]);
    }

    public final Uri[] bT() {
        String string = getString(cO(62, bfrt.a));
        long[] jArrDt = dt(getString(94));
        String[] strArrDu = du(string);
        int length = strArrDu.length;
        Uri[] uriArr = new Uri[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str = strArrDu[i];
            int i3 = i2 + 1;
            Uri uri = null;
            if (str != null && str.length() != 0) {
                uri = Uri.parse(str);
            }
            uriArr[i2] = uri;
            i++;
            i2 = i3;
        }
        return (Uri[]) dqru.D(jArrDt, uriArr, new Uri[0]);
    }

    public final Uri[] bU() {
        String string = getString(cO(48, bfrt.a));
        long[] jArrDt = dt(getString(94));
        String[] strArrDu = du(string);
        int length = strArrDu.length;
        Uri[] uriArr = new Uri[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str = strArrDu[i];
            int i3 = i2 + 1;
            Uri uri = null;
            if (str != null && str.length() != 0) {
                uri = Uri.parse(str);
            }
            uriArr[i2] = uri;
            i++;
            i2 = i3;
        }
        return (Uri[]) dqru.D(jArrDt, uriArr, new Uri[0]);
    }

    public final Uri[] bV() {
        String string = getString(cO(45, bfrt.a));
        long[] jArrDt = dt(getString(94));
        String[] strArrDu = du(string);
        int length = strArrDu.length;
        Uri[] uriArr = new Uri[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str = strArrDu[i];
            int i3 = i2 + 1;
            Uri uri = null;
            if (str != null && str.length() != 0) {
                uri = Uri.parse(str);
            }
            uriArr[i2] = uri;
            i++;
            i2 = i3;
        }
        return (Uri[]) dqru.D(jArrDt, uriArr, new Uri[0]);
    }

    public final aonp[] bW() {
        String string = getString(cO(156, bfrt.a));
        long[] jArrDt = dt(getString(159));
        int[] iArrDs = ds(string);
        aonp[] aonpVarArr = new aonp[iArrDs.length];
        for (int i = 0; i < iArrDs.length; i++) {
            aonp aonpVarB = aonp.b(iArrDs[i]);
            if (aonpVarB == null) {
                throw new IllegalStateException();
            }
            aonpVarArr[i] = aonpVarB;
        }
        return (aonp[]) dqru.D(jArrDt, aonpVarArr, new aonp[0]);
    }

    public final bvdl[] bX() {
        String string = getString(cO(55, bfrt.a));
        long[] jArrDt = dt(getString(94));
        int[] iArrDs = ds(string);
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
        return (bvdl[]) dqru.D(jArrDt, bvdlVarArr, new bvdl[0]);
    }

    public final bvdr[] bY() {
        String string = getString(cO(87, bfrt.a));
        long[] jArrDt = dt(getString(94));
        int[] iArrDs = ds(string);
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
        return (bvdr[]) dqru.D(jArrDt, bvdrVarArr, new bvdr[0]);
    }

    public final Optional[] bZ() {
        long[] jArrDt = dt(getString(cO(118, bfrt.a)));
        int length = jArrDt.length;
        Optional[] optionalArr = new Optional[length];
        for (int i = 0; i < length; i++) {
            optionalArr[i] = basb.b(jArrDt[i]);
        }
        return (Optional[]) dqru.D(null, optionalArr, new Optional[0]);
    }

    public final String ba() {
        return getString(cO(44, bfrt.a));
    }

    public final String bb() {
        return csrz.a(getString(cO(148, bfrt.a)));
    }

    public final String bc() {
        return getString(cO(147, bfrt.a));
    }

    public final String bd() {
        return cssb.a(getString(cO(96, bfrt.a)));
    }

    public final String be() {
        return getString(cO(25, bfrt.a));
    }

    public final String bf() {
        return cssq.a(getString(cO(168, bfrt.a)));
    }

    public final String bg() {
        return getString(cO(152, bfrt.a));
    }

    public final String bh() {
        return getString(cO(132, bfrt.a));
    }

    public final String bi() {
        return getString(cO(173, bfrt.a));
    }

    public final fhaz bj() {
        byte[] blob = getBlob(cO(34, bfrt.a));
        if (blob == null) {
            return null;
        }
        try {
            return (fhaz) evsn.parseFrom(fhaz.a, blob, evrr.a());
        } catch (Throwable unused) {
            return fhaz.a;
        }
    }

    public final boolean bk() {
        return getInt(cO(84, bfrt.a)) == 1;
    }

    public final boolean bl() {
        return getInt(cO(106, bfrt.a)) == 1;
    }

    public final boolean bm() {
        return getInt(cO(146, bfrt.a)) == 1;
    }

    public final boolean bn() {
        return getInt(cO(108, bfrt.a)) == 1;
    }

    public final boolean bo() {
        return getInt(cO(140, bfrt.a)) == 1;
    }

    public final boolean bp() {
        return getInt(cO(177, bfrt.a)) == 1;
    }

    public final boolean bq() {
        return getInt(cO(139, bfrt.a)) == 1;
    }

    public final boolean br() {
        return getInt(cO(8, bfrt.a)) == 1;
    }

    public final boolean bs() {
        return getInt(cO(93, bfrt.a)) == 1;
    }

    public final boolean bt() {
        return getInt(cO(149, bfrt.a)) == 1;
    }

    public final boolean bu() {
        return getInt(cO(9, bfrt.a)) == 1;
    }

    public final byte[] bv() {
        return getBlob(cO(71, bfrt.a));
    }

    public final byte[] bw() {
        return getBlob(cO(70, bfrt.a));
    }

    public final int[] bx() {
        return dqru.A(dt(getString(94)), ds(getString(cO(66, bfrt.a))));
    }

    public final int[] by() {
        return dqru.A(null, ds(getString(cO(126, bfrt.a))));
    }

    public final int[] bz() {
        return dqru.A(null, ds(getString(cO(127, bfrt.a))));
    }

    @Override // defpackage.bfrj
    public final int c() {
        return getInt(cO(5, bfrt.a));
    }

    public final String[] ca() {
        return (String[]) dqru.D(dt(getString(94)), du(getString(cO(68, bfrt.a))), new String[0]);
    }

    public final String[] cb() {
        return (String[]) dqru.D(dt(getString(94)), du(getString(cO(67, bfrt.a))), new String[0]);
    }

    public final String[] cc() {
        return (String[]) dqru.D(dt(getString(94)), du(getString(cO(77, bfrt.a))), new String[0]);
    }

    public final String[] cd() {
        return (String[]) dqru.D(dt(getString(94)), du(getString(cO(46, bfrt.a))), new String[0]);
    }

    public final String[] ce() {
        return (String[]) dqru.D(dt(getString(94)), du(getString(cO(74, bfrt.a))), new String[0]);
    }

    public final String[] cf() {
        return (String[]) dqru.D(dt(getString(94)), du(getString(cO(75, bfrt.a))), new String[0]);
    }

    public final String[] cg() {
        return (String[]) dqru.D(dt(getString(159)), du(getString(cO(158, bfrt.a))), new String[0]);
    }

    public final String[] ch() {
        String[] strArrDu = du(getString(cO(125, bfrt.a)));
        for (int i = 0; i < strArrDu.length; i++) {
            strArrDu[i] = cssb.a(strArrDu[i]);
        }
        return (String[]) dqru.D(null, strArrDu, new String[0]);
    }

    public final String[] ci() {
        return (String[]) dqru.D(dt(getString(159)), du(getString(cO(155, bfrt.a))), new String[0]);
    }

    public final String[] cj() {
        String string = getString(cO(43, bfrt.a));
        long[] jArrDt = dt(getString(94));
        String[] strArrDu = du(string);
        for (int i = 0; i < strArrDu.length; i++) {
            strArrDu[i] = cssq.a(strArrDu[i]);
        }
        return (String[]) dqru.D(jArrDt, strArrDu, new String[0]);
    }

    public final String[] ck() {
        return (String[]) dqru.D(dt(getString(159)), du(getString(cO(157, bfrt.a))), new String[0]);
    }

    public final String[] cl() {
        return (String[]) dqru.D(null, du(getString(cO(36, bfrt.a))), new String[0]);
    }

    public final String[] cm() {
        return (String[]) dqru.D(null, du(getString(cO(38, bfrt.a))), new String[0]);
    }

    public final String[] cn() {
        return (String[]) dqru.D(null, du(getString(cO(39, bfrt.a))), new String[0]);
    }

    public final String[] co() {
        return (String[]) dqru.D(null, du(getString(cO(37, bfrt.a))), new String[0]);
    }

    public final boolean[] cp() {
        return dqru.E(dt(getString(94)), dv(getString(cO(72, bfrt.a))));
    }

    public final boolean[] cq() {
        return dqru.E(dt(getString(94)), dv(getString(cO(79, bfrt.a))));
    }

    public final boolean[] cr() {
        return dqru.E(dt(getString(94)), dv(getString(cO(83, bfrt.a))));
    }

    public final byte[][] cs() {
        return dqru.F(dt(getString(94)), dD(getString(cO(82, bfrt.a))));
    }

    public final byte[][] ct() {
        return dqru.F(dt(getString(94)), dD(getString(cO(81, bfrt.a))));
    }

    @Override // defpackage.bfrj
    public final int d() {
        return getInt(cO(6, bfrt.a));
    }

    @Override // defpackage.bfrj
    public final long e() {
        return getLong(cO(4, bfrt.a));
    }

    @Override // defpackage.bfrj
    public final long f() {
        return getLong(cO(51, bfrt.a));
    }

    @Override // defpackage.bfrj
    public final MessageIdType g() {
        return new MessageIdType(getLong(cO(0, bfrt.a)));
    }

    @Override // defpackage.bfrj
    public final MessageIdType h() {
        return new MessageIdType(getLong(cO(160, bfrt.a)));
    }

    @Override // defpackage.bfrj
    public final MessageIdType i() {
        return new MessageIdType(getLong(cO(153, bfrt.a)));
    }

    @Override // defpackage.bfrj
    public final bvdz j() {
        bvdz[] bvdzVarArrValues = bvdz.values();
        int i = getInt(cO(21, bfrt.a));
        if (i < bvdzVarArrValues.length) {
            return bvdzVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.bfrj
    public final cklv k() {
        byte[] blob = getBlob(cO(151, bfrt.a));
        if (blob == null) {
            return null;
        }
        try {
            return (cklv) evsn.parseFrom(cklv.a, blob, evrr.a());
        } catch (Throwable unused) {
            return cklv.a;
        }
    }

    @Override // defpackage.bfrj
    public final String l() {
        return getString(cO(18, bfrt.a));
    }

    @Override // defpackage.bfrj
    public final String m() {
        return getString(cO(2, bfrt.a));
    }

    @Override // defpackage.bfrj
    public final boolean n() {
        return getInt(cO(22, bfrt.a)) == 1;
    }

    @Override // defpackage.bfrj
    public final String[] o() {
        return (String[]) dqru.D(dt(getString(94)), du(getString(cO(41, bfrt.a))), new String[0]);
    }

    public final double p() {
        return getDouble(cO(61, bfrt.a));
    }

    public final double q() {
        return getDouble(cO(60, bfrt.a));
    }

    public final int r() {
        return getInt(cO(103, bfrt.a));
    }

    public final int s() {
        return getInt(cO(104, bfrt.a));
    }

    public final int t() {
        return getInt(cO(145, bfrt.a));
    }

    public final int u() {
        return getInt(cO(105, bfrt.a));
    }

    public final int v() {
        return getInt(cO(7, bfrt.a));
    }

    public final int w() {
        return getInt(cO(107, bfrt.a));
    }

    public final int x() {
        return getInt(cO(17, bfrt.a));
    }

    public final int y() {
        return getInt(cO(20, bfrt.a));
    }

    public final int z() {
        return getInt(cO(30, bfrt.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
