package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hnl {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [hsl, java.lang.Object] */
    public static final hxi a(hpu[] hpuVarArr, hxi hxiVar, hxi hxiVar2) {
        hxh hxhVar = new hxh(hxi.d);
        for (hpu hpuVar : hpuVarArr) {
            hng hngVar = hpuVar.a;
            if (hpuVar.f || !hxiVar.containsKey(hngVar)) {
                ?? r5 = hxiVar2.get(hngVar);
                hpuVar.getClass();
                hxhVar.put(hngVar, ((hpt) hngVar).b(hpuVar, r5));
            }
        }
        return hxhVar.a();
    }

    public static final Object b(hxi hxiVar, hng hngVar) {
        hngVar.getClass();
        Object objA = hxiVar.get(hngVar);
        if (objA == null) {
            objA = hngVar.a();
        }
        return ((hsl) objA).a(hxiVar);
    }
}
