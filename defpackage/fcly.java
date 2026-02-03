package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcly extends fbsk {
    public static final Logger a = Logger.getLogger(fcly.class.getName());
    public static final fchy b = new fcml(fcdy.o);
    public static final fbpc c = new fclx();
    private static final fboo t = fboo.b;
    private static final fbns u = fbns.a;
    private static final long v = TimeUnit.SECONDS.toMillis(120);
    public final fclw h;
    public final fcei d = new fcei();
    final List e = new ArrayList();
    public final List f = new ArrayList();
    public final List g = new ArrayList();
    public fbpc i = c;
    public fchy j = b;
    public fboo k = t;
    public fbns l = u;
    public long m = v;
    fbok n = fbol.a;
    public boolean o = true;
    public boolean p = true;
    public boolean q = true;
    public boolean r = true;
    fbpi s = fbpi.b;

    public fcly(fclw fclwVar) {
        this.h = fclwVar;
        Iterator it = fbnu.a().b().iterator();
        while (it.hasNext()) {
            ((fbnt) it.next()).b();
        }
    }
}
