package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MessageWithTextIdsQuery;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bkkq extends dqqf<bkkq, bkks, bkku, MessageWithTextIdsQuery.BindData, bkkp> implements dqqj {
    @Deprecated
    public bkkq(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bkks bkksVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, MessageWithTextIdsQuery.a, dqwjVar, dqtmVar, bkksVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bkgh();
    }

    public final MessageIdType c() {
        return new MessageIdType(getLong(cO(0, MessageWithTextIdsQuery.a)));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
