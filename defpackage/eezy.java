package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eezy {
    private static final Map o = new HashMap();
    public final Context a;
    public final eeza b;
    public final String c;
    public boolean g;
    public final Intent h;
    public final eezu i;
    public ServiceConnection m;
    public IInterface n;
    public final List d = new ArrayList();
    public final Set e = new HashSet();
    public final Object f = new Object();
    public final IBinder.DeathRecipient k = new IBinder.DeathRecipient() { // from class: eezp
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            eezy eezyVar = this.a;
            eeza eezaVar = eezyVar.b;
            eezaVar.d("reportBinderDeath", new Object[0]);
            eezt eeztVar = (eezt) eezyVar.j.get();
            if (eeztVar != null) {
                eezaVar.d("calling onBinderDied", new Object[0]);
                eeztVar.a();
            } else {
                eezaVar.d("%s : Binder has died.", eezyVar.c);
                List list = eezyVar.d;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((eezo) it.next()).b(eezyVar.a());
                }
                list.clear();
            }
            synchronized (eezyVar.f) {
                eezyVar.c();
            }
        }
    };
    public final AtomicInteger l = new AtomicInteger(0);
    public final WeakReference j = new WeakReference(null);

    public eezy(Context context, eeza eezaVar, String str, Intent intent, eezu eezuVar) {
        this.a = context;
        this.b = eezaVar;
        this.c = str;
        this.h = intent;
        this.i = eezuVar;
    }

    public final RemoteException a() {
        return new RemoteException(String.valueOf(this.c).concat(" : Binder has died."));
    }

    public final void b(eezo eezoVar, defr defrVar) {
        d(new eezr(this, eezoVar.d, defrVar, eezoVar));
    }

    public final void c() {
        Set set = this.e;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((defr) it.next()).c(a());
        }
        set.clear();
    }

    public final void d(eezo eezoVar) {
        Handler handler;
        Map map = o;
        synchronized (map) {
            String str = this.c;
            if (!map.containsKey(str)) {
                HandlerThread handlerThread = new HandlerThread(str, 10);
                handlerThread.start();
                map.put(str, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(str);
        }
        handler.post(eezoVar);
    }

    public final void e(defr defrVar) {
        synchronized (this.f) {
            this.e.remove(defrVar);
        }
        d(new eezs(this));
    }
}
