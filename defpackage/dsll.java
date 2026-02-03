package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsll implements dskl {
    final String a = "user_experiments_store";
    private final dskp b;
    private final dxgk c;

    public dsll(dskp dskpVar, dxgk dxgkVar) {
        this.b = dskpVar;
        this.c = dxgkVar;
    }

    public static ecnv d(String str) {
        ecnw ecnwVar = new ecnw();
        ecnwVar.b("CREATE TABLE ");
        ecnwVar.b(str);
        ecnwVar.b(" (");
        ecnwVar.b("account TEXT NOT NULL, ");
        ecnwVar.b("key TEXT NOT NULL, ");
        ecnwVar.b("message BLOB NOT NULL, ");
        ecnwVar.b("windowStartTimestamp INTEGER NOT NULL, ");
        ecnwVar.b("windowEndTimestamp INTEGER NOT NULL, ");
        ecnwVar.b("PRIMARY KEY (account, key))");
        return ecnwVar.a();
    }

    @Override // defpackage.dskl
    public final ListenableFuture a(long j) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        sb.append("windowEndTimestamp < ?");
        arrayList.add(String.valueOf(j));
        final ecnt ecntVarA = ecnu.a(this.a, sb, arrayList);
        this.c.b();
        return this.b.d.c(new ecny() { // from class: dslj
            @Override // defpackage.ecny
            public final Object a(ecoa ecoaVar) {
                return Integer.valueOf(ecoaVar.a(ecntVarA));
            }
        });
    }

    @Override // defpackage.dskl
    public final ListenableFuture b() {
        ecnw ecnwVar = new ecnw();
        ecnwVar.b("SELECT * FROM ");
        ecnwVar.b(this.a);
        ecnv ecnvVarA = ecnwVar.a();
        this.c.b();
        return this.b.d.a(ecnvVarA).e(new eopo() { // from class: dsli
            @Override // defpackage.eopo
            public final Object a(eopt eoptVar, Object obj) {
                Cursor cursor = (Cursor) obj;
                HashSet hashSet = new HashSet();
                while (cursor.moveToNext()) {
                    String string = cursor.getString(cursor.getColumnIndexOrThrow("account"));
                    if (true == string.equals("signedout")) {
                        string = null;
                    }
                    hashSet.add(dsmz.c(string, cursor.getString(cursor.getColumnIndexOrThrow("key")), ProtoParsers.g(cursor.getBlob(cursor.getColumnIndexOrThrow("message")), ethm.a), cursor.getLong(cursor.getColumnIndexOrThrow("windowStartTimestamp")), cursor.getLong(cursor.getColumnIndexOrThrow("windowEndTimestamp"))));
                }
                return hashSet;
            }
        }, eoqg.a).g();
    }

    @Override // defpackage.dskl
    public final ListenableFuture c(final Collection collection) {
        return this.b.d.d(new ecnz() { // from class: dslk
            @Override // defpackage.ecnz
            public final void a(ecoa ecoaVar) throws dskg {
                for (dsmz dsmzVar : collection) {
                    if (dsmzVar.b > dsmzVar.c) {
                        throw new dskg();
                    }
                    ContentValues contentValues = new ContentValues(4);
                    String strA = dsmzVar.a();
                    if (strA == null) {
                        strA = "signedout";
                    }
                    dsll dsllVar = this.a;
                    contentValues.put("account", strA);
                    contentValues.put("key", dsmzVar.b());
                    contentValues.put("message", dsmzVar.a.toByteArray());
                    contentValues.put("windowStartTimestamp", Long.valueOf(dsmzVar.b));
                    contentValues.put("windowEndTimestamp", Long.valueOf(dsmzVar.c));
                    if (ecoaVar.c(dsllVar.a, contentValues, 5) == -1) {
                        throw new SQLException("Failed to put() to DB.");
                    }
                }
            }
        });
    }
}
