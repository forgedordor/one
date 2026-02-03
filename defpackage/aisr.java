package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aisr extends fcyz implements fdat {
    int a;
    final /* synthetic */ int b;
    final /* synthetic */ exmt c;
    final /* synthetic */ long d;
    final /* synthetic */ aisw e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aisr(int i, exmt exmtVar, long j, aisw aiswVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = i;
        this.c = exmtVar;
        this.d = j;
        this.e = aiswVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aisr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dsvl dsvlVarA = dsvm.a(this.b);
            dsvlVarA.c(dswc.b());
            exmt exmtVar = this.c;
            long j = this.d;
            exmtVar.getClass();
            evsl evslVar = dswk.a;
            emmr emmrVar = (emmr) emms.a.createBuilder();
            emmrVar.getClass();
            exvn exvnVar = (exvn) exvq.a.createBuilder();
            exvnVar.getClass();
            exvo exvoVar = (exvo) exvp.a.createBuilder();
            exvoVar.getClass();
            int iA = exmtVar.a();
            exvoVar.copyOnWrite();
            exvp exvpVar = (exvp) exvoVar.instance;
            exvpVar.b |= 1;
            exvpVar.c = iA;
            evsn evsnVarBuild = exvoVar.build();
            evsnVarBuild.getClass();
            exvnVar.copyOnWrite();
            exvq exvqVar = (exvq) exvnVar.instance;
            exvqVar.c = (exvp) evsnVarBuild;
            exvqVar.b |= 2;
            evrj evrjVarD = evwy.d(j);
            evrjVarD.getClass();
            exvnVar.copyOnWrite();
            exvq exvqVar2 = (exvq) exvnVar.instance;
            exvqVar2.d = evrjVarD;
            exvqVar2.b |= 4;
            MessageType messagetypeBuild = exvnVar.build();
            messagetypeBuild.getClass();
            emmrVar.copyOnWrite();
            emms emmsVar = (emms) emmrVar.instance;
            emmsVar.d = (exvq) messagetypeBuild;
            emmsVar.c |= 1;
            evsn evsnVarBuild2 = emmrVar.build();
            evsnVarBuild2.getClass();
            dsvlVarA.b(new dsvf(evslVar, (emms) evsnVarBuild2));
            aisw aiswVar = this.e;
            dsvlVarA.b(aita.b(aiswVar.a));
            dsvm dsvmVarA = dsvlVarA.a();
            this.a = 1;
            if (aiswVar.c(dsvmVarA, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aisr(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
