package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edds {
    private final Context a;

    public edds(Context context) {
        this.a = context;
    }

    public final Uri a(String str) {
        Context context = this.a;
        String str2 = String.format("%s.%s", context.getPackageName(), "photopicker_images");
        if (!context.getCacheDir().exists()) {
            context.getCacheDir().mkdirs();
        }
        File file = new File(context.getCacheDir(), "photopicker_images");
        if (!file.exists()) {
            file.mkdirs();
        }
        return FileProvider.a(context, str2, new File(file, str));
    }
}
