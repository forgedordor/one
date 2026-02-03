package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbvd implements fcek, fbwc {
    public static final Logger a = Logger.getLogger(fbvd.class.getName());
    public final fbwd b;
    private final fchy c;
    private final fchy d;
    private final ekgb e;
    private final fbty f;
    private final fbuj g;
    private fclz h;
    private ScheduledExecutorService i;
    private Executor j;
    private boolean k;
    private final fbue l;

    public fbvd(fbvb fbvbVar) {
        fbty fbtyVar = fbvbVar.a;
        fbtyVar.getClass();
        this.f = fbtyVar;
        fchy fchyVar = fbvbVar.c;
        fchyVar.getClass();
        this.d = fchyVar;
        this.c = fbvbVar.d;
        List list = fbvbVar.b;
        list.getClass();
        this.e = ekgb.n(list);
        fbut fbutVar = fbvbVar.e;
        fbutVar.getClass();
        this.l = new fbue(fbutVar);
        this.g = fbvbVar.f;
        this.b = new fbwd(this);
    }

    @Override // defpackage.fbwc
    public final synchronized boolean D(int i, Parcel parcel) {
        IBinder strongBinder;
        if (i == 1) {
            if (this.k) {
                fbvc.a.D(1, parcel);
                return false;
            }
            if (parcel.readInt() > 0 && (strongBinder = parcel.readStrongBinder()) != null) {
                int callingUid = Binder.getCallingUid();
                fbmw fbmwVar = fbmw.a;
                fbmu fbmuVar = new fbmu(fbmw.a);
                fbty fbtyVar = this.f;
                fbmuVar.b(fbpb.b, fbtyVar);
                fbmuVar.b(fbpb.a, new fbvv(callingUid));
                fbmuVar.b(fbvm.f, Integer.valueOf(callingUid));
                fbmuVar.b(fbvm.g, fbtyVar.d());
                fbmuVar.b(fbvm.h, this.g);
                fbue fbueVar = this.l;
                Executor executor = this.j;
                executor.getClass();
                fbmuVar.b(fbvs.a, new fbvr(callingUid, fbueVar, executor));
                fbmuVar.b(fcdq.a, fbsi.PRIVACY_AND_INTEGRITY);
                fchy fchyVar = this.c;
                fbmw fbmwVarA = fbmuVar.a();
                ekgb ekgbVar = this.e;
                Logger logger = fbwm.a;
                fbvl fbvlVar = new fbvl(fchyVar, fbmwVarA, ekgbVar, strongBinder);
                fclz fclzVar = this.h;
                synchronized (fclzVar) {
                    ejwl.m(!((fbuv) fclzVar).b, "Illegal transportCreated() after serverShutdown()");
                    ((fbuv) fclzVar).c++;
                }
                fbvlVar.e(new fbuu((fbuv) fclzVar, ((fbuv) fclzVar).a.a(fbvlVar)));
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fcek
    public final List b() {
        return ekgb.r(this.f);
    }

    public final synchronized void c() {
        this.d.b(this.j);
        this.j = null;
    }

    @Override // defpackage.fcek
    public final synchronized void d() {
        Runnable runnableB;
        if (this.k) {
            return;
        }
        this.k = true;
        this.b.a = fbvc.a;
        fclz fclzVar = this.h;
        ((fbuv) fclzVar).a.c();
        synchronized (fclzVar) {
            ((fbuv) fclzVar).b = true;
            runnableB = ((fbuv) fclzVar).b();
        }
        if (runnableB != null) {
            runnableB.run();
        }
        this.c.b(this.i);
        this.i = null;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.fcek
    public final synchronized void e(fclz fclzVar) {
        this.h = new fbuv(fclzVar, new Runnable() { // from class: fbva
            @Override // java.lang.Runnable
            public final void run() {
                this.a.c();
            }
        });
        this.i = (ScheduledExecutorService) this.c.a();
        this.j = this.d.a();
    }

    public final String toString() {
        return "BinderServer[" + this.f.toString() + "]";
    }
}
