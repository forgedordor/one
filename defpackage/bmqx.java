package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmqx extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new bmqu(this);
    }

    public final void b(bmqz... bmqzVarArr) {
        ap(new dqpm("cms_dead_letter_queue.abandoned_action", 3, as((Iterable) DesugarArrays.stream(bmqzVarArr).map(new Function() { // from class: bmqv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((bmqz) obj).ordinal());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: bmqw
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }))), true));
    }

    public final void c(int i) {
        int iIntValue = bmqy.c().intValue();
        if (iIntValue < 57090) {
            dqru.x("bugle_table_type", iIntValue);
        }
        ap(new dqty("cms_dead_letter_queue.bugle_table_type", 1, Integer.valueOf(i)));
    }
}
