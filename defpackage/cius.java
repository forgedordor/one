package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class cius {
    public abstract ciuu a();

    public abstract Optional b();

    public abstract Optional c();

    public abstract void d(ciut ciutVar);

    public final ciuu e() {
        ejwl.b(c().isPresent() != b().isPresent(), "Either RcsGroupTelephonyData or ParseError must be present.");
        return a();
    }
}
