package defpackage;

import android.content.Context;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecri {
    private final CronetEngine a;

    @Deprecated
    public ecri(CronetEngine cronetEngine) {
        this.a = cronetEngine;
    }

    public final ecro a(Context context, String str, String str2, String str3) {
        return new ecrh(context, str, str2, str3, new ecqy(this.a));
    }
}
