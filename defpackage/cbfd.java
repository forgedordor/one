package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbfd extends dqws {
    public cbfd(String[] strArr) {
        super("work_queue", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cbfb b() {
        l();
        return new cbfb(this.a.a());
    }

    public final void c(cbeh... cbehVarArr) {
        int iIntValue = cbfi.c().intValue();
        for (cbeh cbehVar : cbehVarArr) {
            if (((Integer) cbfi.b.getOrDefault(cbehVar.toString(), -1)).intValue() > iIntValue) {
                dqru.x("columnReference.toString()", iIntValue);
            }
        }
        m(cbehVarArr);
    }

    public final void d(cbfa... cbfaVarArr) {
        D((String) DesugarArrays.stream(cbfaVarArr).map(new Function() { // from class: cbfc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((cbfa) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void e(Function function) {
        String[] strArr = cbfi.a;
        k(new cbfg((cbfh) function.apply(new cbfh())));
    }
}
