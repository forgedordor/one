package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dxgg {
    private final Map a = new HashMap();
    private final dxgf b;

    public dxgg(dxgf dxgfVar) {
        this.b = dxgfVar;
    }

    public final synchronized Object a(String str) {
        return b(dxvj.a(str));
    }

    public final synchronized Object b(dxvi dxviVar) {
        Map map = this.a;
        Object obj = map.get(dxviVar);
        if (obj != null) {
            return obj;
        }
        Object objA = this.b.a(dxviVar);
        map.put(dxviVar, objA);
        return objA;
    }
}
