package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cock {
    public static final fctc a = fctd.a(new fdae() { // from class: coch
        @Override // defpackage.fdae
        public final Object invoke() {
            fctc fctcVar = cock.a;
            return new cocp(new fdat() { // from class: coci
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    cnyz cnyzVar = (cnyz) obj;
                    Collection collection = (Collection) obj2;
                    fctc fctcVar2 = cock.a;
                    cnyzVar.getClass();
                    collection.getClass();
                    boolean z = false;
                    if (cobt.c(collection) && cobt.f(cnyzVar)) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            }, new fdat() { // from class: cocj
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    cnyz cnyzVar = (cnyz) obj;
                    Collection collection = (Collection) obj2;
                    fctc fctcVar2 = cock.a;
                    cnyzVar.getClass();
                    collection.getClass();
                    boolean z = false;
                    Object obj3 = null;
                    for (Object obj4 : collection) {
                        if (cobt.f((cnyz) obj4)) {
                            if (z) {
                                throw new IllegalArgumentException("Collection contains more than one matching element.");
                            }
                            z = true;
                            obj3 = obj4;
                        }
                    }
                    if (!z) {
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    cnyz cnyzVar2 = (cnyz) obj3;
                    cnyu cnyuVar = (cnyu) cnyzVar2.toBuilder();
                    cnyuVar.getClass();
                    cnyq cnyqVar = (cnyq) cnzi.a(cnyuVar).toBuilder();
                    cnyqVar.getClass();
                    evvp evvpVar = ((cnyr) cnyqVar.instance).c;
                    if (evvpVar == null) {
                        evvpVar = evvp.a;
                    }
                    evvpVar.getClass();
                    evvp evvpVar2 = (cnyzVar.c == 4 ? (cnyr) cnyzVar.d : cnyr.a).c;
                    if (evvpVar2 == null) {
                        evvpVar2 = evvp.a;
                    }
                    evvpVar2.getClass();
                    cnzg.b(cobu.a(evvpVar, evvpVar2), cnyqVar);
                    cnzi.e(cnzg.a(cnyqVar), cnyuVar);
                    cnyz cnyzVarC = cnzi.c(cnyuVar);
                    List listAi = fcva.ai(fcva.ag(collection, cnyzVar2), cnyzVarC);
                    evqs evqsVar = cnyzVarC.e;
                    evqsVar.getClass();
                    return new cobx(listAi, 4, fcva.b(new cobv(cnyzVar, evqsVar)));
                }
            });
        }
    });
}
