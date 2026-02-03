package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class codp {
    public static final cqce a = cqce.g("Bugle", "TableBasedWipeoutDetectionHeuristicCommon");
    public final Context b;
    public final cmfo c;

    public codp(Context context, cmfo cmfoVar) {
        this.b = context;
        this.c = cmfoVar;
    }

    final void a(Uri uri, final codo codoVar) {
        Context context = this.b;
        final Uri uriInsert = context.getContentResolver().insert(uri, new ContentValues());
        ejyb.e(uriInsert);
        Cursor cursorQuery = context.getContentResolver().query(uriInsert, new String[]{"_data"}, null, null, null, null);
        try {
            ejyb.e(cursorQuery);
            if (!cursorQuery.moveToNext()) {
                throw new ejyc(a.E(uriInsert, "Unable to query newly created uri="));
            }
            final String string = cursorQuery.getString(0);
            if (TextUtils.isEmpty(string)) {
                throw new ejyc(a.E(uriInsert, "Newly created Uri has an empty filename. uri="));
            }
            this.c.m(new ejvr() { // from class: codn
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return codoVar.a((evuh) obj, uriInsert, string);
                }
            });
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            try {
                cursorQuery.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
