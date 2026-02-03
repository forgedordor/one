package defpackage;

import java.util.LinkedHashMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awit extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ awiz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awit(awiz awizVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = awizVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awit) c((Set) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            Set set = (Set) this.b;
            awjc awjcVar = (awjc) this.c.c.b();
            this.a = 1;
            obj = awjcVar.a(set, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        awiz awizVar = this.c;
        Iterable<awjb> iterable = (Iterable) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(iterable, 10)), 16));
        for (awjb awjbVar : iterable) {
            fcti fctiVar = new fcti(awjbVar.c, awjbVar.a);
            linkedHashMap.put(fctiVar.a, fctiVar.b);
        }
        awizVar.b.g(linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(iterable, 10)), 16));
        for (Object obj2 : iterable) {
            linkedHashMap2.put(((awjb) obj2).a, obj2);
        }
        return linkedHashMap2;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        awit awitVar = new awit(this.c, fcxyVar);
        awitVar.b = obj;
        return awitVar;
    }
}
