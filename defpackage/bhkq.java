package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.LocationAndLinkAnnotationIdsQuery;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bhkq extends dqqf<bhkq, bhks, bhku, LocationAndLinkAnnotationIdsQuery.BindData, bhkp> implements dqqj {
    @Deprecated
    public bhkq(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bhks bhksVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, LocationAndLinkAnnotationIdsQuery.a, dqwjVar, dqtmVar, bhksVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bhkc();
    }

    public final String c() {
        return getString(cO(0, LocationAndLinkAnnotationIdsQuery.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
