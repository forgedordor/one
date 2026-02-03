package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjze extends fcyz implements fdat {
    int a;
    final /* synthetic */ cjzf b;
    final /* synthetic */ dggn c;
    final /* synthetic */ dfir d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjze(cjzf cjzfVar, dggn dggnVar, dfir dfirVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cjzfVar;
        this.c = dggnVar;
        this.d = dfirVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjze) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cjzf cjzfVar = this.b;
            final dggn dggnVar = this.c;
            final dfir dfirVar = this.d;
            fdap fdapVar = new fdap() { // from class: cjzd
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    cjzi cjziVar = (cjzi) ((cjzm) obj2).toBuilder();
                    String str = dggo.a(dggnVar).a;
                    cjziVar.copyOnWrite();
                    ((cjzm) cjziVar.instance).a().put(str, dfirVar);
                    evsn evsnVarBuild = cjziVar.build();
                    evsnVarBuild.getClass();
                    return (cjzm) evsnVarBuild;
                }
            };
            this.a = 1;
            if (cjzfVar.c.d(fdapVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cjze(this.b, this.c, this.d, fcxyVar);
    }
}
