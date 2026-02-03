package defpackage;

import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chav extends fcyz implements fdat {
    final /* synthetic */ Instant a;
    final /* synthetic */ cgzx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chav(Instant instant, cgzx cgzxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = instant;
        this.b = cgzxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chav) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String[] strArr = bsrg.a;
        bsrd bsrdVar = new bsrd();
        bsrdVar.ap("PipelineWorkDatabaseOperations#updateExecuteAfterTimestamp");
        final cgzx cgzxVar = this.b;
        bsrdVar.e(new Function() { // from class: chau
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bsrf bsrfVar = (bsrf) obj2;
                bsrfVar.b(cgzxVar);
                return bsrfVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsrdVar.c(this.a);
        bsrdVar.d(dqxf.a(bsrg.b.e));
        ekgb ekgbVarA = bsrdVar.b().a();
        ekgbVarA.getClass();
        bspj bspjVar = (bspj) fcva.P(ekgbVarA);
        if (bspjVar != null) {
            return chak.a(bspjVar);
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chav(this.a, this.b, fcxyVar);
    }
}
