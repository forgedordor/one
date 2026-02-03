package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class eavq {
    public abstract eavr a();

    public abstract List b();

    public abstract List c();

    public abstract void d(List list);

    public abstract void e(List list);

    public final eavr f() {
        d(ekgb.n(b()));
        e(ekgb.n(c()));
        List<Integer> listC = c();
        if (!listC.isEmpty()) {
            for (Integer num : listC) {
                ejwl.j(eknz.c(0, 4).a(num), "Price level must not be out of range of %s to %s, but was: %s.", Double.valueOf(1.0d), Double.valueOf(5.0d), num);
            }
        }
        return a();
    }
}
