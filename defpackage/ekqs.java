package defpackage;

import defpackage.ekrw;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ekqs<API extends ekrw<API>> {
    public final ekta b;

    protected ekqs(ekta ektaVar) {
        ektaVar.getClass();
        this.b = ektaVar;
    }

    public static void l(String str, eksx eksxVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(TimeUnit.NANOSECONDS.toMillis(eksxVar.d()))));
        sb.append(": logging error [");
        eksz.a(1, eksxVar.e(), sb);
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }

    public abstract ekrw a(Level level);

    public final ekrw d() {
        return a(Level.CONFIG);
    }

    public final ekrw e() {
        return a(Level.FINE);
    }

    public final ekrw f() {
        return a(Level.FINER);
    }

    public final ekrw g() {
        return a(Level.FINEST);
    }

    public final ekrw h() {
        return a(Level.INFO);
    }

    public final ekrw i() {
        return a(Level.SEVERE);
    }

    public final ekrw j() {
        return a(Level.WARNING);
    }

    protected final String k() {
        return this.b.d();
    }

    protected final boolean m(Level level) {
        return this.b.c(level);
    }
}
