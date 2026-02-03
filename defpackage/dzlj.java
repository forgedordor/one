package defpackage;

import j$.util.Comparator;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzlj {
    public final ejxr a;

    public dzlj(final eygg eyggVar) {
        this.a = ejxx.a(new ejxr() { // from class: dzli
            @Override // defpackage.ejxr
            public final Object get() {
                return ekgb.E(Comparator.CC.comparing(new Function() { // from class: dzlg
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Integer.valueOf(((dzwn) obj).a().a);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, Comparator.CC.reverseOrder()), (Iterable) eyggVar.b());
            }
        });
    }
}
