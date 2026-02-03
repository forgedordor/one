package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dvun {
    /* JADX WARN: Multi-variable type inference failed */
    public static ekgb d(List list) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ekqh it = ((ekgb) list).iterator();
        while (it.hasNext()) {
            dvun dvunVar = (dvun) it.next();
            if (dvunVar.b() == 1) {
                ekfwVar.h(dvunVar.a());
            }
        }
        return ekfwVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ekgb e(List list) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ekqh it = ((ekgb) list).iterator();
        while (it.hasNext()) {
            dvun dvunVar = (dvun) it.next();
            if (dvunVar.b() == 2) {
                ekfwVar.h(dvunVar.c());
            }
        }
        return ekfwVar.g();
    }

    public abstract dwhq a();

    public abstract int b();

    public abstract Object c();
}
