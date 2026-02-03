package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgxt extends dgxi {
    private static final long p = TimeUnit.MINUTES.toMillis(1);
    public final dhaw i;
    public final Map j;
    public final crmx k;
    public final dgxf l;
    public final dgxu m;
    public final dgxd n;
    public final dfio o;
    private final dfht q;
    private volatile int r;
    private final Runnable s;
    private final dhay t;

    public dgxt(dfys dfysVar, dgwg dgwgVar, dgxm dgxmVar, dfio dfioVar, dhaw dhawVar, Context context, crmx crmxVar, dgxf dgxfVar, dhjt dhjtVar, dgxu dgxuVar, dgxd dgxdVar) {
        super(dfysVar, dgwgVar, dgxmVar, dhjtVar);
        this.j = new ConcurrentHashMap();
        this.r = 0;
        this.s = new dgxq(this);
        dgxr dgxrVar = new dgxr(this);
        this.t = dgxrVar;
        this.i = dhawVar;
        dhawVar.g.add(dgxrVar);
        this.o = dfioVar;
        this.q = dfht.a(context, "capability_publishing");
        this.k = crmxVar;
        this.l = dgxfVar;
        this.m = dgxuVar;
        this.n = dgxdVar;
    }

    @Override // defpackage.dgvq
    public final void e() {
        w(0L);
    }

    @Override // defpackage.dgvq
    public final void g(dezf dezfVar) throws dhax {
        try {
            this.q.b();
            v();
            dhja.c("Unpublishing presence capabilities for %s", dhiz.USER_ID.c(this.a.c().mUserName));
            dhaw dhawVar = this.i;
            dhawVar.b();
            dgvj dgvjVar = dhawVar.j;
            if (dgvjVar != null) {
                try {
                    if (dgvjVar.i == 1) {
                        throw new IllegalStateException("unpublish() cannot be called in the PENDING state!");
                    }
                    dgvjVar.i = 1;
                    dgvjVar.e = 0;
                    ebky ebkyVar = dgvjVar.d;
                    ebkyVar.a();
                    try {
                        eblf eblfVar = ((eblg) dgvjVar.a).a;
                        eblfVar.k(dgvjVar.b.d(eblfVar, ebkyVar, dgvjVar.c, dgvjVar.e, dgvjVar.g, null, new byte[0]), dgvjVar.h);
                    } catch (ebmn e) {
                        dhja.i(e, "Error while creating sip request: %s", e.getMessage());
                        dgvjVar.i = 3;
                    }
                } catch (Exception e2) {
                    throw new dhax("Error while unpublishing presence: ".concat(String.valueOf(e2.getMessage())), e2);
                }
            }
        } catch (dhax e3) {
            dhja.g("Can't send un-Publish for Presence: %s", e3.getMessage());
        }
        this.j.clear();
    }

    @Override // defpackage.dgxi
    public final void s(String str, long j, String str2) throws ebmn, dhax {
        if (str2 == null) {
            throw new IllegalArgumentException("MSISDN must not be null.");
        }
        dhja.c("Adding pending request for presence capability for %s", dhiz.PHONE_NUMBER.c(str2));
        this.j.put(str2, new dgxs(Long.valueOf(j)));
        try {
            dhaw dhawVar = this.i;
            try {
                dhaz dhazVar = dhawVar.i;
                if (dhazVar != null) {
                    dhazVar.i(dhawVar.p);
                }
                dhawVar.i = new dhaz(dhawVar, dhawVar.h, dhjv.l(str2, dhawVar.a.c(), dhawVar.l), dhawVar.f);
                dhaz dhazVar2 = dhawVar.i;
                dhazVar2.f = "application/pidf+xml, application/rlmi+xml, multipart/related";
                dhazVar2.k = 0;
                dhazVar2.l = dhkl.a().longValue();
                dhawVar.i.d(dhawVar.p);
                dhawVar.i.m();
            } catch (Exception e) {
                throw new dhax("Error while sending presence subscription ", e);
            }
        } catch (dhax unused) {
            throw new ebmn("Error requesting presence capability for ".concat(String.valueOf(dhiz.PHONE_NUMBER.c(str2))));
        }
    }

    @Override // defpackage.dgxi
    public final void t(String str) throws ebmn, dhax {
        if (this.j.containsKey(str)) {
            dhja.c("Presence Capabilities request for %s already pending", dhiz.PHONE_NUMBER.c(str));
        } else {
            s(null, 0L, str);
        }
    }

    public final synchronized long u() {
        int i;
        i = this.r;
        this.r = i + 1;
        long[] jArr = deze.a;
        return deze.a[Math.min(i, 15)] / 1000;
    }

    public final void v() {
        dhja.c("Resetting retry counter for publishing capabilities", new Object[0]);
        this.r = 0;
    }

    protected final void w(long j) {
        dhja.c("Scheduling publishing of capabilities with delay %d", Long.valueOf(j));
        Thread threadB = dhlc.a().b("capability_publishing", this.s, p);
        dfht dfhtVar = this.q;
        if (dfhtVar.e()) {
            dhja.c("Cancelling alarm timer before starting a new schedule", new Object[0]);
            dfhtVar.b();
        }
        dhja.c("Scheduling the capability publishing thread", new Object[0]);
        dfhtVar.d(threadB, j);
    }

    @Override // defpackage.dgvq
    public final void n() {
    }

    @Override // defpackage.dgvq
    public final void o() {
    }
}
