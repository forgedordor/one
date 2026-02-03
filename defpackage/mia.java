package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mia extends ekeo {
    private final Map a;

    public mia(Map map) {
        this.a = map;
    }

    @Override // defpackage.ekeo
    protected final Map b() {
        return this.a;
    }

    @Override // defpackage.ekeo, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // defpackage.ekeo, java.util.Map
    public final boolean containsValue(Object obj) {
        return ekjc.m(new eklq(entrySet().iterator()), obj);
    }

    @Override // defpackage.ekeo, java.util.Map
    public final Set entrySet() {
        return ekpg.h(super.entrySet(), new ejwm() { // from class: mhy
            @Override // defpackage.ejwm
            public final boolean a(Object obj) {
                return ((Map.Entry) obj).getKey() != null;
            }
        });
    }

    @Override // defpackage.ekeo, java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && ekmi.m(this, obj);
    }

    @Override // defpackage.ekeo, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) super.get(obj);
    }

    @Override // defpackage.ekeo, java.util.Map
    public final int hashCode() {
        return ekpg.a(entrySet());
    }

    @Override // defpackage.ekeo, defpackage.eker
    protected final /* synthetic */ Object hp() {
        return this.a;
    }

    @Override // defpackage.ekeo, java.util.Map
    public final boolean isEmpty() {
        if (super.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // defpackage.ekeo, java.util.Map
    public final Set keySet() {
        return ekpg.h(super.keySet(), new ejwm() { // from class: mhz
            @Override // defpackage.ejwm
            public final boolean a(Object obj) {
                return ((String) obj) != null;
            }
        });
    }

    @Override // defpackage.ekeo, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
