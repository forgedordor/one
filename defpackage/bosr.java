package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bosr extends dqqf implements bopr {
    @Deprecated
    public bosr(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bosz boszVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, botm.a, dqwjVar, dqtmVar, boszVar);
    }

    public final int A() {
        return getInt(cO(48, botm.a));
    }

    public final int B() {
        return getInt(cO(29, botm.a));
    }

    public final int C() {
        return getInt(cO(41, botm.a));
    }

    public final int D() {
        return getInt(cO(37, botm.a));
    }

    public final int E() {
        return getInt(cO(76, botm.a));
    }

    public final long F() {
        return getLong(cO(55, botm.a));
    }

    public final long G() {
        return getLong(cO(50, botm.a));
    }

    public final long H() {
        return getLong(cO(44, botm.a));
    }

    public final long I() {
        return getLong(cO(49, botm.a));
    }

    public final long J() {
        return getLong(cO(18, botm.a));
    }

    public final long K() {
        return getLong(cO(21, botm.a));
    }

    public final long L() {
        return getLong(cO(20, botm.a));
    }

    public final long M() {
        return getLong(cO(56, botm.a));
    }

    public final long N() {
        return getLong(cO(17, botm.a));
    }

    public final Uri O() {
        String string = getString(cO(8, botm.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri P() {
        String string = getString(cO(75, botm.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final avoe Q() {
        return avoe.b(getInt(cO(62, botm.a)));
    }

    public final awjl R() {
        return awjm.a(getString(cO(28, botm.a)));
    }

    public final axcm S() {
        return axcn.a(getString(cO(27, botm.a)));
    }

    public final ConversationIdType T() {
        return new ConversationIdType(getLong(cO(60, botm.a)));
    }

    public final ConversationIdType U() {
        return new ConversationIdType(getLong(cO(61, botm.a)));
    }

    public final bvdp V() {
        bvdp[] bvdpVarArrValues = bvdp.values();
        int i = getInt(cO(3, botm.a));
        if (i < bvdpVarArrValues.length) {
            return bvdpVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final cbqx W() {
        return cbqw.a(getString(cO(73, botm.a)));
    }

    public final cbqz X() {
        return new cbqz(getLong(cO(72, botm.a)));
    }

    public final cidt Y() {
        byte[] blob = getBlob(cO(69, botm.a));
        if (blob == null) {
            return null;
        }
        try {
            return (cidt) evsn.parseFrom(cidt.a, blob, evrr.a());
        } catch (Throwable unused) {
            return cidt.a;
        }
    }

    public final cigb Z() {
        return new cigb(getLong(cO(58, botm.a)));
    }

    public final boolean aA() {
        return getInt(cO(42, botm.a)) == 1;
    }

    public final boolean aB() {
        return getInt(cO(68, botm.a)) == 1;
    }

    public final boolean aC() {
        return getInt(cO(57, botm.a)) == 1;
    }

    public final boolean aD() {
        return getInt(cO(10, botm.a)) == 1;
    }

    public final boolean aE() {
        return getInt(cO(47, botm.a)) == 1;
    }

    public final byte[] aF() {
        return getBlob(cO(54, botm.a));
    }

    public final int[] aG() {
        return dqru.A(null, ds(getString(cO(40, botm.a))));
    }

    public final int[] aH() {
        return dqru.A(null, ds(getString(cO(15, botm.a))));
    }

    public final int[] aI() {
        return dqru.A(null, ds(getString(cO(39, botm.a))));
    }

    public final int[] aJ() {
        return dqru.A(null, ds(getString(cO(71, botm.a))));
    }

    public final int[] aK() {
        return dqru.A(null, ds(getString(cO(48, botm.a))));
    }

    public final int[] aL() {
        return dqru.A(null, ds(getString(cO(29, botm.a))));
    }

    public final int[] aM() {
        return dqru.A(null, ds(getString(cO(41, botm.a))));
    }

    public final int[] aN() {
        return dqru.A(null, ds(getString(cO(37, botm.a))));
    }

    public final int[] aO() {
        return dqru.A(null, ds(getString(cO(76, botm.a))));
    }

    public final long[] aP() {
        return dqru.C(null, dt(getString(cO(55, botm.a))));
    }

    public final long[] aQ() {
        return dqru.C(null, dt(getString(cO(50, botm.a))));
    }

    public final long[] aR() {
        return dqru.C(null, dt(getString(cO(44, botm.a))));
    }

    public final long[] aS() {
        return dqru.C(null, dt(getString(cO(49, botm.a))));
    }

    public final long[] aT() {
        return dqru.C(null, dt(getString(cO(18, botm.a))));
    }

    public final long[] aU() {
        return dqru.C(null, dt(getString(cO(21, botm.a))));
    }

    public final long[] aV() {
        return dqru.C(null, dt(getString(cO(20, botm.a))));
    }

    public final long[] aW() {
        return dqru.C(null, dt(getString(cO(38, botm.a))));
    }

    public final long[] aX() {
        return dqru.C(null, dt(getString(cO(56, botm.a))));
    }

    public final long[] aY() {
        return dqru.C(null, dt(getString(cO(17, botm.a))));
    }

    public final Uri[] aZ() {
        String[] strArrDu = du(getString(cO(13, botm.a)));
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

    public final cins aa() {
        cins[] cinsVarArrValues = cins.values();
        int i = getInt(cO(70, botm.a));
        if (i < cinsVarArrValues.length) {
            return cinsVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final Optional ab() {
        return basb.b(getLong(cO(66, botm.a)));
    }

    public final Optional ac() {
        return basb.b(getLong(cO(65, botm.a)));
    }

    public final String ad() {
        return getString(cO(74, botm.a));
    }

    public final String ae() {
        return getString(cO(51, botm.a));
    }

    public final String af() {
        return getString(cO(26, botm.a));
    }

    public final String ag() {
        return getString(cO(14, botm.a));
    }

    public final String ah() {
        return cssq.a(getString(cO(11, botm.a)));
    }

    public final String ai() {
        return cssq.a(getString(cO(12, botm.a)));
    }

    public final String aj() {
        return getString(cO(19, botm.a));
    }

    public final String ak() {
        return cssq.a(getString(cO(46, botm.a)));
    }

    public final String al() {
        return getString(cO(36, botm.a));
    }

    public final String am() {
        return getString(cO(23, botm.a));
    }

    public final String an() {
        return getString(cO(25, botm.a));
    }

    public final String ao() {
        return cssq.a(getString(cO(45, botm.a)));
    }

    public final String ap() {
        return getString(cO(35, botm.a));
    }

    public final String aq() {
        return getString(cO(9, botm.a));
    }

    public final String ar() {
        return csrz.a(getString(cO(53, botm.a)));
    }

    public final String as() {
        return getString(cO(64, botm.a));
    }

    public final String at() {
        return getString(cO(34, botm.a));
    }

    public final String au() {
        return cssq.a(getString(cO(6, botm.a)));
    }

    public final String av() {
        return cssq.a(getString(cO(7, botm.a)));
    }

    public final String aw() {
        return getString(cO(4, botm.a));
    }

    public final boolean ax() {
        return getInt(cO(67, botm.a)) == 1;
    }

    public final boolean ay() {
        return getInt(cO(43, botm.a)) == 1;
    }

    public final boolean az() {
        return getInt(cO(33, botm.a)) == 1;
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new boji();
    }

    public final String[] bA() {
        return (String[]) dqru.D(null, du(getString(cO(19, botm.a))), new String[0]);
    }

    public final String[] bB() {
        String[] strArrDu = du(getString(cO(2, botm.a)));
        for (int i = 0; i < strArrDu.length; i++) {
        }
        return (String[]) dqru.D(null, strArrDu, new String[0]);
    }

    public final String[] bC() {
        String[] strArrDu = du(getString(cO(46, botm.a)));
        for (int i = 0; i < strArrDu.length; i++) {
            strArrDu[i] = cssq.a(strArrDu[i]);
        }
        return (String[]) dqru.D(null, strArrDu, new String[0]);
    }

    public final String[] bD() {
        return (String[]) dqru.D(null, du(getString(cO(36, botm.a))), new String[0]);
    }

    public final String[] bE() {
        return (String[]) dqru.D(null, du(getString(cO(23, botm.a))), new String[0]);
    }

    public final String[] bF() {
        return (String[]) dqru.D(null, du(getString(cO(31, botm.a))), new String[0]);
    }

    public final String[] bG() {
        return (String[]) dqru.D(null, du(getString(cO(25, botm.a))), new String[0]);
    }

    public final String[] bH() {
        String[] strArrDu = du(getString(cO(45, botm.a)));
        for (int i = 0; i < strArrDu.length; i++) {
            strArrDu[i] = cssq.a(strArrDu[i]);
        }
        return (String[]) dqru.D(null, strArrDu, new String[0]);
    }

    public final String[] bI() {
        return (String[]) dqru.D(null, du(getString(cO(35, botm.a))), new String[0]);
    }

    public final String[] bJ() {
        return (String[]) dqru.D(null, du(getString(cO(22, botm.a))), new String[0]);
    }

    public final String[] bK() {
        return (String[]) dqru.D(null, du(getString(cO(24, botm.a))), new String[0]);
    }

    public final String[] bL() {
        return (String[]) dqru.D(null, du(getString(cO(9, botm.a))), new String[0]);
    }

    public final String[] bM() {
        String[] strArrDu = du(getString(cO(53, botm.a)));
        for (int i = 0; i < strArrDu.length; i++) {
            strArrDu[i] = csrz.a(strArrDu[i]);
        }
        for (int i2 = 0; i2 < strArrDu.length; i2++) {
        }
        return (String[]) dqru.D(null, strArrDu, new String[0]);
    }

    public final String[] bN() {
        return (String[]) dqru.D(null, du(getString(cO(52, botm.a))), new String[0]);
    }

    public final String[] bO() {
        return (String[]) dqru.D(null, du(getString(cO(64, botm.a))), new String[0]);
    }

    public final String[] bP() {
        return (String[]) dqru.D(null, du(getString(cO(34, botm.a))), new String[0]);
    }

    public final String[] bQ() {
        String[] strArrDu = du(getString(cO(6, botm.a)));
        for (int i = 0; i < strArrDu.length; i++) {
            strArrDu[i] = cssq.a(strArrDu[i]);
        }
        return (String[]) dqru.D(null, strArrDu, new String[0]);
    }

    public final String[] bR() {
        String[] strArrDu = du(getString(cO(7, botm.a)));
        for (int i = 0; i < strArrDu.length; i++) {
            strArrDu[i] = cssq.a(strArrDu[i]);
        }
        return (String[]) dqru.D(null, strArrDu, new String[0]);
    }

    public final String[] bS() {
        return (String[]) dqru.D(null, du(getString(cO(4, botm.a))), new String[0]);
    }

    public final boolean[] bT() {
        return dqru.E(null, dv(getString(cO(59, botm.a))));
    }

    public final boolean[] bU() {
        return dqru.E(null, dv(getString(cO(67, botm.a))));
    }

    public final boolean[] bV() {
        return dqru.E(null, dv(getString(cO(43, botm.a))));
    }

    public final boolean[] bW() {
        return dqru.E(null, dv(getString(cO(33, botm.a))));
    }

    public final boolean[] bX() {
        return dqru.E(null, dv(getString(cO(42, botm.a))));
    }

    public final boolean[] bY() {
        return dqru.E(null, dv(getString(cO(68, botm.a))));
    }

    public final boolean[] bZ() {
        return dqru.E(null, dv(getString(cO(30, botm.a))));
    }

    public final Uri[] ba() {
        String[] strArrDu = du(getString(cO(8, botm.a)));
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

    public final Uri[] bb() {
        String[] strArrDu = du(getString(cO(75, botm.a)));
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

    public final avoe[] bc() {
        int[] iArrDs = ds(getString(cO(62, botm.a)));
        avoe[] avoeVarArr = new avoe[iArrDs.length];
        for (int i = 0; i < iArrDs.length; i++) {
            avoe avoeVarB = avoe.b(iArrDs[i]);
            if (avoeVarB == null) {
                throw new IllegalStateException();
            }
            avoeVarArr[i] = avoeVarB;
        }
        return (avoe[]) dqru.D(null, avoeVarArr, new avoe[0]);
    }

    public final awjl[] bd() {
        String[] strArrDu = du(getString(cO(28, botm.a)));
        int length = strArrDu.length;
        awjl[] awjlVarArr = new awjl[length];
        for (int i = 0; i < length; i++) {
            awjlVarArr[i] = awjm.a(strArrDu[i]);
        }
        return (awjl[]) dqru.D(null, awjlVarArr, new awjl[0]);
    }

    public final axcm[] be() {
        String[] strArrDu = du(getString(cO(27, botm.a)));
        int length = strArrDu.length;
        axcm[] axcmVarArr = new axcm[length];
        for (int i = 0; i < length; i++) {
            axcmVarArr[i] = axcn.a(strArrDu[i]);
        }
        return (axcm[]) dqru.D(null, axcmVarArr, new axcm[0]);
    }

    public final ConversationIdType[] bf() {
        long[] jArrDt = dt(getString(cO(60, botm.a)));
        int length = jArrDt.length;
        ConversationIdType[] conversationIdTypeArr = new ConversationIdType[length];
        for (int i = 0; i < length; i++) {
            conversationIdTypeArr[i] = new ConversationIdType(jArrDt[i]);
        }
        return (ConversationIdType[]) dqru.D(null, conversationIdTypeArr, new ConversationIdType[0]);
    }

    public final ConversationIdType[] bg() {
        long[] jArrDt = dt(getString(cO(61, botm.a)));
        int length = jArrDt.length;
        ConversationIdType[] conversationIdTypeArr = new ConversationIdType[length];
        for (int i = 0; i < length; i++) {
            conversationIdTypeArr[i] = new ConversationIdType(jArrDt[i]);
        }
        return (ConversationIdType[]) dqru.D(null, conversationIdTypeArr, new ConversationIdType[0]);
    }

    public final ConversationIdType[] bh() {
        long[] jArrDt = dt(getString(cO(0, botm.a)));
        int length = jArrDt.length;
        ConversationIdType[] conversationIdTypeArr = new ConversationIdType[length];
        for (int i = 0; i < length; i++) {
            conversationIdTypeArr[i] = new ConversationIdType(jArrDt[i]);
        }
        return (ConversationIdType[]) dqru.D(null, conversationIdTypeArr, new ConversationIdType[0]);
    }

    public final MessageIdType[] bi() {
        long[] jArrDt = dt(getString(cO(5, botm.a)));
        int length = jArrDt.length;
        MessageIdType[] messageIdTypeArr = new MessageIdType[length];
        for (int i = 0; i < length; i++) {
            messageIdTypeArr[i] = new MessageIdType(jArrDt[i]);
        }
        return (MessageIdType[]) dqru.D(null, messageIdTypeArr, new MessageIdType[0]);
    }

    public final bvdk[] bj() {
        int[] iArrDs = ds(getString(cO(16, botm.a)));
        bvdk[] bvdkVarArr = new bvdk[iArrDs.length];
        for (int i = 0; i < iArrDs.length; i++) {
            bvdk bvdkVarA = bvdk.a(iArrDs[i]);
            if (bvdkVarA == null) {
                throw new IllegalStateException();
            }
            bvdkVarArr[i] = bvdkVarA;
        }
        return (bvdk[]) dqru.D(null, bvdkVarArr, new bvdk[0]);
    }

    public final bvdp[] bk() {
        int[] iArrDs = ds(getString(cO(3, botm.a)));
        bvdp[] bvdpVarArrValues = bvdp.values();
        int length = bvdpVarArrValues.length;
        bvdp[] bvdpVarArr = new bvdp[iArrDs.length];
        for (int i = 0; i < iArrDs.length; i++) {
            int i2 = iArrDs[i];
            if (i2 >= length) {
                throw new IllegalStateException();
            }
            bvdpVarArr[i] = bvdpVarArrValues[i2];
        }
        return (bvdp[]) dqru.D(null, bvdpVarArr, new bvdp[0]);
    }

    public final cbqx[] bl() {
        String[] strArrDu = du(getString(cO(73, botm.a)));
        int length = strArrDu.length;
        cbqx[] cbqxVarArr = new cbqx[length];
        for (int i = 0; i < length; i++) {
            cbqxVarArr[i] = cbqw.a(strArrDu[i]);
        }
        return (cbqx[]) dqru.D(null, cbqxVarArr, new cbqx[0]);
    }

    public final cbqz[] bm() {
        long[] jArrDt = dt(getString(cO(72, botm.a)));
        int length = jArrDt.length;
        cbqz[] cbqzVarArr = new cbqz[length];
        for (int i = 0; i < length; i++) {
            cbqzVarArr[i] = new cbqz(jArrDt[i]);
        }
        return (cbqz[]) dqru.D(null, cbqzVarArr, new cbqz[0]);
    }

    public final cidt[] bn() {
        cidt cidtVar;
        List listDf = df(getString(cO(69, botm.a)));
        cidt[] cidtVarArr = new cidt[listDf.size()];
        Iterator it = listDf.iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                byte[] bArrZ = dqru.z((String) it.next());
                int i2 = i + 1;
                if (bArrZ == null) {
                    cidtVar = null;
                } else {
                    try {
                        cidtVar = (cidt) evsn.parseFrom(cidt.a, bArrZ);
                    } catch (Throwable unused) {
                        i = i2;
                        cidtVarArr[i] = null;
                        i++;
                    }
                }
                cidtVarArr[i] = cidtVar;
                i = i2;
            } catch (Throwable unused2) {
            }
        }
        return (cidt[]) dqru.D(null, cidtVarArr, new cidt[0]);
    }

    public final cigb[] bo() {
        long[] jArrDt = dt(getString(cO(58, botm.a)));
        int length = jArrDt.length;
        cigb[] cigbVarArr = new cigb[length];
        for (int i = 0; i < length; i++) {
            cigbVarArr[i] = new cigb(jArrDt[i]);
        }
        return (cigb[]) dqru.D(null, cigbVarArr, new cigb[0]);
    }

    public final cins[] bp() {
        int[] iArrDs = ds(getString(cO(70, botm.a)));
        cins[] cinsVarArrValues = cins.values();
        int length = cinsVarArrValues.length;
        cins[] cinsVarArr = new cins[iArrDs.length];
        for (int i = 0; i < iArrDs.length; i++) {
            int i2 = iArrDs[i];
            if (i2 >= length) {
                throw new IllegalStateException();
            }
            cinsVarArr[i] = cinsVarArrValues[i2];
        }
        return (cins[]) dqru.D(null, cinsVarArr, new cins[0]);
    }

    public final cnqj[] bq() {
        long[] jArrDt = dt(getString(cO(1, botm.a)));
        int length = jArrDt.length;
        cnqj[] cnqjVarArr = new cnqj[length];
        for (int i = 0; i < length; i++) {
            cnqjVarArr[i] = cnqj.b(jArrDt[i]);
        }
        return (cnqj[]) dqru.D(null, cnqjVarArr, new cnqj[0]);
    }

    public final cpyi[] br() {
        int[] iArrDs = ds(getString(cO(63, botm.a)));
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

    public final Optional[] bs() {
        long[] jArrDt = dt(getString(cO(66, botm.a)));
        int length = jArrDt.length;
        Optional[] optionalArr = new Optional[length];
        for (int i = 0; i < length; i++) {
            optionalArr[i] = basb.b(jArrDt[i]);
        }
        return (Optional[]) dqru.D(null, optionalArr, new Optional[0]);
    }

    public final Optional[] bt() {
        long[] jArrDt = dt(getString(cO(65, botm.a)));
        int length = jArrDt.length;
        Optional[] optionalArr = new Optional[length];
        for (int i = 0; i < length; i++) {
            optionalArr[i] = basb.b(jArrDt[i]);
        }
        return (Optional[]) dqru.D(null, optionalArr, new Optional[0]);
    }

    public final String[] bu() {
        return (String[]) dqru.D(null, du(getString(cO(74, botm.a))), new String[0]);
    }

    public final String[] bv() {
        return (String[]) dqru.D(null, du(getString(cO(51, botm.a))), new String[0]);
    }

    public final String[] bw() {
        return (String[]) dqru.D(null, du(getString(cO(26, botm.a))), new String[0]);
    }

    public final String[] bx() {
        return (String[]) dqru.D(null, du(getString(cO(14, botm.a))), new String[0]);
    }

    public final String[] by() {
        String[] strArrDu = du(getString(cO(11, botm.a)));
        for (int i = 0; i < strArrDu.length; i++) {
            strArrDu[i] = cssq.a(strArrDu[i]);
        }
        return (String[]) dqru.D(null, strArrDu, new String[0]);
    }

    public final String[] bz() {
        String[] strArrDu = du(getString(cO(12, botm.a)));
        for (int i = 0; i < strArrDu.length; i++) {
            strArrDu[i] = cssq.a(strArrDu[i]);
        }
        return (String[]) dqru.D(null, strArrDu, new String[0]);
    }

    @Override // defpackage.bopr
    public final int c() {
        return getInt(cO(40, botm.a));
    }

    public final boolean[] ca() {
        return dqru.E(null, dv(getString(cO(32, botm.a))));
    }

    public final boolean[] cb() {
        return dqru.E(null, dv(getString(cO(57, botm.a))));
    }

    public final boolean[] cc() {
        return dqru.E(null, dv(getString(cO(10, botm.a))));
    }

    public final boolean[] cd() {
        return dqru.E(null, dv(getString(cO(47, botm.a))));
    }

    public final byte[][] ce() {
        return dqru.F(null, dD(getString(cO(54, botm.a))));
    }

    @Override // defpackage.bopr
    public final int e() {
        return getInt(cO(39, botm.a));
    }

    @Override // defpackage.bopr
    public final long f() {
        return getLong(cO(38, botm.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        int i;
        String[] strArrBR;
        Uri[] uriArrBa;
        String[] strArrBL;
        long[] jArr;
        boolean[] zArrCc;
        boolean[] zArr;
        String[] strArrBy;
        String[] strArr;
        String[] strArrBz;
        String[] strArr2;
        Uri[] uriArrAZ;
        Uri[] uriArr;
        String[] strArrBx;
        String[] strArr3;
        int[] iArrAH;
        int[] iArr;
        bvdk[] bvdkVarArrBj;
        bvdk[] bvdkVarArr;
        long[] jArrAY;
        long[] jArr2;
        long[] jArrAT;
        long[] jArr3;
        String[] strArrBA;
        String[] strArr4;
        long[] jArrAV;
        long[] jArr4;
        long[] jArrAU;
        long[] jArr5;
        String[] strArrBJ;
        String[] strArr5;
        String[] strArrBE;
        String[] strArr6;
        String[] strArrBK;
        String[] strArr7;
        String[] strArrBG;
        String[] strArr8;
        String[] strArrBw;
        String[] strArr9;
        axcm[] axcmVarArrBe;
        axcm[] axcmVarArr;
        awjl[] awjlVarArrBd;
        awjl[] awjlVarArr;
        int[] iArrAL;
        int[] iArr2;
        boolean[] zArrBZ;
        boolean[] zArr2;
        String[] strArrBF;
        String[] strArr10;
        boolean[] zArrCa;
        boolean[] zArr3;
        boolean[] zArrBW;
        boolean[] zArr4;
        String[] strArrBP;
        String[] strArr11;
        String[] strArrBI;
        String[] strArr12;
        String[] strArrBD;
        String[] strArr13;
        int[] iArrAN;
        int[] iArr3;
        long[] jArrAW;
        long[] jArr6;
        int[] iArrAI;
        int[] iArr4;
        int[] iArrAG;
        int[] iArr5;
        int[] iArrAM;
        int[] iArr6;
        boolean[] zArrBX;
        boolean[] zArr5;
        boolean[] zArrBV;
        boolean[] zArr6;
        long[] jArrAR;
        long[] jArr7;
        String[] strArrBH;
        String[] strArr14;
        String[] strArrBC;
        String[] strArr15;
        boolean[] zArrCd;
        boolean[] zArr7;
        int[] iArrAK;
        int[] iArr7;
        long[] jArrAS;
        long[] jArr8;
        long[] jArrAQ;
        long[] jArr9;
        String[] strArrBv;
        String[] strArr16;
        String[] strArrBN;
        String[] strArr17;
        String[] strArrBM;
        String[] strArr18;
        byte[][] bArrCe;
        byte[][] bArr;
        long[] jArrAP;
        long[] jArr10;
        long[] jArrAX;
        long[] jArr11;
        boolean[] zArrCb;
        boolean[] zArr8;
        cigb[] cigbVarArrBo;
        cigb[] cigbVarArr;
        boolean[] zArrBT;
        boolean[] zArr9;
        ConversationIdType[] conversationIdTypeArrBf;
        ConversationIdType[] conversationIdTypeArr;
        ConversationIdType[] conversationIdTypeArrBg;
        ConversationIdType[] conversationIdTypeArr2;
        avoe[] avoeVarArrBc;
        avoe[] avoeVarArr;
        cpyi[] cpyiVarArrBr;
        cpyi[] cpyiVarArr;
        String[] strArrBO;
        String[] strArr19;
        Optional[] optionalArrBt;
        Optional[] optionalArr;
        Optional[] optionalArrBs;
        Optional[] optionalArr2;
        boolean[] zArrBU;
        boolean[] zArr10;
        boolean[] zArrBY;
        boolean[] zArr11;
        cidt[] cidtVarArrBn;
        cidt[] cidtVarArr;
        cins[] cinsVarArrBp;
        cins[] cinsVarArr;
        int[] iArrAJ;
        int[] iArr8;
        cbqz[] cbqzVarArrBm;
        cbqz[] cbqzVarArr;
        cbqx[] cbqxVarArrBl;
        cbqx[] cbqxVarArr;
        String[] strArrBu;
        String[] strArr20;
        Uri[] uriArrBb;
        int[] iArrAO;
        int i2;
        Uri[] uriArr2;
        int[] iArr9;
        dqthVar.b();
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length == 0 || (length == 1 && jArrDC[0] == -1)) {
            return ekgb.q();
        }
        HashSet hashSet = new HashSet();
        boolean zD = this.d.d();
        ConversationIdType[] conversationIdTypeArrBh = dj(0) ? zD ? bh() : new ConversationIdType[]{h()} : null;
        dqqf.dA(length, conversationIdTypeArrBh, new ejxr() { // from class: bops
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        cnqj[] cnqjVarArrBq = dj(1) ? zD ? bq() : new cnqj[]{k()} : null;
        dqqf.dA(length, cnqjVarArrBq, new ejxr() { // from class: bopu
            @Override // defpackage.ejxr
            public final Object get() {
                return "sms_thread_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        String[] strArrBB = dj(2) ? zD ? bB() : new String[]{q()} : null;
        dqqf.dA(length, strArrBB, new ejxr() { // from class: boqg
            @Override // defpackage.ejxr
            public final Object get() {
                return "name:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        bvdp[] bvdpVarArrBk = dj(3) ? zD ? bk() : new bvdp[]{V()} : null;
        dqqf.dA(length, bvdpVarArrBk, new ejxr() { // from class: boqs
            @Override // defpackage.ejxr
            public final Object get() {
                return "name_is_automatic:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        String[] strArrBS = dj(4) ? zD ? bS() : new String[]{aw()} : null;
        dqqf.dA(length, strArrBS, new ejxr() { // from class: bore
            @Override // defpackage.ejxr
            public final Object get() {
                return "subtitle:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        MessageIdType[] messageIdTypeArrBi = dj(5) ? zD ? bi() : new MessageIdType[]{i()} : null;
        dqqf.dA(length, messageIdTypeArrBi, new ejxr() { // from class: borq
            @Override // defpackage.ejxr
            public final Object get() {
                return "latest_message_id:".concat(String.valueOf(this.a.getString(5)));
            }
        });
        String[] strArrBQ = dj(6) ? zD ? bQ() : new String[]{au()} : null;
        dqqf.dA(length, strArrBQ, new ejxr() { // from class: bosc
            @Override // defpackage.ejxr
            public final Object get() {
                return "snippet_text:".concat(String.valueOf(this.a.getString(6)));
            }
        });
        if (dj(7)) {
            strArrBR = zD ? bR() : new String[]{av()};
            i = 0;
        } else {
            i = 0;
            strArrBR = null;
        }
        dqqf.dA(length, strArrBR, new ejxr() { // from class: bosl
            @Override // defpackage.ejxr
            public final Object get() {
                return "subject_text:".concat(String.valueOf(this.a.getString(7)));
            }
        });
        if (!dj(8)) {
            uriArrBa = null;
        } else if (zD) {
            uriArrBa = ba();
        } else {
            uriArrBa = new Uri[1];
            uriArrBa[i] = O();
        }
        dqqf.dA(length, uriArrBa, new ejxr() { // from class: bosm
            @Override // defpackage.ejxr
            public final Object get() {
                return "preview_uri:".concat(String.valueOf(this.a.getString(8)));
            }
        });
        if (!dj(9)) {
            strArrBL = null;
        } else if (zD) {
            strArrBL = bL();
        } else {
            strArrBL = new String[1];
            strArrBL[i] = aq();
        }
        dqqf.dA(length, strArrBL, new ejxr() { // from class: bosn
            @Override // defpackage.ejxr
            public final Object get() {
                return "preview_content_type:".concat(String.valueOf(this.a.getString(9)));
            }
        });
        if (!dj(10)) {
            jArr = jArrDC;
            zArrCc = null;
        } else if (zD) {
            zArrCc = cc();
            jArr = jArrDC;
        } else {
            jArr = jArrDC;
            boolean[] zArr12 = new boolean[1];
            zArr12[i] = aD();
            zArrCc = zArr12;
        }
        dqqf.dB(length, zArrCc, new ejxr() { // from class: boqd
            @Override // defpackage.ejxr
            public final Object get() {
                return "show_draft:".concat(String.valueOf(this.a.getString(10)));
            }
        });
        if (!dj(11)) {
            zArr = zArrCc;
            strArrBy = null;
        } else if (zD) {
            strArrBy = by();
            zArr = zArrCc;
        } else {
            zArr = zArrCc;
            String[] strArr21 = new String[1];
            strArr21[i] = ah();
            strArrBy = strArr21;
        }
        dqqf.dA(length, strArrBy, new ejxr() { // from class: boqo
            @Override // defpackage.ejxr
            public final Object get() {
                return "draft_snippet_text:".concat(String.valueOf(this.a.getString(11)));
            }
        });
        if (!dj(12)) {
            strArr = strArrBy;
            strArrBz = null;
        } else if (zD) {
            strArrBz = bz();
            strArr = strArrBy;
        } else {
            strArr = strArrBy;
            String[] strArr22 = new String[1];
            strArr22[i] = ai();
            strArrBz = strArr22;
        }
        dqqf.dA(length, strArrBz, new ejxr() { // from class: boqz
            @Override // defpackage.ejxr
            public final Object get() {
                return "draft_subject_text:".concat(String.valueOf(this.a.getString(12)));
            }
        });
        if (!dj(13)) {
            strArr2 = strArrBz;
            uriArrAZ = null;
        } else if (zD) {
            uriArrAZ = aZ();
            strArr2 = strArrBz;
        } else {
            strArr2 = strArrBz;
            Uri[] uriArr3 = new Uri[1];
            uriArr3[i] = g();
            uriArrAZ = uriArr3;
        }
        dqqf.dA(length, uriArrAZ, new ejxr() { // from class: bork
            @Override // defpackage.ejxr
            public final Object get() {
                return "draft_preview_uri:".concat(String.valueOf(this.a.getString(13)));
            }
        });
        if (!dj(14)) {
            uriArr = uriArrAZ;
            strArrBx = null;
        } else if (zD) {
            strArrBx = bx();
            uriArr = uriArrAZ;
        } else {
            uriArr = uriArrAZ;
            String[] strArr23 = new String[1];
            strArr23[i] = ag();
            strArrBx = strArr23;
        }
        dqqf.dA(length, strArrBx, new ejxr() { // from class: borv
            @Override // defpackage.ejxr
            public final Object get() {
                return "draft_preview_content_type:".concat(String.valueOf(this.a.getString(14)));
            }
        });
        if (!dj(15)) {
            strArr3 = strArrBx;
            iArrAH = null;
        } else if (zD) {
            iArrAH = aH();
            strArr3 = strArrBx;
        } else {
            strArr3 = strArrBx;
            int[] iArr10 = new int[1];
            iArr10[i] = y();
            iArrAH = iArr10;
        }
        dqqf.dy(length, iArrAH, new ejxr() { // from class: bosg
            @Override // defpackage.ejxr
            public final Object get() {
                return "etouffee_default:".concat(String.valueOf(this.a.getString(15)));
            }
        });
        if (!dj(16)) {
            iArr = iArrAH;
            bvdkVarArrBj = null;
        } else if (zD) {
            bvdkVarArrBj = bj();
            iArr = iArrAH;
        } else {
            iArr = iArrAH;
            bvdk[] bvdkVarArr2 = new bvdk[1];
            bvdkVarArr2[i] = j();
            bvdkVarArrBj = bvdkVarArr2;
        }
        dqqf.dA(length, bvdkVarArrBj, new ejxr() { // from class: boso
            @Override // defpackage.ejxr
            public final Object get() {
                return "archive_status:".concat(String.valueOf(this.a.getString(16)));
            }
        });
        if (!dj(17)) {
            bvdkVarArr = bvdkVarArrBj;
            jArrAY = null;
        } else if (zD) {
            jArrAY = aY();
            bvdkVarArr = bvdkVarArrBj;
        } else {
            bvdkVarArr = bvdkVarArrBj;
            long[] jArr12 = new long[1];
            jArr12[i] = N();
            jArrAY = jArr12;
        }
        dqqf.dz(length, jArrAY, new ejxr() { // from class: bosp
            @Override // defpackage.ejxr
            public final Object get() {
                return "sort_timestamp:".concat(String.valueOf(this.a.getString(17)));
            }
        });
        if (!dj(18)) {
            jArr2 = jArrAY;
            jArrAT = null;
        } else if (zD) {
            jArrAT = aT();
            jArr2 = jArrAY;
        } else {
            jArr2 = jArrAY;
            long[] jArr13 = new long[1];
            jArr13[i] = J();
            jArrAT = jArr13;
        }
        dqqf.dz(length, jArrAT, new ejxr() { // from class: bosq
            @Override // defpackage.ejxr
            public final Object get() {
                return "last_read_timestamp:".concat(String.valueOf(this.a.getString(18)));
            }
        });
        if (!dj(19)) {
            jArr3 = jArrAT;
            strArrBA = null;
        } else if (zD) {
            strArrBA = bA();
            jArr3 = jArrAT;
        } else {
            jArr3 = jArrAT;
            String[] strArr24 = new String[1];
            strArr24[i] = aj();
            strArrBA = strArr24;
        }
        dqqf.dA(length, strArrBA, new ejxr() { // from class: bopt
            @Override // defpackage.ejxr
            public final Object get() {
                return "icon:".concat(String.valueOf(this.a.getString(19)));
            }
        });
        if (!dj(20)) {
            strArr4 = strArrBA;
            jArrAV = null;
        } else if (zD) {
            jArrAV = aV();
            strArr4 = strArrBA;
        } else {
            strArr4 = strArrBA;
            long[] jArr14 = new long[1];
            jArr14[i] = L();
            jArrAV = jArr14;
        }
        dqqf.dz(length, jArrAV, new ejxr() { // from class: bopv
            @Override // defpackage.ejxr
            public final Object get() {
                return "participant_contact_id:".concat(String.valueOf(this.a.getString(20)));
            }
        });
        if (!dj(21)) {
            jArr4 = jArrAV;
            jArrAU = null;
        } else if (zD) {
            jArrAU = aU();
            jArr4 = jArrAV;
        } else {
            jArr4 = jArrAV;
            long[] jArr15 = new long[1];
            jArr15[i] = K();
            jArrAU = jArr15;
        }
        dqqf.dz(length, jArrAU, new ejxr() { // from class: bopw
            @Override // defpackage.ejxr
            public final Object get() {
                return "normalized_participant_contact_id:".concat(String.valueOf(this.a.getString(21)));
            }
        });
        if (!dj(22)) {
            jArr5 = jArrAU;
            strArrBJ = null;
        } else if (zD) {
            strArrBJ = bJ();
            jArr5 = jArrAU;
        } else {
            jArr5 = jArrAU;
            String[] strArr25 = new String[1];
            strArr25[i] = s();
            strArrBJ = strArr25;
        }
        dqqf.dA(length, strArrBJ, new ejxr() { // from class: bopx
            @Override // defpackage.ejxr
            public final Object get() {
                return "participant_lookup_key:".concat(String.valueOf(this.a.getString(22)));
            }
        });
        if (!dj(23)) {
            strArr5 = strArrBJ;
            strArrBE = null;
        } else if (zD) {
            strArrBE = bE();
            strArr5 = strArrBJ;
        } else {
            strArr5 = strArrBJ;
            String[] strArr26 = new String[1];
            strArr26[i] = am();
            strArrBE = strArr26;
        }
        dqqf.dA(length, strArrBE, new ejxr() { // from class: bopy
            @Override // defpackage.ejxr
            public final Object get() {
                return "normalized_participant_lookup_key:".concat(String.valueOf(this.a.getString(23)));
            }
        });
        if (!dj(24)) {
            strArr6 = strArrBE;
            strArrBK = null;
        } else if (zD) {
            strArrBK = bK();
            strArr6 = strArrBE;
        } else {
            strArr6 = strArrBE;
            String[] strArr27 = new String[1];
            strArr27[i] = t();
            strArrBK = strArr27;
        }
        dqqf.dA(length, strArrBK, new ejxr() { // from class: bopz
            @Override // defpackage.ejxr
            public final Object get() {
                return "participant_normalized_destination:".concat(String.valueOf(this.a.getString(24)));
            }
        });
        if (!dj(25)) {
            strArr7 = strArrBK;
            strArrBG = null;
        } else if (zD) {
            strArrBG = bG();
            strArr7 = strArrBK;
        } else {
            strArr7 = strArrBK;
            String[] strArr28 = new String[1];
            strArr28[i] = an();
            strArrBG = strArr28;
        }
        dqqf.dA(length, strArrBG, new ejxr() { // from class: boqa
            @Override // defpackage.ejxr
            public final Object get() {
                return "participant_comparable_destination:".concat(String.valueOf(this.a.getString(25)));
            }
        });
        if (!dj(26)) {
            strArr8 = strArrBG;
            strArrBw = null;
        } else if (zD) {
            strArrBw = bw();
            strArr8 = strArrBG;
        } else {
            strArr8 = strArrBG;
            String[] strArr29 = new String[1];
            strArr29[i] = af();
            strArrBw = strArr29;
        }
        dqqf.dA(length, strArrBw, new ejxr() { // from class: boqb
            @Override // defpackage.ejxr
            public final Object get() {
                return "current_self_id:".concat(String.valueOf(this.a.getString(26)));
            }
        });
        if (!dj(27)) {
            strArr9 = strArrBw;
            axcmVarArrBe = null;
        } else if (zD) {
            axcmVarArrBe = be();
            strArr9 = strArrBw;
        } else {
            strArr9 = strArrBw;
            axcm[] axcmVarArr2 = new axcm[1];
            axcmVarArr2[i] = S();
            axcmVarArrBe = axcmVarArr2;
        }
        dqqf.dA(length, axcmVarArrBe, new ejxr() { // from class: boqc
            @Override // defpackage.ejxr
            public final Object get() {
                return "current_my_identity_foreign_key:".concat(String.valueOf(this.a.getString(27)));
            }
        });
        if (!dj(28)) {
            axcmVarArr = axcmVarArrBe;
            awjlVarArrBd = null;
        } else if (zD) {
            awjlVarArrBd = bd();
            axcmVarArr = axcmVarArrBe;
        } else {
            axcmVarArr = axcmVarArrBe;
            awjl[] awjlVarArr2 = new awjl[1];
            awjlVarArr2[i] = R();
            awjlVarArrBd = awjlVarArr2;
        }
        dqqf.dA(length, awjlVarArrBd, new ejxr() { // from class: boqe
            @Override // defpackage.ejxr
            public final Object get() {
                return "destination_token:".concat(String.valueOf(this.a.getString(28)));
            }
        });
        if (!dj(29)) {
            awjlVarArr = awjlVarArrBd;
            iArrAL = null;
        } else if (zD) {
            iArrAL = aL();
            awjlVarArr = awjlVarArrBd;
        } else {
            awjlVarArr = awjlVarArrBd;
            int[] iArr11 = new int[1];
            iArr11[i] = B();
            iArrAL = iArr11;
        }
        dqqf.dy(length, iArrAL, new ejxr() { // from class: boqf
            @Override // defpackage.ejxr
            public final Object get() {
                return "participant_count:".concat(String.valueOf(this.a.getString(29)));
            }
        });
        if (!dj(30)) {
            iArr2 = iArrAL;
            zArrBZ = null;
        } else if (zD) {
            zArrBZ = bZ();
            iArr2 = iArrAL;
        } else {
            iArr2 = iArrAL;
            boolean[] zArr13 = new boolean[1];
            zArr13[i] = w();
            zArrBZ = zArr13;
        }
        dqqf.dB(length, zArrBZ, new ejxr() { // from class: boqh
            @Override // defpackage.ejxr
            public final Object get() {
                return "notification_enabled:".concat(String.valueOf(this.a.getString(30)));
            }
        });
        if (!dj(31)) {
            zArr2 = zArrBZ;
            strArrBF = null;
        } else if (zD) {
            strArrBF = bF();
            zArr2 = zArrBZ;
        } else {
            zArr2 = zArrBZ;
            String[] strArr30 = new String[1];
            strArr30[i] = r();
            strArrBF = strArr30;
        }
        dqqf.dA(length, strArrBF, new ejxr() { // from class: boqi
            @Override // defpackage.ejxr
            public final Object get() {
                return "notification_sound_uri:".concat(String.valueOf(this.a.getString(31)));
            }
        });
        if (!dj(32)) {
            strArr10 = strArrBF;
            zArrCa = null;
        } else if (zD) {
            zArrCa = ca();
            strArr10 = strArrBF;
        } else {
            strArr10 = strArrBF;
            boolean[] zArr14 = new boolean[1];
            zArr14[i] = x();
            zArrCa = zArr14;
        }
        dqqf.dB(length, zArrCa, new ejxr() { // from class: boqj
            @Override // defpackage.ejxr
            public final Object get() {
                return "notification_vibration:".concat(String.valueOf(this.a.getString(32)));
            }
        });
        if (!dj(33)) {
            zArr3 = zArrCa;
            zArrBW = null;
        } else if (zD) {
            zArrBW = bW();
            zArr3 = zArrCa;
        } else {
            zArr3 = zArrCa;
            boolean[] zArr15 = new boolean[1];
            zArr15[i] = az();
            zArrBW = zArr15;
        }
        dqqf.dB(length, zArrBW, new ejxr() { // from class: boqk
            @Override // defpackage.ejxr
            public final Object get() {
                return "include_email_addr:".concat(String.valueOf(this.a.getString(33)));
            }
        });
        if (!dj(34)) {
            zArr4 = zArrBW;
            strArrBP = null;
        } else if (zD) {
            strArrBP = bP();
            zArr4 = zArrBW;
        } else {
            zArr4 = zArrBW;
            String[] strArr31 = new String[1];
            strArr31[i] = at();
            strArrBP = strArr31;
        }
        dqqf.dA(length, strArrBP, new ejxr() { // from class: boql
            @Override // defpackage.ejxr
            public final Object get() {
                return "sms_service_center:".concat(String.valueOf(this.a.getString(34)));
            }
        });
        if (!dj(35)) {
            strArr11 = strArrBP;
            strArrBI = null;
        } else if (zD) {
            strArrBI = bI();
            strArr11 = strArrBP;
        } else {
            strArr11 = strArrBP;
            String[] strArr32 = new String[1];
            strArr32[i] = ap();
            strArrBI = strArr32;
        }
        dqqf.dA(length, strArrBI, new ejxr() { // from class: boqm
            @Override // defpackage.ejxr
            public final Object get() {
                return "participant_id_list:".concat(String.valueOf(this.a.getString(35)));
            }
        });
        if (!dj(36)) {
            strArr12 = strArrBI;
            strArrBD = null;
        } else if (zD) {
            strArrBD = bD();
            strArr12 = strArrBI;
        } else {
            strArr12 = strArrBI;
            String[] strArr33 = new String[1];
            strArr33[i] = al();
            strArrBD = strArr33;
        }
        dqqf.dA(length, strArrBD, new ejxr() { // from class: boqn
            @Override // defpackage.ejxr
            public final Object get() {
                return "normalized_participant_id_list:".concat(String.valueOf(this.a.getString(36)));
            }
        });
        if (!dj(37)) {
            strArr13 = strArrBD;
            iArrAN = null;
        } else if (zD) {
            iArrAN = aN();
            strArr13 = strArrBD;
        } else {
            strArr13 = strArrBD;
            int[] iArr12 = new int[1];
            iArr12[i] = D();
            iArrAN = iArr12;
        }
        dqqf.dy(length, iArrAN, new ejxr() { // from class: boqp
            @Override // defpackage.ejxr
            public final Object get() {
                return "source_type:".concat(String.valueOf(this.a.getString(37)));
            }
        });
        if (!dj(38)) {
            iArr3 = iArrAN;
            jArrAW = null;
        } else if (zD) {
            jArrAW = aW();
            iArr3 = iArrAN;
        } else {
            iArr3 = iArrAN;
            long[] jArr16 = new long[1];
            jArr16[i] = f();
            jArrAW = jArr16;
        }
        dqqf.dz(length, jArrAW, new ejxr() { // from class: boqq
            @Override // defpackage.ejxr
            public final Object get() {
                return "rcs_session_id:".concat(String.valueOf(this.a.getString(38)));
            }
        });
        if (!dj(39)) {
            jArr6 = jArrAW;
            iArrAI = null;
        } else if (zD) {
            iArrAI = aI();
            jArr6 = jArrAW;
        } else {
            jArr6 = jArrAW;
            int[] iArr13 = new int[1];
            iArr13[i] = e();
            iArrAI = iArr13;
        }
        dqqf.dy(length, iArrAI, new ejxr() { // from class: boqr
            @Override // defpackage.ejxr
            public final Object get() {
                return "join_state:".concat(String.valueOf(this.a.getString(39)));
            }
        });
        if (!dj(40)) {
            iArr4 = iArrAI;
            iArrAG = null;
        } else if (zD) {
            iArrAG = aG();
            iArr4 = iArrAI;
        } else {
            iArr4 = iArrAI;
            int[] iArr14 = new int[1];
            iArr14[i] = c();
            iArrAG = iArr14;
        }
        dqqf.dy(length, iArrAG, new ejxr() { // from class: boqt
            @Override // defpackage.ejxr
            public final Object get() {
                return "conv_type:".concat(String.valueOf(this.a.getString(40)));
            }
        });
        if (!dj(41)) {
            iArr5 = iArrAG;
            iArrAM = null;
        } else if (zD) {
            iArrAM = aM();
            iArr5 = iArrAG;
        } else {
            iArr5 = iArrAG;
            int[] iArr15 = new int[1];
            iArr15[i] = C();
            iArrAM = iArr15;
        }
        dqqf.dy(length, iArrAM, new ejxr() { // from class: boqu
            @Override // defpackage.ejxr
            public final Object get() {
                return "send_mode:".concat(String.valueOf(this.a.getString(41)));
            }
        });
        if (!dj(42)) {
            iArr6 = iArrAM;
            zArrBX = null;
        } else if (zD) {
            zArrBX = bX();
            iArr6 = iArrAM;
        } else {
            iArr6 = iArrAM;
            boolean[] zArr16 = new boolean[1];
            zArr16[i] = aA();
            zArrBX = zArr16;
        }
        dqqf.dB(length, zArrBX, new ejxr() { // from class: boqv
            @Override // defpackage.ejxr
            public final Object get() {
                return "IS_ENTERPRISE:".concat(String.valueOf(this.a.getString(42)));
            }
        });
        if (!dj(43)) {
            zArr5 = zArrBX;
            zArrBV = null;
        } else if (zD) {
            zArrBV = bV();
            zArr5 = zArrBX;
        } else {
            zArr5 = zArrBX;
            boolean[] zArr17 = new boolean[1];
            zArr17[i] = ay();
            zArrBV = zArr17;
        }
        dqqf.dB(length, zArrBV, new ejxr() { // from class: boqw
            @Override // defpackage.ejxr
            public final Object get() {
                return "has_ea2p_bot_recipient:".concat(String.valueOf(this.a.getString(43)));
            }
        });
        if (!dj(44)) {
            zArr6 = zArrBV;
            jArrAR = null;
        } else if (zD) {
            jArrAR = aR();
            zArr6 = zArrBV;
        } else {
            zArr6 = zArrBV;
            long[] jArr17 = new long[1];
            jArr17[i] = H();
            jArrAR = jArr17;
        }
        dqqf.dz(length, jArrAR, new ejxr() { // from class: boqx
            @Override // defpackage.ejxr
            public final Object get() {
                return "last_interactive_event_timestamp:".concat(String.valueOf(this.a.getString(44)));
            }
        });
        if (!dj(45)) {
            jArr7 = jArrAR;
            strArrBH = null;
        } else if (zD) {
            strArrBH = bH();
            jArr7 = jArrAR;
        } else {
            jArr7 = jArrAR;
            String[] strArr34 = new String[1];
            strArr34[i] = ao();
            strArrBH = strArr34;
        }
        dqqf.dA(length, strArrBH, new ejxr() { // from class: boqy
            @Override // defpackage.ejxr
            public final Object get() {
                return "participant_display_destination:".concat(String.valueOf(this.a.getString(45)));
            }
        });
        if (!dj(46)) {
            strArr14 = strArrBH;
            strArrBC = null;
        } else if (zD) {
            strArrBC = bC();
            strArr14 = strArrBH;
        } else {
            strArr14 = strArrBH;
            String[] strArr35 = new String[1];
            strArr35[i] = ak();
            strArrBC = strArr35;
        }
        dqqf.dA(length, strArrBC, new ejxr() { // from class: bora
            @Override // defpackage.ejxr
            public final Object get() {
                return "normalized_participant_display_destination:".concat(String.valueOf(this.a.getString(46)));
            }
        });
        if (!dj(47)) {
            strArr15 = strArrBC;
            zArrCd = null;
        } else if (zD) {
            zArrCd = cd();
            strArr15 = strArrBC;
        } else {
            strArr15 = strArrBC;
            boolean[] zArr18 = new boolean[1];
            zArr18[i] = aE();
            zArrCd = zArr18;
        }
        dqqf.dB(length, zArrCd, new ejxr() { // from class: borb
            @Override // defpackage.ejxr
            public final Object get() {
                return "spam_warning_dismiss_status:".concat(String.valueOf(this.a.getString(47)));
            }
        });
        if (!dj(48)) {
            zArr7 = zArrCd;
            iArrAK = null;
        } else if (zD) {
            iArrAK = aK();
            zArr7 = zArrCd;
        } else {
            zArr7 = zArrCd;
            int[] iArr16 = new int[1];
            iArr16[i] = A();
            iArrAK = iArr16;
        }
        dqqf.dy(length, iArrAK, new ejxr() { // from class: borc
            @Override // defpackage.ejxr
            public final Object get() {
                return "open_count:".concat(String.valueOf(this.a.getString(48)));
            }
        });
        if (!dj(49)) {
            iArr7 = iArrAK;
            jArrAS = null;
        } else if (zD) {
            jArrAS = aS();
            iArr7 = iArrAK;
        } else {
            iArr7 = iArrAK;
            long[] jArr18 = new long[1];
            jArr18[i] = I();
            jArrAS = jArr18;
        }
        dqqf.dz(length, jArrAS, new ejxr() { // from class: bord
            @Override // defpackage.ejxr
            public final Object get() {
                return "last_logged_scooby_metadata_timestamp:".concat(String.valueOf(this.a.getString(49)));
            }
        });
        if (!dj(50)) {
            jArr8 = jArrAS;
            jArrAQ = null;
        } else if (zD) {
            jArrAQ = aQ();
            jArr8 = jArrAS;
        } else {
            jArr8 = jArrAS;
            long[] jArr19 = new long[1];
            jArr19[i] = G();
            jArrAQ = jArr19;
        }
        dqqf.dz(length, jArrAQ, new ejxr() { // from class: borf
            @Override // defpackage.ejxr
            public final Object get() {
                return "delete_timestamp:".concat(String.valueOf(this.a.getString(50)));
            }
        });
        if (!dj(51)) {
            jArr9 = jArrAQ;
            strArrBv = null;
        } else if (zD) {
            strArrBv = bv();
            jArr9 = jArrAQ;
        } else {
            jArr9 = jArrAQ;
            String[] strArr36 = new String[1];
            strArr36[i] = ae();
            strArrBv = strArr36;
        }
        dqqf.dA(length, strArrBv, new ejxr() { // from class: borg
            @Override // defpackage.ejxr
            public final Object get() {
                return "cms_id:".concat(String.valueOf(this.a.getString(51)));
            }
        });
        if (!dj(52)) {
            strArr16 = strArrBv;
            strArrBN = null;
        } else if (zD) {
            strArrBN = bN();
            strArr16 = strArrBv;
        } else {
            strArr16 = strArrBv;
            String[] strArr37 = new String[1];
            strArr37[i] = u();
            strArrBN = strArr37;
        }
        dqqf.dA(length, strArrBN, new ejxr() { // from class: borh
            @Override // defpackage.ejxr
            public final Object get() {
                return "rcs_group_id:".concat(String.valueOf(this.a.getString(52)));
            }
        });
        if (!dj(53)) {
            strArr17 = strArrBN;
            strArrBM = null;
        } else if (zD) {
            strArrBM = bM();
            strArr17 = strArrBN;
        } else {
            strArr17 = strArrBN;
            String[] strArr38 = new String[1];
            strArr38[i] = ar();
            strArrBM = strArr38;
        }
        dqqf.dA(length, strArrBM, new ejxr() { // from class: bori
            @Override // defpackage.ejxr
            public final Object get() {
                return "rcs_conference_uri:".concat(String.valueOf(this.a.getString(53)));
            }
        });
        if (!dj(54)) {
            strArr18 = strArrBM;
            bArrCe = null;
        } else if (zD) {
            bArrCe = ce();
            strArr18 = strArrBM;
        } else {
            strArr18 = strArrBM;
            byte[][] bArr2 = new byte[1][];
            bArr2[i] = aF();
            bArrCe = bArr2;
        }
        dqqf.dA(length, bArrCe, new ejxr() { // from class: borj
            @Override // defpackage.ejxr
            public final Object get() {
                return "tachygram_group_routing_info_token:".concat(String.valueOf(this.a.getString(54)));
            }
        });
        if (!dj(55)) {
            bArr = bArrCe;
            jArrAP = null;
        } else if (zD) {
            jArrAP = aP();
            bArr = bArrCe;
        } else {
            bArr = bArrCe;
            long[] jArr20 = new long[1];
            jArr20[i] = F();
            jArrAP = jArr20;
        }
        dqqf.dz(length, jArrAP, new ejxr() { // from class: borl
            @Override // defpackage.ejxr
            public final Object get() {
                return "cms_most_recent_read_message_timestamp_ms:".concat(String.valueOf(this.a.getString(55)));
            }
        });
        if (!dj(56)) {
            jArr10 = jArrAP;
            jArrAX = null;
        } else if (zD) {
            jArrAX = aX();
            jArr10 = jArrAP;
        } else {
            jArr10 = jArrAP;
            long[] jArr21 = new long[1];
            jArr21[i] = M();
            jArrAX = jArr21;
        }
        dqqf.dz(length, jArrAX, new ejxr() { // from class: borm
            @Override // defpackage.ejxr
            public final Object get() {
                return "rcs_subject_change_timestamp_ms:".concat(String.valueOf(this.a.getString(56)));
            }
        });
        if (!dj(57)) {
            jArr11 = jArrAX;
            zArrCb = null;
        } else if (zD) {
            zArrCb = cb();
            jArr11 = jArrAX;
        } else {
            jArr11 = jArrAX;
            boolean[] zArr19 = new boolean[1];
            zArr19[i] = aC();
            zArrCb = zArr19;
        }
        dqqf.dB(length, zArrCb, new ejxr() { // from class: born
            @Override // defpackage.ejxr
            public final Object get() {
                return "rcs_session_allows_revocation:".concat(String.valueOf(this.a.getString(57)));
            }
        });
        if (!dj(58)) {
            zArr8 = zArrCb;
            cigbVarArrBo = null;
        } else if (zD) {
            cigbVarArrBo = bo();
            zArr8 = zArrCb;
        } else {
            zArr8 = zArrCb;
            cigb[] cigbVarArr2 = new cigb[1];
            cigbVarArr2[i] = Z();
            cigbVarArrBo = cigbVarArr2;
        }
        dqqf.dA(length, cigbVarArrBo, new ejxr() { // from class: boro
            @Override // defpackage.ejxr
            public final Object get() {
                return "rcs_group_capabilities:".concat(String.valueOf(this.a.getString(58)));
            }
        });
        if (!dj(59)) {
            cigbVarArr = cigbVarArrBo;
            zArrBT = null;
        } else if (zD) {
            zArrBT = bT();
            cigbVarArr = cigbVarArrBo;
        } else {
            cigbVarArr = cigbVarArrBo;
            boolean[] zArr20 = new boolean[1];
            zArr20[i] = v();
            zArrBT = zArr20;
        }
        dqqf.dB(length, zArrBT, new ejxr() { // from class: borp
            @Override // defpackage.ejxr
            public final Object get() {
                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(59)));
            }
        });
        if (!dj(60)) {
            zArr9 = zArrBT;
            conversationIdTypeArrBf = null;
        } else if (zD) {
            conversationIdTypeArrBf = bf();
            zArr9 = zArrBT;
        } else {
            zArr9 = zArrBT;
            ConversationIdType[] conversationIdTypeArr3 = new ConversationIdType[1];
            conversationIdTypeArr3[i] = T();
            conversationIdTypeArrBf = conversationIdTypeArr3;
        }
        dqqf.dA(length, conversationIdTypeArrBf, new ejxr() { // from class: borr
            @Override // defpackage.ejxr
            public final Object get() {
                return "duplicate_of:".concat(String.valueOf(this.a.getString(60)));
            }
        });
        if (!dj(61)) {
            conversationIdTypeArr = conversationIdTypeArrBf;
            conversationIdTypeArrBg = null;
        } else if (zD) {
            conversationIdTypeArrBg = bg();
            conversationIdTypeArr = conversationIdTypeArrBf;
        } else {
            conversationIdTypeArr = conversationIdTypeArrBf;
            ConversationIdType[] conversationIdTypeArr4 = new ConversationIdType[1];
            conversationIdTypeArr4[i] = U();
            conversationIdTypeArrBg = conversationIdTypeArr4;
        }
        dqqf.dA(length, conversationIdTypeArrBg, new ejxr() { // from class: bors
            @Override // defpackage.ejxr
            public final Object get() {
                return "new_duplicate_of:".concat(String.valueOf(this.a.getString(61)));
            }
        });
        if (!dj(62)) {
            conversationIdTypeArr2 = conversationIdTypeArrBg;
            avoeVarArrBc = null;
        } else if (zD) {
            avoeVarArrBc = bc();
            conversationIdTypeArr2 = conversationIdTypeArrBg;
        } else {
            conversationIdTypeArr2 = conversationIdTypeArrBg;
            avoe[] avoeVarArr2 = new avoe[1];
            avoeVarArr2[i] = Q();
            avoeVarArrBc = avoeVarArr2;
        }
        dqqf.dA(length, avoeVarArrBc, new ejxr() { // from class: bort
            @Override // defpackage.ejxr
            public final Object get() {
                return "error_state:".concat(String.valueOf(this.a.getString(62)));
            }
        });
        if (!dj(63)) {
            avoeVarArr = avoeVarArrBc;
            cpyiVarArrBr = null;
        } else if (zD) {
            cpyiVarArrBr = br();
            avoeVarArr = avoeVarArrBc;
        } else {
            avoeVarArr = avoeVarArrBc;
            cpyi[] cpyiVarArr2 = new cpyi[1];
            cpyiVarArr2[i] = l();
            cpyiVarArrBr = cpyiVarArr2;
        }
        dqqf.dA(length, cpyiVarArrBr, new ejxr() { // from class: boru
            @Override // defpackage.ejxr
            public final Object get() {
                return "cms_life_cycle:".concat(String.valueOf(this.a.getString(63)));
            }
        });
        if (!dj(64)) {
            cpyiVarArr = cpyiVarArrBr;
            strArrBO = null;
        } else if (zD) {
            strArrBO = bO();
            cpyiVarArr = cpyiVarArrBr;
        } else {
            cpyiVarArr = cpyiVarArrBr;
            String[] strArr39 = new String[1];
            strArr39[i] = as();
            strArrBO = strArr39;
        }
        dqqf.dA(length, strArrBO, new ejxr() { // from class: borw
            @Override // defpackage.ejxr
            public final Object get() {
                return "rcs_group_self_msisdn:".concat(String.valueOf(this.a.getString(64)));
            }
        });
        if (!dj(65)) {
            strArr19 = strArrBO;
            optionalArrBt = null;
        } else if (zD) {
            optionalArrBt = bt();
            strArr19 = strArrBO;
        } else {
            strArr19 = strArrBO;
            Optional[] optionalArr3 = new Optional[1];
            optionalArr3[i] = ac();
            optionalArrBt = optionalArr3;
        }
        dqqf.dA(length, optionalArrBt, new ejxr() { // from class: borx
            @Override // defpackage.ejxr
            public final Object get() {
                return "recipient_offline_timestamp_ms:".concat(String.valueOf(this.a.getString(65)));
            }
        });
        if (!dj(66)) {
            optionalArr = optionalArrBt;
            optionalArrBs = null;
        } else if (zD) {
            optionalArrBs = bs();
            optionalArr = optionalArrBt;
        } else {
            optionalArr = optionalArrBt;
            Optional[] optionalArr4 = new Optional[1];
            optionalArr4[i] = ab();
            optionalArrBs = optionalArr4;
        }
        dqqf.dA(length, optionalArrBs, new ejxr() { // from class: bory
            @Override // defpackage.ejxr
            public final Object get() {
                return "rcs_group_last_sync_timestamp:".concat(String.valueOf(this.a.getString(66)));
            }
        });
        if (!dj(67)) {
            optionalArr2 = optionalArrBs;
            zArrBU = null;
        } else if (zD) {
            zArrBU = bU();
            optionalArr2 = optionalArrBs;
        } else {
            optionalArr2 = optionalArrBs;
            boolean[] zArr21 = new boolean[1];
            zArr21[i] = ax();
            zArrBU = zArr21;
        }
        dqqf.dB(length, zArrBU, new ejxr() { // from class: borz
            @Override // defpackage.ejxr
            public final Object get() {
                return "has_been_e2ee:".concat(String.valueOf(this.a.getString(67)));
            }
        });
        if (!dj(68)) {
            zArr10 = zArrBU;
            zArrBY = null;
        } else if (zD) {
            zArrBY = bY();
            zArr10 = zArrBU;
        } else {
            zArr10 = zArrBU;
            boolean[] zArr22 = new boolean[1];
            zArr22[i] = aB();
            zArrBY = zArr22;
        }
        dqqf.dB(length, zArrBY, new ejxr() { // from class: bosa
            @Override // defpackage.ejxr
            public final Object get() {
                return "marked_as_unread:".concat(String.valueOf(this.a.getString(68)));
            }
        });
        if (!dj(69)) {
            zArr11 = zArrBY;
            cidtVarArrBn = null;
        } else if (zD) {
            cidtVarArrBn = bn();
            zArr11 = zArrBY;
        } else {
            zArr11 = zArrBY;
            cidt[] cidtVarArr2 = new cidt[1];
            cidtVarArr2[i] = Y();
            cidtVarArrBn = cidtVarArr2;
        }
        dqqf.dA(length, cidtVarArrBn, new ejxr() { // from class: bosb
            @Override // defpackage.ejxr
            public final Object get() {
                return "custom_theme:".concat(String.valueOf(this.a.getString(69)));
            }
        });
        if (!dj(70)) {
            cidtVarArr = cidtVarArrBn;
            cinsVarArrBp = null;
        } else if (zD) {
            cinsVarArrBp = bp();
            cidtVarArr = cidtVarArrBn;
        } else {
            cidtVarArr = cidtVarArrBn;
            cins[] cinsVarArr2 = new cins[1];
            cinsVarArr2[i] = aa();
            cinsVarArrBp = cinsVarArr2;
        }
        dqqf.dA(length, cinsVarArrBp, new ejxr() { // from class: bosd
            @Override // defpackage.ejxr
            public final Object get() {
                return "mms_group_upgrade_status:".concat(String.valueOf(this.a.getString(70)));
            }
        });
        if (!dj(71)) {
            cinsVarArr = cinsVarArrBp;
            iArrAJ = null;
        } else if (zD) {
            iArrAJ = aJ();
            cinsVarArr = cinsVarArrBp;
        } else {
            cinsVarArr = cinsVarArrBp;
            int[] iArr17 = new int[1];
            iArr17[i] = z();
            iArrAJ = iArr17;
        }
        dqqf.dy(length, iArrAJ, new ejxr() { // from class: bose
            @Override // defpackage.ejxr
            public final Object get() {
                return "mms_group_upgrade_retries:".concat(String.valueOf(this.a.getString(71)));
            }
        });
        if (!dj(72)) {
            iArr8 = iArrAJ;
            cbqzVarArrBm = null;
        } else if (zD) {
            cbqzVarArrBm = bm();
            iArr8 = iArrAJ;
        } else {
            iArr8 = iArrAJ;
            cbqz[] cbqzVarArr2 = new cbqz[1];
            cbqzVarArr2[i] = X();
            cbqzVarArrBm = cbqzVarArr2;
        }
        dqqf.dA(length, cbqzVarArrBm, new ejxr() { // from class: bosf
            @Override // defpackage.ejxr
            public final Object get() {
                return "encryption_protocol:".concat(String.valueOf(this.a.getString(72)));
            }
        });
        if (!dj(73)) {
            cbqzVarArr = cbqzVarArrBm;
            cbqxVarArrBl = null;
        } else if (zD) {
            cbqxVarArrBl = bl();
            cbqzVarArr = cbqzVarArrBm;
        } else {
            cbqzVarArr = cbqzVarArrBm;
            cbqx[] cbqxVarArr2 = new cbqx[1];
            cbqxVarArr2[i] = W();
            cbqxVarArrBl = cbqxVarArr2;
        }
        dqqf.dA(length, cbqxVarArrBl, new ejxr() { // from class: bosh
            @Override // defpackage.ejxr
            public final Object get() {
                return "encryption_id:".concat(String.valueOf(this.a.getString(73)));
            }
        });
        if (!dj(74)) {
            cbqxVarArr = cbqxVarArrBl;
            strArrBu = null;
        } else if (zD) {
            strArrBu = bu();
            cbqxVarArr = cbqxVarArrBl;
        } else {
            cbqxVarArr = cbqxVarArrBl;
            String[] strArr40 = new String[1];
            strArr40[i] = ad();
            strArrBu = strArr40;
        }
        dqqf.dA(length, strArrBu, new ejxr() { // from class: bosi
            @Override // defpackage.ejxr
            public final Object get() {
                return "cms_correlation_id:".concat(String.valueOf(this.a.getString(74)));
            }
        });
        if (!dj(75)) {
            strArr20 = strArrBu;
            uriArrBb = null;
        } else if (zD) {
            uriArrBb = bb();
            strArr20 = strArrBu;
        } else {
            strArr20 = strArrBu;
            Uri[] uriArr4 = new Uri[1];
            uriArr4[i] = P();
            uriArrBb = uriArr4;
        }
        dqqf.dA(length, uriArrBb, new ejxr() { // from class: bosj
            @Override // defpackage.ejxr
            public final Object get() {
                return "rcs_group_icon_url:".concat(String.valueOf(this.a.getString(75)));
            }
        });
        if (!dj(76)) {
            iArrAO = null;
        } else if (zD) {
            iArrAO = aO();
        } else {
            iArrAO = new int[1];
            iArrAO[i] = E();
        }
        dqqf.dy(length, iArrAO, new ejxr() { // from class: bosk
            @Override // defpackage.ejxr
            public final Object get() {
                return "unread_count:".concat(String.valueOf(this.a.getString(76)));
            }
        });
        ekfw ekfwVar = new ekfw();
        int i3 = i;
        while (i3 < length) {
            long j = jArr[i3];
            if (j > 0) {
                i2 = i3;
                if (!hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(jArr[i2]));
                    bojl bojlVarD = botm.d();
                    bojlVarD.aD();
                    long j2 = jArr[i2];
                    uriArr2 = uriArrBb;
                    if (conversationIdTypeArrBh != null) {
                        bojlVarD.B(conversationIdTypeArrBh[i2]);
                    }
                    if (cnqjVarArrBq != null) {
                        bojlVarD.as(cnqjVarArrBq[i2]);
                    }
                    if (strArrBB != null) {
                        bojlVarD.M(strArrBB[i2]);
                    }
                    if (bvdpVarArrBk != null) {
                        bojlVarD.N(bvdpVarArrBk[i2]);
                    }
                    if (strArrBS != null) {
                        bojlVarD.ay(strArrBS[i2]);
                    }
                    if (messageIdTypeArrBi != null) {
                        bojlVarD.I(messageIdTypeArrBi[i2]);
                    }
                    if (strArrBQ != null) {
                        bojlVarD.at(strArrBQ[i2]);
                    }
                    if (strArrBR != null) {
                        bojlVarD.ax(strArrBR[i2]);
                    }
                    if (uriArrBa != null) {
                        bojlVarD.ae(uriArrBa[i2]);
                    }
                    if (strArrBL != null) {
                        bojlVarD.ad(strArrBL[i2]);
                    }
                    if (zArr != null) {
                        bojlVarD.aq(zArr[i2]);
                    }
                    if (strArr != null) {
                        bojlVarD.s(strArr[i2]);
                    }
                    if (strArr2 != null) {
                        bojlVarD.t(strArr2[i2]);
                    }
                    if (uriArr != null) {
                        bojlVarD.r(uriArr[i2]);
                    }
                    if (strArr3 != null) {
                        bojlVarD.q(strArr3[i2]);
                    }
                    if (iArr != null) {
                        bojlVarD.p(iArr[i2]);
                    }
                    if (bvdkVarArr != null) {
                        bojlVarD.c(bvdkVarArr[i2]);
                    }
                    iArr9 = iArrAO;
                    if (jArr2 != null) {
                        bojlVarD.au(jArr2[i2]);
                    }
                    if (jArr3 != null) {
                        bojlVarD.H(jArr3[i2]);
                    }
                    if (strArr4 != null) {
                        bojlVarD.A(strArr4[i2]);
                    }
                    if (jArr4 != null) {
                        bojlVarD.X(jArr4[i2]);
                    }
                    if (jArr5 != null) {
                        bojlVarD.O(jArr5[i2]);
                    }
                    if (strArr5 != null) {
                        bojlVarD.ab(strArr5[i2]);
                    }
                    if (strArr6 != null) {
                        bojlVarD.R(strArr6[i2]);
                    }
                    if (strArr7 != null) {
                        bojlVarD.ac(strArr7[i2]);
                    }
                    if (strArr8 != null) {
                        bojlVarD.W(strArr8[i2]);
                    }
                    if (strArr9 != null) {
                        bojlVarD.k(strArr9[i2]);
                    }
                    if (axcmVarArr != null) {
                        bojlVarD.j(axcmVarArr[i2]);
                    }
                    if (awjlVarArr != null) {
                        bojlVarD.o(awjlVarArr[i2]);
                    }
                    if (iArr2 != null) {
                        bojlVarD.Y(iArr2[i2]);
                    }
                    if (zArr2 != null) {
                        bojlVarD.S(zArr2[i2]);
                    }
                    if (strArr10 != null) {
                        bojlVarD.T(strArr10[i2]);
                    }
                    if (zArr3 != null) {
                        bojlVarD.U(zArr3[i2]);
                    }
                    if (zArr4 != null) {
                        bojlVarD.C(zArr4[i2]);
                    }
                    if (strArr11 != null) {
                        bojlVarD.ar(strArr11[i2]);
                    }
                    if (strArr12 != null) {
                        bojlVarD.aa(strArr12[i2]);
                    }
                    if (strArr13 != null) {
                        bojlVarD.Q(strArr13[i2]);
                    }
                    if (iArr3 != null) {
                        bojlVarD.av(iArr3[i2]);
                    }
                    if (jArr6 != null) {
                        bojlVarD.am(jArr6[i2]);
                    }
                    if (iArr4 != null) {
                        bojlVarD.E(iArr4[i2]);
                    }
                    if (iArr5 != null) {
                        bojlVarD.i(iArr5[i2]);
                    }
                    if (iArr6 != null) {
                        bojlVarD.ap(iArr6[i2]);
                    }
                    if (zArr5 != null) {
                        bojlVarD.D(zArr5[i2]);
                    }
                    if (zArr6 != null) {
                        bojlVarD.z(zArr6[i2]);
                    }
                    if (jArr7 != null) {
                        bojlVarD.F(jArr7[i2]);
                    }
                    if (strArr14 != null) {
                        bojlVarD.Z(strArr14[i2]);
                    }
                    if (strArr15 != null) {
                        bojlVarD.P(strArr15[i2]);
                    }
                    if (zArr7 != null) {
                        bojlVarD.aw(zArr7[i2]);
                    }
                    if (iArr7 != null) {
                        bojlVarD.V(iArr7[i2]);
                    }
                    if (jArr8 != null) {
                        bojlVarD.G(jArr8[i2]);
                    }
                    if (jArr9 != null) {
                        bojlVarD.m(jArr9[i2]);
                    }
                    if (strArr16 != null) {
                        bojlVarD.f(strArr16[i2]);
                    }
                    if (strArr17 != null) {
                        bojlVarD.ai(strArr17[i2]);
                    }
                    if (strArr18 != null) {
                        bojlVarD.af(strArr18[i2]);
                    }
                    if (bArr != null) {
                        bojlVarD.az(bArr[i2]);
                    }
                    if (jArr10 != null) {
                        bojlVarD.h(jArr10[i2]);
                    }
                    if (jArr11 != null) {
                        bojlVarD.an(jArr11[i2]);
                    }
                    if (zArr8 != null) {
                        bojlVarD.al(zArr8[i2]);
                    }
                    if (cigbVarArr != null) {
                        bojlVarD.ag(cigbVarArr[i2]);
                    }
                    if (zArr9 != null) {
                        bojlVarD.d(zArr9[i2]);
                    }
                    if (conversationIdTypeArr != null) {
                        bojlVarD.n(conversationIdTypeArr[i2]);
                    }
                    if (conversationIdTypeArr2 != null) {
                        bojlVarD.u(conversationIdTypeArr2[i2]);
                    }
                    if (avoeVarArr != null) {
                        bojlVarD.x(avoeVarArr[i2]);
                    }
                    if (cpyiVarArr != null) {
                        bojlVarD.g(cpyiVarArr[i2]);
                    }
                    if (strArr19 != null) {
                        bojlVarD.ak(strArr19[i2]);
                    }
                    if (optionalArr != null) {
                        bojlVarD.ao(optionalArr[i2]);
                    }
                    if (optionalArr2 != null) {
                        bojlVarD.aj(optionalArr2[i2]);
                    }
                    if (zArr10 != null) {
                        bojlVarD.y(zArr10[i2]);
                    }
                    if (zArr11 != null) {
                        bojlVarD.J(zArr11[i2]);
                    }
                    if (cidtVarArr != null) {
                        bojlVarD.l(cidtVarArr[i2]);
                    }
                    if (cinsVarArr != null) {
                        bojlVarD.L(cinsVarArr[i2]);
                    }
                    if (iArr8 != null) {
                        bojlVarD.K(iArr8[i2]);
                    }
                    if (cbqzVarArr != null) {
                        bojlVarD.w(cbqzVarArr[i2]);
                    }
                    if (cbqxVarArr != null) {
                        bojlVarD.v(cbqxVarArr[i2]);
                    }
                    if (strArr20 != null) {
                        bojlVarD.e(strArr20[i2]);
                    }
                    if (uriArr2 != null) {
                        bojlVarD.ah(uriArr2[i2]);
                    }
                    if (iArr9 != null) {
                        bojlVarD.aA(iArr9[i2]);
                    }
                    ekfwVar.h(bojlVarD.a());
                }
                i3 = i2 + 1;
                uriArrBb = uriArr2;
                iArrAO = iArr9;
            } else {
                i2 = i3;
            }
            uriArr2 = uriArrBb;
            iArr9 = iArrAO;
            i3 = i2 + 1;
            uriArrBb = uriArr2;
            iArrAO = iArr9;
        }
        return ekfwVar.g();
    }

    @Override // defpackage.bopr
    public final Uri g() {
        String string = getString(cO(13, botm.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    @Override // defpackage.bopr
    public final ConversationIdType h() {
        return new ConversationIdType(getLong(cO(0, botm.a)));
    }

    @Override // defpackage.bopr
    public final MessageIdType i() {
        return new MessageIdType(getLong(cO(5, botm.a)));
    }

    @Override // defpackage.bopr
    public final bvdk j() {
        return bvdk.a(getInt(cO(16, botm.a)));
    }

    @Override // defpackage.bopr
    public final cnqj k() {
        return cnqj.b(getLong(cO(1, botm.a)));
    }

    @Override // defpackage.bopr
    public final cpyi l() {
        cpyi[] cpyiVarArrValues = cpyi.values();
        int i = getInt(cO(63, botm.a));
        if (i < cpyiVarArrValues.length) {
            return cpyiVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.bopr
    public final ekgb m() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            if (W() != null) {
                ekfwVar.h(W());
            }
        }
        return ekfwVar.g();
    }

    @Override // defpackage.bopr
    public final ekgb n() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            h();
            ekfwVar.h(h());
        }
        return ekfwVar.g();
    }

    @Override // defpackage.bopr
    public final ekgb o() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            e();
            ekfwVar.h(Integer.valueOf(e()));
        }
        return ekfwVar.g();
    }

    @Override // defpackage.bopr
    public final ekgb p() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            k();
            ekfwVar.h(k());
        }
        return ekfwVar.g();
    }

    @Override // defpackage.bopr
    public final String q() {
        return getString(cO(2, botm.a));
    }

    @Override // defpackage.bopr
    public final String r() {
        return getString(cO(31, botm.a));
    }

    @Override // defpackage.bopr
    public final String s() {
        return getString(cO(22, botm.a));
    }

    @Override // defpackage.bopr
    public final String t() {
        return getString(cO(24, botm.a));
    }

    @Override // defpackage.bopr
    public final String u() {
        return getString(cO(52, botm.a));
    }

    @Override // defpackage.bopr
    public final boolean v() {
        return getInt(cO(59, botm.a)) == 1;
    }

    @Override // defpackage.bopr
    public final boolean w() {
        return getInt(cO(30, botm.a)) == 1;
    }

    @Override // defpackage.bopr
    public final boolean x() {
        return getInt(cO(32, botm.a)) == 1;
    }

    public final int y() {
        return getInt(cO(15, botm.a));
    }

    public final int z() {
        return getInt(cO(71, botm.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
