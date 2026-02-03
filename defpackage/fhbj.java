package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhbj extends fhbu {
    private boolean a = true;

    @Override // defpackage.fhbu
    public final fhbv a(Type type, Annotation[] annotationArr, fhdy fhdyVar) {
        if (type == fezk.class) {
            return fhef.p(annotationArr, fhfm.class) ? fhbf.a : fhbd.a;
        }
        if (type == Void.class) {
            return fhbi.a;
        }
        if (!this.a || type != fctx.class) {
            return null;
        }
        try {
            return fhbh.a;
        } catch (NoClassDefFoundError unused) {
            this.a = false;
            return null;
        }
    }

    @Override // defpackage.fhbu
    public final fhbv b(Type type) {
        if (fezf.class.isAssignableFrom(fhef.a(type))) {
            return fhbe.a;
        }
        return null;
    }
}
