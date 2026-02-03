package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rlj implements rfg {
    private static final String[] a = {"_data"};
    private final Context b;
    private final Uri c;

    public rlj(Context context, Uri uri) {
        this.b = context;
        this.c = uri;
    }

    @Override // defpackage.rfg
    public final Class a() {
        return File.class;
    }

    @Override // defpackage.rfg
    public final reb eX() {
        return reb.LOCAL;
    }

    @Override // defpackage.rfg
    public final void g(rbh rbhVar, rff rffVar) {
        Cursor cursorQuery = this.b.getContentResolver().query(this.c, a, null, null, null);
        if (cursorQuery != null) {
            try {
                string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
            } finally {
                cursorQuery.close();
            }
        }
        if (TextUtils.isEmpty(string)) {
            rffVar.f(new FileNotFoundException("Failed to find file path for: ".concat(String.valueOf(String.valueOf(this.c)))));
        } else {
            rffVar.c(new File(string));
        }
    }

    @Override // defpackage.rfg
    public final void d() {
    }

    @Override // defpackage.rfg
    public final void e() {
    }
}
