package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czog {
    public final eosc a;
    public final egxv b;
    public final cogw c;
    public final cqjk d;
    public final czoo e;
    private final egyt f;

    public czog(eosc eoscVar, egxv egxvVar, egyt egytVar, cogw cogwVar, cqjk cqjkVar, czoo czooVar) {
        this.a = eoscVar;
        this.b = egxvVar;
        this.f = egytVar;
        this.c = cogwVar;
        this.d = cqjkVar;
        this.e = czooVar;
    }

    static /* synthetic */ Boolean b() throws Throwable {
        if (cqbe.j()) {
            return true;
        }
        try {
            cqdk.b("am_expression_jni");
            return true;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }

    public final egyi a() {
        return new egys(this.f, new eopk() { // from class: czoa
            @Override // defpackage.eopk
            public final eopy a(eopt eoptVar) {
                return new eopy(eijx.g(new Callable() { // from class: czob
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return czog.b();
                    }
                }, this.a.a));
            }
        }, new Object());
    }
}
