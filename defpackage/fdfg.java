package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
class fdfg extends fdfb {
    public static final fdev b(Iterator it) {
        return fdey.c(new fdff(it));
    }

    public static final fdev c(fdev fdevVar) {
        return fdevVar instanceof fdei ? fdevVar : new fdei(fdevVar);
    }

    public static final fdev d(final fdae fdaeVar) {
        return fdey.c(new fdeu(fdaeVar, new fdap() { // from class: fdfd
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                obj.getClass();
                return fdaeVar.invoke();
            }
        }));
    }

    public static final fdev e(final Object obj, fdap fdapVar) {
        return obj == null ? fdeo.a : new fdeu(new fdae() { // from class: fdfc
            @Override // defpackage.fdae
            public final Object invoke() {
                return obj;
            }
        }, fdapVar);
    }
}
