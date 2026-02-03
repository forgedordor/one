package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.LocationSearchQuery;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bibn extends dqqf<bibn, bibp, bibr, LocationSearchQuery.BindData, bibm> implements dqqj {
    @Deprecated
    public bibn(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bibp bibpVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, LocationSearchQuery.a, dqwjVar, dqtmVar, bibpVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bhky();
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
