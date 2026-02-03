package defpackage;

import j$.util.DesugarCollections;
import j$.util.Map;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjyw extends fcyz implements fdat {
    int a;
    final /* synthetic */ cjzf b;
    final /* synthetic */ dggn c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjyw(fcxy fcxyVar, cjzf cjzfVar, dggn dggnVar) {
        super(2, fcxyVar);
        this.b = cjzfVar;
        this.c = dggnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjyw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            fctl.b(obj);
        } else {
            fctl.b(obj);
            cjzf cjzfVar = this.b;
            this.d = cjzfVar;
            this.a = 1;
            obj = cjzfVar.m(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((cjzm) obj).b);
        mapUnmodifiableMap.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(fcwa.a(mapUnmodifiableMap.size()));
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            Object key = entry.getKey();
            key.getClass();
            linkedHashMap.put(new dggp((String) key), entry.getValue());
        }
        dggn dggnVar = this.c;
        dfir dfirVar = dfir.a;
        dfirVar.getClass();
        return Map.EL.getOrDefault(linkedHashMap, dggnVar, dfirVar);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cjyw cjywVar = new cjyw(fcxyVar, this.b, this.c);
        cjywVar.d = obj;
        return cjywVar;
    }
}
