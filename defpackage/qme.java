package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qme {
    public static final String a = qas.d("WorkTimer");
    public final qbi b;
    public final Map c = new HashMap();
    public final Map d = new HashMap();
    public final Object e = new Object();

    public qme(qbi qbiVar) {
        this.b = qbiVar;
    }

    public final void a(qiw qiwVar) {
        synchronized (this.e) {
            if (((qmd) this.c.remove(qiwVar)) != null) {
                qas.c().a(a, a.l(qiwVar, "Stopping timer for "));
                this.d.remove(qiwVar);
            }
        }
    }
}
