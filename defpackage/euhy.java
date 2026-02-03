package defpackage;

import android.database.Cursor;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euhy {
    public static final String[] a = {"sourceid", "account_type", "account_name", "contact_id", "mimetype", "is_primary", "is_super_primary", "display_name", "data1", "data2", "data3", "data1", "data1", "data1"};

    public static final void a(String str, int i, euhx euhxVar, Map map) {
        eugs eugsVar = new eugs(str, i);
        if (map.containsKey(eugsVar)) {
            euhxVar.a((String) map.get(eugsVar));
        }
    }

    public static final void b(String str, int i, Cursor cursor, Map map, Map map2, Set set) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0 || cursor.isNull(columnIndex)) {
            return;
        }
        String string = cursor.getString(cursor.getColumnIndex("contact_id"));
        euhw euhwVar = cursor.getInt(cursor.getColumnIndex("is_super_primary")) == 1 ? euhw.SUPER_PRIMARY : cursor.getInt(cursor.getColumnIndex("is_primary")) == 1 ? euhw.PRIMARY : euhw.REGULAR;
        eugs eugsVar = new eugs(string, i);
        if (!map.containsKey(eugsVar) || euhwVar.compareTo((euhw) map2.get(eugsVar)) > 0) {
            map.put(eugsVar, cursor.getString(columnIndex));
            map2.put(eugsVar, euhwVar);
            set.add(string);
        }
    }
}
