package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cshk {
    public static final cqce a = cqce.g("Bugle", "MoiraiApiInitializationManager");
    public static final cczi b = cdag.h(cdag.b, "record_moirai_initialization_memory", false);
    public static final Object c = new Object();
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu i;
    public final eosc l;
    private egpe m;
    public boolean g = false;
    public final AtomicBoolean h = new AtomicBoolean(false);
    public int j = 0;
    public long k = 0;

    public cshk(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, eosc eoscVar) {
        this.d = fcsuVar;
        this.f = fcsuVar4;
        this.i = fcsuVar2;
        this.e = fcsuVar3;
        this.l = eoscVar;
    }

    public final eiju a() {
        synchronized (c) {
            if (this.g) {
                return eijx.e(null);
            }
            if (this.m == null) {
                this.m = new egpe(new eooy() { // from class: cshi
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        eieu eieuVarK = eiiy.k("MoiraiApiInitializationManager#createInitializationResultFuture");
                        cshk cshkVar = this.a;
                        try {
                            final cshs cshsVar = (cshs) cshkVar.d.b();
                            eiju eijuVarH = eiju.g(((dhor) cshsVar.a.b()).b()).h(new ejvr() { // from class: cshr
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj) {
                                    cshsVar.c = (dhou) obj;
                                    return null;
                                }
                            }, cshsVar.b);
                            eieuVarK.b(eijuVarH);
                            eika.l(eijuVarH, new cshj(cshkVar), cshkVar.l);
                            eieuVarK.close();
                            return eijuVarH;
                        } catch (Throwable th) {
                            try {
                                eieuVarK.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }, this.l);
            }
            if (this.m.e()) {
                return eiju.g(this.m.c());
            }
            if (this.j >= ((Integer) cshq.c.e()).intValue()) {
                a.r("Retry limit to initialize MoiraiApi reached.");
                return eijx.d(new IllegalStateException("Retry limit to initialize MoiraiApi reached."));
            }
            if (((cogw) this.i.b()).f().toEpochMilli() < this.k) {
                a.r("The allowed time for initializing MoiraiApi wasn't reached.");
                return eijx.d(new IllegalStateException("The allowed time for initializing MoiraiApi wasn't reached."));
            }
            this.j++;
            eieu eieuVarK = eiiy.k("MoiraiApiInitializationManager#getInitializationResultFuture");
            try {
                eiju eijuVarG = eiju.g(this.m.c());
                eieuVarK.b(eijuVarG);
                eieuVarK.close();
                return eijuVarG;
            } finally {
            }
        }
    }
}
