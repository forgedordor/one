package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awbu extends dqqf implements awbt {
    @Deprecated
    public awbu(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, awbw awbwVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, awcb.a, dqwjVar, dqtmVar, awbwVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new avrg();
    }

    @Override // defpackage.awbt
    public final ConversationIdType c() {
        return new ConversationIdType(getLong(cO(0, awcb.a)));
    }

    @Override // defpackage.awbt
    public final String[] d() {
        String[] strArrDu = du(getString(cO(6, awcb.a)));
        for (int i = 0; i < strArrDu.length; i++) {
            strArrDu[i] = cssb.a(strArrDu[i]);
        }
        return (String[]) dqru.D(null, strArrDu, new String[0]);
    }

    @Override // defpackage.awbt
    public final String[] e() {
        String[] strArrDu = du(getString(cO(7, awcb.a)));
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
