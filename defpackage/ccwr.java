package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccwr extends fcyz implements fdat {
    final /* synthetic */ amgc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccwr(amgc amgcVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = amgcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccwr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        bpdy bpdyVarA = bped.a("EmergencyQuestionnaireDatabaseOperationsImpl.getOptionsForMessageId");
        final amgc amgcVar = this.a;
        bpdyVarA.c(new Function() { // from class: ccwq
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
        });
        bpdp bpdpVar = (bpdp) bpdyVarA.b().q(bped.b.b);
        try {
            ekgb ekgbVarC = bpdpVar.c();
            bpdpVar.close();
            ekgbVarC.getClass();
            return fcva.av(ekgbVarC);
        } catch (Throwable th) {
            try {
                bpdpVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ccwr(this.a, fcxyVar);
    }
}
