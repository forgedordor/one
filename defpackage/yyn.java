package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yyn extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ yyp c;
    final /* synthetic */ yyq d;
    final /* synthetic */ fdpl e;
    final /* synthetic */ int f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yyn(fcxy fcxyVar, int i, yyp yypVar, yyq yyqVar, fdpl fdplVar) {
        super(3, fcxyVar);
        this.f = i;
        this.c = yypVar;
        this.d = yyqVar;
        this.e = fdplVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        yyn yynVar = new yyn((fcxy) obj3, this.f, this.c, this.d, this.e);
        yynVar.g = (fdpm) obj;
        yynVar.b = obj2;
        return yynVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdpl fdplVarA;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r2 = this.g;
            yyg yygVar = (yyg) this.b;
            boolean z = yygVar.a;
            anho anhoVar = yygVar.b;
            if (this.f - 1 != 0) {
                yyp yypVar = this.c;
                yyq yyqVar = this.d;
                fdpl fdplVar = this.e;
                ajlt ajltVar = yyqVar.a;
                if (!fdbq.f(ajltVar.b(), yypVar.m.getAndSet(ajltVar.b()))) {
                    yypVar.n.f(false);
                }
                fdplVarA = auyf.a(yypVar.n, ((zqi) yypVar.h.b()).e, fdplVar, yypVar.e.f(), yypVar.p.d, yypVar.f.i, new yyj(yypVar, yyqVar, anhoVar, z, null));
            } else {
                yyp yypVar2 = this.c;
                yyq yyqVar2 = this.d;
                fdpl fdplVar2 = this.e;
                ajlt ajltVar2 = yyqVar2.a;
                AtomicBoolean atomicBoolean = new AtomicBoolean(!fdbq.f((MessageId) yypVar2.j.getAndSet(ajltVar2.b()), ajltVar2.b()));
                AtomicReference atomicReference = yypVar2.k;
                zqk zqkVar = yyqVar2.c;
                if (!fdbq.f(atomicReference.getAndSet(zqkVar), zqkVar)) {
                    yypVar2.l.f(false);
                }
                fdplVarA = fdqq.a(fdud.c(yypVar2.l, fdplVar2, yypVar2.e.f(), yypVar2.p.d, yypVar2.f.i, new yym(yypVar2, yyqVar2, atomicBoolean, z, anhoVar, null)));
            }
            this.a = 1;
            if (fdpy.c(r2, fdplVarA, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
