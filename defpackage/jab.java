package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jab {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [icr] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [icr] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [hum] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [hum] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static Object a(jac jacVar, izw izwVar) {
        jee jeeVar;
        if (!jacVar.D().C) {
            itw.c("ModifierLocal accessed from an unattached node");
        }
        if (!jacVar.D().C) {
            itw.d("visitAncestors called on an unattached node");
        }
        icr icrVar = jacVar.D().v;
        jcr jcrVarD = jbg.d(jacVar);
        while (jcrVarD != null) {
            if ((jcrVarD.v.f.u & 32) != 0) {
                while (icrVar != null) {
                    if ((icrVar.t & 32) != 0) {
                        jbi jbiVarA = icrVar;
                        ?? humVar = 0;
                        while (jbiVarA != 0) {
                            if (jbiVarA instanceof jac) {
                                jac jacVar2 = (jac) jbiVarA;
                                if (jacVar2.p().c(izwVar)) {
                                    return jacVar2.p().a(izwVar);
                                }
                            } else if ((jbiVarA.t & 32) != 0 && (jbiVarA instanceof jbi)) {
                                icr icrVar2 = jbiVarA.E;
                                int i = 0;
                                jbiVarA = jbiVarA;
                                humVar = humVar;
                                while (icrVar2 != null) {
                                    if ((icrVar2.t & 32) != 0) {
                                        i++;
                                        humVar = humVar;
                                        if (i == 1) {
                                            jbiVarA = icrVar2;
                                        } else {
                                            if (humVar == 0) {
                                                humVar = new hum(new icr[16]);
                                            }
                                            if (jbiVarA != 0) {
                                                humVar.n(jbiVarA);
                                            }
                                            humVar.n(icrVar2);
                                            jbiVarA = 0;
                                        }
                                    }
                                    icrVar2 = icrVar2.w;
                                    jbiVarA = jbiVarA;
                                    humVar = humVar;
                                }
                                if (i != 1) {
                                }
                            }
                            jbiVarA = jbg.a(humVar);
                        }
                    }
                    icrVar = icrVar.v;
                }
            }
            jcrVarD = jcrVarD.s();
            icrVar = (jcrVarD == null || (jeeVar = jcrVarD.v) == null) ? null : jeeVar.e;
        }
        return izwVar.a.invoke();
    }
}
