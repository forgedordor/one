package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbbr {
    public static final boolean a(final String str) {
        cbfd cbfdVarA = cbfi.a();
        cbfdVarA.A("hasScheduledWork");
        cbfdVarA.e(new Function() { // from class: cbbq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cbfh cbfhVar = (cbfh) obj;
                cbfhVar.i(str);
                int iIntValue = cbfi.c().intValue();
                if (iIntValue < 46060) {
                    dqru.x("workmanager_id", iIntValue);
                }
                cbfhVar.ap(new dqpn("work_queue.workmanager_id", 6));
                return cbfhVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return cbfdVarA.b().U();
    }
}
