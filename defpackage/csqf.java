package defpackage;

import j$.time.Duration;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csqf extends fcyz implements fdat {
    final /* synthetic */ csqg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csqf(csqg csqgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = csqgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csqf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String[] strArr = bqrg.a;
        bqqs bqqsVar = new bqqs();
        bqqsVar.f("deleteExpiredOutcomes");
        final csqg csqgVar = this.a;
        bqqsVar.b = new bqrc((bqrf) new Function() { // from class: csqe
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bqrf bqrfVar = (bqrf) obj2;
                long epochMilli = ((cogw) csqgVar.g.b()).f().toEpochMilli() - Duration.ofDays(((Number) csdz.a.e()).intValue()).toMillis();
                int iIntValue = bqrg.c().intValue();
                if (iIntValue < 59190) {
                    dqru.x("classification_timestamp", iIntValue);
                }
                bqrfVar.ap(new dqty("message_spam.classification_timestamp", 8, Long.valueOf(epochMilli)));
                return bqrfVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bqrf()));
        bqqsVar.d();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new csqf(this.a, fcxyVar);
    }
}
