package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jcq extends fdbr implements fdae {
    final /* synthetic */ jcr a;
    final /* synthetic */ fdci b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcq(jcr jcrVar, fdci fdciVar) {
        super(0);
        this.a = jcrVar;
        this.b = fdciVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [icr] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [icr] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
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
    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        jee jeeVar = this.a.v;
        if ((jeeVar.a() & 8) != 0) {
            for (icr icrVar = jeeVar.e; icrVar != null; icrVar = icrVar.v) {
                if ((icrVar.t & 8) != 0) {
                    jbi jbiVarA = icrVar;
                    ?? humVar = 0;
                    while (jbiVarA != 0) {
                        if (jbiVarA instanceof jfy) {
                            fdci fdciVar = this.b;
                            jfy jfyVar = (jfy) jbiVarA;
                            if (jfyVar.dP()) {
                                fdciVar.a = new jsc();
                                ((jsc) fdciVar.a).c = true;
                            }
                            if (jfyVar.u()) {
                                ((jsc) fdciVar.a).b = true;
                            }
                            jfyVar.dQ((jto) fdciVar.a);
                        } else if ((jbiVarA.t & 8) != 0 && (jbiVarA instanceof jbi)) {
                            icr icrVar2 = jbiVarA.E;
                            int i = 0;
                            jbiVarA = jbiVarA;
                            humVar = humVar;
                            while (icrVar2 != null) {
                                if ((icrVar2.t & 8) != 0) {
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
            }
        }
        return fctx.a;
    }
}
