package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhen extends fhbu {
    private final esyd a;

    private fhen(esyd esydVar) {
        this.a = esydVar;
    }

    public static fhen c(esyd esydVar) {
        if (esydVar != null) {
            return new fhen(esydVar);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // defpackage.fhbu
    public final fhbv a(Type type, Annotation[] annotationArr, fhdy fhdyVar) {
        return new fhep(this.a.a(new etcz(type)));
    }

    @Override // defpackage.fhbu
    public final fhbv b(Type type) {
        etcz etczVar = new etcz(type);
        esyd esydVar = this.a;
        return new fheo(esydVar, esydVar.a(etczVar));
    }
}
