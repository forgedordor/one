package defpackage;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcac {
    private static volatile dcac b;
    public final List a = new CopyOnWriteArrayList();

    private dcac() {
    }

    public static dcac a() {
        if (b == null) {
            synchronized (dcac.class) {
                if (b == null) {
                    b = new dcac();
                }
            }
        }
        return b;
    }

    public final void b(dbzr dbzrVar) {
        this.a.add(0, dbzrVar);
    }
}
