package defpackage;

import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgoa implements cgkq {
    @Override // defpackage.cgkq
    public final /* bridge */ /* synthetic */ cgkl a(Object obj) {
        cgpd cgpdVar = (cgpd) obj;
        cgkk cgkkVar = (cgkk) cgkl.a.createBuilder();
        cglf cglfVar = cglf.NT_INCOMING_MESSAGE;
        cgkkVar.copyOnWrite();
        cgkl cgklVar = (cgkl) cgkkVar.instance;
        cgklVar.e = cglfVar.j;
        cgklVar.b |= 1;
        cgkkVar.copyOnWrite();
        cgkl cgklVar2 = (cgkl) cgkkVar.instance;
        cgpdVar.getClass();
        cgklVar2.d = cgpdVar;
        cgklVar2.c = 3;
        return (cgkl) cgkkVar.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cgkq
    public final ekgb b(ekgb ekgbVar) {
        int i;
        ejwl.a(!ekgbVar.isEmpty());
        cgkk cgkkVar = (cgkk) cgkl.a.createBuilder();
        int i2 = 0;
        cglf cglfVarB = cglf.b(((cgkl) ekgbVar.get(0)).e);
        if (cglfVarB == null) {
            cglfVarB = cglf.NT_UNKNOWN;
        }
        cgkkVar.copyOnWrite();
        cgkl cgklVar = (cgkl) cgkkVar.instance;
        cgklVar.e = cglfVarB.j;
        cgklVar.b |= 1;
        boolean zAllMatch = Collection.EL.stream(ekgbVar).allMatch(new Predicate() { // from class: cgnx
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((cgkl) obj).f;
            }
        });
        cgkkVar.copyOnWrite();
        cgkl cgklVar2 = (cgkl) cgkkVar.instance;
        cgklVar2.b |= 2;
        cgklVar2.f = zAllMatch;
        ekgb ekgbVar2 = (ekgb) Collection.EL.stream(ekgbVar).filter(new Predicate() { // from class: cgny
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((cgkl) obj).c == 3;
            }
        }).map(new Function() { // from class: cgnz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cgkl cgklVar3 = (cgkl) obj;
                return cgklVar3.c == 3 ? (cgpd) cgklVar3.d : cgpd.a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(ekcv.a);
        cgpb cgpbVar = (cgpb) cgpd.a.createBuilder();
        boolean zAnyMatch = Collection.EL.stream(ekgbVar2).anyMatch(new Predicate() { // from class: cgnu
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((cgpd) obj).e;
            }
        });
        cgpbVar.copyOnWrite();
        cgpd cgpdVar = (cgpd) cgpbVar.instance;
        cgpdVar.b |= 2;
        cgpdVar.e = zAnyMatch;
        boolean zAnyMatch2 = Collection.EL.stream(ekgbVar2).anyMatch(new Predicate() { // from class: cgnv
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((cgpd) obj).d;
            }
        });
        cgpbVar.copyOnWrite();
        cgpd cgpdVar2 = (cgpd) cgpbVar.instance;
        cgpdVar2.b |= 1;
        cgpdVar2.d = zAnyMatch2;
        boolean zAnyMatch3 = Collection.EL.stream(ekgbVar2).anyMatch(new Predicate() { // from class: cgnw
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((cgpd) obj).f;
            }
        });
        cgpbVar.copyOnWrite();
        cgpd cgpdVar3 = (cgpd) cgpbVar.instance;
        cgpdVar3.b |= 4;
        cgpdVar3.f = zAnyMatch3;
        HashMap map = new HashMap();
        int size = ekgbVar2.size();
        while (i2 < size) {
            Iterator it = DesugarCollections.unmodifiableMap(((cgpd) ekgbVar2.get(i2)).c).entrySet().iterator();
            while (true) {
                i = i2 + 1;
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    cgos cgosVar = (cgos) ((cgov) entry.getValue()).toBuilder();
                    cgov cgovVar = (cgov) map.get(entry.getKey());
                    if (cgovVar != null) {
                        long jMin = Math.min(((cgov) cgosVar.instance).c, cgovVar.c);
                        cgosVar.copyOnWrite();
                        cgov cgovVar2 = (cgov) cgosVar.instance;
                        cgovVar2.b |= 1;
                        cgovVar2.c = jMin;
                    }
                    map.put((String) entry.getKey(), (cgov) cgosVar.build());
                }
            }
            i2 = i;
        }
        ekgp ekgpVarJ = ekgp.j(map);
        cgpbVar.copyOnWrite();
        ((cgpd) cgpbVar.instance).a().putAll(ekgpVarJ);
        cgpd cgpdVar4 = (cgpd) cgpbVar.build();
        cgkkVar.copyOnWrite();
        cgkl cgklVar3 = (cgkl) cgkkVar.instance;
        cgpdVar4.getClass();
        cgklVar3.d = cgpdVar4;
        cgklVar3.c = 3;
        return ekgb.r((cgkl) cgkkVar.build());
    }

    @Override // defpackage.cgkq
    public final /* synthetic */ Object c(cgkl cgklVar) {
        return cgklVar.c == 3 ? (cgpd) cgklVar.d : cgpd.a;
    }
}
