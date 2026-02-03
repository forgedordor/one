package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dslh implements dski {
    public final fcsu a;
    final String b;
    final String c;
    private final dskp d;

    public dslh(dskp dskpVar, fcsu fcsuVar) {
        this.d = dskpVar;
        this.b = "capped_promos";
        this.a = fcsuVar;
        this.c = "noaccount";
    }

    public static ecnv f(String str) {
        ecnw ecnwVar = new ecnw();
        ecnwVar.b("CREATE TABLE ");
        ecnwVar.b(str);
        ecnwVar.b(" (");
        ecnwVar.b("account TEXT NOT NULL,");
        ecnwVar.b("key TEXT NOT NULL,");
        ecnwVar.b("value BLOB NOT NULL,");
        ecnwVar.b(" PRIMARY KEY (account, key))");
        return ecnwVar.a();
    }

    @Override // defpackage.dski
    public final ListenableFuture a() {
        return this.d.d.c(new ecny() { // from class: dslc
            @Override // defpackage.ecny
            public final Object a(ecoa ecoaVar) {
                dslh dslhVar = this.a;
                return Integer.valueOf(ecoaVar.b(dslhVar.b, "account = ?", dslhVar.c));
            }
        });
    }

    @Override // defpackage.dski
    public final ListenableFuture b(final Map map) {
        return this.d.d.c(new ecny() { // from class: dsld
            @Override // defpackage.ecny
            public final Object a(ecoa ecoaVar) {
                dslh dslhVar = this.a;
                String str = dslhVar.c;
                String str2 = dslhVar.b;
                Integer numValueOf = Integer.valueOf(ecoaVar.b(str2, "account = ?", str));
                for (Map.Entry entry : map.entrySet()) {
                    ContentValues contentValues = new ContentValues(3);
                    contentValues.put("account", str);
                    contentValues.put("key", (String) entry.getKey());
                    contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE, ((evuh) entry.getValue()).toByteArray());
                    if (ecoaVar.c(str2, contentValues, 5) == -1) {
                        throw new SQLException("Failed to clearAndPutAll() to DB.");
                    }
                }
                return numValueOf;
            }
        });
    }

    @Override // defpackage.dski
    public final ListenableFuture c() {
        ecnw ecnwVar = new ecnw();
        ecnwVar.b("SELECT key, value");
        ecnwVar.b(" FROM ");
        ecnwVar.b(this.b);
        ecnwVar.b(" WHERE account = ?");
        ecnwVar.d(this.c);
        return this.d.d.a(ecnwVar.a()).e(eiid.g(new eopo() { // from class: dslg
            @Override // defpackage.eopo
            public final Object a(eopt eoptVar, Object obj) {
                Cursor cursor = (Cursor) obj;
                HashMap mapH = ekmi.h(cursor.getCount());
                while (cursor.moveToNext()) {
                    mapH.put(cursor.getString(cursor.getColumnIndexOrThrow("key")), ProtoParsers.g(cursor.getBlob(cursor.getColumnIndexOrThrow(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE)), (evuh) this.a.a.b()));
                }
                return mapH;
            }
        }), eoqg.a).g();
    }

    @Override // defpackage.dski
    public final ListenableFuture d(final String str, final evuh evuhVar) {
        return this.d.d.d(new ecnz() { // from class: dslf
            @Override // defpackage.ecnz
            public final void a(ecoa ecoaVar) {
                ContentValues contentValues = new ContentValues(3);
                dslh dslhVar = this.a;
                contentValues.put("account", dslhVar.c);
                contentValues.put("key", str);
                contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE, evuhVar.toByteArray());
                if (ecoaVar.c(dslhVar.b, contentValues, 5) == -1) {
                    throw new SQLException("Failed to put() to DB.");
                }
            }
        });
    }

    @Override // defpackage.dski
    public final ListenableFuture e(final String str) {
        return this.d.d.d(new ecnz() { // from class: dsle
            @Override // defpackage.ecnz
            public final void a(ecoa ecoaVar) throws InterruptedException {
                dslh dslhVar = this.a;
                ecoaVar.b(dslhVar.b, "(account = ? AND key = ?)", dslhVar.c, str);
            }
        });
    }

    public dslh(dskp dskpVar, String str, dxvi dxviVar, fcsu fcsuVar) {
        this.d = dskpVar;
        this.b = str;
        this.a = fcsuVar;
        this.c = !dxviVar.b() ? dxviVar.a() : "signedout";
    }
}
