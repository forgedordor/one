package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.net.InetAddress;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebik implements ebid {
    public static final /* synthetic */ int a = 0;
    private static final ekgb b;
    private static final Executor c;
    private final ekgb d;

    static {
        int i = ekgb.d;
        b = ekoe.a;
        c = eoqg.a;
    }

    public ebik(ebid ebidVar, List list) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ekfwVar.h(ebidVar);
        ekfwVar.j(list);
        this.d = ekfwVar.g();
    }

    @Override // defpackage.ebid
    public final ListenableFuture a(String str) {
        return d(str, InetAddress.class, 0);
    }

    @Override // defpackage.ebid
    public final ListenableFuture b(String str) {
        return d(str, fgyk.class, 0);
    }

    @Override // defpackage.ebid
    public final ListenableFuture c(String str) {
        return d(str, fgzq.class, 0);
    }

    public final ListenableFuture d(final String str, final Class cls, final int i) {
        ListenableFuture listenableFutureF;
        ekgb ekgbVar = this.d;
        if (i >= ((ekoe) ekgbVar).c) {
            return eork.i(b);
        }
        if (i > 0) {
            dhja.q("making fallback DNS query for target %s", str);
        }
        if (cls.equals(fgyk.class)) {
            listenableFutureF = eooq.f(((ebid) ekgbVar.get(i)).b(str), new ejvr() { // from class: ebig
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    List list = (List) obj;
                    int i2 = ebik.a;
                    return list;
                }
            }, c);
        } else if (cls.equals(fgzq.class)) {
            listenableFutureF = eooq.f(((ebid) ekgbVar.get(i)).c(str), new ejvr() { // from class: ebih
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    List list = (List) obj;
                    int i2 = ebik.a;
                    return list;
                }
            }, c);
        } else {
            if (!cls.equals(InetAddress.class)) {
                throw new IllegalArgumentException("unexpected record classs: ".concat(String.valueOf(cls.getName())));
            }
            listenableFutureF = eooq.f(((ebid) ekgbVar.get(i)).a(str), new ejvr() { // from class: ebii
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    List list = (List) obj;
                    int i2 = ebik.a;
                    return list;
                }
            }, c);
        }
        final ListenableFuture listenableFuture = listenableFutureF;
        return eooq.g(eoqt.t(listenableFuture), new eooz() { // from class: ebij
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (!((List) obj).isEmpty()) {
                    return listenableFuture;
                }
                int i2 = i;
                Class cls2 = cls;
                return this.a.d(str, cls2, i2 + 1);
            }
        }, c);
    }
}
