package defpackage;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class came {
    public static final String a(Instant instant) {
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(instant, ZoneId.ofOffset("UTC", ZoneOffset.UTC));
        Object objA = cams.a.a();
        objA.getClass();
        String str = ((DateTimeFormatter) objA).format(localDateTimeOfInstant);
        str.getClass();
        return str;
    }
}
