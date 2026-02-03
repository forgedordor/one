package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brgq extends dqws {
    public brgq(String[] strArr) {
        super("smarts_personalization_decayed_feature_values", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final brgo b() {
        l();
        return new brgo(this.a.a());
    }

    public final void c(brgn... brgnVarArr) {
        D((String) DesugarArrays.stream(brgnVarArr).map(new Function() { // from class: brgp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((brgn) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void d(Function function) {
        brge[] brgeVarArr = {(brge) function.apply(brgt.c)};
        int iA = brgt.c().a();
        Integer.valueOf(iA).getClass();
        if (((Integer) brgt.b.getOrDefault(brgeVarArr[0].toString(), -1)).intValue() > iA) {
            dqru.x("columnReference.toString()", iA);
        }
        m(brgeVarArr);
    }

    public final void e(Function function) {
        String[] strArr = brgt.a;
        k(new brgr((brgs) function.apply(new brgs())));
    }
}
