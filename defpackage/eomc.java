package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eomc extends ekeo {
    Set a;
    Collection b;
    final /* synthetic */ Map c;
    final /* synthetic */ eomd d;

    public eomc(eomd eomdVar, Map map) {
        this.c = map;
        this.d = eomdVar;
    }

    @Override // defpackage.ekeo
    protected final Map b() {
        return this.c;
    }

    @Override // defpackage.ekeo, java.util.Map
    public final boolean containsValue(Object obj) {
        return ((ekei) values()).d(obj);
    }

    @Override // defpackage.ekeo, java.util.Map
    public final Set entrySet() {
        Set set = this.a;
        if (set != null) {
            return set;
        }
        eolu eoluVar = new eolu(this.c.entrySet());
        this.a = eoluVar;
        return eoluVar;
    }

    @Override // defpackage.ekeo, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        List listC = this.d.c(obj);
        if (listC.isEmpty()) {
            return null;
        }
        return listC;
    }

    @Override // defpackage.ekeo, defpackage.eker
    protected final /* synthetic */ Object hp() {
        return this.c;
    }

    @Override // defpackage.ekeo, java.util.Map
    public final Collection values() {
        Collection collection = this.b;
        if (collection != null) {
            return collection;
        }
        eolw eolwVar = new eolw(this.c.values(), entrySet());
        this.b = eolwVar;
        return eolwVar;
    }
}
