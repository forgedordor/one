package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cjcx implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cjlg apply(augw augwVar) {
        cjlf cjlfVar = (cjlf) cjlg.a.createBuilder();
        d(augwVar, cjlfVar);
        if ((augwVar.b & 2048) != 0) {
            ejvj ejvjVar = cjer.b;
            auib auibVar = augwVar.n;
            if (auibVar == null) {
                auibVar = auib.a;
            }
            cjlm cjlmVar = (cjlm) ejvjVar.fM(auibVar);
            cjlfVar.copyOnWrite();
            cjlg cjlgVar = (cjlg) cjlfVar.instance;
            cjlmVar.getClass();
            cjlgVar.d = cjlmVar;
            cjlgVar.b |= 2;
        }
        b(augwVar, cjlfVar);
        c(augwVar, cjlfVar);
        if ((augwVar.b & 1024) != 0) {
            ejvj ejvjVar2 = cjer.a;
            aufx aufxVar = augwVar.m;
            if (aufxVar == null) {
                aufxVar = aufx.a;
            }
            cjih cjihVar = (cjih) ejvjVar2.fM(aufxVar);
            cjlfVar.copyOnWrite();
            cjlg cjlgVar2 = (cjlg) cjlfVar.instance;
            cjihVar.getClass();
            cjlgVar2.g = cjihVar;
            cjlgVar2.b |= 16;
        }
        e(cjlfVar);
        return (cjlg) cjlfVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(augw augwVar, cjlf cjlfVar);

    public abstract void c(augw augwVar, cjlf cjlfVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public abstract void d(augw augwVar, cjlf cjlfVar);

    public abstract void e(cjlf cjlfVar);
}
