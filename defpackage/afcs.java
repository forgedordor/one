package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afcs extends dqwl {
    public afcs(dqwv dqwvVar) {
        super(dqwvVar);
    }

    @Override // defpackage.dqwl
    public final /* synthetic */ dqqj a(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar) {
        return new afcr(dqsyVar, cursor, strArr, dqxeVarArr, dqwjVar, dqtmVar, this);
    }

    @Override // defpackage.dqwl
    protected final Map b() {
        String[] strArr = afcw.a;
        return new HashMap();
    }

    @Override // defpackage.dqwl
    protected final boolean c() {
        return true;
    }

    @Override // defpackage.dqwl
    protected final String[] d() {
        return new String[]{"messages._id", "message_labels.message_id"};
    }

    @Override // defpackage.dqwl
    protected final String[] e() {
        return new String[]{"messages", "null"};
    }
}
