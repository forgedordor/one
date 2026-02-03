package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fhbl {
    protected static Type getParameterUpperBound(int i, ParameterizedType parameterizedType) {
        return fhef.h(i, parameterizedType);
    }

    protected static Class<?> getRawType(Type type) {
        return fhef.a(type);
    }

    public abstract fhbm<?, ?> get(Type type, Annotation[] annotationArr, fhdy fhdyVar);
}
