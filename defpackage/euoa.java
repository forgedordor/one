package defpackage;

import android.net.Uri;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euoa {
    static {
        new HashMap();
    }

    public static final Uri a(String str) {
        return new Uri.Builder().scheme("file").path(str).build();
    }
}
