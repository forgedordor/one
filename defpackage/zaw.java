package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zaw extends fcyz implements fdat {
    int a;
    final /* synthetic */ zbe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaw(zbe zbeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = zbeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zaw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final zbe zbeVar = this.b;
            cmfo cmfoVarA = zbeVar.a();
            fdap fdapVar = new fdap() { // from class: zav
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    zbg zbgVar = (zbg) obj2;
                    int i2 = zbgVar.c + 1;
                    boolean z = zbgVar.d || i2 >= 20;
                    ((zat) zbeVar.c.b()).a(2, i2, z);
                    zbf zbfVar = (zbf) zbgVar.toBuilder();
                    int i3 = zbgVar.c + 1;
                    zbfVar.copyOnWrite();
                    zbg zbgVar2 = (zbg) zbfVar.instance;
                    zbgVar2.b |= 2;
                    zbgVar2.c = i3;
                    zbfVar.copyOnWrite();
                    zbg zbgVar3 = (zbg) zbfVar.instance;
                    zbgVar3.b |= 4;
                    zbgVar3.d = z;
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
        return new zaw(this.b, fcxyVar);
    }
}
