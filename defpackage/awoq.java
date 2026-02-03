package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.ArrayList;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awoq extends dqsi {
    public static final String[] a = {"group_members.group_token", "group_members.destination_token"};
    public static final awob b;
    public static final int[] c;

    static {
        new ekgi().c();
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("group_token", "index_group_members_group_token");
        ekgiVar.c();
        b = new awob();
        c = new int[]{60430};
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static void b(int i, awnr... awnrVarArr) {
        dqru.B(a(), i, false, new BiConsumer() { // from class: awno
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                String[] strArr = awoq.a;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, awnrVarArr);
    }

    public static void c(dqsy dqsyVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("group_token TEXT REFERENCES groups(token) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("destination_token TEXT REFERENCES destinations(token) ON DELETE CASCADE ON UPDATE CASCADE");
        sb.insert(0, "CREATE TABLE group_members (");
        sb.append(", PRIMARY KEY (group_token,destination_token));");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_group_members_group_token");
        arrayList.add("CREATE INDEX index_group_members_group_token ON group_members(group_token);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
