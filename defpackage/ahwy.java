package defpackage;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahwy {
    public final File a;

    public ahwy(File file) {
        this.a = file;
    }

    public static final void a(SQLiteDatabase sQLiteDatabase, String str) throws SQLException {
        List listS = fdgn.S(str, new String[]{"\n"}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listS) {
            String str2 = (String) obj;
            if (!fdgn.t(str2, "--") && str2.length() > 0) {
                arrayList.add(obj);
            }
        }
        List listS2 = fdgn.S(fcva.aF(arrayList, "\n", null, null, null, 62), new String[]{";"}, 0, 6);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listS2) {
            if (((String) obj2).length() > 0) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL((String) it.next());
        }
    }
}
