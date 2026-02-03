package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abcp {
    public static Optional a(Optional optional) {
        return optional.isPresent() ? Optional.of(optional.get()) : Optional.empty();
    }
}
