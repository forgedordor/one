package defpackage;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecod {
    public final dbyl a;
    public final String b;
    public CopyOnWriteArrayList c;

    public ecod(Context context, String str) {
        this(new dbyl(context, str, null), str);
    }

    public ecod(dbyl dbylVar, String str) {
        this.c = new CopyOnWriteArrayList();
        if (!str.startsWith("STREAMZ_")) {
            throw new IllegalArgumentException("logSourceName should be prefixed by STREAMZ_");
        }
        this.a = dbylVar;
        this.b = str;
    }
}
