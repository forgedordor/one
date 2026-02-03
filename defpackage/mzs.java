package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mzs extends Exception {
    public mzs(UUID uuid) {
        super("Media does not support uuid: ".concat(uuid.toString()));
    }
}
