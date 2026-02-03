package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcuu extends dqqf implements bcut {
    @Deprecated
    public bcuu(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bcuw bcuwVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bcve.a, dqwjVar, dqtmVar, bcuwVar);
    }

    @Override // defpackage.bcut
    public final String A() {
        return getString(cO(12, bcve.a));
    }

    @Override // defpackage.bcut
    public final String B() {
        return cssq.a(getString(cO(9, bcve.a)));
    }

    @Override // defpackage.bcut
    public final String C() {
        return cssq.a(getString(cO(10, bcve.a)));
    }

    @Override // defpackage.bcut
    public final String D() {
        return cssq.a(getString(cO(65, bcve.a)));
    }

    @Override // defpackage.bcut
    public final String E() {
        return cssq.a(getString(cO(61, bcve.a)));
    }

    @Override // defpackage.bcut
    public final String F() {
        return cssq.a(getString(cO(64, bcve.a)));
    }

    @Override // defpackage.bcut
    public final String G() {
        return cssq.a(getString(cO(60, bcve.a)));
    }

    @Override // defpackage.bcut
    public final String H() {
        return getString(cO(16, bcve.a));
    }

    @Override // defpackage.bcut
    public final String I() {
        return getString(cO(2, bcve.a));
    }

    @Override // defpackage.bcut
    public final String J() {
        return cssq.a(getString(cO(34, bcve.a)));
    }

    @Override // defpackage.bcut
    public final String K() {
        return getString(cO(18, bcve.a));
    }

    @Override // defpackage.bcut
    public final String L() {
        return getString(cO(19, bcve.a));
    }

    @Override // defpackage.bcut
    public final String M() {
        return getString(cO(57, bcve.a));
    }

    @Override // defpackage.bcut
    public final String N() {
        return cssq.a(getString(cO(5, bcve.a)));
    }

    @Override // defpackage.bcut
    public final String O() {
        return cssq.a(getString(cO(67, bcve.a)));
    }

    @Override // defpackage.bcut
    public final String P() {
        return getString(cO(71, bcve.a));
    }

    @Override // defpackage.bcut
    public final boolean Q() {
        return getInt(cO(33, bcve.a)) == 1;
    }

    @Override // defpackage.bcut
    public final boolean R() {
        return getInt(cO(32, bcve.a)) == 1;
    }

    @Override // defpackage.bcut
    public final boolean S() {
        return getInt(cO(44, bcve.a)) == 1;
    }

    @Override // defpackage.bcut
    public final boolean T() {
        return getInt(cO(23, bcve.a)) == 1;
    }

    @Override // defpackage.bcut
    public final boolean U() {
        return getInt(cO(39, bcve.a)) == 1;
    }

    @Override // defpackage.bcut
    public final boolean V() {
        return getInt(cO(52, bcve.a)) == 1;
    }

    @Override // defpackage.bcut
    public final boolean W() {
        return getInt(cO(8, bcve.a)) == 1;
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bbtl();
    }

    @Override // defpackage.bcut
    public final int c() {
        return getInt(cO(30, bcve.a));
    }

    @Override // defpackage.bcut
    public final int d() {
        return getInt(cO(29, bcve.a));
    }

    @Override // defpackage.bcut
    public final int e() {
        return getInt(cO(22, bcve.a));
    }

    @Override // defpackage.bcut
    public final int f() {
        return getInt(cO(50, bcve.a));
    }

    @Override // defpackage.bcut
    public final int g() {
        return getInt(cO(54, bcve.a));
    }

    @Override // defpackage.bcut
    public final int h() {
        return getInt(cO(56, bcve.a));
    }

    @Override // defpackage.bcut
    public final int i() {
        return getInt(cO(53, bcve.a));
    }

    @Override // defpackage.bcut
    public final int j() {
        return getInt(cO(27, bcve.a));
    }

    @Override // defpackage.bcut
    public final int k() {
        return getInt(cO(51, bcve.a));
    }

    @Override // defpackage.bcut
    public final int l() {
        return getInt(cO(58, bcve.a));
    }

    @Override // defpackage.bcut
    public final long m() {
        return getLong(cO(28, bcve.a));
    }

    @Override // defpackage.bcut
    public final long n() {
        return getLong(cO(49, bcve.a));
    }

    @Override // defpackage.bcut
    public final long o() {
        return getLong(cO(48, bcve.a));
    }

    @Override // defpackage.bcut
    public final long p() {
        return getLong(cO(72, bcve.a));
    }

    @Override // defpackage.bcut
    public final Uri q() {
        String string = getString(cO(11, bcve.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    @Override // defpackage.bcut
    public final Uri r() {
        String string = getString(cO(68, bcve.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    @Override // defpackage.bcut
    public final aonp s() {
        return aonp.b(getInt(cO(70, bcve.a)));
    }

    @Override // defpackage.bcut
    public final ConversationIdType t() {
        return new ConversationIdType(getLong(cO(76, bcve.a)));
    }

    @Override // defpackage.bcut
    public final ConversationIdType u() {
        return new ConversationIdType(getLong(cO(0, bcve.a)));
    }

    @Override // defpackage.bcut
    public final MessageIdType v() {
        return new MessageIdType(getLong(cO(47, bcve.a)));
    }

    @Override // defpackage.bcut
    public final bvdk w() {
        return bvdk.a(getInt(cO(14, bcve.a)));
    }

    @Override // defpackage.bcut
    public final ekgb x() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            u();
            ekfwVar.h(u());
        }
        return ekfwVar.g();
    }

    @Override // defpackage.bcut
    public final String y() {
        return getString(cO(69, bcve.a));
    }

    @Override // defpackage.bcut
    public final String z() {
        return cssb.a(getString(cO(59, bcve.a)));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
