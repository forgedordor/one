package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esry implements fbni {
    private final fcsu a;
    private final Class b;
    private final Class c;

    public esry(fcsu fcsuVar, Class cls, Class cls2) {
        this.a = fcsuVar;
        this.b = cls;
        this.c = cls2;
    }

    @Override // defpackage.fbni
    public final fbnh a(fbrk fbrkVar, fbnc fbncVar, fbnd fbndVar) {
        try {
            Object objB = this.a.b();
            esrz.b(fbrkVar, this.b, true);
            esrz.b(fbrkVar, this.c, false);
            return new esta(new essu(fbndVar, fbrkVar, fbncVar, (ekgb) objB));
        } catch (StatusException e) {
            return new esvc(Status.c(e));
        }
    }
}
