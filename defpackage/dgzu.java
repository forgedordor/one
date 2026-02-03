package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgzu extends dgvq {
    public final fcsu h;
    public final dhfw i;
    public final crmx j;
    public final Context k;
    public final ebja l;
    public final dgxf m;
    public final dfcg n;
    public final dhgr o;
    public dgzv p;
    public final CopyOnWriteArrayList q;
    public final LinkedBlockingQueue r;
    public volatile boolean s;
    public final InstantMessageConfiguration t;
    public final dgzb u;
    public final deza v;
    public final fcsu w;
    private Thread y;
    private final Runnable z;
    private static final dfny x = dfod.a(181136833);
    public static final dhip g = new dhip("InstantMessagingService");

    public dgzu(Context context, dfys dfysVar, dgwg dgwgVar, fcsu fcsuVar, crmx crmxVar, ebja ebjaVar, dgxf dgxfVar, dfcg dfcgVar, dhjt dhjtVar, dhgr dhgrVar, dgzb dgzbVar, deza dezaVar, fcsu fcsuVar2) {
        super(dfysVar, dgwgVar, dhjtVar);
        this.q = new CopyOnWriteArrayList();
        this.r = new LinkedBlockingQueue();
        this.z = new dgzs(this);
        this.k = context;
        this.h = fcsuVar;
        this.j = crmxVar;
        this.i = new dhfw(dfysVar.c());
        this.l = ebjaVar;
        this.m = dgxfVar;
        this.n = dfcgVar;
        this.t = dfysVar.d();
        this.o = dhgrVar;
        this.u = dgzbVar;
        this.v = dezaVar;
        this.w = fcsuVar2;
    }

    public static int p(int i) {
        if (i == 403) {
            return 9;
        }
        if (i == 404) {
            return 1;
        }
        if (i == 406) {
            return 11;
        }
        if (i == 410) {
            return 1;
        }
        if (i == 486 || i == 488 || i == 500 || i == 600 || i == 603) {
            return 11;
        }
        if (i != 604) {
            return i;
        }
        return 1;
    }

    public static final byte[] y(dgyx dgyxVar) throws ebmn {
        dhja.l(g, "Reading byte content from MessageContent stream", new Object[0]);
        ebco ebcoVar = dgyxVar.g;
        if (ebcoVar != null) {
            return elec.b(ebcoVar.d());
        }
        throw new ebmn("MessageContent is null");
    }

    @Override // defpackage.dgvq
    protected final void f() {
        this.s = false;
        Thread thread = new Thread(this.z, "PM MSG Sender");
        this.y = thread;
        thread.start();
    }

    @Override // defpackage.dgvq
    protected final void g(dezf dezfVar) {
        this.s = true;
        Thread thread = this.y;
        if (thread != null) {
            thread.interrupt();
            this.y = null;
        }
        while (true) {
            LinkedBlockingQueue linkedBlockingQueue = this.r;
            if (linkedBlockingQueue.isEmpty()) {
                linkedBlockingQueue.clear();
                return;
            }
            u((dgyx) linkedBlockingQueue.poll(), 8);
        }
    }

    @Override // defpackage.dgvq
    protected final void m(dgwe dgweVar, dezf dezfVar) {
        if ((dgweVar instanceof dgzn) && ((dgzn) dgweVar).E) {
            dhja.d(g, "Chat conference found - disconnecting instead of stopping.", new Object[0]);
            dgweVar.E(dezfVar);
            return;
        }
        int iOrdinal = dezfVar.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            dgweVar.n(2, 4);
        } else {
            dgweVar.l();
        }
    }

    public final eblf q() {
        eblf eblfVar = ((eblg) this.h).a;
        if (eblfVar.v()) {
            throw new ebmn("SIP stack not initialized");
        }
        return eblfVar;
    }

    public final String r() {
        return this.a.e();
    }

    public final String s(String str) {
        String strF;
        ImsConfiguration imsConfigurationC = this.a.c();
        if (!((Boolean) x.a()).booleanValue()) {
            ebma ebmaVarC = dhjv.c(str, imsConfigurationC, this.j);
            ebmaVarC.getClass();
            return ebmaVarC.toString();
        }
        boolean zY = dhjv.y(imsConfigurationC);
        try {
            strF = q().f();
        } catch (ebmn e) {
            dhja.n(3, g, e, "SipStack is not initialized", new Object[0]);
            strF = "";
        }
        if (TextUtils.isEmpty(strF)) {
            strF = this.a.c().mDomain;
        }
        ebma ebmaVarD = dhjv.d(str, strF, this.j, zY);
        ebmaVarD.getClass();
        return ebmaVarD.toString();
    }

    public final void t(dgzd dgzdVar) {
        this.q.add(dgzdVar);
    }

    public final void u(dgyx dgyxVar, int i) {
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            ((dgzd) it.next()).a(dgyxVar, i);
        }
    }

    public final void v(dgzn dgznVar) {
        boolean zD = dfou.d();
        if (this.p == null) {
            dhja.d(g, "Not notifying, no listener registered", new Object[0]);
            return;
        }
        if (!dgznVar.J) {
            if (dgznVar.E) {
                dhja.d(g, "Group chat session", new Object[0]);
            } else {
                dhja.d(g, "1:1 chat session", new Object[0]);
            }
            if (dgznVar instanceof dhaq) {
                this.p.c(dgznVar);
                return;
            } else {
                this.p.b(dgznVar);
                return;
            }
        }
        if (!zD) {
            dhja.d(g, "Discarding incoming RBM bot chat session, feature disabled.", new Object[0]);
            return;
        }
        dhja.d(g, "1-1 chat session: RBM bot chat session.", new Object[0]);
        if (dgznVar instanceof dhaq) {
            this.p.d(dgznVar);
        } else {
            this.p.e(dgznVar);
        }
    }

    public final void w(dgzd dgzdVar) {
        this.q.remove(dgzdVar);
    }

    public final boolean x() {
        ebkr ebkrVar = dhjv.a;
        return this.t.a();
    }

    @Override // defpackage.dgvq
    public final void n() {
    }

    @Override // defpackage.dgvq
    public final void o() {
    }
}
