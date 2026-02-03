package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akzb extends dqqf implements akza {
    @Deprecated
    public akzb(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, akzd akzdVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, akzi.a, dqwjVar, dqtmVar, akzdVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new akon();
    }

    @Override // defpackage.akza
    public final int c() {
        return getInt(cO(5, akzi.a));
    }

    @Override // defpackage.akza
    public final ConversationIdType d() {
        return new ConversationIdType(getLong(cO(0, akzi.a)));
    }

    @Override // defpackage.akza
    public final bvdp e() {
        bvdp[] bvdpVarArrValues = bvdp.values();
        int i = getInt(cO(2, akzi.a));
        if (i < bvdpVarArrValues.length) {
            return bvdpVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.akza
    public final String f() {
        return getString(cO(1, akzi.a));
    }

    @Override // defpackage.akza
    public final long[] g() {
        return dqru.C(null, dt(getString(cO(6, akzi.a))));
    }

    @Override // defpackage.akza
    public final String[] h() {
        String[] strArrDu = du(getString(cO(11, akzi.a)));
        for (int i = 0; i < strArrDu.length; i++) {
            strArrDu[i] = cssq.a(strArrDu[i]);
        }
        return (String[]) dqru.D(null, strArrDu, new String[0]);
    }

    @Override // defpackage.akza
    public final String[] i() {
        String[] strArrDu = du(getString(cO(9, akzi.a)));
        for (int i = 0; i < strArrDu.length; i++) {
            strArrDu[i] = cssb.a(strArrDu[i]);
        }
        return (String[]) dqru.D(null, strArrDu, new String[0]);
    }

    @Override // defpackage.akza
    public final String[] j() {
        String[] strArrDu = du(getString(cO(10, akzi.a)));
        for (int i = 0; i < strArrDu.length; i++) {
            strArrDu[i] = cssb.a(strArrDu[i]);
        }
        return (String[]) dqru.D(null, strArrDu, new String[0]);
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
