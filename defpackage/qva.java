package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qva {
    static qsy a(qwn qwnVar, qnm qnmVar) {
        return new qsy(h(qwnVar, qnmVar, qvd.a));
    }

    public static qsz b(qwn qwnVar, qnm qnmVar) {
        return c(qwnVar, qnmVar, true);
    }

    public static qsz c(qwn qwnVar, qnm qnmVar, boolean z) {
        return new qsz(i(qwnVar, z ? qwz.a() : 1.0f, qnmVar, qvi.a));
    }

    static qta d(qwn qwnVar, qnm qnmVar, int i) {
        return new qta(h(qwnVar, qnmVar, new qvl(i)));
    }

    static qtb e(qwn qwnVar, qnm qnmVar) {
        return new qtb(h(qwnVar, qnmVar, qvo.a));
    }

    static qtd f(qwn qwnVar, qnm qnmVar) {
        return new qtd(qvr.a(qwnVar, qnmVar, qwz.a(), qvw.a, true));
    }

    static qtf g(qwn qwnVar, qnm qnmVar) {
        return new qtf(i(qwnVar, qwz.a(), qnmVar, qwc.a));
    }

    public static List h(qwn qwnVar, qnm qnmVar, qwi qwiVar) {
        return qvr.a(qwnVar, qnmVar, 1.0f, qwiVar, false);
    }

    public static List i(qwn qwnVar, float f, qnm qnmVar, qwi qwiVar) {
        return qvr.a(qwnVar, qnmVar, f, qwiVar, false);
    }
}
