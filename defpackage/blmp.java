package defpackage;

import android.database.Cursor;
import android.net.Uri;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class blmp extends dqqf implements blmo {
    @Deprecated
    public blmp(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, blmq blmqVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, blmu.a, dqwjVar, dqtmVar, blmqVar);
    }

    public final int A() {
        return getInt(cO(153, blmu.a));
    }

    public final int B() {
        return getInt(cO(10, blmu.a));
    }

    public final int C() {
        return getInt(cO(73, blmu.a));
    }

    public final int D() {
        return getInt(cO(93, blmu.a));
    }

    public final int E() {
        return getInt(cO(192, blmu.a));
    }

    public final int F() {
        return getInt(cO(96, blmu.a));
    }

    public final long G() {
        return getLong(cO(39, blmu.a));
    }

    public final long H() {
        return getLong(cO(171, blmu.a));
    }

    public final long I() {
        return getLong(cO(86, blmu.a));
    }

    public final long J() {
        return getLong(cO(166, blmu.a));
    }

    public final long K() {
        return getLong(cO(104, blmu.a));
    }

    public final long L() {
        return getLong(cO(160, blmu.a));
    }

    public final long M() {
        return getLong(cO(165, blmu.a));
    }

    public final long N() {
        return getLong(cO(134, blmu.a));
    }

    public final long O() {
        return getLong(cO(20, blmu.a));
    }

    public final long P() {
        return getLong(cO(137, blmu.a));
    }

    public final long Q() {
        return getLong(cO(136, blmu.a));
    }

    public final long R() {
        return getLong(cO(21, blmu.a));
    }

    public final long S() {
        return getLong(cO(34, blmu.a));
    }

    public final long T() {
        return getLong(cO(154, blmu.a));
    }

    public final long U() {
        return getLong(cO(172, blmu.a));
    }

    public final long V() {
        return getLong(cO(8, blmu.a));
    }

    public final long W() {
        return getLong(cO(80, blmu.a));
    }

    public final long X() {
        return getLong(cO(47, blmu.a));
    }

    public final long Y() {
        return getLong(cO(26, blmu.a));
    }

    public final long Z() {
        return getLong(cO(42, blmu.a));
    }

    public final MessageIdType aA() {
        return new MessageIdType(getLong(cO(51, blmu.a)));
    }

    public final MessageIdType aB() {
        return new MessageIdType(getLong(cO(52, blmu.a)));
    }

    public final basd aC() {
        return basd.a(getString(cO(43, blmu.a)));
    }

    public final basd aD() {
        return basd.a(getString(cO(28, blmu.a)));
    }

    public final bbaj aE() {
        return bbam.a(getString(cO(110, blmu.a)));
    }

    public final bvdk aF() {
        return bvdk.a(getInt(cO(132, blmu.a)));
    }

    public final bvdn aG() {
        bvdn[] bvdnVarArrValues = bvdn.values();
        int i = getInt(cO(59, blmu.a));
        if (i < bvdnVarArrValues.length) {
            return bvdnVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final bvdp aH() {
        bvdp[] bvdpVarArrValues = bvdp.values();
        int i = getInt(cO(119, blmu.a));
        if (i < bvdpVarArrValues.length) {
            return bvdpVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final bvdx aI() {
        bvdx[] bvdxVarArrValues = bvdx.values();
        int i = getInt(cO(63, blmu.a));
        if (i < bvdxVarArrValues.length) {
            return bvdxVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final bvdx aJ() {
        bvdx[] bvdxVarArrValues = bvdx.values();
        int i = getInt(cO(64, blmu.a));
        if (i < bvdxVarArrValues.length) {
            return bvdxVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final bvdz aK() {
        bvdz[] bvdzVarArrValues = bvdz.values();
        int i = getInt(cO(EnergyProfile.EVCONNECTOR_TYPE_OTHER, blmu.a));
        if (i < bvdzVarArrValues.length) {
            return bvdzVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final bvdz aL() {
        bvdz[] bvdzVarArrValues = bvdz.values();
        int i = getInt(cO(30, blmu.a));
        if (i < bvdzVarArrValues.length) {
            return bvdzVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final bvec aM() {
        bvec[] bvecVarArrValues = bvec.values();
        int i = getInt(cO(65, blmu.a));
        if (i < bvecVarArrValues.length) {
            return bvecVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final cbqx aN() {
        return cbqw.a(getString(cO(189, blmu.a)));
    }

    public final cbqz aO() {
        return new cbqz(getLong(cO(188, blmu.a)));
    }

    public final cbqz aP() {
        return new cbqz(getLong(cO(68, blmu.a)));
    }

    public final cgrd aQ() {
        cgrd[] cgrdVarArrValues = cgrd.values();
        int i = getInt(cO(58, blmu.a));
        if (i < cgrdVarArrValues.length) {
            return cgrdVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final chpm aR() {
        return chpm.b(getInt(cO(113, blmu.a)));
    }

    public final chpq aS() {
        return chpq.b(getInt(cO(111, blmu.a)));
    }

    public final chpq aT() {
        return chpq.b(getInt(cO(112, blmu.a)));
    }

    public final cidt aU() {
        byte[] blob = getBlob(cO(185, blmu.a));
        if (blob == null) {
            return null;
        }
        try {
            return (cidt) evsn.parseFrom(cidt.a, blob, evrr.a());
        } catch (Throwable unused) {
            return cidt.a;
        }
    }

    public final cigb aV() {
        return new cigb(getLong(cO(174, blmu.a)));
    }

    public final cins aW() {
        cins[] cinsVarArrValues = cins.values();
        int i = getInt(cO(186, blmu.a));
        if (i < cinsVarArrValues.length) {
            return cinsVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final cjnm aX() {
        byte[] blob = getBlob(cO(44, blmu.a));
        if (blob == null) {
            return null;
        }
        try {
            return (cjnm) evsn.parseFrom(cjnm.a, blob, evrr.a());
        } catch (Throwable unused) {
            return cjnm.a;
        }
    }

    public final cnqj aY() {
        return cnqj.b(getLong(cO(117, blmu.a)));
    }

    public final cpyi aZ() {
        cpyi[] cpyiVarArrValues = cpyi.values();
        int i = getInt(cO(179, blmu.a));
        if (i < cpyiVarArrValues.length) {
            return cpyiVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final long aa() {
        return getLong(cO(6, blmu.a));
    }

    public final long ab() {
        return getLong(cO(16, blmu.a));
    }

    public final long ac() {
        return getLong(cO(133, blmu.a));
    }

    public final long ad() {
        return getLong(cO(41, blmu.a));
    }

    public final Uri ae() {
        String string = getString(cO(85, blmu.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri af() {
        String string = getString(cO(129, blmu.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri ag() {
        String string = getString(cO(54, blmu.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri ah() {
        String string = getString(cO(124, blmu.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri ai() {
        String string = getString(cO(84, blmu.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri aj() {
        String string = getString(cO(191, blmu.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri ak() {
        String string = getString(cO(14, blmu.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final alwm al() {
        return alwm.b(getInt(cO(109, blmu.a)));
    }

    public final anuc am() {
        byte[] blob = getBlob(cO(114, blmu.a));
        if (blob == null) {
            return null;
        }
        try {
            return (anuc) evsn.parseFrom(anuc.a, blob, evrr.a());
        } catch (Throwable unused) {
            return anuc.a;
        }
    }

    public final avoe an() {
        return avoe.b(getInt(cO(178, blmu.a)));
    }

    public final awjl ao() {
        return awjm.a(getString(cO(144, blmu.a)));
    }

    public final axcm ap() {
        return axcn.a(getString(cO(143, blmu.a)));
    }

    public final axcm aq() {
        return axcn.a(getString(cO(25, blmu.a)));
    }

    public final axcm ar() {
        return axcn.a(getString(cO(71, blmu.a)));
    }

    public final axcm as() {
        return axcn.a(getString(cO(72, blmu.a)));
    }

    public final ConversationIdType at() {
        return new ConversationIdType(getLong(cO(1, blmu.a)));
    }

    public final ConversationIdType au() {
        return new ConversationIdType(getLong(cO(176, blmu.a)));
    }

    public final ConversationIdType av() {
        return new ConversationIdType(getLong(cO(177, blmu.a)));
    }

    public final ConversationIdType aw() {
        return new ConversationIdType(getLong(cO(116, blmu.a)));
    }

    public final baro ax() {
        return new baro(getString(cO(67, blmu.a)));
    }

    public final MessageIdType ay() {
        return new MessageIdType(getLong(cO(0, blmu.a)));
    }

    public final MessageIdType az() {
        return new MessageIdType(getLong(cO(121, blmu.a)));
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bkxe();
    }

    public final String bA() {
        return cssq.a(getString(cO(83, blmu.a)));
    }

    public final String bB() {
        return cssq.a(getString(cO(82, blmu.a)));
    }

    public final String bC() {
        return getString(cO(50, blmu.a));
    }

    public final String bD() {
        return getString(cO(135, blmu.a));
    }

    public final String bE() {
        return getString(cO(70, blmu.a));
    }

    public final String bF() {
        return getString(cO(87, blmu.a));
    }

    public final String bG() {
        return getString(cO(19, blmu.a));
    }

    public final String bH() {
        return getString(cO(22, blmu.a));
    }

    public final String bI() {
        return cssq.a(getString(cO(17, blmu.a)));
    }

    public final String bJ() {
        return getString(cO(18, blmu.a));
    }

    public final String bK() {
        return getString(cO(4, blmu.a));
    }

    public final String bL() {
        return getString(cO(118, blmu.a));
    }

    public final String bM() {
        return cssb.a(getString(cO(75, blmu.a)));
    }

    public final String bN() {
        return cssq.a(getString(cO(162, blmu.a)));
    }

    public final String bO() {
        return getString(cO(152, blmu.a));
    }

    public final String bP() {
        return getString(cO(139, blmu.a));
    }

    public final String bQ() {
        return getString(cO(147, blmu.a));
    }

    public final String bR() {
        return getString(cO(141, blmu.a));
    }

    public final String bS() {
        return cssq.a(getString(cO(161, blmu.a)));
    }

    public final String bT() {
        return getString(cO(151, blmu.a));
    }

    public final String bU() {
        return getString(cO(138, blmu.a));
    }

    public final String bV() {
        return getString(cO(140, blmu.a));
    }

    public final String bW() {
        return getString(cO(125, blmu.a));
    }

    public final String bX() {
        return getString(cO(102, blmu.a));
    }

    public final String bY() {
        return csrz.a(getString(cO(169, blmu.a)));
    }

    public final String bZ() {
        return getString(cO(168, blmu.a));
    }

    public final cpyi ba() {
        cpyi[] cpyiVarArrValues = cpyi.values();
        int i = getInt(cO(57, blmu.a));
        if (i < cpyiVarArrValues.length) {
            return cpyiVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final cpyi bb() {
        cpyi[] cpyiVarArrValues = cpyi.values();
        int i = getInt(cO(108, blmu.a));
        if (i < cpyiVarArrValues.length) {
            return cpyiVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final eyga bc() {
        byte[] blob = getBlob(cO(48, blmu.a));
        if (blob == null) {
            return null;
        }
        try {
            return (eyga) evsn.parseFrom(eyga.a, blob, evrr.a());
        } catch (Throwable unused) {
            return eyga.a;
        }
    }

    public final Instant bd() {
        return bart.b(getLong(cO(7, blmu.a)));
    }

    public final Optional be() {
        return basg.a(getString(cO(55, blmu.a)));
    }

    public final Optional bf() {
        return basg.a(getString(cO(69, blmu.a)));
    }

    public final Optional bg() {
        return basb.b(getLong(cO(182, blmu.a)));
    }

    public final Optional bh() {
        return basb.b(getLong(cO(181, blmu.a)));
    }

    public final String bi() {
        return getString(cO(97, blmu.a));
    }

    public final String bj() {
        return getString(cO(27, blmu.a));
    }

    public final String bk() {
        return getString(cO(190, blmu.a));
    }

    public final String bl() {
        return getString(cO(49, blmu.a));
    }

    public final String bm() {
        return getString(cO(167, blmu.a));
    }

    public final String bn() {
        return getString(cO(38, blmu.a));
    }

    public final String bo() {
        return getString(cO(100, blmu.a));
    }

    public final String bp() {
        return cssq.a(getString(cO(78, blmu.a)));
    }

    public final String bq() {
        return getString(cO(94, blmu.a));
    }

    public final String br() {
        return getString(cO(37, blmu.a));
    }

    public final String bs() {
        return cssq.a(getString(cO(79, blmu.a)));
    }

    public final String bt() {
        return getString(cO(142, blmu.a));
    }

    public final String bu() {
        return getString(cO(45, blmu.a));
    }

    public final String bv() {
        return cssb.a(getString(cO(77, blmu.a)));
    }

    public final String bw() {
        return getString(cO(130, blmu.a));
    }

    public final String bx() {
        return cssq.a(getString(cO(127, blmu.a)));
    }

    public final String by() {
        return cssq.a(getString(cO(128, blmu.a)));
    }

    public final String bz() {
        return getString(cO(107, blmu.a));
    }

    public final int c() {
        return getInt(cO(60, blmu.a));
    }

    public final boolean cA() {
        return getInt(cO(32, blmu.a)) == 1;
    }

    public final boolean cB() {
        return getInt(cO(98, blmu.a)) == 1;
    }

    public final boolean cC() {
        return getInt(cO(106, blmu.a)) == 1;
    }

    public final boolean cD() {
        return getInt(cO(184, blmu.a)) == 1;
    }

    public final boolean cE() {
        return getInt(cO(146, blmu.a)) == 1;
    }

    public final boolean cF() {
        return getInt(cO(148, blmu.a)) == 1;
    }

    public final boolean cG() {
        return getInt(cO(12, blmu.a)) == 1;
    }

    public final boolean cH() {
        return getInt(cO(173, blmu.a)) == 1;
    }

    public final boolean cI() {
        return getInt(cO(13, blmu.a)) == 1;
    }

    public final boolean cJ() {
        return getInt(cO(126, blmu.a)) == 1;
    }

    public final boolean cK() {
        return getInt(cO(163, blmu.a)) == 1;
    }

    public final byte[] cL() {
        return getBlob(cO(46, blmu.a));
    }

    public final byte[] cM() {
        return getBlob(cO(103, blmu.a));
    }

    public final byte[] cN() {
        return getBlob(cO(170, blmu.a));
    }

    public final String ca() {
        return getString(cO(180, blmu.a));
    }

    public final String cb() {
        return getString(cO(33, blmu.a));
    }

    public final String cc() {
        return getString(cO(5, blmu.a));
    }

    public final String cd() {
        return getString(cO(81, blmu.a));
    }

    public final String ce() {
        return getString(cO(24, blmu.a));
    }

    public final String cf() {
        return cssb.a(getString(cO(76, blmu.a)));
    }

    public final String cg() {
        return getString(cO(2, blmu.a));
    }

    public final String ch() {
        return getString(cO(3, blmu.a));
    }

    public final String ci() {
        return getString(cO(36, blmu.a));
    }

    public final String cj() {
        return getString(cO(150, blmu.a));
    }

    public final String ck() {
        return cssq.a(getString(cO(122, blmu.a)));
    }

    public final String cl() {
        return cssq.a(getString(cO(123, blmu.a)));
    }

    public final String cm() {
        return getString(cO(92, blmu.a));
    }

    public final String cn() {
        return getString(cO(120, blmu.a));
    }

    public final String co() {
        return getString(cO(40, blmu.a));
    }

    public final fhaz cp() {
        byte[] blob = getBlob(cO(62, blmu.a));
        if (blob == null) {
            return null;
        }
        try {
            return (fhaz) evsn.parseFrom(fhaz.a, blob, evrr.a());
        } catch (Throwable unused) {
            return fhaz.a;
        }
    }

    public final boolean cq() {
        return getInt(cO(175, blmu.a)) == 1;
    }

    public final boolean cr() {
        return getInt(cO(53, blmu.a)) == 1;
    }

    public final boolean cs() {
        return getInt(cO(91, blmu.a)) == 1;
    }

    public final boolean ct() {
        return getInt(cO(61, blmu.a)) == 1;
    }

    public final boolean cu() {
        return getInt(cO(183, blmu.a)) == 1;
    }

    public final boolean cv() {
        return getInt(cO(159, blmu.a)) == 1;
    }

    public final boolean cw() {
        return getInt(cO(149, blmu.a)) == 1;
    }

    public final boolean cx() {
        return getInt(cO(105, blmu.a)) == 1;
    }

    public final boolean cy() {
        return getInt(cO(158, blmu.a)) == 1;
    }

    public final boolean cz() {
        return getInt(cO(115, blmu.a)) == 1;
    }

    public final int e() {
        return getInt(cO(88, blmu.a));
    }

    public final int f() {
        return getInt(cO(89, blmu.a));
    }

    public final int g() {
        return getInt(cO(156, blmu.a));
    }

    public final int h() {
        return getInt(cO(131, blmu.a));
    }

    public final int i() {
        return getInt(cO(90, blmu.a));
    }

    public final int j() {
        return getInt(cO(99, blmu.a));
    }

    public final int k() {
        return getInt(cO(155, blmu.a));
    }

    public final int l() {
        return getInt(cO(11, blmu.a));
    }

    public final int m() {
        return getInt(cO(187, blmu.a));
    }

    public final int n() {
        return getInt(cO(164, blmu.a));
    }

    public final int o() {
        return getInt(cO(66, blmu.a));
    }

    public final int p() {
        return getInt(cO(145, blmu.a));
    }

    public final int q() {
        return getInt(cO(95, blmu.a));
    }

    public final int r() {
        return getInt(cO(9, blmu.a));
    }

    public final int s() {
        return getInt(cO(23, blmu.a));
    }

    public final int t() {
        return getInt(cO(29, blmu.a));
    }

    public final int u() {
        return getInt(cO(31, blmu.a));
    }

    public final int v() {
        return getInt(cO(56, blmu.a));
    }

    public final int w() {
        return getInt(cO(157, blmu.a));
    }

    public final int x() {
        return getInt(cO(74, blmu.a));
    }

    public final int y() {
        return getInt(cO(35, blmu.a));
    }

    public final int z() {
        return getInt(cO(15, blmu.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
