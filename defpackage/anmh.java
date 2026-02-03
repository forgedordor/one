package defpackage;

import android.content.Context;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anmh implements anml {
    public static final ekhx a = ekhx.v(111, 110, 106, 107, 112, 13, 12);
    private final Context b;

    public anmh(Context context) {
        this.b = context;
    }

    @Override // defpackage.anml
    public final ekgp a(Map map) {
        return craf.i(this.b) ? (ekgp) Collection.EL.stream(map.entrySet()).filter(new Predicate() { // from class: anme
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return !anmh.a.contains(((Map.Entry) obj).getKey());
            }
        }).collect(ekcv.a(new Function() { // from class: anmf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (Integer) ((Map.Entry) obj).getKey();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: anmg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (anmk) ((Map.Entry) obj).getValue();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        })) : ekgp.j(map);
    }
}
