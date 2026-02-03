package defpackage;

import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eddj {
    public static String a(evvp evvpVar) {
        Date date = new Date(evxc.a(evvpVar));
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance();
        dateTimeInstance.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return dateTimeInstance.format(date);
    }
}
