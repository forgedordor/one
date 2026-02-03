package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cccy {
    public static final eyga a(epun epunVar, basd basdVar) {
        epunVar.getClass();
        basdVar.getClass();
        civc civcVarA = civc.a();
        if (basdVar.k()) {
            civcVarA.e(civa.MLS_NAMESPACE, "Original-Message-Id", basdVar.b);
        }
        civa civaVar = civa.MLS_NAMESPACE;
        evqs evqsVar = (epunVar.c == 4 ? (epuc) epunVar.d : epuc.a).g;
        evqsVar.getClass();
        civcVarA.e(civaVar, "Epoch-Authenticator", cccu.a(evqsVar));
        civcVarA.e(civaVar, "Era-ID", String.valueOf(epunVar.h));
        eyga eygaVarC = civcVarA.c();
        eygaVarC.getClass();
        return eygaVarC;
    }
}
