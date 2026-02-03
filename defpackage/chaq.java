package defpackage;

import j$.time.Instant;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chaq extends fcyz implements fdat {
    final /* synthetic */ cgzx a;
    final /* synthetic */ cgxy b;
    final /* synthetic */ byte[] c;
    final /* synthetic */ String d;
    final /* synthetic */ Instant e;
    final /* synthetic */ cgzv f;
    final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chaq(cgzx cgzxVar, cgxy cgxyVar, byte[] bArr, String str, Instant instant, cgzv cgzvVar, long j, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cgzxVar;
        this.b = cgxyVar;
        this.c = bArr;
        this.d = str;
        this.e = instant;
        this.f = cgzvVar;
        this.g = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chaq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        boolean zB = eicg.b(u());
        cgzx cgzxVar = this.a;
        cgxy cgxyVar = this.b;
        byte[] bArr = this.c;
        String str = this.d;
        Instant instant = this.e;
        cgzv cgzvVar = this.f;
        long j = this.g;
        if (!zB) {
            throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
        }
        eieu eieuVarH = eiiy.h("PipelineWorkDatabaseOperations#insertWorkItemData");
        try {
            String[] strArr = bsrg.a;
            bspo bspoVar = new bspo();
            bspoVar.j(cgzxVar);
            bspoVar.h(cgxyVar);
            bspoVar.g(bArr);
            bspoVar.i(str);
            bspoVar.b(null);
            bspoVar.f(instant);
            bspoVar.e(cgzvVar);
            bspoVar.c(instant);
            bspoVar.d(j);
            bspj bspjVarA = bspoVar.a(new Supplier() { // from class: bspl
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new bspk();
                }
            });
            final dqsy dqsyVarB = bsrg.b();
            dqru.b(bsrg.b(), "pipeline_work", bspjVarA, new Function() { // from class: bspg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return Long.valueOf(dqsyVarB.P("pipeline_work", (dqst) obj2));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Consumer() { // from class: bsph
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            bspjVarA.getClass();
            chbe chbeVarA = chak.a(bspjVarA);
            fczl.a(eieuVarH, null);
            return chbeVarA;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chaq(this.a, this.b, this.c, this.d, this.e, this.f, this.g, fcxyVar);
    }
}
