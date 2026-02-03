package defpackage;

import j$.time.Instant;
import j$.util.Optional;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class cmvr {
    static cmvr d(UUID uuid, Instant instant, Instant instant2) {
        return new cmvf(uuid, instant, Optional.of(instant2));
    }

    public abstract Instant a();

    public abstract Optional b();

    public abstract UUID c();
}
