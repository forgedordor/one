package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atcw {
    public static final eksp a = eksp.c("BugleFileTransfer");

    public static String a(String... strArr) {
        int i = elcz.a;
        return elcw.a.b(TextUtils.join(":", strArr).getBytes()).toString();
    }

    public static String b(String str) {
        return a.a(str, "\"", "\"");
    }
}
