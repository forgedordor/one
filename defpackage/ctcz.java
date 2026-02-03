package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctcz extends fcyz implements fdat {
    int a;
    final /* synthetic */ ctdg b;
    final /* synthetic */ String c;
    final /* synthetic */ ctch d;
    final /* synthetic */ ctcj e;
    final /* synthetic */ efwo f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctcz(ctdg ctdgVar, String str, ctch ctchVar, ctcj ctcjVar, efwo efwoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ctdgVar;
        this.c = str;
        this.d = ctchVar;
        this.e = ctcjVar;
        this.f = efwoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctcz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final ctdg ctdgVar = this.b;
            final String str = this.c;
            final ctch ctchVar = this.d;
            final ctcj ctcjVar = this.e;
            final efwo efwoVar = this.f;
            fdap fdapVar = new fdap() { // from class: ctcy
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    ctck ctckVar = (ctck) ((ctcl) obj2).toBuilder();
                    int iA = efwoVar.a();
                    ctckVar.copyOnWrite();
                    ctcl ctclVar = (ctcl) ctckVar.instance;
                    ctclVar.b |= 1;
                    ctclVar.c = iA;
                    ctckVar.copyOnWrite();
                    ctcl ctclVar2 = (ctcl) ctckVar.instance;
                    ctclVar2.b |= 8;
                    ctclVar2.f = str;
                    evvp evvpVarA = cssu.a(((cogw) ctdgVar.b.b()).f().toEpochMilli());
                    ctckVar.copyOnWrite();
                    ctcl ctclVar3 = (ctcl) ctckVar.instance;
                    evvpVarA.getClass();
                    ctclVar3.d = evvpVarA;
                    ctclVar3.b |= 2;
                    ctckVar.copyOnWrite();
                    ctcl ctclVar4 = (ctcl) ctckVar.instance;
                    ctclVar4.e = ctchVar.d;
                    ctclVar4.b |= 4;
                    ctckVar.copyOnWrite();
                    ctcl ctclVar5 = (ctcl) ctckVar.instance;
                    ctclVar5.g = ctcjVar.g;
                    ctclVar5.b |= 16;
                    evsn evsnVarBuild = ctckVar.build();
                    evsnVarBuild.getClass();
                    return (ctcl) evsnVarBuild;
                }
            };
            this.a = 1;
            if (ctdgVar.a.d(fdapVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ctcz(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
