package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhcb extends fhbl {
    private final Executor a;

    public fhcb(Executor executor) {
        this.a = executor;
    }

    @Override // defpackage.fhbl
    public final fhbm<?, ?> get(Type type, Annotation[] annotationArr, fhdy fhdyVar) {
        if (getRawType(type) != fhbk.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new fhbw(fhef.h(0, (ParameterizedType) type), fhef.p(annotationArr, fhea.class) ? null : this.a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
