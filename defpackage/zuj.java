package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zuj implements zuh {
    public final fcsu a;
    public final fcsu b;
    public final AtomicReference c;
    private final efwo d;
    private final dzuc e;
    private final dzqp f;
    private final cmwj g;
    private final aisp h;
    private final cmxn i;
    private final ajfx j;
    private final Optional k;
    private final fcsu l;
    private final fdjx m;
    private final fcsu n;
    private final fcsu o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private final AtomicInteger u;
    private aisq v;
    private aiuz w;

    public zuj(efwo efwoVar, dzuc dzucVar, dzqp dzqpVar, cmwj cmwjVar, aisp aispVar, cmxn cmxnVar, ajfx ajfxVar, Optional optional, fcsu fcsuVar, fcsu fcsuVar2, fdjx fdjxVar, fcsu fcsuVar3, AtomicReference atomicReference, fcsu fcsuVar4, fcsu fcsuVar5) {
        efwoVar.getClass();
        dzucVar.getClass();
        dzqpVar.getClass();
        cmwjVar.getClass();
        aispVar.getClass();
        cmxnVar.getClass();
        ajfxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fdjxVar.getClass();
        fcsuVar3.getClass();
        atomicReference.getClass();
        fcsuVar5.getClass();
        this.d = efwoVar;
        this.e = dzucVar;
        this.f = dzqpVar;
        this.g = cmwjVar;
        this.h = aispVar;
        this.i = cmxnVar;
        this.j = ajfxVar;
        this.k = optional;
        this.l = fcsuVar;
        this.a = fcsuVar2;
        this.m = fdjxVar;
        this.b = fcsuVar3;
        this.c = atomicReference;
        this.n = fcsuVar4;
        this.o = fcsuVar5;
        this.u = new AtomicInteger();
    }

    private final void k(Context context) throws IOException {
        if (!this.t && this.p && this.q && this.r) {
            this.t = true;
            eieu eieuVarH = eiiy.h("ConversationStartupTracker#onReady");
            try {
                dztc.a.b(daiy.a(context));
                if (((aqee) this.o.b()).a()) {
                    j(((ajfr) this.b.b()).a(((aurx) this.a.b()).C()));
                } else {
                    AtomicReference atomicReference = this.c;
                    if (((feds) atomicReference.get()).equals(feds.UNKNOWN_CLOUD_SYNC_STATUS)) {
                        auvw.c(this.m, fcyi.a, fdjz.a, new zui(this, null));
                    } else {
                        feeg feegVarA = ((ajfr) this.b.b()).a((feds) atomicReference.get());
                        feegVarA.getClass();
                        j(feegVarA);
                    }
                }
                fczl.a(eieuVarH, null);
                aisq aisqVar = this.v;
                if (aisqVar != null) {
                    aisqVar.b();
                }
                aiuz aiuzVar = this.w;
                if (aiuzVar != null) {
                    aiuzVar.a();
                }
                auvh.h(this.g.a(this.d));
                ((xvf) this.n.b()).a(true);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    fczl.a(eieuVarH, th);
                    throw th2;
                }
            }
        }
    }

    @Override // defpackage.zuh
    public final void a(boolean z) {
        this.j.e(z ? zug.g : zug.f, this.u.get(), null, dzua.CANCEL);
    }

    @Override // defpackage.zuh
    public final void b() throws IOException {
        if (this.s) {
            return;
        }
        eieu eieuVarH = eiiy.h("ConversationStartupTracker#onComposeRowDraftLoaded");
        try {
            this.s = true;
            this.j.d(zug.d, this.u.get(), null);
            fczl.a(eieuVarH, null);
        } finally {
        }
    }

    @Override // defpackage.zuh
    public final void c(Context context) throws IOException {
        ecem.c();
        if (this.r) {
            return;
        }
        eieu eieuVarH = eiiy.h("ConversationStartupTracker#onComposeRowInteractive");
        try {
            this.r = true;
            this.j.d(zug.c, this.u.get(), null);
            k(context);
            fczl.a(eieuVarH, null);
        } finally {
        }
    }

    @Override // defpackage.zuh
    public final void d() throws IOException {
        aiuz aiuzVarA;
        eieu eieuVarH = eiiy.h("ConversationStartupTracker#onFragmentCreation");
        try {
            ecem.c();
            this.p = false;
            this.q = false;
            this.r = false;
            this.s = false;
            this.t = false;
            this.v = null;
            ((xvf) this.n.b()).a(false);
            int iIncrementAndGet = this.u.incrementAndGet();
            ajfx ajfxVar = this.j;
            ajfxVar.a(ajfo.o, iIncrementAndGet);
            ajfxVar.a(zug.a, iIncrementAndGet);
            ajfxVar.a(zug.b, iIncrementAndGet);
            ajfxVar.a(zug.c, iIncrementAndGet);
            ajfxVar.a(zug.d, iIncrementAndGet);
            ajfxVar.a(zug.e, iIncrementAndGet);
            ajfxVar.a(zug.f, iIncrementAndGet);
            ajfxVar.a(zug.g, iIncrementAndGet);
            this.v = this.h.b(176569, null);
            aiuy aiuyVar = (aiuy) fdct.b(this.k);
            if (aiuyVar != null) {
                Object objB = this.l.b();
                objB.getClass();
                aiuzVarA = aiuyVar.a(((Number) objB).longValue());
            } else {
                aiuzVarA = null;
            }
            this.w = aiuzVarA;
            cmxn cmxnVar = this.i;
            ((ekrd) ((ekrd) cmxn.b.e()).h("com/google/android/apps/messaging/shared/stuckmessages/MessageLatencyAnalytics", "conversationScreenOpened", 881, "MessageLatencyAnalytics.java")).q("Recording new conversation screen open time.");
            cmxnVar.v = cmxnVar.r.a();
            fczl.a(eieuVarH, null);
        } finally {
        }
    }

    @Override // defpackage.zuh
    public final void e(Context context) throws IOException {
        ecem.c();
        if (this.q) {
            return;
        }
        eieu eieuVarH = eiiy.h("ConversationStartupTracker#onMessageListInteractive");
        try {
            this.q = true;
            this.j.d(zug.b, this.u.get(), null);
            k(context);
            fczl.a(eieuVarH, null);
        } finally {
        }
    }

    @Override // defpackage.zuh
    public final void f() {
        aisq aisqVar = this.v;
        if (aisqVar != null) {
            aisqVar.a();
        }
        aiuz aiuzVar = this.w;
        if (aiuzVar != null) {
            aiuzVar.a();
        }
    }

    @Override // defpackage.zuh
    public final void g() {
        this.j.d(zug.e, this.u.get(), null);
    }

    @Override // defpackage.zuh
    public final void h(boolean z) {
        this.j.d(z ? zug.g : zug.f, this.u.get(), null);
    }

    @Override // defpackage.zuh
    public final void i(Context context) throws IOException {
        ecem.c();
        if (this.p) {
            return;
        }
        eieu eieuVarH = eiiy.h("ConversationStartupTracker#onTopAppBarInteractive");
        try {
            this.p = true;
            this.j.d(zug.a, this.u.get(), null);
            k(context);
            fczl.a(eieuVarH, null);
        } finally {
        }
    }

    public final void j(feeg feegVar) {
        ajfx ajfxVar = this.j;
        ajfxVar.d(ajfo.l, 0, feegVar);
        dzfh dzfhVar = ajfo.o;
        AtomicInteger atomicInteger = this.u;
        ajfxVar.d(dzfhVar, atomicInteger.get(), feegVar);
        ajfxVar.d(ajfo.n, atomicInteger.get(), feegVar);
        ajfxVar.d(ajfo.m, atomicInteger.get(), feegVar);
        dzuc dzucVar = this.e;
        dzfh dzfhVar2 = cqjd.n;
        dzua dzuaVar = dzua.SUCCESS;
        dzucVar.g(dzfhVar2, null, null, dzuaVar);
        dzucVar.g(cqjd.m, null, null, dzuaVar);
        ajfxVar.d(ajfs.a, 0, feegVar);
        this.f.e(new dzfh("Conversation data loaded"), feegVar);
    }
}
