package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqfj extends dqws {
    public bqfj(String[] strArr) {
        super("message_edits", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bqfh b() {
        l();
        return new bqfh(this.a.a());
    }

    public final void c(bqev... bqevVarArr) {
        int iA = bqfo.c().a();
        Integer.valueOf(iA).getClass();
        for (bqev bqevVar : bqevVarArr) {
            if (((Integer) bqfo.b.getOrDefault(bqevVar.toString(), -1)).intValue() > iA) {
                dqru.x("columnReference.toString()", iA);
            }
        }
        m(bqevVarArr);
    }

    public final void d(bqfg... bqfgVarArr) {
        D((String) DesugarArrays.stream(bqfgVarArr).map(new Function() { // from class: bqfi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bqfg) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void e(Function function) {
        c((bqev[]) function.apply(bqfo.c));
    }

    public final void f(Function function) {
        c((bqev) function.apply(bqfo.c));
    }

    public final void g(Function function) {
        String[] strArr = bqfo.a;
        k(new bqfm((bqfn) function.apply(new bqfn())));
    }
}
