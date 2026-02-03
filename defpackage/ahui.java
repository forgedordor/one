package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahui extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahui(UUID uuid) {
        super(a.h(uuid, "No restore execution found for session id [", "]"));
        uuid.getClass();
    }
}
