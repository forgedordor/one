package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.ParticipantIdsQuery;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bkot extends dqqf<bkot, bkov, bkox, ParticipantIdsQuery.BindData, bkos> implements dqqj {
    @Deprecated
    public bkot(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bkov bkovVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, ParticipantIdsQuery.a, dqwjVar, dqtmVar, bkovVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bkky();
    }

    public final String c() {
        return getString(cO(0, ParticipantIdsQuery.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
