package defpackage;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqlj implements Serializable, dqlm {
    private static final TimeUnit a = TimeUnit.MINUTES;
    private static final long serialVersionUID = 0;

    @Override // defpackage.dqlm
    public final int a() {
        return 1;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return dqlm.class;
    }

    @Override // defpackage.dqlm
    public final int b() {
        return 1000;
    }

    @Override // defpackage.dqlm
    public final int c() {
        return 1;
    }

    @Override // defpackage.dqlm
    public final int d() {
        return 1;
    }

    @Override // defpackage.dqlm
    public final int e() {
        return 1000;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dqlm) {
            dqlm dqlmVar = (dqlm) obj;
            dqlmVar.d();
            dqlmVar.e();
            dqlmVar.a();
            dqlmVar.b();
            dqlmVar.c();
            dqlmVar.f();
            if (a.equals(dqlmVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dqlm
    public final long f() {
        return 1L;
    }

    @Override // defpackage.dqlm
    public final TimeUnit g() {
        return a;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (a.hashCode() ^ (-810573619)) - 1944263094;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.android.libraries.concurrent.monitoring.ThreadMonitoringConfiguration()";
    }
}
