package defpackage;

import android.database.Cursor;
import android.net.Uri;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmal extends dqqf implements cmak {
    @Deprecated
    public cmal(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, cman cmanVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, cmas.a, dqwjVar, dqtmVar, cmanVar);
    }

    public final String A() {
        return getString(cO(51, cmas.a));
    }

    public final String B() {
        return getString(cO(56, cmas.a));
    }

    public final String C() {
        return getString(cO(0, cmas.a));
    }

    public final String D() {
        return getString(cO(121, cmas.a));
    }

    public final boolean E() {
        return getInt(cO(59, cmas.a)) == 1;
    }

    public final boolean F() {
        return getInt(cO(119, cmas.a)) == 1;
    }

    public final boolean G() {
        return getInt(cO(67, cmas.a)) == 1;
    }

    public final boolean H() {
        return getInt(cO(38, cmas.a)) == 1;
    }

    public final byte[] I() {
        return getBlob(cO(106, cmas.a));
    }

    public final byte[] J() {
        return getBlob(cO(105, cmas.a));
    }

    public final byte[] K() {
        return getBlob(cO(52, cmas.a));
    }

    public final int[] L() {
        return dqru.A(null, ds(getString(cO(EnergyProfile.EVCONNECTOR_TYPE_OTHER, cmas.a))));
    }

    public final int[] M() {
        return dqru.A(null, ds(getString(cO(85, cmas.a))));
    }

    public final long[] N() {
        return dqru.C(null, dt(getString(cO(108, cmas.a))));
    }

    public final long[] O() {
        return dqru.C(null, dt(getString(cO(115, cmas.a))));
    }

    public final long[] P() {
        return dqru.C(null, dt(getString(cO(111, cmas.a))));
    }

    public final Uri[] Q() {
        String[] strArrDu = du(getString(cO(99, cmas.a)));
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

    public final bvdl[] R() {
        int[] iArrDs = ds(getString(cO(90, cmas.a)));
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

    public final String[] S() {
        return (String[]) dqru.D(null, du(getString(cO(102, cmas.a))), new String[0]);
    }

    public final String[] T() {
        return (String[]) dqru.D(null, du(getString(cO(112, cmas.a))), new String[0]);
    }

    public final String[] U() {
        return (String[]) dqru.D(null, du(getString(cO(81, cmas.a))), new String[0]);
    }

    public final String[] V() {
        return (String[]) dqru.D(null, du(getString(cO(109, cmas.a))), new String[0]);
    }

    public final String[] W() {
        return (String[]) dqru.D(null, du(getString(cO(110, cmas.a))), new String[0]);
    }

    public final String[] X() {
        return (String[]) dqru.D(null, du(getString(cO(76, cmas.a))), new String[0]);
    }

    public final boolean[] Y() {
        return dqru.E(null, dv(getString(cO(107, cmas.a))));
    }

    public final boolean[] Z() {
        return dqru.E(null, dv(getString(cO(114, cmas.a))));
    }

    public final byte[][] aa() {
        return dqru.F(null, dD(getString(cO(117, cmas.a))));
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new clpr();
    }

    public final double c() {
        return getDouble(cO(96, cmas.a));
    }

    public final int e() {
        return getInt(cO(66, cmas.a));
    }

    public final long f() {
        return getLong(cO(45, cmas.a));
    }

    public final long g() {
        return getLong(cO(120, cmas.a));
    }

    public final ConversationIdType h() {
        return new ConversationIdType(getLong(cO(7, cmas.a)));
    }

    public final ConversationIdType i() {
        return new ConversationIdType(getLong(cO(91, cmas.a)));
    }

    public final ConversationIdType j() {
        return new ConversationIdType(getLong(cO(2, cmas.a)));
    }

    public final MessageIdType k() {
        return new MessageIdType(getLong(cO(6, cmas.a)));
    }

    public final bvdn l() {
        bvdn[] bvdnVarArrValues = bvdn.values();
        int i = getInt(cO(65, cmas.a));
        if (i < bvdnVarArrValues.length) {
            return bvdnVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final bvdq m() {
        bvdq[] bvdqVarArrValues = bvdq.values();
        int i = getInt(cO(127, cmas.a));
        if (i < bvdqVarArrValues.length) {
            return bvdqVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final cbqz n() {
        return new cbqz(getLong(cO(74, cmas.a)));
    }

    public final cpyi o() {
        cpyi[] cpyiVarArrValues = cpyi.values();
        int i = getInt(cO(63, cmas.a));
        if (i < cpyiVarArrValues.length) {
            return cpyiVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final eyga p() {
        byte[] blob = getBlob(cO(54, cmas.a));
        if (blob == null) {
            return null;
        }
        try {
            return (eyga) evsn.parseFrom(eyga.a, blob, evrr.a());
        } catch (Throwable unused) {
            return eyga.a;
        }
    }

    public final Instant q() {
        return bart.b(getLong(cO(5, cmas.a)));
    }

    public final Optional r() {
        return basg.a(getString(cO(61, cmas.a)));
    }

    public final String s() {
        return getString(cO(103, cmas.a));
    }

    public final String t() {
        return getString(cO(130, cmas.a));
    }

    public final String u() {
        return getString(cO(33, cmas.a));
    }

    public final String v() {
        return getString(cO(113, cmas.a));
    }

    public final String w() {
        return getString(cO(55, cmas.a));
    }

    public final String x() {
        return getString(cO(104, cmas.a));
    }

    public final String y() {
        return getString(cO(44, cmas.a));
    }

    public final String z() {
        return getString(cO(43, cmas.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
