package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class rfs implements rfg {
    private final Uri a;
    private final ContentResolver b;
    private Object c;

    public rfs(ContentResolver contentResolver, Uri uri) {
        this.b = contentResolver;
        this.a = uri;
    }

    protected abstract Object b(Uri uri, ContentResolver contentResolver);

    protected abstract void c(Object obj);

    @Override // defpackage.rfg
    public final void e() {
        Object obj = this.c;
        if (obj != null) {
            try {
                c(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.rfg
    public final reb eX() {
        return reb.LOCAL;
    }

    @Override // defpackage.rfg
    public final void g(rbh rbhVar, rff rffVar) {
        try {
            Object objB = b(this.a, this.b);
            this.c = objB;
            rffVar.c(objB);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            rffVar.f(e);
        }
    }

    @Override // defpackage.rfg
    public final void d() {
    }
}
