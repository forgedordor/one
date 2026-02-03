package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddjt {
    public final Context a;
    public final ddjy b;
    public final ExecutorService c;
    public final Class d;

    public ddjt(Context context, ddjy ddjyVar, ExecutorService executorService, Class cls) {
        this.a = context;
        this.b = ddjyVar;
        this.c = executorService;
        this.d = cls;
    }

    public static void a(String str) {
        ejwl.f(str.startsWith("/"), "collection must start with \"/\" but is \"%s\"", str);
    }
}
