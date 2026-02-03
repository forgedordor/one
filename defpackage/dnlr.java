package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnlr implements fdap {
    final /* synthetic */ String a;
    final /* synthetic */ dnlh b;

    public dnlr(String str, dnlh dnlhVar) {
        this.a = str;
        this.b = dnlhVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        dnne dnneVar = (dnne) obj;
        dnneVar.getClass();
        dnng dnngVar = dnng.a;
        dnnf dnnfVar = (dnnf) dnngVar.createBuilder();
        dnnfVar.getClass();
        dnlh dnlhVar = this.b;
        dnjw dnjwVar = dnlhVar.a;
        if (dnjwVar != null) {
            String strName = dnjwVar.name();
            dnnfVar.copyOnWrite();
            dnng dnngVar2 = (dnng) dnnfVar.instance;
            strName.getClass();
            dnngVar2.b |= 1;
            dnngVar2.c = strName;
        } else {
            dnnfVar.copyOnWrite();
            dnng dnngVar3 = (dnng) dnnfVar.instance;
            dnngVar3.b &= -2;
            dnngVar3.c = dnngVar.c;
        }
        dnjz dnjzVar = dnlhVar.b;
        if (dnjzVar != null) {
            String strName2 = dnjzVar.name();
            dnnfVar.copyOnWrite();
            dnng dnngVar4 = (dnng) dnnfVar.instance;
            strName2.getClass();
            dnngVar4.b |= 2;
            dnngVar4.d = strName2;
        } else {
            dnnfVar.copyOnWrite();
            dnng dnngVar5 = (dnng) dnnfVar.instance;
            dnngVar5.b &= -3;
            dnngVar5.d = dnngVar.d;
        }
        evsn evsnVarBuild = dnnfVar.build();
        evsnVarBuild.getClass();
        dnng dnngVar6 = (dnng) evsnVarBuild;
        dnneVar.copyOnWrite();
        dnnj dnnjVar = (dnnj) dnneVar.instance;
        dnnj dnnjVar2 = dnnj.a;
        evub evubVar = dnnjVar.c;
        if (!evubVar.b) {
            dnnjVar.c = evubVar.a();
        }
        dnnjVar.c.put(this.a, dnngVar6);
        return fctx.a;
    }
}
