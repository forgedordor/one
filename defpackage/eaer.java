package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaer {
    public static final /* synthetic */ int a = 0;
    private static final AtomicBoolean b = new AtomicBoolean(false);

    public static void a() {
        c(14903854);
    }

    public static void b() {
        c(14903855);
    }

    private static void c(final int... iArr) {
        if (b.compareAndSet(false, true)) {
            dcac.a().b(new dbzr() { // from class: eaeq
                @Override // defpackage.dbzr
                public final void a(dbzs dbzsVar) {
                    int i = eaer.a;
                    try {
                        ((dbyd) dbzsVar).i(iArr);
                    } catch (IllegalArgumentException unused) {
                    }
                }
            });
        }
    }
}
