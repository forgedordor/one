package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehvf {
    private final Context a;
    private Context b;

    public ehvf(Context context) {
        this.a = context;
    }

    private final synchronized Context d() {
        if (this.b == null) {
            Context context = this.a;
            Context contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
            if (contextCreateDeviceProtectedStorageContext != null) {
                this.b = contextCreateDeviceProtectedStorageContext;
            } else {
                this.b = context;
            }
        }
        return this.b;
    }

    private final File e(int i, int i2) {
        Context contextD = i2 == 1 ? d() : this.a;
        return i + (-1) != 0 ? contextD.getCacheDir() : contextD.getFilesDir();
    }

    public final ekhx a() {
        return ekhx.t(e(1, 2), e(1, 1), e(2, 2), e(2, 1));
    }

    public final File b(ehvh ehvhVar) {
        ehve ehveVar = (ehve) ehvhVar;
        return e(ehveVar.a, ehveVar.b);
    }

    public final Uri c(ehvh ehvhVar, String str) {
        ehve ehveVar = (ehve) ehvhVar;
        int i = ehveVar.a;
        String str2 = ehveVar.b == 1 ? "directboot-" : "";
        String strConcat = i + (-1) != 0 ? str2.concat("cache") : str2.concat("files");
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        return new Uri.Builder().scheme("android").authority(this.a.getPackageName()).path(a.n(str, strConcat, "/", "/")).build();
    }
}
