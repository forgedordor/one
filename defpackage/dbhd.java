package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dbhd {
    public static dbhc c;
    private static final Object d = new Object();
    protected final String a;
    protected final Object b;

    protected dbhd(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public static void b(Context context) {
        synchronized (d) {
            if (c == null) {
                c = new dbhc(context.getContentResolver());
            }
        }
    }

    public abstract Object a();
}
