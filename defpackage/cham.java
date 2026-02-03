package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cham extends fcyz implements fdat {
    final /* synthetic */ cgzx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cham(cgzx cgzxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cgzxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cham) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String[] strArr = bsrg.a;
        bsqv bsqvVar = new bsqv();
        bsqvVar.f("PipelineWorkDatabaseOperations#deleteWorkItemData");
        final cgzx cgzxVar = this.a;
        bsqvVar.b = new bsre((bsrf) new Function() { // from class: chal
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
        }.apply(new bsrf()));
        bsqvVar.d();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cham(this.a, fcxyVar);
    }
}
