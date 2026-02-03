package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adts extends dqws {
    public adts(String[] strArr) {
        super("conversations LEFT JOIN conversation_pin ON (conversation_pin.conversation_id=conversations._id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final adtq b() {
        l();
        return new adtq(this.a.a());
    }

    public final void c(adtp... adtpVarArr) {
        D((String) DesugarArrays.stream(adtpVarArr).map(new Function() { // from class: adtr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((adtp) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void d(adtx adtxVar) {
        k(new adtt(adtxVar));
    }

    public final void e(Function function) {
        String[] strArr = adty.a;
        k(new adtt((adtx) function.apply(new adtx())));
    }
}
