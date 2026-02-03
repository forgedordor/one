package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class cghe extends cgiw {
    @Override // defpackage.cgiw
    public final eiju a(List list, Object obj) {
        return b(obj).h(new ejvr() { // from class: cghd
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                cghg cghgVar = (cghg) obj2;
                if (cghgVar == null) {
                    return null;
                }
                cgjg cgjgVarN = cgjh.n();
                cgjgVarN.f(cghgVar.d());
                ((cggn) cgjgVarN).b = cghgVar.a();
                cgjgVarN.e(cghgVar.c());
                cgjgVarN.k(cghgVar.e());
                cgjgVarN.g(cghgVar.b());
                cgjgVarN.i(cghgVar.f());
                return new cggr(ekgb.r(cgjgVarN.a()), Optional.empty());
            }
        }, eoqg.a);
    }

    public abstract eiju b(Object obj);
}
