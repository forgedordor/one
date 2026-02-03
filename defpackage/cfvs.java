package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfvs implements cfuz, cfvo {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/proxy/server/bindchannel/machine/TachyonPersistentChannelStateMachine");
    public final cfvl b;
    public cfvh c;
    public final Map d;
    private final fdjx e;
    private final cfvm f;
    private final cfuu g;
    private final ezol h;
    private final cfvj i;
    private final cfut j;
    private final eizx k;

    public cfvs(fdjx fdjxVar, cfvm cfvmVar, cfuu cfuuVar, ezol ezolVar) {
        this.e = fdjxVar;
        this.f = cfvmVar;
        this.g = cfuuVar;
        this.h = ezolVar;
        cfvj cfvjVar = new cfvj(ezolVar);
        this.i = cfvjVar;
        cfwc cfwcVar = (cfwc) cfvmVar.a.b();
        cfwcVar.getClass();
        cfth cfthVar = (cfth) cfvmVar.b.b();
        cfthVar.getClass();
        cfvy cfvyVar = (cfvy) cfvmVar.c.b();
        cfvyVar.getClass();
        cfvl cfvlVar = new cfvl(cfwcVar, cfthVar, cfvyVar, this, this, cfvjVar);
        this.b = cfvlVar;
        fdjx fdjxVar2 = (fdjx) cfuuVar.a.b();
        fdjxVar2.getClass();
        cfvf cfvfVar = (cfvf) cfuuVar.b.b();
        cfvfVar.getClass();
        evrj evrjVar = (evrj) cfuuVar.c.b();
        evrjVar.getClass();
        evrj evrjVar2 = (evrj) cfuuVar.d.b();
        evrjVar2.getClass();
        this.j = new cfut(fdjxVar2, cfvfVar, evrjVar, evrjVar2, this);
        this.k = new eizx();
        int i = fdcj.a;
        this.c = cfvlVar.a(new fdbi(cfuv.class));
        fdbi fdbiVar = new fdbi(cfuv.class);
        cfuy cfuyVar = cfuy.a;
        fdbi fdbiVar2 = new fdbi(cfux.class);
        cfuy cfuyVar2 = cfuy.d;
        cfuy cfuyVar3 = cfuy.e;
        cfuy cfuyVar4 = cfuy.f;
        fcti[] fctiVarArr = {new fcti(cfuyVar2, new fdbi(cfuw.class)), new fcti(cfuyVar3, new fdbi(cfwb.class)), new fcti(cfuyVar4, new fdbi(cfuv.class))};
        fdbi fdbiVar3 = new fdbi(cfuw.class);
        cfuy cfuyVar5 = cfuy.g;
        this.d = fcwa.g(new fcti(fdbiVar, fcwa.c(new fcti(cfuyVar, new fdbi(cfux.class)))), new fcti(fdbiVar2, fcwa.g(fctiVarArr)), new fcti(fdbiVar3, fcwa.g(new fcti(cfuyVar5, new fdbi(cfvg.class)), new fcti(cfuyVar3, new fdbi(cfwb.class)), new fcti(cfuyVar4, new fdbi(cfve.class)), new fcti(cfuy.c, new fdbi(cfwb.class)), new fcti(cfuy.j, new fdbi(cfvb.class)))), new fcti(new fdbi(cfvb.class), fcwa.g(new fcti(cfuyVar2, new fdbi(cfuw.class)), new fcti(cfuyVar3, new fdbi(cfwb.class)), new fcti(cfuyVar4, new fdbi(cfve.class)), new fcti(cfuy.k, new fdbi(cfve.class)))), new fcti(new fdbi(cfwb.class), fcwa.g(new fcti(cfuy.h, new fdbi(cfuv.class)), new fcti(cfuy.b, new fdbi(cfvx.class)), new fcti(cfuyVar, new fdbi(cfux.class)))), new fcti(new fdbi(cfvx.class), fcwa.g(new fcti(cfuyVar5, new fdbi(cfvg.class)), new fcti(cfuyVar, new fdbi(cfux.class)))), new fcti(new fdbi(cfvg.class), fcwa.g(new fcti(cfuyVar2, new fdbi(cfuw.class)), new fcti(cfuyVar3, new fdbi(cfwb.class)), new fcti(cfuyVar4, new fdbi(cfve.class)))), new fcti(new fdbi(cfve.class), fcwa.g(new fcti(cfuy.i, new fdbi(cfuv.class)), new fcti(cfuyVar, new fdbi(cfux.class)), new fcti(cfuy.l, new fdbi(cfvg.class)))));
    }

    @Override // defpackage.cfuz
    public final void a(final cfuy cfuyVar) {
        cfuyVar.getClass();
        ejaa.a(this.e, this.k, new cfvr(this, cfuyVar, null)).hK(new fdap() { // from class: cfvq
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ekrw ekrwVarH = cfvs.a.h();
                ekrwVarH.X(eksq.a, "BugleBindChannelProxy");
                ((ekrd) ((ekrd) ekrwVarH).g((Throwable) obj).h("com/google/android/apps/messaging/shared/net/proxy/server/bindchannel/machine/TachyonPersistentChannelStateMachine", "onEvent$lambda$0", 76, "TachyonPersistentChannelStateMachine.kt")).D("Finished processing event %s. End state: %s", cfuyVar.name(), this.c.b());
                return fctx.a;
            }
        });
    }

    @Override // defpackage.cfvo
    public final fdpl b(cfvn cfvnVar) {
        fdug fdugVar;
        this.i.c.set(cfvnVar);
        cfut cfutVar = this.j;
        synchronized (cfutVar.h) {
            cfuz cfuzVar = cfutVar.g;
            cfuzVar.a(cfuy.a);
            if (cfutVar.i == null) {
                cfutVar.i = new cfub(cfvnVar, auvw.k(cfutVar.c, null, null, new cfuh(cfutVar, cfvnVar, null), 3));
            } else {
                cfuzVar.a(cfuy.d);
            }
            fdugVar = new fdug(cfutVar.j);
        }
        return fdugVar;
    }
}
