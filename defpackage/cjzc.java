package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjzc extends fcyz implements fdat {
    int a;
    final /* synthetic */ cjzf b;
    final /* synthetic */ dggn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjzc(cjzf cjzfVar, dggn dggnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cjzfVar;
        this.c = dggnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjzc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cjzf cjzfVar = this.b;
            final dggn dggnVar = this.c;
            fdap fdapVar = new fdap() { // from class: cjzb
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    cjzi cjziVar = (cjzi) ((cjzm) obj2).toBuilder();
                    String str = dggo.a(dggnVar).a;
                    cjziVar.copyOnWrite();
                    ((cjzm) cjziVar.instance).a().remove(str);
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
        return new cjzc(this.b, this.c, fcxyVar);
    }
}
