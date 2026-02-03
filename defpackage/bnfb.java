package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bnfb extends dqws<bndx, bnez, bnfb, bncf, bndw> {
    public bnfb(String[] strArr) {
        super("contacts", strArr, null, null, null, "$primary");
    }

    private final void g(bndw... bndwVarArr) {
        int iIntValue = bnfe.c().intValue();
        for (bndw bndwVar : bndwVarArr) {
            if (((Integer) bnfe.b.getOrDefault(bndwVar.toString(), -1)).intValue() > iIntValue) {
                dqru.x("columnReference.toString()", iIntValue);
            }
        }
        m(bndwVarArr);
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bnez b() {
        l();
        return new bnez(this.a.a());
    }

    public final void c(bney... bneyVarArr) {
        D((String) DesugarArrays.stream(bneyVarArr).map(new Function() { // from class: bnfa
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bney) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void d(Function function) {
        g((bndw[]) function.apply(bnfe.c));
    }

    public final void e(Function function) {
        g((bndw) function.apply(bnfe.c));
    }

    public final void f(Function function) {
        String[] strArr = bnfe.a;
        k(new bnfc((bnfd) function.apply(new bnfd())));
    }
}
