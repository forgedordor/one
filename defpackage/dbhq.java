package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbhq extends dbht {
    public static Context a;
    private final String b;

    public dbhq(String str) {
        this.b = str;
    }

    public static void b(SharedPreferences.Editor editor) {
        editor.apply();
    }

    public final SharedPreferences a() {
        return a.getSharedPreferences(this.b, 0);
    }
}
