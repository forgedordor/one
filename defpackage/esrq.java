package defpackage;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.net.URI;
import java.net.URISyntaxException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esrq extends fbnd {
    private final String a;
    private final esmk b;
    private final Object c = new Object();
    private final ConcurrentHashMap d = new ConcurrentHashMap();

    public esrq(String str, esmk esmkVar) {
        this.a = str;
        this.b = esmkVar;
    }

    private static final URI c(String str) {
        try {
            URI uri = new URI(null, str, null, null, null);
            return uri.getPort() != -1 ? uri : new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), 443, uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (URISyntaxException e) {
            throw new IllegalStateException("Malformed endpoint authority", e);
        }
    }

    @Override // defpackage.fbnd
    public final fbnh a(fbrk fbrkVar, fbnc fbncVar) throws Throwable {
        Object obj;
        String str = (String) fbncVar.h(esoc.a);
        if (str == null) {
            str = this.a;
        }
        esmk esmkVar = this.b;
        URI uriC = c(str);
        ejwl.m(!TextUtils.isEmpty(uriC.getAuthority()), "Could not parse channel authority");
        Integer num = (Integer) fbncVar.h(estq.a);
        Integer num2 = (Integer) fbncVar.h(estq.b);
        Integer num3 = (Integer) fbncVar.h(esnx.a);
        esma esmaVar = (esma) esmkVar;
        long jLongValue = ((Long) ((ejxw) esmaVar.j).a).longValue();
        long j = esmaVar.m;
        long j2 = esmaVar.n;
        esqs esqsVar = new esqs(uriC, jLongValue, j, j2, num, num2, num3);
        ConcurrentHashMap concurrentHashMap = this.d;
        esro esroVar = (esro) concurrentHashMap.get(esqsVar);
        if (esroVar == null) {
            Object obj2 = this.c;
            synchronized (obj2) {
                try {
                    try {
                        if (!concurrentHashMap.containsKey(esqsVar)) {
                            long j3 = esof.n;
                            ejxw ejxwVar = new ejxw(false);
                            esmh esmhVar = new esmh();
                            esmhVar.h = ejxwVar;
                            esmhVar.c(4194304);
                            esmhVar.a(Long.MAX_VALUE);
                            esmhVar.b(esof.n);
                            esmhVar.a = ((esma) esmkVar).a;
                            esmhVar.b = esqsVar.a;
                            esmhVar.j = esqsVar.c;
                            esmhVar.k = esqsVar.d;
                            esmhVar.l = esqsVar.b;
                            esmhVar.p = (byte) (esmhVar.p | 1);
                            esmhVar.c = ((esma) esmkVar).d;
                            esmhVar.d = ((esma) esmkVar).e;
                            esmhVar.e = ((esma) esmkVar).c;
                            esmhVar.f = ((esma) esmkVar).f;
                            esmhVar.g = ((esma) esmkVar).h;
                            esmhVar.h = ((esma) esmkVar).i;
                            esmhVar.i = ((esma) esmkVar).k;
                            esmhVar.a(j);
                            esmhVar.b(j2);
                            Integer num4 = esqsVar.e;
                            if (num4 != null) {
                                esmhVar.c(num4.intValue());
                            } else {
                                esmhVar.c(((esma) esmkVar).l);
                            }
                            esog esogVar = ((esma) esmkVar).b;
                            if (esmhVar.p == 15 && esmhVar.a != null && esmhVar.b != null && esmhVar.c != null && esmhVar.d != null && esmhVar.e != null && esmhVar.h != null) {
                                obj = obj2;
                                concurrentHashMap.put(esqsVar, new esro(esogVar, new esmi(esmhVar.a, esmhVar.b, esmhVar.c, esmhVar.d, esmhVar.e, esmhVar.f, esmhVar.g, esmhVar.h, esmhVar.i, esmhVar.j, esmhVar.k, esmhVar.l, esmhVar.m, esmhVar.n, esmhVar.o)));
                            }
                            StringBuilder sb = new StringBuilder();
                            if (esmhVar.a == null) {
                                sb.append(" applicationContext");
                            }
                            if (esmhVar.b == null) {
                                sb.append(" uri");
                            }
                            if (esmhVar.c == null) {
                                sb.append(" backgroundExecutor");
                            }
                            if (esmhVar.d == null) {
                                sb.append(" blockingExecutor");
                            }
                            if (esmhVar.e == null) {
                                sb.append(" lightweightExecutor");
                            }
                            if (esmhVar.h == null) {
                                sb.append(" recordNetworkMetricsToPrimes");
                            }
                            if ((esmhVar.p & 1) == 0) {
                                sb.append(" grpcIdleTimeoutMillis");
                            }
                            if ((esmhVar.p & 2) == 0) {
                                sb.append(" maxMessageSize");
                            }
                            if ((esmhVar.p & 4) == 0) {
                                sb.append(" grpcKeepAliveTimeMillis");
                            }
                            if ((esmhVar.p & 8) == 0) {
                                sb.append(" grpcKeepAliveTimeoutMillis");
                            }
                            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                        }
                        obj = obj2;
                        esroVar = (esro) concurrentHashMap.get(esqsVar);
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
            throw th;
        }
        return esroVar.a(fbrkVar, fbncVar);
    }

    @Override // defpackage.fbnd
    public final String b() {
        return this.a;
    }
}
