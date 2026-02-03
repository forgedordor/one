package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfuh extends fcyz implements fdat {
    int a;
    final /* synthetic */ cfut b;
    final /* synthetic */ cfvn c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfuh(cfut cfutVar, cfvn cfvnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cfutVar;
        this.c = cfvnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfuh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdjx fdjxVar = (fdjx) this.d;
            cfut cfutVar = this.b;
            cfvn cfvnVar = this.c;
            cfvf cfvfVar = cfutVar.d;
            eywx eywxVarA = cfvfVar.b.a(cfvnVar.b, cfvnVar.c);
            ezkk ezkkVar = (ezkk) cfvnVar.a.toBuilder();
            ezkkVar.getClass();
            ezjy ezjyVar = (ezjy) ezjz.a.createBuilder();
            ezjyVar.getClass();
            long seconds = evxd.c(cfvfVar.a).toSeconds();
            ezjyVar.copyOnWrite();
            ((ezjz) ezjyVar.instance).b = seconds;
            evsn evsnVarBuild = ezjyVar.build();
            evsnVarBuild.getClass();
            ezkkVar.copyOnWrite();
            ezkl ezklVar = (ezkl) ezkkVar.instance;
            ezklVar.d = (ezjz) evsnVarBuild;
            ezklVar.b |= 4;
            fdtm fdtmVar = new fdtm(new fdqz(new cfuc(cfutVar, fdjxVar, cfvnVar, null), fcnh.a(eywxVarA.a, eywe.j(), eyze.a(ezkkVar), eywxVarA.b, new fbrg())), new cfud(null));
            Duration durationC = evxd.c(cfutVar.e);
            fdqt fdqtVar = new fdqt(new fdrc(new fdtm(fdpn.a(fdqn.a(fdtmVar, fdhi.j(fdhk.g(durationC.getSeconds(), fdhl.d), fdhk.f(durationC.getNano(), fdhl.a))), 0, 3), new cfue(cfutVar, null)), new cfuf(cfutVar, null)), new cfug(cfutVar, null));
            this.a = 1;
            if (fdpy.a(fdqtVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cfuh cfuhVar = new cfuh(this.b, this.c, fcxyVar);
        cfuhVar.d = obj;
        return cfuhVar;
    }
}
