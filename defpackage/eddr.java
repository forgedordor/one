package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eddr {
    public final Context a;

    public eddr(Context context) {
        this.a = context;
    }

    public final OutputStream a(Uri uri) {
        return ebsv.c(this.a, uri, ebsu.c);
    }
}
