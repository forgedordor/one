package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czwe {
    public static final String a(Context context, String str) {
        String strConcat = str != null ? ":".concat(str) : "";
        return context.getPackageName() + ":reminder" + strConcat;
    }
}
