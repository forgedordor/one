package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpra extends dqws {
    public bpra(String[] strArr) {
        super("generic_worker_queue", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bpqy b() {
        l();
        return new bpqy(this.a.a());
    }

    public final void c(bpqx... bpqxVarArr) {
        D((String) DesugarArrays.stream(bpqxVarArr).map(new Function() { // from class: bpqz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bpqx) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void d(Function function) {
        String[] strArr = bprf.a;
        k(new bprd((bpre) function.apply(new bpre())));
    }
}
