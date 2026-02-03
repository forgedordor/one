package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vuf extends fcyz implements fdat {
    int a;
    final /* synthetic */ vuh b;
    final /* synthetic */ Duration c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vuf(vuh vuhVar, int i, Duration duration, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = vuhVar;
        this.d = i;
        this.c = duration;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vuf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            Object objB = this.b.b.b();
            objB.getClass();
            this.a = 1;
            obj = fdtc.a((fdpl) objB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ajlj ajljVarC = ((ajlk) obj).c();
        airv airvVar = (airv) this.b.c.b();
        int i2 = this.d;
        ajljVarC.getClass();
        Duration duration = this.c;
        enna ennaVar = (enna) ennb.a.createBuilder();
        ennaVar.getClass();
        if (duration != null) {
            evrj evrjVarA = evxd.a(duration);
            ennaVar.copyOnWrite();
            ennb ennbVar = (ennb) ennaVar.instance;
            ennbVar.c = evrjVarA;
            ennbVar.b |= 1;
        }
        evsn evsnVarBuild = ennaVar.build();
        evsnVarBuild.getClass();
        auvw.k(airvVar.b, null, null, new airu(airvVar, ajljVarC, (ennb) evsnVarBuild, i2, null), 3);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vuf(this.b, this.d, this.c, fcxyVar);
    }
}
