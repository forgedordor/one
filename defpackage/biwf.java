package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MediaSearchQuery;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class biwf extends dqqf<biwf, biwh, biwj, MediaSearchQuery.BindData, biwe> implements dqqj {
    @Deprecated
    public biwf(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, biwh biwhVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, MediaSearchQuery.a, dqwjVar, dqtmVar, biwhVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bibv();
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
