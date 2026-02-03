package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brdi extends dqqf implements brap {
    @Deprecated
    public brdi(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, brdp brdpVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, MessagesTable.a, dqwjVar, dqtmVar, brdpVar);
    }

    @Override // defpackage.brap
    public final ekgb A() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            if (o() != null) {
                ekfwVar.h(o());
            }
        }
        return ekfwVar.g();
    }

    @Override // defpackage.brap
    public final ekgb B() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            i();
            ekfwVar.h(Integer.valueOf(i()));
        }
        return ekfwVar.g();
    }

    @Override // defpackage.brap
    public final Optional C() {
        return basg.a(getString(cO(69, MessagesTable.a)));
    }

    @Override // defpackage.brap
    public final String D() {
        return getString(cO(27, MessagesTable.a));
    }

    @Override // defpackage.brap
    public final String E() {
        return getString(cO(38, MessagesTable.a));
    }

    @Override // defpackage.brap
    public final String F() {
        return getString(cO(19, MessagesTable.a));
    }

    @Override // defpackage.brap
    public final String G() {
        return getString(cO(22, MessagesTable.a));
    }

    @Override // defpackage.brap
    public final String H() {
        return cssq.a(getString(cO(17, MessagesTable.a)));
    }

    @Override // defpackage.brap
    public final String I() {
        return getString(cO(18, MessagesTable.a));
    }

    @Override // defpackage.brap
    public final String J() {
        return getString(cO(4, MessagesTable.a));
    }

    @Override // defpackage.brap
    public final String K() {
        return getString(cO(40, MessagesTable.a));
    }

    @Override // defpackage.brap
    public final boolean L() {
        return getInt(cO(32, MessagesTable.a)) == 1;
    }

    public final int M() {
        return getInt(cO(60, MessagesTable.a));
    }

    public final int N() {
        return getInt(cO(11, MessagesTable.a));
    }

    public final int O() {
        return getInt(cO(66, MessagesTable.a));
    }

    public final int P() {
        return getInt(cO(29, MessagesTable.a));
    }

    public final int Q() {
        return getInt(cO(31, MessagesTable.a));
    }

    public final long R() {
        return getLong(cO(39, MessagesTable.a));
    }

    public final long S() {
        return getLong(cO(21, MessagesTable.a));
    }

    public final long T() {
        return getLong(cO(47, MessagesTable.a));
    }

    public final long U() {
        return getLong(cO(26, MessagesTable.a));
    }

    public final long V() {
        return getLong(cO(42, MessagesTable.a));
    }

    public final long W() {
        return getLong(cO(16, MessagesTable.a));
    }

    public final long X() {
        return getLong(cO(41, MessagesTable.a));
    }

    public final axcm Y() {
        return axcn.a(getString(cO(25, MessagesTable.a)));
    }

    public final baro Z() {
        return new baro(getString(cO(67, MessagesTable.a)));
    }

    public final boolean aA() {
        return getInt(cO(13, MessagesTable.a)) == 1;
    }

    public final byte[] aB() {
        return getBlob(cO(46, MessagesTable.a));
    }

    public final int[] aC() {
        return dqru.A(null, ds(getString(cO(60, MessagesTable.a))));
    }

    public final int[] aD() {
        return dqru.A(null, ds(getString(cO(11, MessagesTable.a))));
    }

    public final int[] aE() {
        return dqru.A(null, ds(getString(cO(66, MessagesTable.a))));
    }

    public final int[] aF() {
        return dqru.A(null, ds(getString(cO(9, MessagesTable.a))));
    }

    public final int[] aG() {
        return dqru.A(null, ds(getString(cO(23, MessagesTable.a))));
    }

    public final int[] aH() {
        return dqru.A(null, ds(getString(cO(29, MessagesTable.a))));
    }

    public final int[] aI() {
        return dqru.A(null, ds(getString(cO(31, MessagesTable.a))));
    }

    public final int[] aJ() {
        return dqru.A(null, ds(getString(cO(56, MessagesTable.a))));
    }

    public final long[] aK() {
        return dqru.C(null, dt(getString(cO(39, MessagesTable.a))));
    }

    public final long[] aL() {
        return dqru.C(null, dt(getString(cO(20, MessagesTable.a))));
    }

    public final long[] aM() {
        return dqru.C(null, dt(getString(cO(21, MessagesTable.a))));
    }

    public final long[] aN() {
        return dqru.C(null, dt(getString(cO(34, MessagesTable.a))));
    }

    public final long[] aO() {
        return dqru.C(null, dt(getString(cO(8, MessagesTable.a))));
    }

    public final long[] aP() {
        return dqru.C(null, dt(getString(cO(47, MessagesTable.a))));
    }

    public final long[] aQ() {
        return dqru.C(null, dt(getString(cO(26, MessagesTable.a))));
    }

    public final long[] aR() {
        return dqru.C(null, dt(getString(cO(42, MessagesTable.a))));
    }

    public final Uri[] aS() {
        String[] strArrDu = du(getString(cO(54, MessagesTable.a)));
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

    public final Uri[] aT() {
        String[] strArrDu = du(getString(cO(14, MessagesTable.a)));
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

    public final axcm[] aU() {
        String[] strArrDu = du(getString(cO(25, MessagesTable.a)));
        int length = strArrDu.length;
        axcm[] axcmVarArr = new axcm[length];
        for (int i = 0; i < length; i++) {
            axcmVarArr[i] = axcn.a(strArrDu[i]);
        }
        return (axcm[]) dqru.D(null, axcmVarArr, new axcm[0]);
    }

    public final ConversationIdType[] aV() {
        long[] jArrDt = dt(getString(cO(1, MessagesTable.a)));
        int length = jArrDt.length;
        ConversationIdType[] conversationIdTypeArr = new ConversationIdType[length];
        for (int i = 0; i < length; i++) {
            conversationIdTypeArr[i] = new ConversationIdType(jArrDt[i]);
        }
        return (ConversationIdType[]) dqru.D(null, conversationIdTypeArr, new ConversationIdType[0]);
    }

    public final baro[] aW() {
        String[] strArrDu = du(getString(cO(67, MessagesTable.a)));
        int length = strArrDu.length;
        baro[] baroVarArr = new baro[length];
        for (int i = 0; i < length; i++) {
            baroVarArr[i] = new baro(strArrDu[i]);
        }
        return (baro[]) dqru.D(null, baroVarArr, new baro[0]);
    }

    public final MessageIdType[] aX() {
        long[] jArrDt = dt(getString(cO(0, MessagesTable.a)));
        int length = jArrDt.length;
        MessageIdType[] messageIdTypeArr = new MessageIdType[length];
        for (int i = 0; i < length; i++) {
            messageIdTypeArr[i] = new MessageIdType(jArrDt[i]);
        }
        return (MessageIdType[]) dqru.D(null, messageIdTypeArr, new MessageIdType[0]);
    }

    public final MessageIdType[] aY() {
        long[] jArrDt = dt(getString(cO(51, MessagesTable.a)));
        int length = jArrDt.length;
        MessageIdType[] messageIdTypeArr = new MessageIdType[length];
        for (int i = 0; i < length; i++) {
            messageIdTypeArr[i] = new MessageIdType(jArrDt[i]);
        }
        return (MessageIdType[]) dqru.D(null, messageIdTypeArr, new MessageIdType[0]);
    }

    public final MessageIdType[] aZ() {
        long[] jArrDt = dt(getString(cO(52, MessagesTable.a)));
        int length = jArrDt.length;
        MessageIdType[] messageIdTypeArr = new MessageIdType[length];
        for (int i = 0; i < length; i++) {
            messageIdTypeArr[i] = new MessageIdType(jArrDt[i]);
        }
        return (MessageIdType[]) dqru.D(null, messageIdTypeArr, new MessageIdType[0]);
    }

    public final MessageIdType aa() {
        return new MessageIdType(getLong(cO(51, MessagesTable.a)));
    }

    public final MessageIdType ab() {
        return new MessageIdType(getLong(cO(52, MessagesTable.a)));
    }

    public final basd ac() {
        return basd.a(getString(cO(43, MessagesTable.a)));
    }

    public final bvdn ad() {
        bvdn[] bvdnVarArrValues = bvdn.values();
        int i = getInt(cO(59, MessagesTable.a));
        if (i < bvdnVarArrValues.length) {
            return bvdnVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final bvdx ae() {
        bvdx[] bvdxVarArrValues = bvdx.values();
        int i = getInt(cO(63, MessagesTable.a));
        if (i < bvdxVarArrValues.length) {
            return bvdxVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final bvdx af() {
        bvdx[] bvdxVarArrValues = bvdx.values();
        int i = getInt(cO(64, MessagesTable.a));
        if (i < bvdxVarArrValues.length) {
            return bvdxVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final bvdz ag() {
        bvdz[] bvdzVarArrValues = bvdz.values();
        int i = getInt(cO(30, MessagesTable.a));
        if (i < bvdzVarArrValues.length) {
            return bvdzVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final cgrd ah() {
        cgrd[] cgrdVarArrValues = cgrd.values();
        int i = getInt(cO(58, MessagesTable.a));
        if (i < cgrdVarArrValues.length) {
            return cgrdVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final cjnm ai() {
        byte[] blob = getBlob(cO(44, MessagesTable.a));
        if (blob == null) {
            return null;
        }
        try {
            return (cjnm) evsn.parseFrom(cjnm.a, blob, evrr.a());
        } catch (Throwable unused) {
            return cjnm.a;
        }
    }

    public final eyga aj() {
        byte[] blob = getBlob(cO(48, MessagesTable.a));
        if (blob == null) {
            return null;
        }
        try {
            return (eyga) evsn.parseFrom(eyga.a, blob, evrr.a());
        } catch (Throwable unused) {
            return eyga.a;
        }
    }

    public final Instant ak() {
        return bart.b(getLong(cO(7, MessagesTable.a)));
    }

    public final Optional al() {
        return basg.a(getString(cO(55, MessagesTable.a)));
    }

    public final String am() {
        return getString(cO(49, MessagesTable.a));
    }

    public final String an() {
        return getString(cO(37, MessagesTable.a));
    }

    public final String ao() {
        return getString(cO(45, MessagesTable.a));
    }

    public final String ap() {
        return getString(cO(50, MessagesTable.a));
    }

    public final String aq() {
        return getString(cO(33, MessagesTable.a));
    }

    public final String ar() {
        return getString(cO(5, MessagesTable.a));
    }

    public final String as() {
        return getString(cO(24, MessagesTable.a));
    }

    public final String at() {
        return getString(cO(2, MessagesTable.a));
    }

    public final String au() {
        return getString(cO(3, MessagesTable.a));
    }

    public final String av() {
        return getString(cO(36, MessagesTable.a));
    }

    public final fhaz aw() {
        byte[] blob = getBlob(cO(62, MessagesTable.a));
        if (blob == null) {
            return null;
        }
        try {
            return (fhaz) evsn.parseFrom(fhaz.a, blob, evrr.a());
        } catch (Throwable unused) {
            return fhaz.a;
        }
    }

    public final boolean ax() {
        return getInt(cO(53, MessagesTable.a)) == 1;
    }

    public final boolean ay() {
        return getInt(cO(61, MessagesTable.a)) == 1;
    }

    public final boolean az() {
        return getInt(cO(12, MessagesTable.a)) == 1;
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bqur();
    }

    public final String[] bA() {
        return (String[]) dqru.D(null, du(getString(cO(24, MessagesTable.a))), new String[0]);
    }

    public final String[] bB() {
        return (String[]) dqru.D(null, du(getString(cO(2, MessagesTable.a))), new String[0]);
    }

    public final String[] bC() {
        return (String[]) dqru.D(null, du(getString(cO(3, MessagesTable.a))), new String[0]);
    }

    public final fhaz[] bD() {
        fhaz fhazVar;
        List listDf = df(getString(cO(62, MessagesTable.a)));
        fhaz[] fhazVarArr = new fhaz[listDf.size()];
        Iterator it = listDf.iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                byte[] bArrZ = dqru.z((String) it.next());
                int i2 = i + 1;
                if (bArrZ == null) {
                    fhazVar = null;
                } else {
                    try {
                        fhazVar = (fhaz) evsn.parseFrom(fhaz.a, bArrZ);
                    } catch (Throwable unused) {
                        i = i2;
                        fhazVarArr[i] = null;
                        i++;
                    }
                }
                fhazVarArr[i] = fhazVar;
                i = i2;
            } catch (Throwable unused2) {
            }
        }
        return (fhaz[]) dqru.D(null, fhazVarArr, new fhaz[0]);
    }

    public final boolean[] bE() {
        return dqru.E(null, dv(getString(cO(53, MessagesTable.a))));
    }

    public final boolean[] bF() {
        return dqru.E(null, dv(getString(cO(61, MessagesTable.a))));
    }

    public final boolean[] bG() {
        return dqru.E(null, dv(getString(cO(32, MessagesTable.a))));
    }

    public final boolean[] bH() {
        return dqru.E(null, dv(getString(cO(12, MessagesTable.a))));
    }

    public final boolean[] bI() {
        return dqru.E(null, dv(getString(cO(13, MessagesTable.a))));
    }

    public final byte[][] bJ() {
        return dqru.F(null, dD(getString(cO(46, MessagesTable.a))));
    }

    public final basd[] ba() {
        String[] strArrDu = du(getString(cO(43, MessagesTable.a)));
        int length = strArrDu.length;
        basd[] basdVarArr = new basd[length];
        for (int i = 0; i < length; i++) {
            basdVarArr[i] = basd.a(strArrDu[i]);
        }
        return (basd[]) dqru.D(null, basdVarArr, new basd[0]);
    }

    public final basd[] bb() {
        String[] strArrDu = du(getString(cO(28, MessagesTable.a)));
        int length = strArrDu.length;
        basd[] basdVarArr = new basd[length];
        for (int i = 0; i < length; i++) {
            basdVarArr[i] = basd.a(strArrDu[i]);
        }
        return (basd[]) dqru.D(null, basdVarArr, new basd[0]);
    }

    public final bvdn[] bc() {
        int[] iArrDs = ds(getString(cO(59, MessagesTable.a)));
        bvdn[] bvdnVarArrValues = bvdn.values();
        int length = bvdnVarArrValues.length;
        bvdn[] bvdnVarArr = new bvdn[iArrDs.length];
        for (int i = 0; i < iArrDs.length; i++) {
            int i2 = iArrDs[i];
            if (i2 >= length) {
                throw new IllegalStateException();
            }
            bvdnVarArr[i] = bvdnVarArrValues[i2];
        }
        return (bvdn[]) dqru.D(null, bvdnVarArr, new bvdn[0]);
    }

    public final bvdx[] bd() {
        int[] iArrDs = ds(getString(cO(63, MessagesTable.a)));
        bvdx[] bvdxVarArrValues = bvdx.values();
        int length = bvdxVarArrValues.length;
        bvdx[] bvdxVarArr = new bvdx[iArrDs.length];
        for (int i = 0; i < iArrDs.length; i++) {
            int i2 = iArrDs[i];
            if (i2 >= length) {
                throw new IllegalStateException();
            }
            bvdxVarArr[i] = bvdxVarArrValues[i2];
        }
        return (bvdx[]) dqru.D(null, bvdxVarArr, new bvdx[0]);
    }

    public final bvdx[] be() {
        int[] iArrDs = ds(getString(cO(64, MessagesTable.a)));
        bvdx[] bvdxVarArrValues = bvdx.values();
        int length = bvdxVarArrValues.length;
        bvdx[] bvdxVarArr = new bvdx[iArrDs.length];
        for (int i = 0; i < iArrDs.length; i++) {
            int i2 = iArrDs[i];
            if (i2 >= length) {
                throw new IllegalStateException();
            }
            bvdxVarArr[i] = bvdxVarArrValues[i2];
        }
        return (bvdx[]) dqru.D(null, bvdxVarArr, new bvdx[0]);
    }

    public final cbqz[] bf() {
        long[] jArrDt = dt(getString(cO(68, MessagesTable.a)));
        int length = jArrDt.length;
        cbqz[] cbqzVarArr = new cbqz[length];
        for (int i = 0; i < length; i++) {
            cbqzVarArr[i] = new cbqz(jArrDt[i]);
        }
        return (cbqz[]) dqru.D(null, cbqzVarArr, new cbqz[0]);
    }

    public final cgrd[] bg() {
        int[] iArrDs = ds(getString(cO(58, MessagesTable.a)));
        cgrd[] cgrdVarArrValues = cgrd.values();
        int length = cgrdVarArrValues.length;
        cgrd[] cgrdVarArr = new cgrd[iArrDs.length];
        for (int i = 0; i < iArrDs.length; i++) {
            int i2 = iArrDs[i];
            if (i2 >= length) {
                throw new IllegalStateException();
            }
            cgrdVarArr[i] = cgrdVarArrValues[i2];
        }
        return (cgrd[]) dqru.D(null, cgrdVarArr, new cgrd[0]);
    }

    public final cjnm[] bh() {
        cjnm cjnmVar;
        List listDf = df(getString(cO(44, MessagesTable.a)));
        cjnm[] cjnmVarArr = new cjnm[listDf.size()];
        Iterator it = listDf.iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                byte[] bArrZ = dqru.z((String) it.next());
                int i2 = i + 1;
                if (bArrZ == null) {
                    cjnmVar = null;
                } else {
                    try {
                        cjnmVar = (cjnm) evsn.parseFrom(cjnm.a, bArrZ);
                    } catch (Throwable unused) {
                        i = i2;
                        cjnmVarArr[i] = null;
                        i++;
                    }
                }
                cjnmVarArr[i] = cjnmVar;
                i = i2;
            } catch (Throwable unused2) {
            }
        }
        return (cjnm[]) dqru.D(null, cjnmVarArr, new cjnm[0]);
    }

    public final cpyi[] bi() {
        int[] iArrDs = ds(getString(cO(57, MessagesTable.a)));
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

    public final eyga[] bj() {
        eyga eygaVar;
        List listDf = df(getString(cO(48, MessagesTable.a)));
        eyga[] eygaVarArr = new eyga[listDf.size()];
        Iterator it = listDf.iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                byte[] bArrZ = dqru.z((String) it.next());
                int i2 = i + 1;
                if (bArrZ == null) {
                    eygaVar = null;
                } else {
                    try {
                        eygaVar = (eyga) evsn.parseFrom(eyga.a, bArrZ);
                    } catch (Throwable unused) {
                        i = i2;
                        eygaVarArr[i] = null;
                        i++;
                    }
                }
                eygaVarArr[i] = eygaVar;
                i = i2;
            } catch (Throwable unused2) {
            }
        }
        return (eyga[]) dqru.D(null, eygaVarArr, new eyga[0]);
    }

    public final Instant[] bk() {
        long[] jArrDt = dt(getString(cO(7, MessagesTable.a)));
        int length = jArrDt.length;
        Instant[] instantArr = new Instant[length];
        for (int i = 0; i < length; i++) {
            instantArr[i] = bart.b(jArrDt[i]);
        }
        return (Instant[]) dqru.D(null, instantArr, new Instant[0]);
    }

    public final Optional[] bl() {
        String[] strArrDu = du(getString(cO(55, MessagesTable.a)));
        int length = strArrDu.length;
        Optional[] optionalArr = new Optional[length];
        for (int i = 0; i < length; i++) {
            optionalArr[i] = basg.a(strArrDu[i]);
        }
        return (Optional[]) dqru.D(null, optionalArr, new Optional[0]);
    }

    public final Optional[] bm() {
        String[] strArrDu = du(getString(cO(69, MessagesTable.a)));
        int length = strArrDu.length;
        Optional[] optionalArr = new Optional[length];
        for (int i = 0; i < length; i++) {
            optionalArr[i] = basg.a(strArrDu[i]);
        }
        return (Optional[]) dqru.D(null, optionalArr, new Optional[0]);
    }

    public final String[] bn() {
        return (String[]) dqru.D(null, du(getString(cO(27, MessagesTable.a))), new String[0]);
    }

    public final String[] bo() {
        return (String[]) dqru.D(null, du(getString(cO(49, MessagesTable.a))), new String[0]);
    }

    public final String[] bp() {
        return (String[]) dqru.D(null, du(getString(cO(38, MessagesTable.a))), new String[0]);
    }

    public final String[] bq() {
        return (String[]) dqru.D(null, du(getString(cO(37, MessagesTable.a))), new String[0]);
    }

    public final String[] br() {
        return (String[]) dqru.D(null, du(getString(cO(45, MessagesTable.a))), new String[0]);
    }

    public final String[] bs() {
        return (String[]) dqru.D(null, du(getString(cO(50, MessagesTable.a))), new String[0]);
    }

    public final String[] bt() {
        return (String[]) dqru.D(null, du(getString(cO(19, MessagesTable.a))), new String[0]);
    }

    public final String[] bu() {
        return (String[]) dqru.D(null, du(getString(cO(22, MessagesTable.a))), new String[0]);
    }

    public final String[] bv() {
        String[] strArrDu = du(getString(cO(17, MessagesTable.a)));
        for (int i = 0; i < strArrDu.length; i++) {
            strArrDu[i] = cssq.a(strArrDu[i]);
        }
        return (String[]) dqru.D(null, strArrDu, new String[0]);
    }

    public final String[] bw() {
        return (String[]) dqru.D(null, du(getString(cO(18, MessagesTable.a))), new String[0]);
    }

    public final String[] bx() {
        return (String[]) dqru.D(null, du(getString(cO(4, MessagesTable.a))), new String[0]);
    }

    public final String[] by() {
        return (String[]) dqru.D(null, du(getString(cO(33, MessagesTable.a))), new String[0]);
    }

    public final String[] bz() {
        return (String[]) dqru.D(null, du(getString(cO(5, MessagesTable.a))), new String[0]);
    }

    @Override // defpackage.brap
    public final int c() {
        return getInt(cO(9, MessagesTable.a));
    }

    @Override // defpackage.brap
    public final int e() {
        return getInt(cO(23, MessagesTable.a));
    }

    @Override // defpackage.brap
    public final int f() {
        return getInt(cO(56, MessagesTable.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        int i;
        Instant[] instantArrBk;
        long[] jArrAO;
        int[] iArrAF;
        long[] jArr;
        int[] iArrA;
        int[] iArr;
        int[] iArrAD;
        int[] iArr2;
        boolean[] zArrBH;
        boolean[] zArr;
        boolean[] zArrBI;
        boolean[] zArr2;
        Uri[] uriArrAT;
        Uri[] uriArr;
        int[] iArrA2;
        int[] iArr3;
        long[] jArrC;
        long[] jArr2;
        String[] strArrBv;
        String[] strArr;
        String[] strArrBw;
        String[] strArr2;
        String[] strArrBt;
        String[] strArr3;
        long[] jArrAL;
        long[] jArr3;
        long[] jArrAM;
        long[] jArr4;
        String[] strArrBu;
        String[] strArr4;
        int[] iArrAG;
        int[] iArr4;
        String[] strArrBA;
        String[] strArr5;
        axcm[] axcmVarArrAU;
        axcm[] axcmVarArr;
        long[] jArrAQ;
        long[] jArr5;
        String[] strArrBn;
        String[] strArr6;
        basd[] basdVarArrBb;
        basd[] basdVarArr;
        int[] iArrAH;
        int[] iArr5;
        long[] jArr6;
        boolean z;
        MessageIdType[] messageIdTypeArr;
        bvdz[] bvdzVarArr;
        int[] iArr6;
        long[] jArrAN;
        long[] jArr7;
        int[] iArrA3;
        int[] iArr7;
        bvdz[] bvdzVarArr2;
        String[] strArr7;
        String[] strArr8;
        String[] strArrBp;
        String[] strArr9;
        long[] jArrAK;
        long[] jArr8;
        String[] strArr10;
        String[] strArr11;
        long[] jArr9;
        long[] jArrAR;
        long[] jArr10;
        basd[] basdVarArrBa;
        basd[] basdVarArr2;
        cjnm[] cjnmVarArrBh;
        cjnm[] cjnmVarArr;
        String[] strArrBr;
        String[] strArr12;
        byte[][] bArrBJ;
        byte[][] bArr;
        long[] jArrAP;
        long[] jArr11;
        eyga[] eygaVarArrBj;
        eyga[] eygaVarArr;
        String[] strArrBo;
        String[] strArr13;
        String[] strArrBs;
        String[] strArr14;
        MessageIdType[] messageIdTypeArrAY;
        MessageIdType[] messageIdTypeArr2;
        MessageIdType[] messageIdTypeArrAZ;
        MessageIdType[] messageIdTypeArr3;
        boolean[] zArrBE;
        boolean[] zArr3;
        Uri[] uriArrAS;
        Uri[] uriArr2;
        Optional[] optionalArrBl;
        Optional[] optionalArr;
        int[] iArrAJ;
        int[] iArr8;
        cpyi[] cpyiVarArrBi;
        cpyi[] cpyiVarArr;
        cgrd[] cgrdVarArrBg;
        cgrd[] cgrdVarArr;
        bvdn[] bvdnVarArrBc;
        bvdn[] bvdnVarArr;
        int[] iArrAC;
        int[] iArr9;
        boolean[] zArrBF;
        boolean[] zArr4;
        fhaz[] fhazVarArrBD;
        fhaz[] fhazVarArr;
        bvdx[] bvdxVarArrBd;
        bvdx[] bvdxVarArr;
        bvdx[] bvdxVarArrBe;
        bvdx[] bvdxVarArr2;
        String[] strArr15;
        boolean[] zArr5;
        String[] strArr16;
        baro[] baroVarArr;
        bvec[] bvecVarArr;
        int i2;
        bvec[] bvecVarArr2;
        Optional[] optionalArrBm;
        int i3;
        cbqz[] cbqzVarArr;
        int i4;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length == 0 || (length == 1 && jArrDC[0] == -1)) {
            int i5 = ekgb.d;
            return ekoe.a;
        }
        HashSet hashSet = new HashSet();
        dqtm dqtmVar = this.d;
        boolean zDj = dj(0);
        boolean z2 = dqtmVar.b;
        MessageIdType[] messageIdTypeArrAX = zDj ? z2 ? aX() : new MessageIdType[]{q()} : null;
        dqqf.dA(length, messageIdTypeArrAX, new ejxr() { // from class: braq
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        ConversationIdType[] conversationIdTypeArrAV = dj(1) ? z2 ? aV() : new ConversationIdType[]{p()} : null;
        dqqf.dA(length, conversationIdTypeArrAV, new ejxr() { // from class: bras
            @Override // defpackage.ejxr
            public final Object get() {
                return "conversation_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        String[] strArrBB = dj(2) ? z2 ? bB() : new String[]{at()} : null;
        dqqf.dA(length, strArrBB, new ejxr() { // from class: brbe
            @Override // defpackage.ejxr
            public final Object get() {
                return "sender_id:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        String[] strArrBC = dj(3) ? z2 ? bC() : new String[]{au()} : null;
        dqqf.dA(length, strArrBC, new ejxr() { // from class: brbq
            @Override // defpackage.ejxr
            public final Object get() {
                return "sender_send_destination:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        String[] strArrBx = dj(4) ? z2 ? bx() : new String[]{J()} : null;
        dqqf.dA(length, strArrBx, new ejxr() { // from class: brcc
            @Override // defpackage.ejxr
            public final Object get() {
                return "msisdn_receiving_rcs_message:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        String[] strArrBz = dj(5) ? z2 ? bz() : new String[]{ar()} : null;
        dqqf.dA(length, strArrBz, new ejxr() { // from class: brco
            @Override // defpackage.ejxr
            public final Object get() {
                return "receiving_network_country:".concat(String.valueOf(this.a.getString(5)));
            }
        });
        long[] jArrC2 = dj(6) ? z2 ? dqru.C(null, dt(getString(cO(6, MessagesTable.a)))) : new long[]{m()} : null;
        dqqf.dz(length, jArrC2, new ejxr() { // from class: brda
            @Override // defpackage.ejxr
            public final Object get() {
                return "sent_timestamp:".concat(String.valueOf(this.a.getString(6)));
            }
        });
        if (dj(7)) {
            instantArrBk = z2 ? bk() : new Instant[]{ak()};
            i = 0;
        } else {
            i = 0;
            instantArrBk = null;
        }
        dqqf.dA(length, instantArrBk, new ejxr() { // from class: brdb
            @Override // defpackage.ejxr
            public final Object get() {
                return "queue_insert_timestamp:".concat(String.valueOf(this.a.getString(7)));
            }
        });
        if (!dj(8)) {
            jArrAO = null;
        } else if (z2) {
            jArrAO = aO();
        } else {
            jArrAO = new long[1];
            jArrAO[i] = l();
        }
        dqqf.dz(length, jArrAO, new ejxr() { // from class: brdc
            @Override // defpackage.ejxr
            public final Object get() {
                return "received_timestamp:".concat(String.valueOf(this.a.getString(8)));
            }
        });
        if (!dj(9)) {
            iArrAF = null;
        } else if (z2) {
            iArrAF = aF();
        } else {
            iArrAF = new int[1];
            iArrAF[i] = c();
        }
        dqqf.dy(length, iArrAF, new ejxr() { // from class: brdd
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_protocol:".concat(String.valueOf(this.a.getString(9)));
            }
        });
        if (!dj(10)) {
            jArr = jArrDC;
            iArrA = null;
        } else if (z2) {
            jArr = jArrDC;
            iArrA = dqru.A(null, ds(getString(cO(10, MessagesTable.a))));
        } else {
            jArr = jArrDC;
            iArrA = new int[1];
            iArrA[i] = i();
        }
        dqqf.dy(length, iArrA, new ejxr() { // from class: brbb
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_status:".concat(String.valueOf(this.a.getString(10)));
            }
        });
        if (!dj(11)) {
            iArr = iArrA;
            iArrAD = null;
        } else if (z2) {
            iArr = iArrA;
            iArrAD = aD();
        } else {
            iArr = iArrA;
            iArrAD = new int[1];
            iArrAD[i] = N();
        }
        dqqf.dy(length, iArrAD, new ejxr() { // from class: brbm
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_report_status:".concat(String.valueOf(this.a.getString(11)));
            }
        });
        if (!dj(12)) {
            iArr2 = iArrAD;
            zArrBH = null;
        } else if (z2) {
            iArr2 = iArrAD;
            zArrBH = bH();
        } else {
            iArr2 = iArrAD;
            zArrBH = new boolean[1];
            zArrBH[i] = az();
        }
        dqqf.dB(length, zArrBH, new ejxr() { // from class: brbx
            @Override // defpackage.ejxr
            public final Object get() {
                return "seen:".concat(String.valueOf(this.a.getString(12)));
            }
        });
        if (!dj(13)) {
            zArr = zArrBH;
            zArrBI = null;
        } else if (z2) {
            zArr = zArrBH;
            zArrBI = bI();
        } else {
            zArr = zArrBH;
            zArrBI = new boolean[1];
            zArrBI[i] = aA();
        }
        dqqf.dB(length, zArrBI, new ejxr() { // from class: brci
            @Override // defpackage.ejxr
            public final Object get() {
                return "read:".concat(String.valueOf(this.a.getString(13)));
            }
        });
        if (!dj(14)) {
            zArr2 = zArrBI;
            uriArrAT = null;
        } else if (z2) {
            zArr2 = zArrBI;
            uriArrAT = aT();
        } else {
            zArr2 = zArrBI;
            uriArrAT = new Uri[1];
            uriArrAT[i] = o();
        }
        dqqf.dA(length, uriArrAT, new ejxr() { // from class: brct
            @Override // defpackage.ejxr
            public final Object get() {
                return "sms_message_uri:".concat(String.valueOf(this.a.getString(14)));
            }
        });
        if (!dj(15)) {
            uriArr = uriArrAT;
            iArrA2 = null;
        } else if (z2) {
            uriArr = uriArrAT;
            iArrA2 = dqru.A(null, ds(getString(cO(15, MessagesTable.a))));
        } else {
            uriArr = uriArrAT;
            iArrA2 = new int[1];
            iArrA2[i] = h();
        }
        dqqf.dy(length, iArrA2, new ejxr() { // from class: brde
            @Override // defpackage.ejxr
            public final Object get() {
                return "sms_priority:".concat(String.valueOf(this.a.getString(15)));
            }
        });
        if (!dj(16)) {
            iArr3 = iArrA2;
            jArrC = null;
        } else if (z2) {
            iArr3 = iArrA2;
            jArrC = dqru.C(null, dt(getString(cO(16, MessagesTable.a))));
        } else {
            iArr3 = iArrA2;
            jArrC = new long[1];
            jArrC[i] = W();
        }
        dqqf.dz(length, jArrC, new ejxr() { // from class: brdf
            @Override // defpackage.ejxr
            public final Object get() {
                return "sms_message_size:".concat(String.valueOf(this.a.getString(16)));
            }
        });
        if (!dj(17)) {
            jArr2 = jArrC;
            strArrBv = null;
        } else if (z2) {
            jArr2 = jArrC;
            strArrBv = bv();
        } else {
            jArr2 = jArrC;
            strArrBv = new String[1];
            strArrBv[i] = H();
        }
        dqqf.dA(length, strArrBv, new ejxr() { // from class: brdg
            @Override // defpackage.ejxr
            public final Object get() {
                return "mms_subject:".concat(String.valueOf(this.a.getString(17)));
            }
        });
        if (!dj(18)) {
            strArr = strArrBv;
            strArrBw = null;
        } else if (z2) {
            strArr = strArrBv;
            strArrBw = bw();
        } else {
            strArr = strArrBv;
            strArrBw = new String[1];
            strArrBw[i] = I();
        }
        dqqf.dA(length, strArrBw, new ejxr() { // from class: brdh
            @Override // defpackage.ejxr
            public final Object get() {
                return "mms_transaction_id:".concat(String.valueOf(this.a.getString(18)));
            }
        });
        if (!dj(19)) {
            strArr2 = strArrBw;
            strArrBt = null;
        } else if (z2) {
            strArr2 = strArrBw;
            strArrBt = bt();
        } else {
            strArr2 = strArrBw;
            strArrBt = new String[1];
            strArrBt[i] = F();
        }
        dqqf.dA(length, strArrBt, new ejxr() { // from class: brar
            @Override // defpackage.ejxr
            public final Object get() {
                return "mms_content_location:".concat(String.valueOf(this.a.getString(19)));
            }
        });
        if (!dj(20)) {
            strArr3 = strArrBt;
            jArrAL = null;
        } else if (z2) {
            strArr3 = strArrBt;
            jArrAL = aL();
        } else {
            strArr3 = strArrBt;
            jArrAL = new long[1];
            jArrAL[i] = j();
        }
        dqqf.dz(length, jArrAL, new ejxr() { // from class: brat
            @Override // defpackage.ejxr
            public final Object get() {
                return "mms_expiry:".concat(String.valueOf(this.a.getString(20)));
            }
        });
        if (!dj(21)) {
            jArr3 = jArrAL;
            jArrAM = null;
        } else if (z2) {
            jArr3 = jArrAL;
            jArrAM = aM();
        } else {
            jArr3 = jArrAL;
            jArrAM = new long[1];
            jArrAM[i] = S();
        }
        dqqf.dz(length, jArrAM, new ejxr() { // from class: brau
            @Override // defpackage.ejxr
            public final Object get() {
                return "rcs_expiry:".concat(String.valueOf(this.a.getString(21)));
            }
        });
        if (!dj(22)) {
            jArr4 = jArrAM;
            strArrBu = null;
        } else if (z2) {
            jArr4 = jArrAM;
            strArrBu = bu();
        } else {
            jArr4 = jArrAM;
            strArrBu = new String[1];
            strArrBu[i] = G();
        }
        dqqf.dA(length, strArrBu, new ejxr() { // from class: brav
            @Override // defpackage.ejxr
            public final Object get() {
                return "mms_retrieve_text:".concat(String.valueOf(this.a.getString(22)));
            }
        });
        if (!dj(23)) {
            strArr4 = strArrBu;
            iArrAG = null;
        } else if (z2) {
            strArr4 = strArrBu;
            iArrAG = aG();
        } else {
            strArr4 = strArrBu;
            iArrAG = new int[1];
            iArrAG[i] = e();
        }
        dqqf.dy(length, iArrAG, new ejxr() { // from class: braw
            @Override // defpackage.ejxr
            public final Object get() {
                return "raw_status:".concat(String.valueOf(this.a.getString(23)));
            }
        });
        if (!dj(24)) {
            iArr4 = iArrAG;
            strArrBA = null;
        } else if (z2) {
            iArr4 = iArrAG;
            strArrBA = bA();
        } else {
            iArr4 = iArrAG;
            strArrBA = new String[1];
            strArrBA[i] = as();
        }
        dqqf.dA(length, strArrBA, new ejxr() { // from class: brax
            @Override // defpackage.ejxr
            public final Object get() {
                return "self_id:".concat(String.valueOf(this.a.getString(24)));
            }
        });
        if (!dj(25)) {
            strArr5 = strArrBA;
            axcmVarArrAU = null;
        } else if (z2) {
            strArr5 = strArrBA;
            axcmVarArrAU = aU();
        } else {
            strArr5 = strArrBA;
            axcmVarArrAU = new axcm[1];
            axcmVarArrAU[i] = Y();
        }
        dqqf.dA(length, axcmVarArrAU, new ejxr() { // from class: bray
            @Override // defpackage.ejxr
            public final Object get() {
                return "my_identity_foreign_key:".concat(String.valueOf(this.a.getString(25)));
            }
        });
        if (!dj(26)) {
            axcmVarArr = axcmVarArrAU;
            jArrAQ = null;
        } else if (z2) {
            axcmVarArr = axcmVarArrAU;
            jArrAQ = aQ();
        } else {
            axcmVarArr = axcmVarArrAU;
            jArrAQ = new long[1];
            jArrAQ[i] = U();
        }
        dqqf.dz(length, jArrAQ, new ejxr() { // from class: braz
            @Override // defpackage.ejxr
            public final Object get() {
                return "retry_start_timestamp:".concat(String.valueOf(this.a.getString(26)));
            }
        });
        if (!dj(27)) {
            jArr5 = jArrAQ;
            strArrBn = null;
        } else if (z2) {
            jArr5 = jArrAQ;
            strArrBn = bn();
        } else {
            jArr5 = jArrAQ;
            strArrBn = new String[1];
            strArrBn[i] = D();
        }
        dqqf.dA(length, strArrBn, new ejxr() { // from class: brba
            @Override // defpackage.ejxr
            public final Object get() {
                return "cloud_sync_id:".concat(String.valueOf(this.a.getString(27)));
            }
        });
        if (!dj(28)) {
            strArr6 = strArrBn;
            basdVarArrBb = null;
        } else if (z2) {
            strArr6 = strArrBn;
            basdVarArrBb = bb();
        } else {
            strArr6 = strArrBn;
            basdVarArrBb = new basd[1];
            basdVarArrBb[i] = r();
        }
        dqqf.dA(length, basdVarArrBb, new ejxr() { // from class: brbc
            @Override // defpackage.ejxr
            public final Object get() {
                return "rcs_message_id_with_text_type:".concat(String.valueOf(this.a.getString(28)));
            }
        });
        if (!dj(29)) {
            basdVarArr = basdVarArrBb;
            iArrAH = null;
        } else if (z2) {
            basdVarArr = basdVarArrBb;
            iArrAH = aH();
        } else {
            basdVarArr = basdVarArrBb;
            iArrAH = new int[1];
            iArrAH[i] = P();
        }
        dqqf.dy(length, iArrAH, new ejxr() { // from class: brbd
            @Override // defpackage.ejxr
            public final Object get() {
                return "etouffee_status:".concat(String.valueOf(this.a.getString(29)));
            }
        });
        if (!dj(30)) {
            iArr5 = iArrAH;
            jArr6 = jArrAO;
            z = z2;
            messageIdTypeArr = messageIdTypeArrAX;
            bvdzVarArr = null;
        } else if (z2) {
            iArr5 = iArrAH;
            int[] iArrDs = ds(getString(cO(30, MessagesTable.a)));
            bvdz[] bvdzVarArrValues = bvdz.values();
            jArr6 = jArrAO;
            int length2 = bvdzVarArrValues.length;
            bvdz[] bvdzVarArr3 = new bvdz[iArrDs.length];
            z = z2;
            messageIdTypeArr = messageIdTypeArrAX;
            for (int i6 = i; i6 < iArrDs.length; i6++) {
                int i7 = iArrDs[i6];
                if (i7 >= length2) {
                    throw new IllegalStateException();
                }
                bvdzVarArr3[i6] = bvdzVarArrValues[i7];
            }
            bvdzVarArr = (bvdz[]) dqru.D(null, bvdzVarArr3, new bvdz[i]);
        } else {
            iArr5 = iArrAH;
            jArr6 = jArrAO;
            z = z2;
            messageIdTypeArr = messageIdTypeArrAX;
            bvdz[] bvdzVarArr4 = new bvdz[1];
            bvdzVarArr4[i] = ag();
            bvdzVarArr = bvdzVarArr4;
        }
        dqqf.dA(length, bvdzVarArr, new ejxr() { // from class: brbf
            @Override // defpackage.ejxr
            public final Object get() {
                return "verification_status:".concat(String.valueOf(this.a.getString(30)));
            }
        });
        int[] iArrAI = dj(31) ? z ? aI() : new int[]{Q()} : null;
        dqqf.dy(length, iArrAI, new ejxr() { // from class: brbg
            @Override // defpackage.ejxr
            public final Object get() {
                return "rcs_ui_status:".concat(String.valueOf(this.a.getString(31)));
            }
        });
        boolean[] zArrBG = dj(32) ? z ? bG() : new boolean[]{L()} : null;
        dqqf.dB(length, zArrBG, new ejxr() { // from class: brbh
            @Override // defpackage.ejxr
            public final Object get() {
                return "is_hidden:".concat(String.valueOf(this.a.getString(32)));
            }
        });
        String[] strArrBy = dj(33) ? z ? by() : new String[]{aq()} : null;
        dqqf.dA(length, strArrBy, new ejxr() { // from class: brbi
            @Override // defpackage.ejxr
            public final Object get() {
                return "rcs_remote_instance:".concat(String.valueOf(this.a.getString(33)));
            }
        });
        if (!dj(34)) {
            iArr6 = iArrAI;
            jArrAN = null;
        } else if (z) {
            iArr6 = iArrAI;
            jArrAN = aN();
        } else {
            iArr6 = iArrAI;
            jArrAN = new long[]{k()};
        }
        dqqf.dz(length, jArrAN, new ejxr() { // from class: brbj
            @Override // defpackage.ejxr
            public final Object get() {
                return "rcs_file_transfer_session_id:".concat(String.valueOf(this.a.getString(34)));
            }
        });
        if (!dj(35)) {
            jArr7 = jArrAN;
            iArrA3 = null;
        } else if (z) {
            jArr7 = jArrAN;
            iArrA3 = dqru.A(null, ds(getString(cO(35, MessagesTable.a))));
        } else {
            jArr7 = jArrAN;
            iArrA3 = new int[]{g()};
        }
        dqqf.dy(length, iArrA3, new ejxr() { // from class: brbk
            @Override // defpackage.ejxr
            public final Object get() {
                return "sms_error_code:".concat(String.valueOf(this.a.getString(35)));
            }
        });
        if (!dj(36)) {
            iArr7 = iArrA3;
            bvdzVarArr2 = bvdzVarArr;
            strArr7 = null;
        } else if (z) {
            iArr7 = iArrA3;
            bvdzVarArr2 = bvdzVarArr;
            strArr7 = (String[]) dqru.D(null, du(getString(cO(36, MessagesTable.a))), new String[0]);
        } else {
            iArr7 = iArrA3;
            bvdzVarArr2 = bvdzVarArr;
            strArr7 = new String[]{av()};
        }
        dqqf.dA(length, strArr7, new ejxr() { // from class: brbl
            @Override // defpackage.ejxr
            public final Object get() {
                return "sms_error_desc_map_name:".concat(String.valueOf(this.a.getString(36)));
            }
        });
        String[] strArrBq = dj(37) ? z ? bq() : new String[]{an()} : null;
        dqqf.dA(length, strArrBq, new ejxr() { // from class: brbn
            @Override // defpackage.ejxr
            public final Object get() {
                return "correlation_id:".concat(String.valueOf(this.a.getString(37)));
            }
        });
        if (!dj(38)) {
            strArr8 = strArrBq;
            strArrBp = null;
        } else if (z) {
            strArr8 = strArrBq;
            strArrBp = bp();
        } else {
            strArr8 = strArrBq;
            strArrBp = new String[]{E()};
        }
        dqqf.dA(length, strArrBp, new ejxr() { // from class: brbo
            @Override // defpackage.ejxr
            public final Object get() {
                return "cms_id:".concat(String.valueOf(this.a.getString(38)));
            }
        });
        if (!dj(39)) {
            strArr9 = strArrBp;
            jArrAK = null;
        } else if (z) {
            strArr9 = strArrBp;
            jArrAK = aK();
        } else {
            strArr9 = strArrBp;
            jArrAK = new long[]{R()};
        }
        dqqf.dz(length, jArrAK, new ejxr() { // from class: brbp
            @Override // defpackage.ejxr
            public final Object get() {
                return "cms_last_mod_seq:".concat(String.valueOf(this.a.getString(39)));
            }
        });
        if (!dj(40)) {
            jArr8 = jArrAK;
            strArr10 = strArr7;
            strArr11 = null;
        } else if (z) {
            jArr8 = jArrAK;
            strArr10 = strArr7;
            strArr11 = (String[]) dqru.D(null, du(getString(cO(40, MessagesTable.a))), new String[0]);
        } else {
            jArr8 = jArrAK;
            strArr10 = strArr7;
            strArr11 = new String[]{K()};
        }
        dqqf.dA(length, strArr11, new ejxr() { // from class: brbr
            @Override // defpackage.ejxr
            public final Object get() {
                return "web_id:".concat(String.valueOf(this.a.getString(40)));
            }
        });
        long[] jArrC3 = dj(41) ? z ? dqru.C(null, dt(getString(cO(41, MessagesTable.a)))) : new long[]{X()} : null;
        dqqf.dz(length, jArrC3, new ejxr() { // from class: brbs
            @Override // defpackage.ejxr
            public final Object get() {
                return "usage_stats_logging_id:".concat(String.valueOf(this.a.getString(41)));
            }
        });
        if (!dj(42)) {
            jArr9 = jArrC3;
            jArrAR = null;
        } else if (z) {
            jArr9 = jArrC3;
            jArrAR = aR();
        } else {
            jArr9 = jArrC3;
            jArrAR = new long[]{V()};
        }
        dqqf.dz(length, jArrAR, new ejxr() { // from class: brbt
            @Override // defpackage.ejxr
            public final Object get() {
                return "send_counter:".concat(String.valueOf(this.a.getString(42)));
            }
        });
        if (!dj(43)) {
            jArr10 = jArrAR;
            basdVarArrBa = null;
        } else if (z) {
            jArr10 = jArrAR;
            basdVarArrBa = ba();
        } else {
            jArr10 = jArrAR;
            basdVarArrBa = new basd[]{ac()};
        }
        dqqf.dA(length, basdVarArrBa, new ejxr() { // from class: brbu
            @Override // defpackage.ejxr
            public final Object get() {
                return "original_rcs_message_id:".concat(String.valueOf(this.a.getString(43)));
            }
        });
        if (!dj(44)) {
            basdVarArr2 = basdVarArrBa;
            cjnmVarArrBh = null;
        } else if (z) {
            basdVarArr2 = basdVarArrBa;
            cjnmVarArrBh = bh();
        } else {
            basdVarArr2 = basdVarArrBa;
            cjnmVarArrBh = new cjnm[]{ai()};
        }
        dqqf.dA(length, cjnmVarArrBh, new ejxr() { // from class: brbv
            @Override // defpackage.ejxr
            public final Object get() {
                return "raw_rcs_message_to_send:".concat(String.valueOf(this.a.getString(44)));
            }
        });
        if (!dj(45)) {
            cjnmVarArr = cjnmVarArrBh;
            strArrBr = null;
        } else if (z) {
            cjnmVarArr = cjnmVarArrBh;
            strArrBr = br();
        } else {
            cjnmVarArr = cjnmVarArrBh;
            strArrBr = new String[]{ao()};
        }
        dqqf.dA(length, strArrBr, new ejxr() { // from class: brbw
            @Override // defpackage.ejxr
            public final Object get() {
                return "custom_delivery_receipt_mime_type:".concat(String.valueOf(this.a.getString(45)));
            }
        });
        if (!dj(46)) {
            strArr12 = strArrBr;
            bArrBJ = null;
        } else if (z) {
            strArr12 = strArrBr;
            bArrBJ = bJ();
        } else {
            strArr12 = strArrBr;
            bArrBJ = new byte[][]{aB()};
        }
        dqqf.dA(length, bArrBJ, new ejxr() { // from class: brby
            @Override // defpackage.ejxr
            public final Object get() {
                return "custom_delivery_receipt_content:".concat(String.valueOf(this.a.getString(46)));
            }
        });
        if (!dj(47)) {
            bArr = bArrBJ;
            jArrAP = null;
        } else if (z) {
            bArr = bArrBJ;
            jArrAP = aP();
        } else {
            bArr = bArrBJ;
            jArrAP = new long[]{T()};
        }
        dqqf.dz(length, jArrAP, new ejxr() { // from class: brbz
            @Override // defpackage.ejxr
            public final Object get() {
                return "report_attempt_acounter:".concat(String.valueOf(this.a.getString(47)));
            }
        });
        if (!dj(48)) {
            jArr11 = jArrAP;
            eygaVarArrBj = null;
        } else if (z) {
            jArr11 = jArrAP;
            eygaVarArrBj = bj();
        } else {
            jArr11 = jArrAP;
            eygaVarArrBj = new eyga[]{aj()};
        }
        dqqf.dA(length, eygaVarArrBj, new ejxr() { // from class: brca
            @Override // defpackage.ejxr
            public final Object get() {
                return "custom_headers:".concat(String.valueOf(this.a.getString(48)));
            }
        });
        if (!dj(49)) {
            eygaVarArr = eygaVarArrBj;
            strArrBo = null;
        } else if (z) {
            eygaVarArr = eygaVarArrBj;
            strArrBo = bo();
        } else {
            eygaVarArr = eygaVarArrBj;
            strArrBo = new String[]{am()};
        }
        dqqf.dA(length, strArrBo, new ejxr() { // from class: brcb
            @Override // defpackage.ejxr
            public final Object get() {
                return "cms_correlation_id:".concat(String.valueOf(this.a.getString(49)));
            }
        });
        if (!dj(50)) {
            strArr13 = strArrBo;
            strArrBs = null;
        } else if (z) {
            strArr13 = strArrBo;
            strArrBs = bs();
        } else {
            strArr13 = strArrBo;
            strArrBs = new String[]{ap()};
        }
        dqqf.dA(length, strArrBs, new ejxr() { // from class: brcd
            @Override // defpackage.ejxr
            public final Object get() {
                return "group_private_participant:".concat(String.valueOf(this.a.getString(50)));
            }
        });
        if (!dj(51)) {
            strArr14 = strArrBs;
            messageIdTypeArrAY = null;
        } else if (z) {
            strArr14 = strArrBs;
            messageIdTypeArrAY = aY();
        } else {
            strArr14 = strArrBs;
            messageIdTypeArrAY = new MessageIdType[]{aa()};
        }
        dqqf.dA(length, messageIdTypeArrAY, new ejxr() { // from class: brce
            @Override // defpackage.ejxr
            public final Object get() {
                return "original_message_id:".concat(String.valueOf(this.a.getString(51)));
            }
        });
        if (!dj(52)) {
            messageIdTypeArr2 = messageIdTypeArrAY;
            messageIdTypeArrAZ = null;
        } else if (z) {
            messageIdTypeArr2 = messageIdTypeArrAY;
            messageIdTypeArrAZ = aZ();
        } else {
            messageIdTypeArr2 = messageIdTypeArrAY;
            messageIdTypeArrAZ = new MessageIdType[]{ab()};
        }
        dqqf.dA(length, messageIdTypeArrAZ, new ejxr() { // from class: brcf
            @Override // defpackage.ejxr
            public final Object get() {
                return "parent_message_id:".concat(String.valueOf(this.a.getString(52)));
            }
        });
        if (!dj(53)) {
            messageIdTypeArr3 = messageIdTypeArrAZ;
            zArrBE = null;
        } else if (z) {
            messageIdTypeArr3 = messageIdTypeArrAZ;
            zArrBE = bE();
        } else {
            messageIdTypeArr3 = messageIdTypeArrAZ;
            zArrBE = new boolean[]{ax()};
        }
        dqqf.dB(length, zArrBE, new ejxr() { // from class: brcg
            @Override // defpackage.ejxr
            public final Object get() {
                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(53)));
            }
        });
        if (!dj(54)) {
            zArr3 = zArrBE;
            uriArrAS = null;
        } else if (z) {
            zArr3 = zArrBE;
            uriArrAS = aS();
        } else {
            zArr3 = zArrBE;
            uriArrAS = new Uri[]{n()};
        }
        dqqf.dA(length, uriArrAS, new ejxr() { // from class: brch
            @Override // defpackage.ejxr
            public final Object get() {
                return "old_sms_message_uri:".concat(String.valueOf(this.a.getString(54)));
            }
        });
        if (!dj(55)) {
            uriArr2 = uriArrAS;
            optionalArrBl = null;
        } else if (z) {
            uriArr2 = uriArrAS;
            optionalArrBl = bl();
        } else {
            uriArr2 = uriArrAS;
            optionalArrBl = new Optional[]{al()};
        }
        dqqf.dA(length, optionalArrBl, new ejxr() { // from class: brcj
            @Override // defpackage.ejxr
            public final Object get() {
                return "draft_id:".concat(String.valueOf(this.a.getString(55)));
            }
        });
        if (!dj(56)) {
            optionalArr = optionalArrBl;
            iArrAJ = null;
        } else if (z) {
            optionalArr = optionalArrBl;
            iArrAJ = aJ();
        } else {
            optionalArr = optionalArrBl;
            iArrAJ = new int[]{f()};
        }
        dqqf.dy(length, iArrAJ, new ejxr() { // from class: brck
            @Override // defpackage.ejxr
            public final Object get() {
                return "result_code:".concat(String.valueOf(this.a.getString(56)));
            }
        });
        if (!dj(57)) {
            iArr8 = iArrAJ;
            cpyiVarArrBi = null;
        } else if (z) {
            iArr8 = iArrAJ;
            cpyiVarArrBi = bi();
        } else {
            iArr8 = iArrAJ;
            cpyiVarArrBi = new cpyi[]{u()};
        }
        dqqf.dA(length, cpyiVarArrBi, new ejxr() { // from class: brcl
            @Override // defpackage.ejxr
            public final Object get() {
                return "cms_life_cycle:".concat(String.valueOf(this.a.getString(57)));
            }
        });
        if (!dj(58)) {
            cpyiVarArr = cpyiVarArrBi;
            cgrdVarArrBg = null;
        } else if (z) {
            cpyiVarArr = cpyiVarArrBi;
            cgrdVarArrBg = bg();
        } else {
            cpyiVarArr = cpyiVarArrBi;
            cgrdVarArrBg = new cgrd[]{ah()};
        }
        dqqf.dA(length, cgrdVarArrBg, new ejxr() { // from class: brcm
            @Override // defpackage.ejxr
            public final Object get() {
                return "mute_priority:".concat(String.valueOf(this.a.getString(58)));
            }
        });
        if (!dj(59)) {
            cgrdVarArr = cgrdVarArrBg;
            bvdnVarArrBc = null;
        } else if (z) {
            cgrdVarArr = cgrdVarArrBg;
            bvdnVarArrBc = bc();
        } else {
            cgrdVarArr = cgrdVarArrBg;
            bvdnVarArrBc = new bvdn[]{ad()};
        }
        dqqf.dA(length, bvdnVarArrBc, new ejxr() { // from class: brcn
            @Override // defpackage.ejxr
            public final Object get() {
                return "fallback_reason:".concat(String.valueOf(this.a.getString(59)));
            }
        });
        if (!dj(60)) {
            bvdnVarArr = bvdnVarArrBc;
            iArrAC = null;
        } else if (z) {
            bvdnVarArr = bvdnVarArrBc;
            iArrAC = aC();
        } else {
            bvdnVarArr = bvdnVarArrBc;
            iArrAC = new int[]{M()};
        }
        dqqf.dy(length, iArrAC, new ejxr() { // from class: brcp
            @Override // defpackage.ejxr
            public final Object get() {
                return "auto_retry_counter:".concat(String.valueOf(this.a.getString(60)));
            }
        });
        if (!dj(61)) {
            iArr9 = iArrAC;
            zArrBF = null;
        } else if (z) {
            iArr9 = iArrAC;
            zArrBF = bF();
        } else {
            iArr9 = iArrAC;
            zArrBF = new boolean[]{ay()};
        }
        dqqf.dB(length, zArrBF, new ejxr() { // from class: brcq
            @Override // defpackage.ejxr
            public final Object get() {
                return "can_revoke_before_delivered_with_rcs:".concat(String.valueOf(this.a.getString(61)));
            }
        });
        if (!dj(62)) {
            zArr4 = zArrBF;
            fhazVarArrBD = null;
        } else if (z) {
            zArr4 = zArrBF;
            fhazVarArrBD = bD();
        } else {
            zArr4 = zArrBF;
            fhazVarArrBD = new fhaz[]{aw()};
        }
        dqqf.dA(length, fhazVarArrBD, new ejxr() { // from class: brcr
            @Override // defpackage.ejxr
            public final Object get() {
                return "trace_id:".concat(String.valueOf(this.a.getString(62)));
            }
        });
        if (!dj(63)) {
            fhazVarArr = fhazVarArrBD;
            bvdxVarArrBd = null;
        } else if (z) {
            fhazVarArr = fhazVarArrBD;
            bvdxVarArrBd = bd();
        } else {
            fhazVarArr = fhazVarArrBD;
            bvdxVarArrBd = new bvdx[]{ae()};
        }
        dqqf.dA(length, bvdxVarArrBd, new ejxr() { // from class: brcs
            @Override // defpackage.ejxr
            public final Object get() {
                return "outgoing_delivery_report_status:".concat(String.valueOf(this.a.getString(63)));
            }
        });
        if (!dj(64)) {
            bvdxVarArr = bvdxVarArrBd;
            bvdxVarArrBe = null;
        } else if (z) {
            bvdxVarArr = bvdxVarArrBd;
            bvdxVarArrBe = be();
        } else {
            bvdxVarArr = bvdxVarArrBd;
            bvdxVarArrBe = new bvdx[]{af()};
        }
        dqqf.dA(length, bvdxVarArrBe, new ejxr() { // from class: brcu
            @Override // defpackage.ejxr
            public final Object get() {
                return "outgoing_read_report_status:".concat(String.valueOf(this.a.getString(64)));
            }
        });
        if (!dj(65)) {
            bvdxVarArr2 = bvdxVarArrBe;
            strArr15 = strArr11;
            zArr5 = zArrBG;
            strArr16 = strArrBy;
            baroVarArr = null;
            bvecVarArr = null;
        } else if (z) {
            bvdxVarArr2 = bvdxVarArrBe;
            int[] iArrDs2 = ds(getString(cO(65, MessagesTable.a)));
            bvec[] bvecVarArrValues = bvec.values();
            strArr15 = strArr11;
            int length3 = bvecVarArrValues.length;
            zArr5 = zArrBG;
            bvec[] bvecVarArr3 = new bvec[iArrDs2.length];
            strArr16 = strArrBy;
            for (int i8 = 0; i8 < iArrDs2.length; i8++) {
                int i9 = iArrDs2[i8];
                if (i9 >= length3) {
                    throw new IllegalStateException();
                }
                bvecVarArr3[i8] = bvecVarArrValues[i9];
            }
            baroVarArr = null;
            bvecVarArr = (bvec[]) dqru.D(null, bvecVarArr3, new bvec[0]);
        } else {
            bvdxVarArr2 = bvdxVarArrBe;
            strArr15 = strArr11;
            zArr5 = zArrBG;
            strArr16 = strArrBy;
            baroVarArr = null;
            bvecVarArr = new bvec[]{s()};
        }
        dqqf.dA(length, bvecVarArr, new ejxr() { // from class: brcv
            @Override // defpackage.ejxr
            public final Object get() {
                return "xms_transport:".concat(String.valueOf(this.a.getString(65)));
            }
        });
        int[] iArrAE = dj(66) ? z ? aE() : new int[]{O()} : baroVarArr;
        dqqf.dy(length, iArrAE, new ejxr() { // from class: brcw
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_original_protocol:".concat(String.valueOf(this.a.getString(66)));
            }
        });
        baro[] baroVarArrAW = dj(67) ? z ? aW() : new baro[]{Z()} : baroVarArr;
        dqqf.dA(length, baroVarArrAW, new ejxr() { // from class: brcx
            @Override // defpackage.ejxr
            public final Object get() {
                return "satellite_datagram_id:".concat(String.valueOf(this.a.getString(67)));
            }
        });
        cbqz[] cbqzVarArrBf = dj(68) ? z ? bf() : new cbqz[]{t()} : null;
        dqqf.dA(length, cbqzVarArrBf, new ejxr() { // from class: brcy
            @Override // defpackage.ejxr
            public final Object get() {
                return "encryption_protocol:".concat(String.valueOf(this.a.getString(68)));
            }
        });
        if (!dj(69)) {
            i2 = 0;
            bvecVarArr2 = bvecVarArr;
            optionalArrBm = null;
        } else if (z) {
            optionalArrBm = bm();
            bvecVarArr2 = bvecVarArr;
            i2 = 0;
        } else {
            i2 = 0;
            optionalArrBm = new Optional[]{C()};
            bvecVarArr2 = bvecVarArr;
        }
        dqqf.dA(length, optionalArrBm, new ejxr() { // from class: brcz
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_persistence_id:".concat(String.valueOf(this.a.getString(69)));
            }
        });
        ekfw ekfwVar = new ekfw();
        int i10 = i2;
        while (i10 < length) {
            long j = jArr[i10];
            if (j > 0) {
                i3 = i10;
                if (!hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(jArr[i3]));
                    bquu bquuVarC = MessagesTable.c();
                    bquuVarC.aD();
                    long j2 = jArr[i3];
                    cbqzVarArr = cbqzVarArrBf;
                    if (messageIdTypeArr != null) {
                        bquuVarC.v(messageIdTypeArr[i3]);
                    }
                    if (conversationIdTypeArrAV != null) {
                        bquuVarC.m(conversationIdTypeArrAV[i3]);
                    }
                    if (strArrBB != null) {
                        bquuVarC.ai(strArrBB[i3]);
                    }
                    if (strArrBC != null) {
                        bquuVarC.aj(strArrBC[i3]);
                    }
                    if (strArrBx != null) {
                        bquuVarC.E(strArrBx[i3]);
                    }
                    if (strArrBz != null) {
                        bquuVarC.ab(strArrBz[i3]);
                    }
                    i4 = length;
                    if (jArrC2 != null) {
                        bquuVarC.ak(jArrC2[i3]);
                    }
                    if (instantArrBk != null) {
                        bquuVarC.Q(instantArrBk[i3]);
                    }
                    if (jArr6 != null) {
                        bquuVarC.aa(jArr6[i3]);
                    }
                    if (iArrAF != null) {
                        bquuVarC.P(iArrAF[i3]);
                    }
                    if (iArr != null) {
                        bquuVarC.aq(iArr[i3]);
                    }
                    if (iArr2 != null) {
                        bquuVarC.y(iArr2[i3]);
                    }
                    if (zArr != null) {
                        bquuVarC.H(zArr[i3]);
                    }
                    if (zArr2 != null) {
                        bquuVarC.Z(zArr2[i3]);
                    }
                    if (uriArr != null) {
                        bquuVarC.ao(uriArr[i3]);
                    }
                    if (iArr3 != null) {
                        bquuVarC.ap(iArr3[i3]);
                    }
                    if (jArr2 != null) {
                        bquuVarC.an(jArr2[i3]);
                    }
                    if (strArr != null) {
                        bquuVarC.C(strArr[i3]);
                    }
                    if (strArr2 != null) {
                        bquuVarC.D(strArr2[i3]);
                    }
                    if (strArr3 != null) {
                        bquuVarC.z(strArr3[i3]);
                    }
                    if (jArr3 != null) {
                        bquuVarC.A(jArr3[i3]);
                    }
                    if (jArr4 != null) {
                        bquuVarC.U(jArr4[i3]);
                    }
                    if (strArr4 != null) {
                        bquuVarC.B(strArr4[i3]);
                    }
                    if (iArr4 != null) {
                        bquuVarC.S(iArr4[i3]);
                    }
                    if (strArr5 != null) {
                        bquuVarC.ag(strArr5[i3]);
                    }
                    if (axcmVarArr != null) {
                        bquuVarC.G(axcmVarArr[i3]);
                    }
                    if (jArr5 != null) {
                        bquuVarC.ae(jArr5[i3]);
                    }
                    if (strArr6 != null) {
                        bquuVarC.h(strArr6[i3]);
                    }
                    if (basdVarArr != null) {
                        bquuVarC.W(basdVarArr[i3]);
                    }
                    if (iArr5 != null) {
                        bquuVarC.T(iArr5[i3]);
                    }
                    if (bvdzVarArr2 != null) {
                        bquuVarC.at(bvdzVarArr2[i3]);
                    }
                    if (iArr6 != null) {
                        bquuVarC.Y(iArr6[i3]);
                    }
                    if (zArr5 != null) {
                        bquuVarC.w(zArr5[i3]);
                    }
                    if (strArr16 != null) {
                        bquuVarC.X(strArr16[i3]);
                    }
                    if (jArr7 != null) {
                        bquuVarC.V(jArr7[i3]);
                    }
                    if (iArr7 != null) {
                        bquuVarC.al(iArr7[i3]);
                    }
                    if (strArr10 != null) {
                        bquuVarC.am(strArr10[i3]);
                    }
                    if (strArr8 != null) {
                        bquuVarC.n(strArr8[i3]);
                    }
                    if (strArr9 != null) {
                        bquuVarC.j(strArr9[i3]);
                    }
                    if (jArr8 != null) {
                        bquuVarC.k(jArr8[i3]);
                    }
                    if (strArr15 != null) {
                        bquuVarC.au(strArr15[i3]);
                    }
                    if (jArr9 != null) {
                        bquuVarC.as(jArr9[i3]);
                    }
                    if (jArr10 != null) {
                        bquuVarC.ah(jArr10[i3]);
                    }
                    if (basdVarArr2 != null) {
                        bquuVarC.L(basdVarArr2[i3]);
                    }
                    if (cjnmVarArr != null) {
                        bquuVarC.R(cjnmVarArr[i3]);
                    }
                    if (strArr12 != null) {
                        bquuVarC.p(strArr12[i3]);
                    }
                    if (bArr != null) {
                        bquuVarC.o(bArr[i3]);
                    }
                    if (jArr11 != null) {
                        bquuVarC.ac(jArr11[i3]);
                    }
                    if (eygaVarArr != null) {
                        bquuVarC.q(eygaVarArr[i3]);
                    }
                    if (strArr13 != null) {
                        bquuVarC.i(strArr13[i3]);
                    }
                    if (strArr14 != null) {
                        bquuVarC.u(strArr14[i3]);
                    }
                    if (messageIdTypeArr2 != null) {
                        bquuVarC.J(messageIdTypeArr2[i3]);
                    }
                    if (messageIdTypeArr3 != null) {
                        bquuVarC.O(messageIdTypeArr3[i3]);
                    }
                    if (zArr3 != null) {
                        bquuVarC.f(zArr3[i3]);
                    }
                    if (uriArr2 != null) {
                        bquuVarC.I(uriArr2[i3]);
                    }
                    if (optionalArr != null) {
                        bquuVarC.r(optionalArr[i3]);
                    }
                    if (iArr8 != null) {
                        bquuVarC.ad(iArr8[i3]);
                    }
                    if (cpyiVarArr != null) {
                        bquuVarC.l(cpyiVarArr[i3]);
                    }
                    if (cgrdVarArr != null) {
                        bquuVarC.F(cgrdVarArr[i3]);
                    }
                    if (bvdnVarArr != null) {
                        bquuVarC.t(bvdnVarArr[i3]);
                    }
                    if (iArr9 != null) {
                        bquuVarC.e(iArr9[i3]);
                    }
                    if (zArr4 != null) {
                        bquuVarC.g(zArr4[i3]);
                    }
                    if (fhazVarArr != null) {
                        bquuVarC.ar(fhazVarArr[i3]);
                    }
                    if (bvdxVarArr != null) {
                        bquuVarC.M(bvdxVarArr[i3]);
                    }
                    if (bvdxVarArr2 != null) {
                        bquuVarC.N(bvdxVarArr2[i3]);
                    }
                    if (bvecVarArr2 != null) {
                        bquuVarC.av(bvecVarArr2[i3]);
                    }
                    if (iArrAE != null) {
                        bquuVarC.K(iArrAE[i3]);
                    }
                    if (baroVarArrAW != null) {
                        bquuVarC.af(baroVarArrAW[i3]);
                    }
                    if (cbqzVarArr != null) {
                        bquuVarC.s(cbqzVarArr[i3]);
                    }
                    if (optionalArrBm != null) {
                        bquuVarC.x(optionalArrBm[i3]);
                    }
                    ekfwVar.h(bquuVarC.a());
                }
                i10 = i3 + 1;
                cbqzVarArrBf = cbqzVarArr;
                length = i4;
            } else {
                i3 = i10;
            }
            cbqzVarArr = cbqzVarArrBf;
            i4 = length;
            i10 = i3 + 1;
            cbqzVarArrBf = cbqzVarArr;
            length = i4;
        }
        return ekfwVar.g();
    }

    @Override // defpackage.brap
    public final int g() {
        return getInt(cO(35, MessagesTable.a));
    }

    @Override // defpackage.brap
    public final int h() {
        return getInt(cO(15, MessagesTable.a));
    }

    @Override // defpackage.brap
    public final int i() {
        return getInt(cO(10, MessagesTable.a));
    }

    @Override // defpackage.brap
    public final long j() {
        return getLong(cO(20, MessagesTable.a));
    }

    @Override // defpackage.brap
    public final long k() {
        return getLong(cO(34, MessagesTable.a));
    }

    @Override // defpackage.brap
    public final long l() {
        return getLong(cO(8, MessagesTable.a));
    }

    @Override // defpackage.brap
    public final long m() {
        return getLong(cO(6, MessagesTable.a));
    }

    @Override // defpackage.brap
    public final Uri n() {
        String string = getString(cO(54, MessagesTable.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    @Override // defpackage.brap
    public final Uri o() {
        String string = getString(cO(14, MessagesTable.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    @Override // defpackage.brap
    public final ConversationIdType p() {
        return new ConversationIdType(getLong(cO(1, MessagesTable.a)));
    }

    @Override // defpackage.brap
    public final MessageIdType q() {
        return new MessageIdType(getLong(cO(0, MessagesTable.a)));
    }

    @Override // defpackage.brap
    public final basd r() {
        return basd.a(getString(cO(28, MessagesTable.a)));
    }

    @Override // defpackage.brap
    public final bvec s() {
        bvec[] bvecVarArrValues = bvec.values();
        int i = getInt(cO(65, MessagesTable.a));
        if (i < bvecVarArrValues.length) {
            return bvecVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.brap
    public final cbqz t() {
        return new cbqz(getLong(cO(68, MessagesTable.a)));
    }

    @Override // defpackage.brap
    public final cpyi u() {
        cpyi[] cpyiVarArrValues = cpyi.values();
        int i = getInt(cO(57, MessagesTable.a));
        if (i < cpyiVarArrValues.length) {
            return cpyiVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.brap
    public final ekgb v() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            p();
            ekfwVar.h(p());
        }
        return ekfwVar.g();
    }

    @Override // defpackage.brap
    public final ekgb w() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            q();
            ekfwVar.h(q());
        }
        return ekfwVar.g();
    }

    @Override // defpackage.brap
    public final ekgb x() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            ac();
            ekfwVar.h(ac());
        }
        return ekfwVar.g();
    }

    @Override // defpackage.brap
    public final ekgb y() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            k();
            ekfwVar.h(Long.valueOf(k()));
        }
        return ekfwVar.g();
    }

    @Override // defpackage.brap
    public final ekgb z() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            l();
            ekfwVar.h(Long.valueOf(l()));
        }
        return ekfwVar.g();
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
