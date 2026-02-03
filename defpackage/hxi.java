package defpackage;

import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxi extends hvp implements Map, hux {
    public static final hxi d = new hxi(hwg.a, 0);

    public hxi(hwg hwgVar, int i) {
        super(hwgVar, i);
    }

    @Override // defpackage.hvp, defpackage.hux
    public final /* synthetic */ huw a() {
        return new hxh(this);
    }

    @Override // defpackage.hvp, defpackage.fcuj, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof hng) {
            return super.containsKey((hng) obj);
        }
        return false;
    }

    @Override // defpackage.fcuj, java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj instanceof hsl) {
            return super.containsValue((hsl) obj);
        }
        return false;
    }

    @Override // defpackage.hvp
    /* renamed from: d */
    public final /* synthetic */ hvr a() {
        return new hxh(this);
    }

    @Override // defpackage.hvp, defpackage.fcuj, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof hng) {
            return (hsl) super.get((hng) obj);
        }
        return null;
    }

    @Override // defpackage.fcuj, java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof hng) ? obj2 : (hsl) Map.CC.$default$getOrDefault(this, (hng) obj, (hsl) obj2);
    }

    public final Object h(hng hngVar) {
        return hnl.b(this, hngVar);
    }

    public final hxi i(hng hngVar, hsl hslVar) {
        hwf hwfVarD = this.b.d(hngVar.hashCode(), hngVar, hslVar, 0);
        if (hwfVarD == null) {
            return this;
        }
        return new hxi(hwfVarD.a, this.c + hwfVarD.b);
    }
}
