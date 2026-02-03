package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
final class lwa implements lvh {
    private final Object a;
    private final luj b;

    public lwa(Object obj) {
        this.a = obj;
        this.b = lul.a.b(obj.getClass());
    }

    @Override // defpackage.lvh
    public final void gL(lvj lvjVar, lva lvaVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Map map = this.b.a;
        List list = (List) map.get(lvaVar);
        Object obj = this.a;
        luj.a(list, lvjVar, lvaVar, obj);
        luj.a((List) map.get(lva.ON_ANY), lvjVar, lvaVar, obj);
    }
}
