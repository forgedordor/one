package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgrb {
    public static String a(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public static String b(String str) {
        return a(str).trim();
    }
}
