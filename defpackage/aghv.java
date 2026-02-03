package defpackage;

import j$.util.Optional;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aghv {
    private final ejxr a;

    public aghv(final eygg eyggVar) {
        this.a = ejxx.a(new ejxr() { // from class: aghu
            @Override // defpackage.ejxr
            public final Object get() {
                return aghv.b(eyggVar);
            }
        });
    }

    public static Optional b(eygg eyggVar) {
        try {
            return Optional.of((CronetEngine) eyggVar.b());
        } catch (IllegalStateException | UnsatisfiedLinkError unused) {
            return Optional.empty();
        }
    }

    public final Optional a() {
        return (Optional) this.a.get();
    }
}
