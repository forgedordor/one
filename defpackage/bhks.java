package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.LocationAndLinkAnnotationIdsQuery;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bhks extends dqwl<bhkq, bhks, bhku, LocationAndLinkAnnotationIdsQuery.BindData, bhkp> {
    public bhks(dqwv dqwvVar) {
        super(dqwvVar);
    }

    @Override // defpackage.dqwl
    public final /* synthetic */ dqqj a(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar) {
        return new bhkq(dqsyVar, cursor, strArr, dqxeVarArr, dqwjVar, dqtmVar, this);
    }

    @Override // defpackage.dqwl
    protected final Map b() {
        String[] strArr = LocationAndLinkAnnotationIdsQuery.a;
        return new HashMap();
    }

    @Override // defpackage.dqwl
    protected final boolean c() {
        return true;
    }

    @Override // defpackage.dqwl
    protected final String[] d() {
        return new String[0];
    }

    @Override // defpackage.dqwl
    protected final String[] e() {
        return new String[0];
    }
}
