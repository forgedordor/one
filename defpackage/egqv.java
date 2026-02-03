package defpackage;

import android.database.Cursor;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egqv {
    public static final ekgb a(Cursor cursor, fdap fdapVar) {
        ArrayList arrayList = new ArrayList();
        if (cursor.moveToFirst()) {
            do {
                arrayList.add(fdapVar.invoke(new egrr(cursor)));
            } while (cursor.moveToNext());
        }
        return ekfv.a(arrayList);
    }

    public static final Object b(fcyh fcyhVar, fdap fdapVar, fcxy fcxyVar) {
        return fdjy.a(new egqu(fcyhVar, fdapVar, null), fcxyVar);
    }
}
