package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.time.Instant;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwfx implements dwgk {
    private final dwje a;
    private final dwcx b;
    private final String c;
    private final KeyPair d;
    private final Instant e;
    private final cdpp f;

    public dwfx(dwje dwjeVar, dvjj dvjjVar, cdpp cdppVar, String str, KeyPair keyPair, Instant instant) {
        this.a = dwjeVar;
        this.b = new dwcx(dvjjVar);
        this.f = cdppVar;
        this.c = str;
        this.d = keyPair;
        this.e = instant;
    }

    @Override // defpackage.dwgk
    public final ListenableFuture a(final ezpp ezppVar) {
        final ezol ezolVarB = dwcx.b(this.a.c().f());
        final ListenableFuture listenableFutureD = dwcx.d();
        eorg eorgVarD = eork.d(listenableFutureD);
        final dwcx dwcxVar = this.b;
        final Instant instant = this.e;
        final KeyPair keyPair = this.d;
        final String str = this.c;
        return eorgVarD.a(new Callable() { // from class: dwct
            @Override // java.util.concurrent.Callable
            public final Object call() throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
                ezpp ezppVar2 = ezppVar;
                String string = dwdu.a(ezppVar2.d).toString();
                Locale locale = Locale.US;
                String lowerCase = string.toLowerCase(Locale.US);
                Instant instant2 = instant;
                String str2 = String.format(locale, "%s:%d", lowerCase, Long.valueOf(eonw.a(instant2)));
                KeyPair keyPair2 = keyPair;
                evqs evqsVarA = dvjk.a(str2, keyPair2);
                ezlk ezlkVar = (ezlk) ezll.a.createBuilder();
                long jA = eonw.a(instant2);
                ezlkVar.copyOnWrite();
                ((ezll) ezlkVar.instance).e = jA;
                ezlkVar.copyOnWrite();
                ezll ezllVar = (ezll) ezlkVar.instance;
                ezppVar2.getClass();
                ezllVar.c = ezppVar2;
                ezllVar.b |= 1;
                ezlkVar.copyOnWrite();
                ezll ezllVar2 = (ezll) ezlkVar.instance;
                ezol ezolVar = ezolVarB;
                ezolVar.getClass();
                ezllVar2.d = ezolVar;
                ezllVar2.b |= 2;
                ezlj ezljVarA = dwcxVar.a((String) eork.q(listenableFutureD), str, null, keyPair2.getPublic());
                ezlkVar.copyOnWrite();
                ezll ezllVar3 = (ezll) ezlkVar.instance;
                ezljVarA.getClass();
                ezllVar3.h = ezljVarA;
                ezllVar3.b |= 4;
                if (evqsVarA == null) {
                    return (ezll) ezlkVar.build();
                }
                ezlkVar.copyOnWrite();
                ((ezll) ezlkVar.instance).f = 2;
                ezlkVar.copyOnWrite();
                ((ezll) ezlkVar.instance).g = evqsVarA;
                return (ezll) ezlkVar.build();
            }
        }, eoqg.a);
    }

    @Override // defpackage.dwgk
    public final /* bridge */ /* synthetic */ ListenableFuture b(ListenableFuture listenableFuture, Object obj) {
        final ezll ezllVar = (ezll) obj;
        return eooq.g(listenableFuture, new eooz() { // from class: dwfw
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                return ((eyzg) obj2).c(ezllVar);
            }
        }, eoqg.a);
    }

    @Override // defpackage.dwgk
    public final /* synthetic */ Object c(Object obj) {
        ezln ezlnVar = (ezln) obj;
        if ((ezlnVar.b & 2) == 0) {
            if (!ezlnVar.e) {
                dvqv dvqvVarE = dvqw.e();
                ((dvqi) dvqvVarE).d = 3;
                return dvqvVarE.a();
            }
            dvhv.a("RegRefreshRpcHandler", "RegisterRefreshResponse: retry with server timestamp");
            dvqv dvqvVarE2 = dvqw.e();
            dvqi dvqiVar = (dvqi) dvqvVarE2;
            dvqiVar.d = 4;
            dvqiVar.c = ejwi.j(Long.valueOf(ezlnVar.f));
            return dvqvVarE2.a();
        }
        dwjb dwjbVarE = dwje.e();
        dwin dwinVar = new dwin();
        dwinVar.e(this.a.c().f());
        dwjbVarE.f(dwinVar);
        dwjbVarE.d(ezlnVar.h);
        dwjbVarE.e(dwjd.VALID);
        dwje dwjeVarA = dwjbVarE.a();
        dwjs dwjsVarA = dwju.a();
        ezns eznsVar = ezlnVar.d;
        if (eznsVar == null) {
            eznsVar = ezns.a;
        }
        dwjsVarA.e(dvhz.a(eznsVar.b.I()));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        dvhn.a();
        long micros = timeUnit.toMicros(System.currentTimeMillis());
        ezns eznsVar2 = ezlnVar.d;
        if (eznsVar2 == null) {
            eznsVar2 = ezns.a;
        }
        dwjsVarA.g(micros + eznsVar2.c);
        dvhn.a();
        dwjsVarA.h(System.currentTimeMillis());
        dwjsVarA.f(this.d);
        dwju dwjuVarA = dwjsVarA.a();
        dvqv dvqvVarE3 = dvqw.e();
        dvqi dvqiVar2 = (dvqi) dvqvVarE3;
        dvqiVar2.d = 2;
        dvqiVar2.a = ejwi.j(dwjeVarA);
        dvqiVar2.b = ejwi.j(dwjuVarA);
        return dvqvVarE3.a();
    }

    @Override // defpackage.dwgk
    public final void d(UUID uuid, int i, Status status, dvyx dvyxVar, long j) {
        dwhp dwhpVarR = dwhq.r();
        dwhpVarR.g(10003);
        dwje dwjeVar = this.a;
        dwhpVarR.n(dwjeVar.c().f());
        dwhpVarR.o(dwjeVar.d().E());
        dwhpVarR.p(uuid.toString());
        dwhpVarR.j(1);
        dwhpVarR.m(Integer.valueOf(status.getCode().value()));
        dwhpVarR.f(i);
        dwhpVarR.e(j);
        dvyxVar.b(dwhpVarR.a());
    }

    @Override // defpackage.dwgk
    public final /* synthetic */ void e(UUID uuid, Object obj, dvyx dvyxVar, long j) {
        dvqw dvqwVar = (dvqw) obj;
        dwhp dwhpVarR = dwhq.r();
        dwhpVarR.g(10003);
        dwhpVarR.n(((dwim) dvqwVar.a().c()).b.f());
        dwhpVarR.o(((dwim) dvqwVar.a().c()).c.E());
        dwhpVarR.p(uuid.toString());
        dwhpVarR.e(j);
        if (dvqwVar.d() == 2 && dvqwVar.a().g()) {
            dwhpVarR.j(1);
            dwhpVarR.f(1);
            dvyxVar.b(dwhpVarR.a());
        } else if (dvqwVar.d() == 4) {
            dwhpVarR.j(1);
            dwhpVarR.f(3);
            dvyxVar.b(dwhpVarR.a());
        } else {
            dwje dwjeVar = this.a;
            dwhpVarR.n(dwjeVar.c().f());
            dwhpVarR.o(dwjeVar.d().E());
            dwhpVarR.j(1);
            dwhpVarR.f(2);
            dvyxVar.b(dwhpVarR.a());
        }
    }
}
