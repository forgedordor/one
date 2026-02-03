package defpackage;

import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecfk {
    public static final Uri a(Uri.Builder builder, ekfw ekfwVar) {
        return builder.encodedFragment(ecgp.a(ekfwVar.g())).build();
    }

    public static final void b(File file, Uri.Builder builder) {
        builder.path(file.getAbsolutePath());
    }
}
