package defpackage;

import android.database.Cursor;
import android.net.Uri;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bgvc extends dqqf implements bgvb {
    @Deprecated
    public bgvc(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bgve bgveVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bgvl.a, dqwjVar, dqtmVar, bgveVar);
    }

    public final int A() {
        return getInt(cO(7, bgvl.a));
    }

    public final int B() {
        return getInt(cO(103, bgvl.a));
    }

    public final int C() {
        return getInt(cO(20, bgvl.a));
    }

    public final int D() {
        return getInt(cO(30, bgvl.a));
    }

    public final int E() {
        return getInt(cO(24, bgvl.a));
    }

    public final int F() {
        return getInt(cO(11, bgvl.a));
    }

    public final int G() {
        return getInt(cO(162, bgvl.a));
    }

    public final long H() {
        return getLong(cO(97, bgvl.a));
    }

    public final long I() {
        return getLong(cO(106, bgvl.a));
    }

    public final long J() {
        return getLong(cO(131, bgvl.a));
    }

    public final long K() {
        return getLong(cO(175, bgvl.a));
    }

    public final long L() {
        return getLong(cO(81, bgvl.a));
    }

    public final long M() {
        return getLong(cO(55, bgvl.a));
    }

    public final long N() {
        return getLong(cO(14, bgvl.a));
    }

    public final long O() {
        return getLong(cO(15, bgvl.a));
    }

    public final long P() {
        return getLong(cO(23, bgvl.a));
    }

    public final long Q() {
        return getLong(cO(160, bgvl.a));
    }

    public final long R() {
        return getLong(cO(3, bgvl.a));
    }

    public final long S() {
        return getLong(cO(12, bgvl.a));
    }

    public final long T() {
        return getLong(cO(28, bgvl.a));
    }

    public final Uri U() {
        String string = getString(cO(141, bgvl.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri V() {
        String string = getString(cO(48, bgvl.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri W() {
        String string = getString(cO(96, bgvl.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final athh X() {
        return athg.a(getString(cO(86, bgvl.a)));
    }

    public final ConversationIdType Y() {
        return new ConversationIdType(getLong(cO(52, bgvl.a)));
    }

    public final MessageIdType Z() {
        return new MessageIdType(getLong(cO(159, bgvl.a)));
    }

    public final String aA() {
        return cssb.a(getString(cO(164, bgvl.a)));
    }

    public final String aB() {
        return getString(cO(179, bgvl.a));
    }

    public final String aC() {
        return cssq.a(getString(cO(95, bgvl.a)));
    }

    public final String aD() {
        return cssq.a(getString(cO(166, bgvl.a)));
    }

    public final String aE() {
        return cssq.a(getString(cO(94, bgvl.a)));
    }

    public final String aF() {
        return cssq.a(getString(cO(165, bgvl.a)));
    }

    public final String aG() {
        return getString(cO(161, bgvl.a));
    }

    public final String aH() {
        return getString(cO(109, bgvl.a));
    }

    public final String aI() {
        return getString(cO(136, bgvl.a));
    }

    public final String aJ() {
        return cssq.a(getString(cO(133, bgvl.a)));
    }

    public final String aK() {
        return getString(cO(135, bgvl.a));
    }

    public final String aL() {
        return getString(cO(134, bgvl.a));
    }

    public final String aM() {
        return getString(cO(177, bgvl.a));
    }

    public final String aN() {
        return cssq.a(getString(cO(132, bgvl.a)));
    }

    public final String aO() {
        return cssq.a(getString(cO(176, bgvl.a)));
    }

    public final String aP() {
        return getString(cO(82, bgvl.a));
    }

    public final String aQ() {
        return getString(cO(98, bgvl.a));
    }

    public final String aR() {
        return cssq.a(getString(cO(13, bgvl.a)));
    }

    public final String aS() {
        return getString(cO(139, bgvl.a));
    }

    public final String aT() {
        return cssb.a(getString(cO(91, bgvl.a)));
    }

    public final String aU() {
        return cssb.a(getString(cO(163, bgvl.a)));
    }

    public final String aV() {
        return getString(cO(142, bgvl.a));
    }

    public final String aW() {
        return getString(cO(36, bgvl.a));
    }

    public final String aX() {
        return getString(cO(59, bgvl.a));
    }

    public final String aY() {
        return getString(cO(40, bgvl.a));
    }

    public final String aZ() {
        return csrz.a(getString(cO(146, bgvl.a)));
    }

    public final MessageIdType aa() {
        return new MessageIdType(getLong(cO(129, bgvl.a)));
    }

    public final MessageIdType ab() {
        return new MessageIdType(getLong(cO(38, bgvl.a)));
    }

    public final MessageIdType ac() {
        return new MessageIdType(getLong(cO(110, bgvl.a)));
    }

    public final MessageIdType ad() {
        return new MessageIdType(getLong(cO(116, bgvl.a)));
    }

    public final basd ae() {
        return basd.a(getString(cO(29, bgvl.a)));
    }

    public final basd af() {
        return basd.a(getString(cO(19, bgvl.a)));
    }

    public final bvdg ag() {
        return bvdf.a(getString(cO(54, bgvl.a)));
    }

    public final bvdg ah() {
        return bvdf.a(getString(cO(53, bgvl.a)));
    }

    public final bvdn ai() {
        bvdn[] bvdnVarArrValues = bvdn.values();
        int i = getInt(cO(33, bgvl.a));
        if (i < bvdnVarArrValues.length) {
            return bvdnVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final bvdq aj() {
        bvdq[] bvdqVarArrValues = bvdq.values();
        int i = getInt(cO(88, bgvl.a));
        if (i < bvdqVarArrValues.length) {
            return bvdqVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final bvdt ak() {
        bvdt[] bvdtVarArrValues = bvdt.values();
        int i = getInt(cO(50, bgvl.a));
        if (i < bvdtVarArrValues.length) {
            return bvdtVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final bvdy al() {
        bvdy[] bvdyVarArrValues = bvdy.values();
        int i = getInt(cO(87, bgvl.a));
        if (i < bvdyVarArrValues.length) {
            return bvdyVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final bvdz am() {
        bvdz[] bvdzVarArrValues = bvdz.values();
        int i = getInt(cO(105, bgvl.a));
        if (i < bvdzVarArrValues.length) {
            return bvdzVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final bvef an() {
        bvef[] bvefVarArrValues = bvef.values();
        int i = getInt(cO(85, bgvl.a));
        if (i < bvefVarArrValues.length) {
            return bvefVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final cgrd ao() {
        cgrd[] cgrdVarArrValues = cgrd.values();
        int i = getInt(cO(32, bgvl.a));
        if (i < cgrdVarArrValues.length) {
            return cgrdVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final cgvx ap() {
        byte[] blob = getBlob(cO(152, bgvl.a));
        if (blob == null) {
            return null;
        }
        try {
            return (cgvx) evsn.parseFrom(cgvx.a, blob, evrr.a());
        } catch (Throwable unused) {
            return cgvx.a;
        }
    }

    public final chpq aq() {
        return chpq.b(getInt(cO(107, bgvl.a)));
    }

    public final chpq ar() {
        return chpq.b(getInt(cO(108, bgvl.a)));
    }

    public final cpyi as() {
        cpyi[] cpyiVarArrValues = cpyi.values();
        int i = getInt(cO(31, bgvl.a));
        if (i < cpyiVarArrValues.length) {
            return cpyiVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final Optional at() {
        return basb.b(getLong(cO(148, bgvl.a)));
    }

    public final String au() {
        return getString(cO(180, bgvl.a));
    }

    public final String av() {
        return getString(cO(74, bgvl.a));
    }

    public final String aw() {
        return getString(cO(65, bgvl.a));
    }

    public final String ax() {
        return getString(cO(26, bgvl.a));
    }

    public final String ay() {
        return getString(cO(140, bgvl.a));
    }

    public final String az() {
        return cssb.a(getString(cO(93, bgvl.a)));
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bfsc();
    }

    public final long[] bA() {
        return dqru.C(dt(getString(90)), dt(getString(cO(76, bgvl.a))));
    }

    public final long[] bB() {
        return dqru.C(dt(getString(90)), dt(getString(cO(72, bgvl.a))));
    }

    public final long[] bC() {
        return dqru.C(null, dt(getString(cO(172, bgvl.a))));
    }

    public final long[] bD() {
        return dqru.C(null, dt(getString(cO(111, bgvl.a))));
    }

    public final long[] bE() {
        return dqru.C(null, dt(getString(cO(117, bgvl.a))));
    }

    public final long[] bF() {
        return dqru.C(null, dt(getString(cO(128, bgvl.a))));
    }

    public final long[] bG() {
        return dqru.C(dt(getString(90)), dt(getString(cO(90, bgvl.a))));
    }

    public final long[] bH() {
        return dqru.C(null, dt(getString(cO(173, bgvl.a))));
    }

    public final long[] bI() {
        return dqru.C(null, dt(getString(cO(115, bgvl.a))));
    }

    public final long[] bJ() {
        return dqru.C(null, dt(getString(cO(113, bgvl.a))));
    }

    public final long[] bK() {
        return dqru.C(null, dt(getString(cO(112, bgvl.a))));
    }

    public final long[] bL() {
        return dqru.C(dt(getString(90)), dt(getString(cO(49, bgvl.a))));
    }

    public final long[] bM() {
        return dqru.C(null, dt(getString(cO(118, bgvl.a))));
    }

    public final long[] bN() {
        return dqru.C(null, dt(getString(cO(119, bgvl.a))));
    }

    public final long[] bO() {
        return dqru.C(dt(getString(157)), dt(getString(cO(157, bgvl.a))));
    }

    public final Uri[] bP() {
        String string = getString(cO(60, bgvl.a));
        long[] jArrDt = dt(getString(90));
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

    public final Uri[] bQ() {
        String string = getString(cO(43, bgvl.a));
        long[] jArrDt = dt(getString(90));
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

    public final Uri[] bR() {
        String string = getString(cO(58, bgvl.a));
        long[] jArrDt = dt(getString(90));
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
        String string = getString(cO(44, bgvl.a));
        long[] jArrDt = dt(getString(90));
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
        String string = getString(cO(41, bgvl.a));
        long[] jArrDt = dt(getString(90));
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
        String[] strArrDu = du(getString(cO(169, bgvl.a)));
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

    public final aonp[] bV() {
        String string = getString(cO(154, bgvl.a));
        long[] jArrDt = dt(getString(157));
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

    public final bvdl[] bW() {
        String string = getString(cO(51, bgvl.a));
        long[] jArrDt = dt(getString(90));
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

    public final bvdr[] bX() {
        String string = getString(cO(83, bgvl.a));
        long[] jArrDt = dt(getString(90));
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

    public final Optional[] bY() {
        long[] jArrDt = dt(getString(cO(114, bgvl.a)));
        int length = jArrDt.length;
        Optional[] optionalArr = new Optional[length];
        for (int i = 0; i < length; i++) {
            optionalArr[i] = basb.b(jArrDt[i]);
        }
        return (Optional[]) dqru.D(null, optionalArr, new Optional[0]);
    }

    public final String[] bZ() {
        return (String[]) dqru.D(dt(getString(90)), du(getString(cO(64, bgvl.a))), new String[0]);
    }

    public final String ba() {
        return cssb.a(getString(cO(92, bgvl.a)));
    }

    public final String bb() {
        return getString(cO(25, bgvl.a));
    }

    public final String bc() {
        return getString(cO(150, bgvl.a));
    }

    public final String bd() {
        return getString(cO(130, bgvl.a));
    }

    public final String be() {
        return getString(cO(174, bgvl.a));
    }

    public final fhaz bf() {
        byte[] blob = getBlob(cO(34, bgvl.a));
        if (blob == null) {
            return null;
        }
        try {
            return (fhaz) evsn.parseFrom(fhaz.a, blob, evrr.a());
        } catch (Throwable unused) {
            return fhaz.a;
        }
    }

    public final boolean bg() {
        return getInt(cO(80, bgvl.a)) == 1;
    }

    public final boolean bh() {
        return getInt(cO(102, bgvl.a)) == 1;
    }

    public final boolean bi() {
        return getInt(cO(22, bgvl.a)) == 1;
    }

    public final boolean bj() {
        return getInt(cO(104, bgvl.a)) == 1;
    }

    public final boolean bk() {
        return getInt(cO(138, bgvl.a)) == 1;
    }

    public final boolean bl() {
        return getInt(cO(178, bgvl.a)) == 1;
    }

    public final boolean bm() {
        return getInt(cO(137, bgvl.a)) == 1;
    }

    public final boolean bn() {
        return getInt(cO(8, bgvl.a)) == 1;
    }

    public final boolean bo() {
        return getInt(cO(89, bgvl.a)) == 1;
    }

    public final boolean bp() {
        return getInt(cO(147, bgvl.a)) == 1;
    }

    public final boolean bq() {
        return getInt(cO(9, bgvl.a)) == 1;
    }

    public final byte[] br() {
        return getBlob(cO(67, bgvl.a));
    }

    public final byte[] bs() {
        return getBlob(cO(66, bgvl.a));
    }

    public final int[] bt() {
        return dqru.A(dt(getString(90)), ds(getString(cO(62, bgvl.a))));
    }

    public final int[] bu() {
        return dqru.A(null, ds(getString(cO(125, bgvl.a))));
    }

    public final int[] bv() {
        return dqru.A(null, ds(getString(cO(126, bgvl.a))));
    }

    public final int[] bw() {
        return dqru.A(null, ds(getString(cO(127, bgvl.a))));
    }

    public final int[] bx() {
        return dqru.A(dt(getString(90)), ds(getString(cO(46, bgvl.a))));
    }

    public final int[] by() {
        return dqru.A(dt(getString(90)), ds(getString(cO(61, bgvl.a))));
    }

    public final long[] bz() {
        return dqru.C(dt(getString(90)), dt(getString(cO(69, bgvl.a))));
    }

    @Override // defpackage.bgvb
    public final int c() {
        return getInt(cO(5, bgvl.a));
    }

    public final String[] ca() {
        return (String[]) dqru.D(dt(getString(90)), du(getString(cO(63, bgvl.a))), new String[0]);
    }

    public final String[] cb() {
        return (String[]) dqru.D(dt(getString(90)), du(getString(cO(73, bgvl.a))), new String[0]);
    }

    public final String[] cc() {
        return (String[]) dqru.D(dt(getString(90)), du(getString(cO(42, bgvl.a))), new String[0]);
    }

    public final String[] cd() {
        return (String[]) dqru.D(null, du(getString(cO(170, bgvl.a))), new String[0]);
    }

    public final String[] ce() {
        return (String[]) dqru.D(dt(getString(90)), du(getString(cO(70, bgvl.a))), new String[0]);
    }

    public final String[] cf() {
        return (String[]) dqru.D(dt(getString(90)), du(getString(cO(71, bgvl.a))), new String[0]);
    }

    public final String[] cg() {
        return (String[]) dqru.D(null, du(getString(cO(171, bgvl.a))), new String[0]);
    }

    public final String[] ch() {
        return (String[]) dqru.D(null, du(getString(cO(167, bgvl.a))), new String[0]);
    }

    public final String[] ci() {
        return (String[]) dqru.D(dt(getString(157)), du(getString(cO(156, bgvl.a))), new String[0]);
    }

    public final String[] cj() {
        String[] strArrDu = du(getString(cO(124, bgvl.a)));
        for (int i = 0; i < strArrDu.length; i++) {
            strArrDu[i] = cssb.a(strArrDu[i]);
        }
        return (String[]) dqru.D(null, strArrDu, new String[0]);
    }

    public final String[] ck() {
        return (String[]) dqru.D(dt(getString(157)), du(getString(cO(153, bgvl.a))), new String[0]);
    }

    public final String[] cl() {
        String string = getString(cO(39, bgvl.a));
        long[] jArrDt = dt(getString(90));
        String[] strArrDu = du(string);
        for (int i = 0; i < strArrDu.length; i++) {
            strArrDu[i] = cssq.a(strArrDu[i]);
        }
        return (String[]) dqru.D(jArrDt, strArrDu, new String[0]);
    }

    public final String[] cm() {
        String[] strArrDu = du(getString(cO(168, bgvl.a)));
        for (int i = 0; i < strArrDu.length; i++) {
            strArrDu[i] = cssq.a(strArrDu[i]);
        }
        return (String[]) dqru.D(null, strArrDu, new String[0]);
    }

    public final String[] cn() {
        return (String[]) dqru.D(dt(getString(157)), du(getString(cO(155, bgvl.a))), new String[0]);
    }

    public final String[] co() {
        return (String[]) dqru.D(null, du(getString(cO(120, bgvl.a))), new String[0]);
    }

    public final String[] cp() {
        return (String[]) dqru.D(null, du(getString(cO(122, bgvl.a))), new String[0]);
    }

    public final String[] cq() {
        return (String[]) dqru.D(null, du(getString(cO(123, bgvl.a))), new String[0]);
    }

    public final String[] cr() {
        return (String[]) dqru.D(null, du(getString(cO(121, bgvl.a))), new String[0]);
    }

    public final boolean[] cs() {
        return dqru.E(dt(getString(90)), dv(getString(cO(68, bgvl.a))));
    }

    public final boolean[] ct() {
        return dqru.E(dt(getString(90)), dv(getString(cO(75, bgvl.a))));
    }

    public final boolean[] cu() {
        return dqru.E(dt(getString(90)), dv(getString(cO(79, bgvl.a))));
    }

    public final byte[][] cv() {
        return dqru.F(dt(getString(90)), dD(getString(cO(78, bgvl.a))));
    }

    public final byte[][] cw() {
        return dqru.F(dt(getString(90)), dD(getString(cO(77, bgvl.a))));
    }

    @Override // defpackage.bgvb
    public final int d() {
        return getInt(cO(17, bgvl.a));
    }

    @Override // defpackage.bgvb
    public final int e() {
        return getInt(cO(6, bgvl.a));
    }

    @Override // defpackage.bgvb
    public final long f() {
        return getLong(cO(4, bgvl.a));
    }

    @Override // defpackage.bgvb
    public final long g() {
        return getLong(cO(47, bgvl.a));
    }

    @Override // defpackage.bgvb
    public final Uri h() {
        String string = getString(cO(10, bgvl.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    @Override // defpackage.bgvb
    public final ConversationIdType i() {
        return new ConversationIdType(getLong(cO(1, bgvl.a)));
    }

    @Override // defpackage.bgvb
    public final MessageIdType j() {
        return new MessageIdType(getLong(cO(0, bgvl.a)));
    }

    @Override // defpackage.bgvb
    public final MessageIdType k() {
        return new MessageIdType(getLong(cO(158, bgvl.a)));
    }

    @Override // defpackage.bgvb
    public final MessageIdType l() {
        return new MessageIdType(getLong(cO(151, bgvl.a)));
    }

    @Override // defpackage.bgvb
    public final bvdz m() {
        bvdz[] bvdzVarArrValues = bvdz.values();
        int i = getInt(cO(21, bgvl.a));
        if (i < bvdzVarArrValues.length) {
            return bvdzVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.bgvb
    public final cklv n() {
        byte[] blob = getBlob(cO(149, bgvl.a));
        if (blob == null) {
            return null;
        }
        try {
            return (cklv) evsn.parseFrom(cklv.a, blob, evrr.a());
        } catch (Throwable unused) {
            return cklv.a;
        }
    }

    @Override // defpackage.bgvb
    public final String o() {
        return getString(cO(16, bgvl.a));
    }

    @Override // defpackage.bgvb
    public final String p() {
        return getString(cO(145, bgvl.a));
    }

    @Override // defpackage.bgvb
    public final String q() {
        return getString(cO(18, bgvl.a));
    }

    @Override // defpackage.bgvb
    public final String r() {
        return getString(cO(2, bgvl.a));
    }

    @Override // defpackage.bgvb
    public final boolean s() {
        return getInt(cO(144, bgvl.a)) == 1;
    }

    @Override // defpackage.bgvb
    public final String[] t() {
        return (String[]) dqru.D(dt(getString(90)), du(getString(cO(37, bgvl.a))), new String[0]);
    }

    public final double u() {
        return getDouble(cO(57, bgvl.a));
    }

    public final double v() {
        return getDouble(cO(56, bgvl.a));
    }

    public final int w() {
        return getInt(cO(99, bgvl.a));
    }

    public final int x() {
        return getInt(cO(100, bgvl.a));
    }

    public final int y() {
        return getInt(cO(143, bgvl.a));
    }

    public final int z() {
        return getInt(cO(EnergyProfile.EVCONNECTOR_TYPE_OTHER, bgvl.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
