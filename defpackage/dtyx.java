package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtyx {
    private final Context a;

    public dtyx(Context context) {
        this.a = context;
    }

    public final String a(Uri uri) {
        return ecfm.a(uri, new ecfc(this.a)).getAbsolutePath();
    }
}
