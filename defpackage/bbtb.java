package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.ConversationIdsQuery;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbtb extends dqqf<bbtb, bbtc, bbtd, ConversationIdsQuery.BindData, bbta> implements dqqj {
    @Deprecated
    public bbtb(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bbtc bbtcVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, ConversationIdsQuery.a, dqwjVar, dqtmVar, bbtcVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bbmu();
    }

    public final ConversationIdType c() {
        return new ConversationIdType(getLong(cO(0, ConversationIdsQuery.a)));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
