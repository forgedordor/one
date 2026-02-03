package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.UrlSearchQuery;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmek extends dqqf<bmek, bmem, bmeo, UrlSearchQuery.BindData, bmej> implements dqqj {
    @Deprecated
    public bmek(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bmem bmemVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, UrlSearchQuery.a, dqwjVar, dqtmVar, bmemVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new blmw();
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
