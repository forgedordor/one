package defpackage;

import android.content.ContentResolver;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class devq {
    public static ContentResolver a;
    protected final String b;
    protected final Object c;

    protected devq(String str, Object obj) {
        this.b = str;
        this.c = obj;
    }

    public static void b(Context context) {
        a = context.getContentResolver();
    }

    public static devq c(String str) {
        return new devo(str, false);
    }

    public abstract Object a();
}
