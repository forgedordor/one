package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckkx {
    public final fcsu a;
    public final fcsu b;
    private final fdjx c;

    public ckkx(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.c = fdjxVar;
        this.a = fcsuVar;
        this.b = fcsuVar2;
    }

    public final void a(eobz eobzVar, String str) {
        auvw.k(this.c, null, null, new ckkw(this, eobzVar, str, null), 3);
    }

    public final void b(String str, int i) {
        str.getClass();
        eoby eobyVar = (eoby) eobz.a.createBuilder();
        eobyVar.getClass();
        eocg eocgVar = (eocg) eoch.a.createBuilder();
        eocgVar.getClass();
        eocd eocdVar = (eocd) eocf.a.createBuilder();
        eocdVar.getClass();
        eocdVar.copyOnWrite();
        eocf eocfVar = (eocf) eocdVar.instance;
        eocfVar.c = i - 1;
        eocfVar.b |= 1;
        evsn evsnVarBuild = eocdVar.build();
        evsnVarBuild.getClass();
        eocgVar.copyOnWrite();
        eoch eochVar = (eoch) eocgVar.instance;
        eochVar.c = (eocf) evsnVarBuild;
        eochVar.b = 3;
        eoca.b(eoci.a(eocgVar), eobyVar);
        a(eoca.a(eobyVar), str);
    }

    public final void c(String str, int i) {
        eoby eobyVar = (eoby) eobz.a.createBuilder();
        eobyVar.getClass();
        eocl eoclVar = (eocl) eocn.a.createBuilder();
        eoclVar.getClass();
        eoclVar.copyOnWrite();
        eocn eocnVar = (eocn) eoclVar.instance;
        eocnVar.c = i - 1;
        eocnVar.b |= 1;
        evsn evsnVarBuild = eoclVar.build();
        evsnVarBuild.getClass();
        eobyVar.copyOnWrite();
        eobz eobzVar = (eobz) eobyVar.instance;
        eobzVar.c = (eocn) evsnVarBuild;
        eobzVar.b = 3;
        a(eoca.a(eobyVar), str);
    }
}
