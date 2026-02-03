package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhel extends fhbl {
    @Override // defpackage.fhbl
    public final fhbm<?, ?> get(Type type, Annotation[] annotationArr, fhdy fhdyVar) {
        if (getRawType(type) != ListenableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("ListenableFuture return type must be parameterized as ListenableFuture<Foo> or ListenableFuture<? extends Foo>");
        }
        Type parameterUpperBound = getParameterUpperBound(0, (ParameterizedType) type);
        if (getRawType(parameterUpperBound) != fhdv.class) {
            return new fheh(parameterUpperBound);
        }
        if (parameterUpperBound instanceof ParameterizedType) {
            return new fhek(getParameterUpperBound(0, (ParameterizedType) parameterUpperBound));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
