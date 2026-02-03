package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class assb {
    public final atau a;
    public final atah b;
    public final asry c;
    private final fcsu d;
    private final eygg e;
    private final fcsu f;
    private final cqbm g;
    private final asrf h;

    public assb(fcsu fcsuVar, eygg eyggVar, fcsu fcsuVar2, cqbm cqbmVar, asrf asrfVar, atau atauVar, atah atahVar, asry asryVar) {
        this.d = fcsuVar;
        this.e = eyggVar;
        this.f = fcsuVar2;
        this.g = cqbmVar;
        this.h = asrfVar;
        this.a = atauVar;
        this.b = atahVar;
        this.c = asryVar;
    }

    public final ellv a(String str) {
        ellv ellvVar = (ellv) elmc.b.createBuilder();
        ellvVar.copyOnWrite();
        elmc elmcVar = (elmc) ellvVar.instance;
        str.getClass();
        elmcVar.c |= 64;
        elmcVar.j = str;
        elpy elpyVarA = ((aimw) this.e.b()).a(((chvg) this.f.b()).a(chvn.h));
        ellvVar.copyOnWrite();
        elmc elmcVar2 = (elmc) ellvVar.instance;
        elmcVar2.g = elpyVarA;
        elmcVar2.c |= 8;
        enwr enwrVarD = ((chza) this.g.a()).d();
        ellvVar.copyOnWrite();
        elmc elmcVar3 = (elmc) ellvVar.instance;
        elmcVar3.h = enwrVarD.N;
        elmcVar3.c |= 16;
        return ellvVar;
    }

    public final void b(elmc elmcVar) {
        aill aillVar = (aill) this.d.b();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        elof elofVar = (elof) elpg.b.createBuilder();
        enyw enywVarA = this.h.a();
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        elpgVar.Y = enywVarA.h;
        elpgVar.d |= 2097152;
        elpg elpgVar2 = (elpg) elofVar.build();
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        elpgVar2.getClass();
        ellhVar.l = elpgVar2;
        ellhVar.b |= 4;
        ellf ellfVar = ellf.BUGLE_GROUP;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        ellhVar2.j = ellfVar.f11do;
        ellhVar2.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar3 = (ellh) ellgVar.instance;
        elmcVar.getClass();
        ellhVar3.B = elmcVar;
        ellhVar3.b |= 4194304;
        aillVar.j(ellgVar);
    }

    public final void c(String str, int i, enxk enxkVar, enxi enxiVar, auib auibVar) {
        ellv ellvVarA = a(str);
        ellvVarA.copyOnWrite();
        elmc elmcVar = (elmc) ellvVarA.instance;
        evsy evsyVar = elmc.a;
        elmcVar.d = 14;
        elmcVar.c |= 1;
        ellvVarA.copyOnWrite();
        elmc elmcVar2 = (elmc) ellvVarA.instance;
        elmcVar2.e = 2;
        elmcVar2.c = 2 | elmcVar2.c;
        enrs enrsVar = (enrs) enru.a.createBuilder();
        fhaz fhazVar = (fhaz) this.a.fH().fM(auibVar);
        enrsVar.copyOnWrite();
        enru enruVar = (enru) enrsVar.instance;
        fhazVar.getClass();
        enruVar.c = fhazVar;
        enruVar.b |= 1;
        enxt enxtVar = (enxt) enxu.a.createBuilder();
        enxv enxvVar = (enxv) enxw.a.createBuilder();
        enxvVar.copyOnWrite();
        enxw enxwVar = (enxw) enxvVar.instance;
        enxwVar.e = i - 1;
        enxwVar.b |= 4;
        enxvVar.copyOnWrite();
        enxw enxwVar2 = (enxw) enxvVar.instance;
        enxwVar2.g = enxkVar.f;
        enxwVar2.b |= 16;
        enxvVar.copyOnWrite();
        enxw enxwVar3 = (enxw) enxvVar.instance;
        enxwVar3.f = enxiVar.D;
        enxwVar3.b |= 8;
        enxtVar.copyOnWrite();
        enxu enxuVar = (enxu) enxtVar.instance;
        enxw enxwVar4 = (enxw) enxvVar.build();
        enxwVar4.getClass();
        enxuVar.c = enxwVar4;
        enxuVar.b |= 1;
        enrsVar.copyOnWrite();
        enru enruVar2 = (enru) enrsVar.instance;
        enxu enxuVar2 = (enxu) enxtVar.build();
        enxuVar2.getClass();
        enruVar2.e = enxuVar2;
        enruVar2.b |= 4;
        ellvVarA.copyOnWrite();
        elmc elmcVar3 = (elmc) ellvVarA.instance;
        enru enruVar3 = (enru) enrsVar.build();
        enruVar3.getClass();
        elmcVar3.n = enruVar3;
        elmcVar3.c |= 16384;
        b((elmc) ellvVarA.build());
    }
}
