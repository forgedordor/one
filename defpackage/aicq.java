package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aicq extends fcyz implements fdat {
    final /* synthetic */ ahwy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aicq(ahwy ahwyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ahwyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aicq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        File file = this.a.a;
        if (file.exists()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(file, (SQLiteDatabase.CursorFactory) null);
        sQLiteDatabaseOpenOrCreateDatabase.getClass();
        ClassLoader classLoader = azuy.a.getClass().getClassLoader();
        classLoader.getClass();
        URL resource = classLoader.getResource("com/google/android/apps/messaging/shared/datamodel/backup/database/sql/" + ((azux) fcva.S(azux.e)).f + ".sql");
        resource.getClass();
        Charset charset = fdfy.a;
        InputStream inputStreamOpenStream = resource.openStream();
        try {
            inputStreamOpenStream.getClass();
            byte[] bArrA = fczk.a(inputStreamOpenStream);
            fczl.a(inputStreamOpenStream, null);
            ahwy.a(sQLiteDatabaseOpenOrCreateDatabase, new String(bArrA, charset));
            return sQLiteDatabaseOpenOrCreateDatabase;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aicq(this.a, fcxyVar);
    }
}
