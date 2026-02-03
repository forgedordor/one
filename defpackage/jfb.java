package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jfb {
    public final hum a = new hum(new jcr[16]);
    public jcr[] b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [icr] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [icr] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
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
    public final void a(jcr jcrVar) {
        if (jcrVar.aC() == 5 && !jcrVar.ak() && !jcrVar.an() && !jcrVar.B && jcrVar.f()) {
            jee jeeVar = jcrVar.v;
            if ((jeeVar.a() & 256) != 0) {
                for (icr icrVar = jeeVar.f; icrVar != null; icrVar = icrVar.w) {
                    if ((icrVar.t & 256) != 0) {
                        jbi jbiVarA = icrVar;
                        ?? humVar = 0;
                        while (jbiVarA != 0) {
                            if (jbiVarA instanceof jbr) {
                                jbr jbrVar = (jbr) jbiVarA;
                                jbrVar.dR(jbg.e(jbrVar, 256));
                            } else if ((jbiVarA.t & 256) != 0 && (jbiVarA instanceof jbi)) {
                                icr icrVar2 = jbiVarA.E;
                                int i = 0;
                                jbiVarA = jbiVarA;
                                humVar = humVar;
                                while (icrVar2 != null) {
                                    if ((icrVar2.t & 256) != 0) {
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
                    if ((icrVar.u & 256) == 0) {
                        break;
                    }
                }
            }
        }
        jcrVar.A = false;
        hum humVarQ = jcrVar.q();
        Object[] objArr = humVarQ.a;
        int i2 = humVarQ.b;
        for (int i3 = 0; i3 < i2; i3++) {
            a((jcr) objArr[i3]);
        }
    }

    public final void b(jcr jcrVar) {
        this.a.n(jcrVar);
        jcrVar.A = true;
    }
}
