package defpackage;

import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pcz {
    private final Map a = new HashMap();
    private final Object b;

    public pcz(Object obj) {
        lcg.a(true);
        this.b = obj;
    }

    final Object a(MotionEvent motionEvent) {
        pda pdaVar = new pda(motionEvent.getToolType(0), motionEvent.getSource());
        Map map = this.a;
        Object obj = map.get(pdaVar);
        if (obj == null) {
            obj = map.get(new pda(pdaVar.a));
        }
        return obj != null ? obj : this.b;
    }

    final void b(pda pdaVar, Object obj) {
        if (obj == null) {
            Map map = this.a;
            if (map.containsKey(pdaVar)) {
                map.remove(pdaVar);
                return;
            }
        }
        this.a.put(pdaVar, obj);
    }
}
