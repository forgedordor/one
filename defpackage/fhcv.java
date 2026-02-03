package defpackage;

import j$.util.Optional;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhcv extends fhbu {
    static final fhbu a = new fhcv();

    @Override // defpackage.fhbu
    public final fhbv a(Type type, Annotation[] annotationArr, fhdy fhdyVar) {
        if (fhef.a(type) != Optional.class) {
            return null;
        }
        return new fhcu(fhdyVar.b(fhef.h(0, (ParameterizedType) type), annotationArr));
    }
}
