package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bnbw extends dqws {
    public bnbw(String[] strArr) {
        super("cms", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bnbu b() {
        l();
        return new bnbu(this.a.a());
    }

    public final void c(bnbt... bnbtVarArr) {
        D((String) DesugarArrays.stream(bnbtVarArr).map(new Function() { // from class: bnbv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bnbt) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void d(bnca bncaVar) {
        k(new bnbz(bncaVar));
    }

    public final void e(Function function) {
        String[] strArr = bncb.a;
        k(new bnbz((bnca) function.apply(new bnca())));
    }
}
