package defpackage;

import android.webkit.URLUtil;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aspp {
    public final cmfo a;

    public aspp(fcsu fcsuVar) {
        cmgk cmgkVar = (cmgk) fcsuVar.b();
        cmgg cmggVarC = cmgh.c();
        cmggVarC.d(cmfn.BUSINESS_APP_DATA);
        cmggVarC.f(aspj.a);
        this.a = cmgkVar.a(cmggVarC.a());
    }

    public final eiju a() {
        return this.a.h().h(new ejvr() { // from class: aspk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                aspj aspjVar = (aspj) obj;
                if ((aspjVar.b & 1) != 0) {
                    aspr asprVar = aspjVar.c;
                    if (asprVar == null) {
                        asprVar = aspr.a;
                    }
                    if (!asprVar.b.isEmpty()) {
                        aspr asprVar2 = aspjVar.c;
                        if (asprVar2 == null) {
                            asprVar2 = aspr.a;
                        }
                        return Optional.of(asprVar2.b);
                    }
                }
                return Optional.empty();
            }
        }, eoqg.a);
    }

    public final eiju b(final String str) {
        return this.a.j(new ejvr() { // from class: aspn
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                aspq aspqVar;
                aspj aspjVar = (aspj) obj;
                if ((aspjVar.b & 1) != 0) {
                    aspr asprVar = aspjVar.c;
                    if (asprVar == null) {
                        asprVar = aspr.a;
                    }
                    aspqVar = (aspq) asprVar.toBuilder();
                } else {
                    aspqVar = (aspq) aspr.a.createBuilder();
                }
                String str2 = str;
                aspi aspiVar = (aspi) aspjVar.toBuilder();
                String strB = ejwk.b(str2);
                if (true != URLUtil.isHttpsUrl(strB)) {
                    strB = "";
                }
                aspqVar.copyOnWrite();
                ((aspr) aspqVar.instance).b = strB;
                aspiVar.copyOnWrite();
                aspj aspjVar2 = (aspj) aspiVar.instance;
                aspr asprVar2 = (aspr) aspqVar.build();
                asprVar2.getClass();
                aspjVar2.c = asprVar2;
                aspjVar2.b |= 1;
                return (aspj) aspiVar.build();
            }
        }).h(new ejvr() { // from class: aspo
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoqg.a);
    }
}
