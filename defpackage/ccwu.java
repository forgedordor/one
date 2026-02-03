package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccwu extends fcyz implements fdat {
    final /* synthetic */ amgc a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccwu(amgc amgcVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = amgcVar;
        this.b = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccwu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String[] strArr = bped.a;
        bpdh bpdhVar = new bpdh();
        final amgc amgcVar = this.a;
        bpdhVar.b(amgcVar.c());
        bpdhVar.c(this.b);
        return Boolean.valueOf(bpdhVar.a().m(new Function() { // from class: ccwt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bpec bpecVar = (bpec) obj2;
                bpecVar.b(amgcVar.c());
                return bpecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ccwu(this.a, this.b, fcxyVar);
    }
}
