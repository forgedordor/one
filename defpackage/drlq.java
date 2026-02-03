package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
class drlq {
    private final long a;
    final String b;
    private final int c;

    public drlq(String str, int i, long j) {
        this.b = str;
        this.c = i;
        this.a = j;
    }

    final void a(ejwf ejwfVar) {
        ejwfVar.a(this.b);
        ejwfVar.a(new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US).format(new Date(this.a)));
        ejwfVar.f("queueSize", this.c);
    }
}
