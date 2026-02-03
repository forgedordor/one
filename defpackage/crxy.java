package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crxy {
    public final fcsu a;
    public final fcsu b;
    public final fdjx c;
    public final fdjx d;

    public crxy(fcsu fcsuVar, fcsu fcsuVar2, fdjx fdjxVar, fdjx fdjxVar2) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fdjxVar;
        this.d = fdjxVar2;
    }

    public static final eoel a(csdl csdlVar, eoeo eoeoVar, int i) {
        eoen eoenVar = (eoen) eoep.a.createBuilder();
        eoenVar.copyOnWrite();
        eoep eoepVar = (eoep) eoenVar.instance;
        eoepVar.e = eoeoVar.a();
        eoepVar.b |= 1;
        if (eoeoVar == eoeo.RECLASSIFICATION) {
            eoex eoexVar = (eoex) eoey.a.createBuilder();
            eoexVar.copyOnWrite();
            eoey eoeyVar = (eoey) eoexVar.instance;
            eoeyVar.b |= 1;
            eoeyVar.c = i;
            eoenVar.copyOnWrite();
            eoep eoepVar2 = (eoep) eoenVar.instance;
            eoey eoeyVar2 = (eoey) eoexVar.build();
            eoeyVar2.getClass();
            eoepVar2.d = eoeyVar2;
            eoepVar2.c = 2;
        }
        eoel eoelVar = (eoel) eoem.a.createBuilder();
        eofd eofdVarA = csdlVar.a();
        eoelVar.copyOnWrite();
        eoem eoemVar = (eoem) eoelVar.instance;
        eoemVar.c = eofdVarA.a();
        eoemVar.b |= 1;
        eoelVar.copyOnWrite();
        eoem eoemVar2 = (eoem) eoelVar.instance;
        eoep eoepVar3 = (eoep) eoenVar.build();
        eoepVar3.getClass();
        eoemVar2.d = eoepVar3;
        eoemVar2.b |= 2;
        return eoelVar;
    }
}
