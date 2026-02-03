package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import j$.time.Instant;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aicp extends fcyz implements fdat {
    final /* synthetic */ aics a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aicp(aics aicsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = aicsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aicp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ahwz ahwzVar = this.a.f;
        ahwzVar.getClass();
        SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(ahwzVar.a.a.getAbsolutePath(), null, 0, null);
        sQLiteDatabaseOpenDatabase.getClass();
        try {
            sQLiteDatabaseOpenDatabase.execSQL("CREATE TABLE IF NOT EXISTS \"os_migration_id_map\" (_id INTEGER PRIMARY KEY AUTOINCREMENT, table_name TEXT, backup_id INT, os_migration_id TEXT, UNIQUE(table_name, os_migration_id) ON CONFLICT FAIL);");
            Cursor cursorQuery = sQLiteDatabaseOpenDatabase.query("backup_metadata", null, null, null, null, null, null);
            try {
                if (cursorQuery.getCount() == 0) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("created_timestamp", Integer.valueOf((int) Instant.now().toEpochMilli()));
                    contentValues.put("schema_version", Long.valueOf(((azux) fcva.S(azux.e)).f));
                    contentValues.put("backup_id", UUID.randomUUID().toString());
                    sQLiteDatabaseOpenDatabase.insertOrThrow("backup_metadata", null, contentValues);
                }
                fczl.a(cursorQuery, null);
                fczl.a(sQLiteDatabaseOpenDatabase, null);
                return fctx.a;
            } finally {
            }
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aicp(this.a, fcxyVar);
    }
}
