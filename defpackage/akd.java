package defpackage;

import j$.time.DateTimeException;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akd {
    public static final Instant a(long j) {
        try {
            return Instant.ofEpochMilli(j);
        } catch (DateTimeException unused) {
            return Instant.EPOCH;
        }
    }
}
