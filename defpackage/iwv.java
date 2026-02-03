package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iwv implements izh {
    final /* synthetic */ iwy a;
    final /* synthetic */ Object b;
    private final cui c;

    public iwv(iwy iwyVar, Object obj) {
        this.a = iwyVar;
        this.b = obj;
        int[] iArr = ctm.a;
        this.c = new cui((byte[]) null);
    }

    @Override // defpackage.izh
    public final int a() {
        jcr jcrVar = (jcr) this.a.j.f(this.b);
        if (jcrVar != null) {
            return jcrVar.E().size();
        }
        return 0;
    }

    @Override // defpackage.izh
    public final void b() {
        iwy iwyVar = this.a;
        iwyVar.h();
        jcr jcrVar = (jcr) iwyVar.j.b(this.b);
        if (jcrVar != null) {
            if (iwyVar.n <= 0) {
                itw.d("No pre-composed items to dispose");
            }
            jcr jcrVar2 = iwyVar.a;
            int iIndexOf = jcrVar2.G().indexOf(jcrVar);
            if (iIndexOf < jcrVar2.G().size() - iwyVar.n) {
                itw.d("Item is not in pre-composed item range");
            }
            iwyVar.m++;
            iwyVar.n--;
            int size = (jcrVar2.G().size() - iwyVar.n) - iwyVar.m;
            iwyVar.j(iIndexOf, size);
            iwyVar.g(size);
        }
    }

    @Override // defpackage.izh
    public final void c(int i, long j) {
        iwy iwyVar = this.a;
        jcr jcrVar = (jcr) iwyVar.j.f(this.b);
        if (jcrVar == null || !jcrVar.d()) {
            return;
        }
        int size = jcrVar.E().size();
        if (i < 0 || i >= size) {
            itw.e("Index (" + i + ") is out of bound of [0, " + size + ')');
        }
        if (jcrVar.f()) {
            itw.c("Pre-measure called on node that is not placed");
        }
        jcr jcrVar2 = iwyVar.a;
        jcrVar2.n = true;
        jcv.a(jcrVar).r((jcr) jcrVar.E().get(i), j);
        jcrVar2.n = false;
        this.c.d(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [icr] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [icr] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9 */
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
    @Override // defpackage.izh
    public final void d(fdap fdapVar) {
        jee jeeVar;
        icr icrVar;
        jcr jcrVar = (jcr) this.a.j.f(this.b);
        if (jcrVar == null || (jeeVar = jcrVar.v) == null || (icrVar = jeeVar.f) == null) {
            return;
        }
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
            if ((icrVar3.u & 262144) != 0) {
                for (icr icrVar4 = icrVar3; icrVar4 != null; icrVar4 = icrVar4.w) {
                    if ((icrVar4.t & 262144) != 0) {
                        jbi jbiVarA = icrVar4;
                        ?? humVar2 = 0;
                        while (jbiVarA != 0) {
                            if (jbiVarA instanceof jgg) {
                                jgg jggVar = (jgg) jbiVarA;
                                Object objInvoke = fdbq.f("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", jggVar.dZ()) ? fdapVar.invoke(jggVar) : jgf.a;
                                if (objInvoke == jgf.c) {
                                    return;
                                }
                                if (objInvoke == jgf.b) {
                                    break;
                                }
                            } else if ((jbiVarA.t & 262144) != 0 && (jbiVarA instanceof jbi)) {
                                icr icrVar5 = jbiVarA.E;
                                int i2 = 0;
                                jbiVarA = jbiVarA;
                                humVar2 = humVar2;
                                while (icrVar5 != null) {
                                    if ((icrVar5.t & 262144) != 0) {
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

    @Override // defpackage.izh
    public final void e(int i) {
        jcr jcrVar = (jcr) this.a.j.f(this.b);
        if (jcrVar == null || !jcrVar.d()) {
            return;
        }
        int size = jcrVar.E().size();
        if (i < 0 || i >= size) {
            itw.e("Index (" + i + ") is out of bound of [0, " + size + ')');
        }
        if (this.c.a(i)) {
            ((jcr) jcrVar.E().get(i)).o();
            ((jcr) jcrVar.E().get(i)).m();
        }
    }
}
