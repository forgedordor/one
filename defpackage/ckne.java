package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckne extends fcyz implements fdat {
    int a;
    final /* synthetic */ cknf b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckne(cknf cknfVar, boolean z, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cknfVar;
        this.c = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckne) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cknf cknfVar = this.b;
            final boolean z = this.c;
            final fdap fdapVar = new fdap() { // from class: cknc
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    cknh cknhVar = (cknh) ckni.a.createBuilder();
                    cknhVar.getClass();
                    cknhVar.copyOnWrite();
                    ckni ckniVar = (ckni) cknhVar.instance;
                    ckniVar.b |= 1;
                    ckniVar.c = z;
                    evsn evsnVarBuild = cknhVar.build();
                    evsnVarBuild.getClass();
                    return (ckni) evsnVarBuild;
                }
            };
            eiju eijuVarJ = cknfVar.a.j(new ejvr() { // from class: cknd
                @Override // defpackage.ejvr
                public final Object apply(Object obj2) {
                    return fdapVar.invoke(obj2);
                }
            });
            this.a = 1;
            if (fdxs.c(eijuVarJ, this) == fcylVar) {
                return fcylVar;
            }
        }
        cknf cknfVar2 = this.b;
        cknfVar2.c.c(true != this.c ? "Bugle.MessageReactions.Ios.Opt.Out.Count" : "Bugle.MessageReactions.Ios.Opt.In.Count");
        cknfVar2.b.a(eijx.e(null), "REACTIONS_SETTINGS_DATASERVICE_KEY");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ckne(this.b, this.c, fcxyVar);
    }
}
