package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class izz {
    public final hum a = new hum(new jap[16]);
    public final hum b = new hum(new izw[16]);
    public final hum c = new hum(new jcr[16]);
    public final hum d = new hum(new izw[16]);
    public boolean e;
    private final jfh f;

    public izz(jfh jfhVar) {
        this.f = jfhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [icr] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [icr] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [hum] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [hum] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final void b(icr icrVar, izw izwVar, Set set) {
        if (!icrVar.D().C) {
            itw.d("visitSubtreeIf called on an unattached node");
        }
        hum humVar = new hum(new icr[16]);
        icr icrVar2 = icrVar.D().w;
        if (icrVar2 == null) {
            jbg.j(humVar, icrVar.D());
        } else {
            humVar.n(icrVar2);
        }
        while (true) {
            int i = humVar.b;
            if (i == 0) {
                return;
            }
            icr icrVar3 = (icr) humVar.c(i - 1);
            if ((icrVar3.u & 32) != 0) {
                for (icr icrVar4 = icrVar3; icrVar4 != null; icrVar4 = icrVar4.w) {
                    if ((icrVar4.t & 32) != 0) {
                        jbi jbiVarA = icrVar4;
                        ?? humVar2 = 0;
                        while (jbiVarA != 0) {
                            if (jbiVarA instanceof jac) {
                                jac jacVar = (jac) jbiVarA;
                                if (jacVar instanceof jap) {
                                    jap japVar = (jap) jacVar;
                                    if ((japVar.a instanceof izx) && japVar.c.contains(izwVar)) {
                                        set.add(jacVar);
                                    }
                                }
                                if (jacVar.p().c(izwVar)) {
                                    break;
                                }
                            } else if ((jbiVarA.t & 32) != 0 && (jbiVarA instanceof jbi)) {
                                icr icrVar5 = jbiVarA.E;
                                int i2 = 0;
                                jbiVarA = jbiVarA;
                                humVar2 = humVar2;
                                while (icrVar5 != null) {
                                    if ((icrVar5.t & 32) != 0) {
                                        i2++;
                                        humVar2 = humVar2;
                                        if (i2 == 1) {
                                            jbiVarA = icrVar5;
                                        } else {
                                            if (humVar2 == 0) {
                                                humVar2 = new hum(new icr[16]);
                                            }
                                            if (jbiVarA != 0) {
                                                humVar2.n(jbiVarA);
                                            }
                                            humVar2.n(icrVar5);
                                            jbiVarA = 0;
                                        }
                                    }
                                    icrVar5 = icrVar5.w;
                                    jbiVarA = jbiVarA;
                                    humVar2 = humVar2;
                                }
                                if (i2 != 1) {
                                }
                            }
                            jbiVarA = jbg.a(humVar2);
                        }
                    }
                }
            }
            jbg.j(humVar, icrVar3);
        }
    }

    public final void a() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.f.x(new izy(this));
    }
}
