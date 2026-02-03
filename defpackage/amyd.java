package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amyd extends fcyz implements fdat {
    int a;
    final /* synthetic */ amyi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amyd(amyi amyiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = amyiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amyd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        amxo amxoVarA = null;
        fctl.b(obj);
        if (i == 0) {
            amyi amyiVar = this.b;
            this.a = 1;
            final fdap fdapVar = new fdap() { // from class: bxpp
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    Duration duration = bxqa.a;
                    ((MessageId) obj2).getClass();
                    return new feaz();
                }
            };
            Function function = new Function() { // from class: bxpq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function2) {
                    return Function$CC.$default$andThen(this, function2);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    Duration duration = bxqa.a;
                    return fdapVar.invoke(obj2);
                }

                public final /* synthetic */ Function compose(Function function2) {
                    return Function$CC.$default$compose(this, function2);
                }
            };
            bxqa bxqaVar = amyiVar.b;
            ConcurrentHashMap concurrentHashMap = bxqaVar.e;
            MessageId messageId = amyiVar.c;
            obj = fdin.a(eicg.a(bxqaVar.b.hE()), new bxpu(null, (feav) ConcurrentMap.EL.computeIfAbsent(concurrentHashMap, messageId, function), bxqaVar, messageId), this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        coik coikVar = (coik) obj;
        if (coikVar != null) {
            amxn amxnVarD = amxo.d();
            amxnVarD.b(coikVar.a());
            amxnVarD.d(coikVar.b());
            amxnVarD.c(coikVar.c());
            amxoVarA = amxnVarD.a();
        }
        return Optional.ofNullable(amxoVarA);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new amyd(this.b, fcxyVar);
    }
}
