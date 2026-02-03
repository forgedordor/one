package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jgh {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [icr] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [icr] */
    /* JADX WARN: Type inference failed for: r3v9 */
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
    public static final jgg a(jgg jggVar) {
        jee jeeVar;
        if (!jggVar.D().C) {
            itw.d("visitAncestors called on an unattached node");
        }
        icr icrVar = jggVar.D().v;
        jcr jcrVarD = jbg.d(jggVar);
        while (jcrVarD != null) {
            if ((jcrVarD.v.f.u & 262144) != 0) {
                while (icrVar != null) {
                    if ((icrVar.t & 262144) != 0) {
                        jbi jbiVarA = icrVar;
                        ?? humVar = 0;
                        while (jbiVarA != 0) {
                            if (jbiVarA instanceof jgg) {
                                jgg jggVar2 = (jgg) jbiVarA;
                                if (fdbq.f(jggVar.dZ(), jggVar2.dZ()) && ibv.a(jggVar, jggVar2)) {
                                    return jggVar2;
                                }
                            } else if ((jbiVarA.t & 262144) != 0 && (jbiVarA instanceof jbi)) {
                                icr icrVar2 = jbiVarA.E;
                                int i = 0;
                                jbiVarA = jbiVarA;
                                humVar = humVar;
                                while (icrVar2 != null) {
                                    if ((icrVar2.t & 262144) != 0) {
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
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [icr] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [icr] */
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
    public static final void b(jgg jggVar, fdap fdapVar) {
        jee jeeVar;
        if (!jggVar.D().C) {
            itw.d("visitAncestors called on an unattached node");
        }
        icr icrVar = jggVar.D().v;
        jcr jcrVarD = jbg.d(jggVar);
        while (jcrVarD != null) {
            if ((jcrVarD.v.f.u & 262144) != 0) {
                while (icrVar != null) {
                    if ((icrVar.t & 262144) != 0) {
                        jbi jbiVarA = icrVar;
                        ?? humVar = 0;
                        while (jbiVarA != 0) {
                            if (jbiVarA instanceof jgg) {
                                jgg jggVar2 = (jgg) jbiVarA;
                                if (fdbq.f(jggVar.dZ(), jggVar2.dZ()) && ibv.a(jggVar, jggVar2) && !((Boolean) fdapVar.invoke(jggVar2)).booleanValue()) {
                                    return;
                                }
                            } else if ((jbiVarA.t & 262144) != 0 && (jbiVarA instanceof jbi)) {
                                icr icrVar2 = jbiVarA.E;
                                int i = 0;
                                jbiVarA = jbiVarA;
                                humVar = humVar;
                                while (icrVar2 != null) {
                                    if ((icrVar2.t & 262144) != 0) {
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [icr] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [icr] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [hum] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [hum] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final void c(jbf jbfVar, Object obj, fdap fdapVar) {
        jee jeeVar;
        if (!jbfVar.D().C) {
            itw.d("visitAncestors called on an unattached node");
        }
        icr icrVar = jbfVar.D().v;
        jcr jcrVarD = jbg.d(jbfVar);
        while (jcrVarD != null) {
            if ((jcrVarD.v.f.u & 262144) != 0) {
                while (icrVar != null) {
                    if ((icrVar.t & 262144) != 0) {
                        jbi jbiVarA = icrVar;
                        ?? humVar = 0;
                        while (jbiVarA != 0) {
                            if (jbiVarA instanceof jgg) {
                                jgg jggVar = (jgg) jbiVarA;
                                if (fdbq.f(obj, jggVar.dZ()) && !((Boolean) fdapVar.invoke(jggVar)).booleanValue()) {
                                    return;
                                }
                            } else if ((jbiVarA.t & 262144) != 0 && (jbiVarA instanceof jbi)) {
                                icr icrVar2 = jbiVarA.E;
                                int i = 0;
                                jbiVarA = jbiVarA;
                                humVar = humVar;
                                while (icrVar2 != null) {
                                    if ((icrVar2.t & 262144) != 0) {
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [icr] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [icr] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [hum] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [hum] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void d(jgg jggVar, fdap fdapVar) {
        if (!jggVar.D().C) {
            itw.d("visitSubtreeIf called on an unattached node");
        }
        hum humVar = new hum(new icr[16]);
        icr icrVar = jggVar.D().w;
        if (icrVar == null) {
            jbg.j(humVar, jggVar.D());
        } else {
            humVar.n(icrVar);
        }
        while (true) {
            int i = humVar.b;
            if (i == 0) {
                return;
            }
            icr icrVar2 = (icr) humVar.c(i - 1);
            if ((icrVar2.u & 262144) != 0) {
                for (icr icrVar3 = icrVar2; icrVar3 != null; icrVar3 = icrVar3.w) {
                    if ((icrVar3.t & 262144) != 0) {
                        jbi jbiVarA = icrVar3;
                        ?? humVar2 = 0;
                        while (jbiVarA != 0) {
                            if (jbiVarA instanceof jgg) {
                                jgg jggVar2 = (jgg) jbiVarA;
                                jgf jgfVar = (fdbq.f(jggVar.dZ(), jggVar2.dZ()) && ibv.a(jggVar, jggVar2)) ? (jgf) fdapVar.invoke(jggVar2) : jgf.a;
                                if (jgfVar == jgf.c) {
                                    return;
                                }
                                if (jgfVar == jgf.b) {
                                    break;
                                }
                            } else if ((jbiVarA.t & 262144) != 0 && (jbiVarA instanceof jbi)) {
                                icr icrVar4 = jbiVarA.E;
                                int i2 = 0;
                                jbiVarA = jbiVarA;
                                humVar2 = humVar2;
                                while (icrVar4 != null) {
                                    if ((icrVar4.t & 262144) != 0) {
                                        i2++;
                                        humVar2 = humVar2;
                                        if (i2 == 1) {
                                            jbiVarA = icrVar4;
                                        } else {
                                            if (humVar2 == 0) {
                                                humVar2 = new hum(new icr[16]);
                                            }
                                            if (jbiVarA != 0) {
                                                humVar2.n(jbiVarA);
                                            }
                                            humVar2.n(icrVar4);
                                            jbiVarA = 0;
                                        }
                                    }
                                    icrVar4 = icrVar4.w;
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
            jbg.j(humVar, icrVar2);
        }
    }
}
