package defpackage;

import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class didn extends eiow {
    public static final /* synthetic */ int b = 0;
    public final List a;

    public didn(List list) {
        List list2 = (List) Collection.EL.stream(list).map(new Function() { // from class: didk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new eiph((eiqt) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toUnmodifiableList());
        this.a = list2;
        Collection.EL.stream(list2).map(new Function() { // from class: didl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eipk) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).forEach(new Consumer() { // from class: didm
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                eiqt eiqtVar = (eiqt) obj;
                int i = didn.b;
                if (eiqtVar instanceof didp) {
                    ((didp) eiqtVar).b();
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.eiow
    public final boolean a(eiqt eiqtVar) {
        if (eiqtVar instanceof dido) {
            return ((dido) eiqtVar).a();
        }
        return true;
    }
}
