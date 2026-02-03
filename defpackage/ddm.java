package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ddm extends fcyz implements fdap {
    Object a;
    Object b;
    int c;
    final /* synthetic */ ddp d;
    final /* synthetic */ Object e;
    final /* synthetic */ ddw f;
    final /* synthetic */ long g;
    final /* synthetic */ fdap h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddm(ddp ddpVar, Object obj, ddw ddwVar, long j, fdap fdapVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.d = ddpVar;
        this.e = obj;
        this.f = ddwVar;
        this.g = j;
        this.h = fdapVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        Object obj3;
        fcyl fcylVar = fcyl.a;
        try {
            if (this.c != 0) {
                obj3 = this.b;
                obj2 = this.a;
                fctl.b(obj);
            } else {
                fctl.b(obj);
                final ddp ddpVar = this.d;
                deb debVar = ddpVar.a;
                debVar.a = (deh) ddpVar.f.a.invoke(this.e);
                ddw ddwVar = this.f;
                ddpVar.i(((dgw) ddwVar).a);
                ddpVar.h(true);
                final deb debVar2 = new deb(debVar.e, debVar.a(), dei.a(debVar.a), debVar.b, Long.MIN_VALUE, debVar.d);
                final fdce fdceVar = new fdce();
                long j = this.g;
                final fdap fdapVar = this.h;
                fdap fdapVar2 = new fdap() { // from class: ddl
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj4) {
                        ddy ddyVar = (ddy) obj4;
                        ddp ddpVar2 = ddpVar;
                        deb debVar3 = ddpVar2.a;
                        dgv.f(ddyVar, debVar3);
                        Object objB = ddpVar2.b(ddyVar.a());
                        boolean zF = fdbq.f(objB, ddyVar.a());
                        fdap fdapVar3 = fdapVar;
                        if (!zF) {
                            deb debVar4 = debVar2;
                            debVar3.c(objB);
                            debVar4.c(objB);
                            if (fdapVar3 != null) {
                                fdapVar3.invoke(ddpVar2);
                            }
                            fdce fdceVar2 = fdceVar;
                            ddyVar.c();
                            fdceVar2.a = true;
                        } else if (fdapVar3 != null) {
                            fdapVar3.invoke(ddpVar2);
                        }
                        return fctx.a;
                    }
                };
                this.a = debVar2;
                this.b = fdceVar;
                this.c = 1;
                if (dgv.b(debVar2, ddwVar, j, fdapVar2, this) == fcylVar) {
                    return fcylVar;
                }
                obj2 = debVar2;
                obj3 = fdceVar;
            }
            int i = true != ((fdce) obj3).a ? 2 : 1;
            this.d.g();
            return new ddx((deb) obj2, i);
        } catch (CancellationException e) {
            this.d.g();
            throw e;
        }
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ddm(this.d, this.e, this.f, this.g, this.h, (fcxy) obj).b(fctx.a);
    }
}
