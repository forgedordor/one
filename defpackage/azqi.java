package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azqi implements dqsj {
    @Override // defpackage.dqsj
    public final String a() {
        return "backup_metadata";
    }

    @Override // defpackage.dqsj
    public final void b(dqsy dqsyVar) {
        String[] strArr = azqo.a;
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("created_timestamp INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("schema_version INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("backup_id TEXT");
        sb.insert(0, "CREATE TABLE backup_metadata (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
