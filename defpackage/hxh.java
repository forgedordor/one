package defpackage;

import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxh extends hvr implements Map, huw {
    private hxi f;

    public hxh(hxi hxiVar) {
        super(hxiVar);
        this.f = hxiVar;
    }

    @Override // defpackage.hvr, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof hng) {
            return super.containsKey((hng) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj instanceof hsl) {
            return super.containsValue((hsl) obj);
        }
        return false;
    }

    @Override // defpackage.hvr, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof hng) {
            return (hsl) super.get((hng) obj);
        }
        return null;
    }

    @Override // defpackage.hvr, java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof hng) ? obj2 : (hsl) Map.CC.$default$getOrDefault(this, (hng) obj, (hsl) obj2);
    }

    @Override // defpackage.hvr
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final hxi a() {
        hwg hwgVar = this.b;
        hxi hxiVar = this.f;
        if (hwgVar != hxiVar.b) {
            this.a = new hwt();
            hxiVar = new hxi(hwgVar, this.e);
        }
        this.f = hxiVar;
        return hxiVar;
    }

    @Override // defpackage.hvr, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj instanceof hng) {
            return (hsl) super.remove((hng) obj);
        }
        return null;
    }
}
