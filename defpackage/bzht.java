package defpackage;

import android.content.Context;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzht implements bzho {
    public static final cqce a = cqce.g("BugleCms", "CmsBatchBackupCompletionProcessorImpl");
    public final dqsn b;
    public final aurx c;
    public final caby d;
    public final cogw e;
    public final bzky f;
    public final caru g;
    public final bzug h;
    public final bzuq i;
    public final aukz j;
    public final fcsu k;
    public final fcsu l;
    public final autx m;
    public final apow n;
    public final egzh o;
    public final fdjx p;
    public final fcsu q;
    public final fcsu r;
    public final appn s;
    public final bzlr t;
    private final axlf u;
    private final Context v;

    /* compiled from: PG */
    public interface a {
        cpup fC();
    }

    public bzht(dqsn dqsnVar, aurx aurxVar, caby cabyVar, cogw cogwVar, bzky bzkyVar, caru caruVar, bzug bzugVar, bzuq bzuqVar, aukz aukzVar, axlf axlfVar, fcsu fcsuVar, @apop fcsu fcsuVar2, autx autxVar, apow apowVar, egzh egzhVar, Context context, fdjx fdjxVar, fcsu fcsuVar3, fcsu fcsuVar4, appn appnVar, bzlr bzlrVar) {
        dqsnVar.getClass();
        aurxVar.getClass();
        cogwVar.getClass();
        aukzVar.getClass();
        axlfVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        autxVar.getClass();
        apowVar.getClass();
        egzhVar.getClass();
        context.getClass();
        fdjxVar.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.b = dqsnVar;
        this.c = aurxVar;
        this.d = cabyVar;
        this.e = cogwVar;
        this.f = bzkyVar;
        this.g = caruVar;
        this.h = bzugVar;
        this.i = bzuqVar;
        this.j = aukzVar;
        this.u = axlfVar;
        this.k = fcsuVar;
        this.l = fcsuVar2;
        this.m = autxVar;
        this.n = apowVar;
        this.o = egzhVar;
        this.v = context;
        this.p = fdjxVar;
        this.q = fcsuVar3;
        this.r = fcsuVar4;
        this.s = appnVar;
        this.t = bzlrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bzho
    public final boolean a(ekgb ekgbVar, ekgb ekgbVar2) {
        ekgbVar.getClass();
        ekgbVar2.getClass();
        if (!ekgbVar.isEmpty()) {
            return false;
        }
        final ArrayList arrayList = new ArrayList(fcva.p(ekgbVar2, 10));
        ekqh it = ekgbVar2.iterator();
        while (it.hasNext()) {
            arrayList.add(bzio.b((byiv) it.next()));
        }
        cbfd cbfdVarA = cbfi.a();
        cbfdVarA.A("isBatchBackupComplete");
        cbfdVarA.e(new Function() { // from class: bzhp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cbfh cbfhVar = (cbfh) obj;
                cbfhVar.i("cms_batch_backup");
                cbfhVar.b(arrayList);
                return cbfhVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return cbfdVarA.b().h() == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (defpackage.fdxs.c(r6, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.bzhv
            if (r0 == 0) goto L13
            r0 = r7
            bzhv r0 = (defpackage.bzhv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzhv r0 = new bzhv
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            goto L64
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.fctl.b(r7)
            goto L47
        L36:
            defpackage.fctl.b(r7)
            axlf r7 = r5.u
            eiju r6 = r7.b(r6)
            r0.c = r4
            java.lang.Object r7 = defpackage.fdxs.c(r6, r0)
            if (r7 == r1) goto L67
        L47:
            android.content.Context r6 = r5.v
            java.lang.Class<bzht$a> r2 = bzht.a.class
            efwo r7 = (defpackage.efwo) r7
            java.lang.Object r6 = defpackage.ehlh.a(r6, r2, r7)
            bzht$a r6 = (bzht.a) r6
            cpup r6 = r6.fC()
            eiju r6 = r6.a(r4)
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r6, r0)
            if (r6 != r1) goto L64
            goto L67
        L64:
            fctx r6 = defpackage.fctx.a
            return r6
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzht.b(int, fcxy):java.lang.Object");
    }
}
