package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csda {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    private final fcsu d;
    private final fdjx e;

    public csda(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fdjxVar.getClass();
        this.d = fcsuVar;
        this.a = fcsuVar2;
        this.b = fcsuVar3;
        this.c = fcsuVar4;
        this.e = fdjxVar;
    }

    public final void a(csch cschVar, csdb csdbVar, csdl csdlVar) {
        cschVar.getClass();
        csdlVar.getClass();
        eieu eieuVarH = eiiy.h("ReinforcedSpamProtectionEntrypoint.reinforceSpamClassifications");
        try {
            for (cscy cscyVar : (Set) this.d.b()) {
                if (cscyVar.a() != csdlVar) {
                    csch cschVar2 = cschVar;
                    csdb csdbVar2 = csdbVar;
                    auvw.k(this.e, null, null, new cscz(this, cschVar2, cscyVar, csdbVar2, null), 3);
                    cschVar = cschVar2;
                    csdbVar = csdbVar2;
                }
            }
            fczl.a(eieuVarH, null);
        } finally {
        }
    }
}
