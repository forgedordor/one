package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rnf implements rfg {
    private static final String[] a = {"_data"};
    private final Context b;
    private final rlq c;
    private final rlq d;
    private final Uri e;
    private final int f;
    private final int g;
    private final rex h;
    private final Class i;
    private volatile boolean j;
    private volatile rfg k;

    public rnf(Context context, rlq rlqVar, rlq rlqVar2, Uri uri, int i, int i2, rex rexVar, Class cls) {
        this.b = context.getApplicationContext();
        this.c = rlqVar;
        this.d = rlqVar2;
        this.e = uri;
        this.f = i;
        this.g = i2;
        this.h = rexVar;
        this.i = cls;
    }

    @Override // defpackage.rfg
    public final Class a() {
        return this.i;
    }

    @Override // defpackage.rfg
    public final void d() {
        this.j = true;
        rfg rfgVar = this.k;
        if (rfgVar != null) {
            rfgVar.d();
        }
    }

    @Override // defpackage.rfg
    public final void e() {
        rfg rfgVar = this.k;
        if (rfgVar != null) {
            rfgVar.e();
        }
    }

    @Override // defpackage.rfg
    public final reb eX() {
        return reb.LOCAL;
    }

    @Override // defpackage.rfg
    public final void g(rbh rbhVar, rff rffVar) throws Throwable {
        rlp rlpVarA;
        Throwable th;
        try {
            Cursor cursor = null;
            if (Environment.isExternalStorageLegacy()) {
                rlq rlqVar = this.c;
                Uri uri = this.e;
                try {
                    Cursor cursorQuery = this.b.getContentResolver().query(uri, a, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    throw new FileNotFoundException(a.E(uri, "File path was empty in media store for: "));
                                }
                                File file = new File(string);
                                cursorQuery.close();
                                rlpVarA = rlqVar.a(file, this.f, this.g, this.h);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                            if (cursor == null) {
                                throw th;
                            }
                            cursor.close();
                            throw th;
                        }
                    }
                    throw new FileNotFoundException(a.E(uri, "Failed to media store entry for: "));
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                Uri requireOriginal = this.e;
                if (rfw.a(requireOriginal) && requireOriginal.getPathSegments().contains("picker")) {
                    rlpVarA = this.d.a(requireOriginal, this.f, this.g, this.h);
                } else {
                    if (this.b.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                        requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                    }
                    rlpVarA = this.d.a(requireOriginal, this.f, this.g, this.h);
                }
            }
            rfg rfgVar = rlpVarA != null ? rlpVarA.c : null;
            if (rfgVar == null) {
                rffVar.f(new IllegalArgumentException("Failed to build fetcher for: " + String.valueOf(this.e)));
                return;
            }
            this.k = rfgVar;
            if (this.j) {
                d();
            } else {
                rfgVar.g(rbhVar, rffVar);
            }
        } catch (FileNotFoundException e) {
            rffVar.f(e);
        }
    }
}
