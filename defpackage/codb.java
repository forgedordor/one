package defpackage;

import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class codb {
    public static final fctc a = fctd.a(new fdae() { // from class: coda
        @Override // defpackage.fdae
        public final Object invoke() {
            fctc fctcVar = codb.a;
            return new cocp(new fdat() { // from class: cocy
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    Collection collection = (Collection) obj2;
                    fctc fctcVar2 = codb.a;
                    ((cnyz) obj).getClass();
                    collection.getClass();
                    return Boolean.valueOf(cobt.b(collection));
                }
            }, new fdat() { // from class: cocz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    cnyz cnyzVar = (cnyz) obj;
                    Collection collection = (Collection) obj2;
                    fctc fctcVar2 = codb.a;
                    cnyzVar.getClass();
                    collection.getClass();
                    cnyz cnyzVar2 = (cnyz) fcva.M(collection);
                    List listB = fcva.b(cnyzVar2);
                    evqs evqsVar = cnyzVar2.e;
                    evqsVar.getClass();
                    return new cobx(listB, 2, fcva.b(new cobv(cnyzVar, evqsVar)));
                }
            });
        }
    });
}
