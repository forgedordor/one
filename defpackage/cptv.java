package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cptv {
    public final cpqp a;

    public cptv(cpqp cpqpVar) {
        this.a = cpqpVar;
    }

    public static Optional b(eqnd eqndVar, final String str) {
        eqns eqnsVar = eqndVar.i;
        if (eqnsVar == null) {
            eqnsVar = eqns.a;
        }
        return Collection.EL.stream(eqnsVar.b).filter(new Predicate() { // from class: cptu
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
                return ((eqnu) obj).f.equals(str);
            }
        }).findFirst();
    }

    public final eplf a(eqnd eqndVar) {
        Optional optionalB = b(eqndVar, cptl.OBJECT_PAYLOAD_PART_ENCRYPTED_RARELY_CHANGED.d);
        if (optionalB.isEmpty()) {
            return eplf.a;
        }
        evqe evqeVar = ((eqnu) optionalB.get()).g;
        if (evqeVar == null) {
            evqeVar = evqe.a;
        }
        eple epleVar = (eple) ((eplf) this.a.a((epkh) evsn.parseFrom(epkh.a, evqeVar.c), eplf.a)).toBuilder();
        String str = eqndVar.c;
        epleVar.copyOnWrite();
        eplf eplfVar = (eplf) epleVar.instance;
        str.getClass();
        eplfVar.d = str;
        return (eplf) epleVar.build();
    }
}
