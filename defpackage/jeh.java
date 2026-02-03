package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jeh implements jel {
    @Override // defpackage.jel
    public final int a() {
        return 16;
    }

    @Override // defpackage.jel
    public final void b(jcr jcrVar, long j, jbu jbuVar, int i, boolean z) {
        jcrVar.M(j, jbuVar, i, z);
    }

    @Override // defpackage.jel
    public final boolean c(jcr jcrVar) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [hum] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [hum] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [icr] */
    /* JADX WARN: Type inference failed for: r8v1, types: [icr] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [icr] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.jel
    public final void d(icr icrVar) {
        ?? humVar = 0;
        while (icrVar != 0) {
            if (icrVar instanceof jfv) {
                ((jfv) icrVar).A();
            } else if ((icrVar.t & 16) != 0 && (icrVar instanceof jbi)) {
                icr icrVar2 = icrVar.E;
                int i = 0;
                humVar = humVar;
                icrVar = icrVar;
                while (icrVar2 != null) {
                    if ((icrVar2.t & 16) != 0) {
                        i++;
                        humVar = humVar;
                        if (i == 1) {
                            icrVar = icrVar2;
                        } else {
                            if (humVar == 0) {
                                humVar = new hum(new icr[16]);
                            }
                            if (icrVar != 0) {
                                humVar.n(icrVar);
                            }
                            humVar.n(icrVar2);
                            icrVar = 0;
                        }
                    }
                    icrVar2 = icrVar2.w;
                    humVar = humVar;
                    icrVar = icrVar;
                }
                if (i != 1) {
                }
            }
            icrVar = jbg.a(humVar);
        }
    }
}
