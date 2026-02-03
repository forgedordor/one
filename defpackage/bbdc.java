package defpackage;

import j$.time.Duration;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbdc {
    public final fcsu a;
    public final fcsu b;
    private final cczv c;

    public bbdc(fcsu fcsuVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        cczi ccziVarF = cdag.f(cdag.b, "country_code_cache_expiry_millis", 1000L);
        this.c = ccziVarF;
        ejxr ejxrVar = new ejxr() { // from class: bbda
            @Override // defpackage.ejxr
            public final Object get() {
                bbdc bbdcVar = this.a;
                fcsu fcsuVar3 = bbdcVar.a;
                List listM = ((crny) fcsuVar3.b()).m();
                ArrayList arrayList = new ArrayList(fcva.p(listM, 10));
                Iterator it = listM.iterator();
                while (it.hasNext()) {
                    arrayList.add(bbdcVar.a(((crof) it.next()).p()));
                }
                ArrayList arrayList2 = new ArrayList(fcva.p(listM, 10));
                Iterator it2 = listM.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(bbdcVar.a(((crof) it2.next()).s()));
                }
                crnc crncVarA = bbdcVar.a(((crny) fcsuVar3.b()).g().s());
                crnc crncVarA2 = bbdcVar.a((String) ((crny) fcsuVar3.b()).g().k().orElse(""));
                crnc crncVarA3 = bbdcVar.a(((crny) fcsuVar3.b()).g().r());
                crmu crmuVar = (crmu) ((Optional) bbdcVar.b.b()).orElse(null);
                return new bbdb(crncVarA2, crncVarA3, crncVarA, bbdcVar.a(crmuVar != null ? crmuVar.b() : null), arrayList2, arrayList);
            }
        };
        Object objE = ccziVarF.e();
        objE.getClass();
        ejxx.b(ejxrVar, Duration.ofMillis(((Number) objE).longValue()));
    }

    public final crnc a(String str) {
        if (str != null) {
            if (str.length() != 2) {
                str = null;
            }
            if (str != null) {
                crmx crmxVarG = ((crny) this.a.b()).g();
                String upperCase = str.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                crnc crncVarC = crmxVarG.c(upperCase);
                crnc crncVar = true != crncVarC.b() ? crncVarC : null;
                if (crncVar != null) {
                    return crncVar;
                }
            }
        }
        return new crnc(0);
    }
}
