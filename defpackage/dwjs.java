package defpackage;

import j$.time.Instant;
import java.security.KeyPair;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dwjs {
    public abstract dwju a();

    public abstract void b(Instant instant);

    public abstract void c(dwjt dwjtVar);

    public abstract void d(Instant instant);

    public abstract void e(ekgb ekgbVar);

    public final void f(KeyPair keyPair) {
        keyPair.getClass();
        c(new dwkl(keyPair));
    }

    public final void g(long j) {
        b(eonw.b(j));
    }

    public final void h(long j) {
        d(Instant.ofEpochMilli(j));
    }
}
