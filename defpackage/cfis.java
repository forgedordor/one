package defpackage;

import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfis {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/handler/common/PairingDesktopObserver");
    public final AtomicReference b = new AtomicReference();

    public final void a(ezol ezolVar) {
        this.b.set(ezolVar);
    }

    public final boolean b(ezol ezolVar) {
        return Objects.equals(ezolVar, this.b.get());
    }
}
