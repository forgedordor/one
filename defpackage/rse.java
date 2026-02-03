package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rse implements Handler.Callback {
    private static final rsd b = new rsc();
    public final csq a = new csq();
    private volatile rbv c;
    private final rsd d;
    private final rrv e;
    private final rsa f;

    public rse(rsd rsdVar) {
        rsdVar = rsdVar == null ? b : rsdVar;
        this.d = rsdVar;
        this.f = new rsa(rsdVar);
        this.e = (rox.b && rox.a) ? new rru() : new rrq();
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void e(Collection collection, Map map) {
        View view;
        if (collection == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ea eaVar = (ea) it.next();
            if (eaVar != null && (view = eaVar.Q) != null) {
                map.put(view, eaVar);
                e(eaVar.I().o(), map);
            }
        }
    }

    public final rbv b(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (rvk.n() && !(context instanceof Application)) {
            if (context instanceof eg) {
                return d((eg) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return b(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = this.d.a(raw.b(context.getApplicationContext()), new rrl(), new rrr(), context.getApplicationContext());
                }
            }
        }
        return this.c;
    }

    public final rbv c(ea eaVar) {
        rvi.e(eaVar.z(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (rvk.m()) {
            return b(eaVar.z().getApplicationContext());
        }
        if (eaVar.G() != null) {
            this.e.a(eaVar.G());
        }
        eaVar.I();
        Context contextZ = eaVar.z();
        return this.f.a(contextZ, raw.b(contextZ.getApplicationContext()), eaVar.P(), eaVar.aK());
    }

    public final rbv d(eg egVar) {
        if (rvk.m()) {
            return b(egVar.getApplicationContext());
        }
        if (egVar.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.e.a(egVar);
        Activity activityA = a(egVar);
        boolean z = true;
        if (activityA != null && activityA.isFinishing()) {
            z = false;
        }
        raw rawVarB = raw.b(egVar.getApplicationContext());
        rsa rsaVar = this.f;
        lvc lvcVarP = egVar.P();
        egVar.a();
        return rsaVar.a(egVar, rawVarB, lvcVarP, z);
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public final boolean handleMessage(Message message) {
        return false;
    }
}
