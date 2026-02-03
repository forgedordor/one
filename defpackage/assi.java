package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class assi {
    public static assi b(asva asvaVar) {
        return c((ekhx) Collection.EL.stream(asvaVar.b).map(new Function() { // from class: assh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                asvc asvcVar = (asvc) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(asvcVar.c);
                if (!asvcVar.d.isEmpty()) {
                    sb.append("=");
                    sb.append(asvcVar.d);
                }
                return sb.toString();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(ekcv.b));
    }

    public static assi c(Iterable iterable) {
        return new assd(ekhx.n(iterable));
    }

    public static assi d() {
        int i = ekgb.d;
        return c(ekoe.a);
    }

    public abstract ekhx a();

    public final boolean e(final String str) {
        return Collection.EL.stream(a()).anyMatch(new Predicate() { // from class: assg
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
                return ((String) obj).contains(str);
            }
        });
    }

    public final boolean f() {
        return a().isEmpty();
    }

    public final boolean g() {
        return h() || i();
    }

    public final boolean h() {
        return e("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.im");
    }

    public final boolean i() {
        return e("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp");
    }
}
