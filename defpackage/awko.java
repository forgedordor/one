package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awko extends dqsi {
    public static final String[] a = {"destinations.token", "destinations.address", "destinations.address_type"};
    public static final awka b;
    public static final int[] c;

    static {
        new ekgi().c();
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("address", "index_destinations_address");
        ekgiVar.c();
        b = new awka();
        c = new int[]{60280};
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static void b(dqsy dqsyVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("token TEXT PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("address TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("address_type INT NOT NULL");
        sb.insert(0, "CREATE TABLE destinations (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_destinations_address");
        arrayList.add("CREATE UNIQUE INDEX index_destinations_address ON destinations(address);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
