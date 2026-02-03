package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Objects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ejbe extends ejaq {
    static final Duration c = Duration.ofMinutes(3);
    static final Duration d = Duration.ofMinutes(3).plusSeconds(45);
    public static final ekgp e = ekoj.a;
    private static final long serialVersionUID = 4556936364828217687L;
    private final Duration a;
    private final Duration b;
    final Object f;
    public volatile ejba g;
    transient ejbc h;

    protected ejbe() {
        this(null, d, c);
    }

    private final int b() {
        ejba ejbaVar = this.g;
        if (ejbaVar == null) {
            return 3;
        }
        Long l = ejbaVar.a.b;
        Date date = l == null ? null : new Date(l.longValue());
        if (date == null) {
            return 1;
        }
        long time = date.getTime() - System.currentTimeMillis();
        Duration duration = this.a;
        Duration durationOfMillis = Duration.ofMillis(time);
        if (durationOfMillis.compareTo(duration) <= 0) {
            return 3;
        }
        return durationOfMillis.compareTo(this.b) <= 0 ? 2 : 1;
    }

    public static ejbe d(ejas ejasVar) {
        ejay ejayVar = new ejay();
        ejayVar.a = ejasVar;
        return new ejbe(ejayVar.a, ejayVar.b, ejayVar.c);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.h = null;
    }

    @Override // defpackage.ejaq
    public void a(Executor executor, fbtu fbtuVar) {
        ejax ejaxVar;
        ListenableFuture listenableFutureI;
        ListenableFuture listenableFutureI2;
        if (b() == 1) {
            listenableFutureI2 = eork.i(this.g);
        } else {
            Object obj = this.f;
            synchronized (obj) {
                if (b() != 1) {
                    synchronized (obj) {
                        ejbc ejbcVar = this.h;
                        if (ejbcVar != null) {
                            ejaxVar = new ejax(ejbcVar, false);
                        } else {
                            eosa eosaVar = new eosa(new ejaw(this));
                            this.h = new ejbc(eosaVar, new ejbd(this, eosaVar));
                            ejaxVar = new ejax(this.h, true);
                        }
                    }
                } else {
                    ejaxVar = null;
                }
            }
            if (ejaxVar != null && ejaxVar.b) {
                executor.execute(ejaxVar.a);
            }
            synchronized (this.f) {
                listenableFutureI = b() != 3 ? eork.i(this.g) : ejaxVar != null ? ejaxVar.a : eork.h(new IllegalStateException("Credentials expired, but there is no task to refresh"));
            }
            listenableFutureI2 = listenableFutureI;
        }
        eork.r(listenableFutureI2, new ejaz(fbtuVar), eoqg.a);
    }

    public ejas c() {
        throw new IllegalStateException("OAuth2Credentials instance does not support refreshing the access token. An instance with a new access token should be used, or a derived type that supports refreshing.");
    }

    public boolean equals(Object obj) {
        if (obj instanceof ejbe) {
            return Objects.equals(this.g, ((ejbe) obj).g);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.g);
    }

    public String toString() {
        Map map;
        ejas ejasVar;
        ejba ejbaVar = this.g;
        if (ejbaVar != null) {
            map = ejbaVar.b;
            ejasVar = ejbaVar.a;
        } else {
            map = null;
            ejasVar = null;
        }
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("requestMetadata", map);
        ejwfVarB.b("temporaryAccess", ejasVar);
        return ejwfVarB.toString();
    }

    protected ejbe(ejas ejasVar, Duration duration, Duration duration2) {
        this.f = new byte[0];
        this.g = null;
        if (ejasVar != null) {
            this.g = ejba.a(ejasVar, e);
        }
        duration.getClass();
        this.b = duration;
        ejwl.b(!duration.isNegative(), "refreshMargin can't be negative");
        duration2.getClass();
        this.a = duration2;
        ejwl.b(!duration2.isNegative(), "expirationMargin can't be negative");
    }
}
