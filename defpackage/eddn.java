package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eddn implements lxk {
    private final Map a;

    public eddn(Map map) {
        this.a = map;
    }

    @Override // defpackage.lxk
    public final lxd a(Class cls) {
        Map map = this.a;
        fcsu fcsuVar = (fcsu) map.get(cls);
        if (fcsuVar == null) {
            Iterator<E> it = ((ekgp) map).entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (cls.isAssignableFrom((Class) entry.getKey())) {
                    fcsuVar = (fcsu) entry.getValue();
                    break;
                }
            }
        }
        if (fcsuVar != null) {
            return (lxd) fcsuVar.b();
        }
        throw new IllegalArgumentException("Unknown ViewModel class ".concat(cls.toString()));
    }

    @Override // defpackage.lxk
    public final /* synthetic */ lxd b(Class cls, lyp lypVar) {
        return lxj.c(this, cls);
    }

    @Override // defpackage.lxk
    public final /* synthetic */ lxd c(fddy fddyVar, lyp lypVar) {
        return lxj.a(this, fddyVar, lypVar);
    }
}
