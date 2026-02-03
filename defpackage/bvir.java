package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvir {
    public final fcsu a;
    public aill b;
    public dbyl c;
    public dbyl d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final Context f;
    public final fcsu g;

    public bvir(Context context, fcsu fcsuVar, fcsu fcsuVar2) {
        this.f = context;
        this.g = fcsuVar;
        this.a = fcsuVar2;
    }

    public static int b(String str) {
        if (str == null || str.length() == 0) {
            return 1;
        }
        return str.startsWith("+") ? 2 : 3;
    }

    public final boolean a() {
        return this.e.get();
    }

    public final dbyl c(int i) {
        return (i == 2 || i == 4) ? this.c : this.d;
    }
}
