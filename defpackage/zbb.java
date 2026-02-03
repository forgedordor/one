package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zbb extends fcyz implements fdat {
    int a;
    final /* synthetic */ zbe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbb(zbe zbeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = zbeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zbb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cmfo cmfoVarA = this.b.a();
            fdap fdapVar = new fdap() { // from class: zba
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    zbf zbfVar = (zbf) ((zbg) obj2).toBuilder();
                    zbfVar.copyOnWrite();
                    zbg zbgVar = (zbg) zbfVar.instance;
                    zbgVar.b |= 4;
                    zbgVar.d = false;
                    zbfVar.copyOnWrite();
                    zbg zbgVar2 = (zbg) zbfVar.instance;
                    zbgVar2.b |= 2;
                    zbgVar2.c = 0;
                    evsn evsnVarBuild = zbfVar.build();
                    evsnVarBuild.getClass();
                    return (zbg) evsnVarBuild;
                }
            };
            this.a = 1;
            if (cmfoVarA.d(fdapVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zbb(this.b, fcxyVar);
    }
}
