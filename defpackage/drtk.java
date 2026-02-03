package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drtk {
    public static volatile drtk a;
    public final Executor b;

    private drtk(Executor executor) {
        this.b = executor == null ? drle.a().d : executor;
    }

    public static void a(Executor executor) {
        if (a == null) {
            synchronized (drtk.class) {
                if (a == null) {
                    a = new drtk(executor);
                }
            }
        }
    }
}
