package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bozw extends dqws {
    public bozw(String[] strArr) {
        super("desktop", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bozu b() {
        l();
        return new bozu(this.a.a());
    }

    public final void c(boyo... boyoVarArr) {
        int iIntValue = bpab.c().intValue();
        for (boyo boyoVar : boyoVarArr) {
            if (((Integer) bpab.b.getOrDefault(boyoVar.toString(), -1)).intValue() > iIntValue) {
                dqru.x("columnReference.toString()", iIntValue);
            }
        }
        m(boyoVarArr);
    }

    public final void d(bozt... boztVarArr) {
        D((String) DesugarArrays.stream(boztVarArr).map(new Function() { // from class: bozv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bozt) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void e(Function function) {
        c((boyo) function.apply(bpab.c));
    }

    public final void f(Function function) {
        String[] strArr = bpab.a;
        k(new bozz((bpaa) function.apply(new bpaa())));
    }
}
