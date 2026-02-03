package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rar {
    final /* synthetic */ Context a;
    private File b = null;

    public rar(Context context) {
        this.a = context;
    }

    public final File a() {
        if (this.b == null) {
            this.b = new File(this.a.getCacheDir(), "volley");
        }
        return this.b;
    }
}
