package defpackage;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coco {
    public static final cczi a = cdag.f(cdag.b, "forward_sync_max_merged_spot_syncs", 20);
    public static final fctc b = fctd.a(new fdae() { // from class: cocn
        @Override // defpackage.fdae
        public final Object invoke() {
            cczi ccziVar = coco.a;
            return new cocp(new fdat() { // from class: cocl
                /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
                @Override // defpackage.fdat
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object a(java.lang.Object r7, java.lang.Object r8) {
                    /*
                        r6 = this;
                        cnyz r7 = (defpackage.cnyz) r7
                        java.util.Collection r8 = (java.util.Collection) r8
                        cczi r0 = defpackage.coco.a
                        r7.getClass()
                        r8.getClass()
                        boolean r0 = defpackage.cobt.g(r7)
                        r1 = 0
                        if (r0 == 0) goto L5a
                        boolean r0 = defpackage.cobt.d(r8)
                        if (r0 == 0) goto L5a
                        boolean r0 = defpackage.cobt.c(r8)
                        r2 = 1
                        if (r0 == 0) goto L59
                        java.util.Iterator r8 = r8.iterator()
                        r0 = 0
                        r3 = r1
                    L26:
                        boolean r4 = r8.hasNext()
                        if (r4 == 0) goto L46
                        java.lang.Object r4 = r8.next()
                        r5 = r4
                        cnyz r5 = (defpackage.cnyz) r5
                        boolean r5 = defpackage.cobt.f(r5)
                        if (r5 == 0) goto L26
                        if (r3 != 0) goto L3e
                        r3 = r2
                        r0 = r4
                        goto L26
                    L3e:
                        java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                        java.lang.String r8 = "Collection contains more than one matching element."
                        r7.<init>(r8)
                        throw r7
                    L46:
                        if (r3 == 0) goto L51
                        cnyz r0 = (defpackage.cnyz) r0
                        boolean r7 = defpackage.cocb.c(r0, r7)
                        if (r7 == 0) goto L59
                        goto L5a
                    L51:
                        java.util.NoSuchElementException r7 = new java.util.NoSuchElementException
                        java.lang.String r8 = "Collection contains no element matching the predicate."
                        r7.<init>(r8)
                        throw r7
                    L59:
                        r1 = r2
                    L5a:
                        java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.cocl.a(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, new fdat() { // from class: cocm
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    cnyz cnyzVar = (cnyz) obj;
                    Collection collection = (Collection) obj2;
                    cczi ccziVar2 = coco.a;
                    cnyzVar.getClass();
                    collection.getClass();
                    boolean z = false;
                    Object obj3 = null;
                    for (Object obj4 : collection) {
                        if (cobt.g((cnyz) obj4)) {
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
                    DesugarCollections.unmodifiableList(((cnyz) cnyuVar.instance).h).getClass();
                    cnyuVar.copyOnWrite();
                    cnyz cnyzVar3 = (cnyz) cnyuVar.instance;
                    cnyzVar3.a();
                    cnyzVar3.h.add(cnyzVar);
                    cnys cnysVar = (cnys) cnzi.b(cnyuVar).toBuilder();
                    cnysVar.getClass();
                    evvp evvpVar = ((cnyt) cnysVar.instance).e;
                    if (evvpVar == null) {
                        evvpVar = evvp.a;
                    }
                    evvpVar.getClass();
                    evvp evvpVar2 = (cnyzVar.c == 5 ? (cnyt) cnyzVar.d : cnyt.a).d;
                    if (evvpVar2 == null) {
                        evvpVar2 = evvp.a;
                    }
                    evvpVar2.getClass();
                    cnzh.c(cobu.a(evvpVar, evvpVar2), cnysVar);
                    evvp evvpVar3 = ((cnyt) cnysVar.instance).f;
                    if (evvpVar3 == null) {
                        evvpVar3 = evvp.a;
                    }
                    evvpVar3.getClass();
                    evvp evvpVar4 = (cnyzVar.c == 5 ? (cnyt) cnyzVar.d : cnyt.a).d;
                    if (evvpVar4 == null) {
                        evvpVar4 = evvp.a;
                    }
                    evvpVar4.getClass();
                    evvp evvpVar5 = evxc.a;
                    evxb evxbVar = evxb.a;
                    evxbVar.getClass();
                    if (evxbVar.compare(evvpVar3, evvpVar4) < 0) {
                        evvpVar3 = evvpVar4;
                    }
                    cnzh.d(evvpVar3, cnysVar);
                    cnzi.f(cnzh.a(cnysVar), cnyuVar);
                    cnyz cnyzVarC = cnzi.c(cnyuVar);
                    List listAi = fcva.ai(fcva.ag(collection, cnyzVar2), cnyzVarC);
                    evqs evqsVar = cnyzVarC.e;
                    evqsVar.getClass();
                    return new cobx(listAi, 7, fcva.b(new cobv(cnyzVar, evqsVar)), ((long) cnyzVarC.h.size()) >= ((Number) coco.a.e()).longValue() ? enqq.TOO_MANY_SPOT_SYNCS : null);
                }
            });
        }
    });
}
