package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caxu extends RuntimeException {
    public final UUID a;

    public caxu(String str, UUID uuid) {
        super("Could not save WorkManager UUID to queue ".concat(str));
        this.a = uuid;
    }
}
