package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvrf {
    final long a;
    private final Context b;
    private final dvtm c;

    public dvrf(Context context, dvtm dvtmVar, long j) {
        this.b = context.getApplicationContext();
        this.c = dvtmVar;
        this.a = j;
    }

    private final Uri d() {
        String strValueOf = String.valueOf(this.b.getPackageName());
        return dvtr.a(strValueOf.concat(".lighter.data"), "MESSAGING", "kvstore", Long.toString(this.a));
    }

    public final ejwi a(String str) {
        ejwi ejwiVarJ;
        Cursor cursorH = this.c.h(d(), dvwr.a, "key = ?", new String[]{str}, null, "1");
        if (cursorH != null) {
            try {
                ejwiVarJ = !cursorH.moveToFirst() ? ejud.a : ejwi.j(cursorH.getBlob(1));
            } finally {
            }
        }
        if (cursorH != null) {
            cursorH.close();
        }
        return ejwiVarJ;
    }

    public final void b() {
        this.c.a(d(), "key = ?", new String[]{"CURRENT_BOOTSTRAP_LATEST_MESSAGE_TIMESTAMP"});
    }

    public final void c(String str, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", str);
        contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE, bArr);
        this.c.c(d(), contentValues, 5);
    }
}
