package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqol extends dqws {
    public bqol(String[] strArr) {
        super("message_send_receive_attempt", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bqoj b() {
        l();
        return new bqoj(this.a.a());
    }

    public final void c(bqoi... bqoiVarArr) {
        D((String) DesugarArrays.stream(bqoiVarArr).map(new Function() { // from class: bqok
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bqoi) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void d(Function function) {
        String[] strArr = bqoo.a;
        k(new bqom((bqon) function.apply(new bqon())));
    }
}
