package defpackage;

import j$.util.Objects;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dgwm implements dhgn {
    public final String b;
    public final fcsu c;
    public final dhfw d;
    public ebky e;
    public boolean h;
    public String i;
    public String[] j;
    public final dhjt m;
    private final dhgo n;
    private final dhgo o;
    private final dfys p;
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public String f = "application/pidf+xml,application/rlmi+xml,multipart/related";
    protected String g = "eventlist";
    public int k = 3600;
    public long l = dhkl.a().longValue() + (this.k * 1000);
    private final eblu q = new dgwk(this);
    private final eblu r = new dgwl(this);

    public dgwm(dfys dfysVar, fcsu fcsuVar, String str, String str2, dhgo dhgoVar, dhgo dhgoVar2, dhjt dhjtVar) {
        this.p = dfysVar;
        this.c = fcsuVar;
        this.b = str2;
        this.n = dhgoVar;
        this.o = dhgoVar2;
        this.m = dhjtVar;
        this.d = new dhfw(dfysVar.c());
        this.i = str;
        this.e = b(fcsuVar);
    }

    protected static final String s(ebqr ebqrVar) {
        String strJ = ebqrVar.j("Subscription-State");
        if (strJ == null) {
            return null;
        }
        int iIndexOf = strJ.indexOf(59);
        return iIndexOf > 0 ? strJ.substring(0, iIndexOf) : strJ;
    }

    private final void u(ebqr ebqrVar) {
        ebqrVar.r("Event: ".concat(String.valueOf(this.b)));
        ebqrVar.r("Accept: ".concat(String.valueOf(this.f)));
        if (dhim.d(this.g)) {
            return;
        }
        ebqrVar.r("Supported: ".concat(String.valueOf(this.g)));
    }

    private final void v(dhft dhftVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dgwo) it.next()).r(dhftVar);
        }
    }

    private final void w(ebqr ebqrVar) {
        String[] strArr = this.j;
        if (strArr == null || strArr.length == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder("Accept-Contact: *");
        for (int i = 0; i < this.j.length; i++) {
            sb.append(';');
            sb.append(this.j[i]);
        }
        ebqrVar.r(sb.toString());
    }

    @Override // defpackage.dhgg
    public final int a() {
        return this.k;
    }

    public final ebky b(fcsu fcsuVar) throws ebmn {
        dfys dfysVar = this.p;
        dfysVar.getClass();
        eblf eblfVar = ((eblg) fcsuVar).a;
        if (eblfVar.v()) {
            throw new ebmn("The sip stack is not available");
        }
        ArrayList arrayListQ = eblfVar.q();
        if (Objects.isNull(dfysVar.c())) {
            throw new ebmn("ims.getConfiguration() failed");
        }
        String str = this.i;
        if (Objects.isNull(str)) {
            throw new ebmn("Remote URI is null. Failed to create dialog path.");
        }
        String strE = dfysVar.e();
        if (Objects.isNull(strE)) {
            throw new ebmn("Public User Identity is null. Failed to create dialog path.");
        }
        return new ebky(eblf.w(), 1, str, strE, str, arrayListQ);
    }

    public final eblf c() throws ebmn {
        eblf eblfVar = ((eblg) this.c).a;
        if (eblfVar.v()) {
            throw new ebmn("imsModule.getSipStack() returned null");
        }
        return eblfVar;
    }

    public final void d(dgwo dgwoVar) {
        this.a.add(dgwoVar);
    }

    protected final void e(String str) {
        if (str == null || !str.startsWith("terminated")) {
            return;
        }
        g(null);
    }

    public final void f(int i, String str) {
        l(false);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dgwo) it.next()).q(i, str);
        }
    }

    public final void g(dhft dhftVar) {
        l(false);
        if (dhftVar == null) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((dgwo) it.next()).u();
            }
        } else {
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                ((dgwo) it2.next()).v(dhftVar);
            }
        }
    }

    public void h(ebqr ebqrVar) {
        try {
            j(ebqrVar);
            String strS = s(ebqrVar);
            List<ebqo> listO = ebqrVar.o();
            dhja.c("Got notify containing: %d parts", Integer.valueOf(listO.size()));
            if (ebqrVar.h() == null) {
                t(null, new byte[0]);
            } else if (listO.size() == 0) {
                t(null, new byte[0]);
            } else {
                for (ebqo ebqoVar : listO) {
                    t(ebqoVar.b, ebqoVar.a);
                }
            }
            e(strS);
        } catch (Exception e) {
            dhja.i(e, "Error while processing notify: %s", e.getMessage());
        }
    }

    public final void i(dgwo dgwoVar) {
        if (Objects.isNull(dgwoVar)) {
            return;
        }
        this.a.remove(dgwoVar);
    }

    protected final void j(ebqr ebqrVar) throws ebmn {
        c().s(this.m.n(ebqrVar));
    }

    protected void k(ebqr ebqrVar) throws ebmn {
        u(ebqrVar);
        w(ebqrVar);
        c().k(ebqrVar, this.q);
    }

    public final void l(boolean z) {
        dhja.c("Stop refreshing subscription for %s", dhiz.URI.c(this.i));
        dhja.c("Remove subscription %s", this);
        dgwn dgwnVar = (dgwn) this.n;
        dgwnVar.a.remove(this);
        dhgm dhgmVar = dgwnVar.b;
        dhip dhipVar = dhgmVar.c;
        dhja.d(dhipVar, "removing refreshable: %s", this);
        PriorityQueue priorityQueue = dhgmVar.b;
        synchronized (priorityQueue) {
            priorityQueue.remove(new dhgl(this));
            if (priorityQueue.isEmpty()) {
                if (craf.d) {
                    AtomicReference atomicReference = dhgmVar.e;
                    if (atomicReference.get() != null) {
                        dhja.d(dhipVar, "Removed last refreshable - stopping timer", new Object[0]);
                        DesugarAtomicReference.getAndUpdate(atomicReference, new UnaryOperator() { // from class: dhgj
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                eosb eosbVar = (eosb) obj;
                                int i = dhgm.f;
                                if (eosbVar == null) {
                                    return null;
                                }
                                eosbVar.cancel(false);
                                return null;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                    }
                } else if (dhgmVar.d != null) {
                    dhja.d(dhipVar, "Removed last refreshable - stopping timer", new Object[0]);
                    dhgmVar.a.b();
                    dhgmVar.d = null;
                }
            }
        }
        if (z) {
            dgwv dgwvVar = (dgwv) this.o;
            dgwvVar.a();
            dgwvVar.a.add(this);
        }
    }

    public final void m() {
        String str = this.b;
        dhja.c("Sending subscribe for event: %s to %s", str, dhiz.URI.c(this.i));
        this.e.a();
        try {
            String[] strArr = this.j;
            if (strArr == null) {
                strArr = new String[0];
            }
            ebqr ebqrVarE = this.m.e(c(), this.e, this.k, str, strArr);
            dhgo dhgoVar = this.n;
            dhja.c("Adding subscription %s", this);
            ((dgwn) dhgoVar).a.add(this);
            ((dgwn) dhgoVar).b.b(this);
            k(ebqrVarE);
        } catch (Exception e) {
            dhja.i(e, "Error while subscribing: %s", e.getMessage());
            v(new dhfv("Error while subscribing refer: ".concat(String.valueOf(e.getMessage())), e));
        }
    }

    public final void n() {
        this.e.a();
        try {
            String[] strArr = this.j;
            if (strArr == null) {
                strArr = new String[0];
            }
            c().k(this.m.e(c(), this.e, 0, this.b, strArr), this.r);
        } catch (Exception e) {
            dhja.i(e, "Error while unsubscribing: %s", e.getMessage());
            g(new dhfv("Error while unsubscribing refer: ".concat(String.valueOf(e.getMessage())), e));
        }
    }

    public final void o(ebqs ebqsVar) {
        String strL = ebqsVar.l();
        this.e.e = dhjv.i(strL);
    }

    @Override // defpackage.dhgn
    public final boolean p() {
        return dhkl.a().longValue() > this.l;
    }

    @Override // defpackage.dhgg
    public final void q(dhgk dhgkVar) {
        String str = this.b;
        dhja.c("Sending subscribe refresh for event: %s to %s", str, dhiz.URI.c(this.i));
        this.e.a();
        try {
            String[] strArr = this.j;
            if (strArr == null) {
                strArr = new String[0];
            }
            ebqr ebqrVarE = this.m.e(c(), this.e, this.k, str, strArr);
            u(ebqrVarE);
            w(ebqrVarE);
            c().k(ebqrVarE, new dgwj(this, dhgkVar));
        } catch (Exception e) {
            dhja.i(e, "Error while subscribing: %s", e.getMessage());
            v(new dhfv("Error while subscribing refer: ".concat(String.valueOf(e.getMessage())), e));
        }
    }

    protected final void t(String str, byte[] bArr) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dgwo) it.next()).d(this, str, bArr);
        }
    }
}
