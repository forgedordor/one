package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ivs {
    public static final ctj a;
    public static final cuh b;
    private static final String c = "androidx.compose.ui.layout.WindowInsetsRulers";

    static {
        cuh cuhVar = new cuh(8);
        iud iudVar = ivr.a;
        cuhVar.f(1, ivr.f);
        cuhVar.f(2, ivr.e);
        cuhVar.f(4, ivr.a);
        cuhVar.f(8, ivr.c);
        cuhVar.f(16, ivr.g);
        cuhVar.f(32, ivr.d);
        cuhVar.f(64, ivr.h);
        a = cuhVar;
        cuh cuhVar2 = new cuh(7);
        cuhVar2.f(1, ivr.f);
        cuhVar2.f(2, ivr.e);
        cuhVar2.f(4, ivr.a);
        cuhVar2.f(16, ivr.g);
        cuhVar2.f(64, ivr.h);
        cuhVar2.f(32, ivr.d);
        cuhVar2.f(8, ivr.c);
        b = cuhVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [icr] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [icr] */
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
    public static final void a(ivy ivyVar) {
        icr icrVarA;
        ivy ivyVarG = ivyVar != null ? ivz.g(ivyVar) : null;
        for (jer jerVar = ivyVarG instanceof jer ? (jer) ivyVarG : null; jerVar != null; jerVar = jerVar.w) {
            boolean zH = jet.h(262144);
            if (zH) {
                icrVarA = jerVar.A();
            } else {
                icrVarA = jerVar.A().v;
                if (icrVarA == null) {
                    continue;
                }
            }
            for (icr icrVarAd = jerVar.ad(zH); icrVarAd != null && (icrVarAd.u & 262144) != 0; icrVarAd = icrVarAd.w) {
                if ((icrVarAd.t & 262144) != 0) {
                    ?? humVar = 0;
                    jbi jbiVarA = icrVarAd;
                    while (jbiVarA != 0) {
                        if (jbiVarA instanceof jgg) {
                            jgg jggVar = (jgg) jbiVarA;
                            if (jggVar.dZ() == c) {
                                throw null;
                            }
                        } else if ((jbiVarA.t & 262144) != 0 && (jbiVarA instanceof jbi)) {
                            icr icrVar = jbiVarA.E;
                            int i = 0;
                            jbiVarA = jbiVarA;
                            humVar = humVar;
                            while (icrVar != null) {
                                if ((icrVar.t & 262144) != 0) {
                                    i++;
                                    humVar = humVar;
                                    if (i == 1) {
                                        jbiVarA = icrVar;
                                    } else {
                                        if (humVar == 0) {
                                            humVar = new hum(new icr[16]);
                                        }
                                        if (jbiVarA != 0) {
                                            humVar.n(jbiVarA);
                                        }
                                        humVar.n(icrVar);
                                        jbiVarA = 0;
                                    }
                                }
                                icrVar = icrVar.w;
                                jbiVarA = jbiVarA;
                                humVar = humVar;
                            }
                            if (i != 1) {
                            }
                        }
                        jbiVarA = jbg.a(humVar);
                    }
                }
                if (icrVarAd != icrVarA) {
                }
            }
        }
    }
}
