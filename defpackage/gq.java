package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gq implements luv, pjb, lxq {
    public lvn a = null;
    public pja b = null;
    private final ea c;
    private final lxp d;
    private final Runnable e;
    private lxk f;

    public gq(ea eaVar, lxp lxpVar, Runnable runnable) {
        this.c = eaVar;
        this.d = lxpVar;
        this.e = runnable;
    }

    @Override // defpackage.lvj
    public final lvc P() {
        b();
        return this.a;
    }

    @Override // defpackage.luv
    public final lxk R() {
        Application application;
        ea eaVar = this.c;
        lxk lxkVarR = eaVar.R();
        if (!lxkVarR.equals(eaVar.ac)) {
            this.f = lxkVarR;
            return lxkVarR;
        }
        if (this.f == null) {
            Context applicationContext = eaVar.A().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f = new lwy(application, eaVar, eaVar.m);
        }
        return this.f;
    }

    @Override // defpackage.lxq
    public final lxp S() {
        b();
        return this.d;
    }

    @Override // defpackage.luv
    public final lyp T() {
        Application application;
        ea eaVar = this.c;
        Context applicationContext = eaVar.A().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        lys lysVar = new lys();
        if (application != null) {
            lysVar.b(lxh.b, application);
        }
        lysVar.b(lwu.a, eaVar);
        lysVar.b(lwu.b, this);
        Bundle bundle = eaVar.m;
        if (bundle != null) {
            lysVar.b(lwu.c, bundle);
        }
        return lysVar;
    }

    @Override // defpackage.pjb
    public final pix U() {
        b();
        return this.b.a;
    }

    final void a(lva lvaVar) {
        this.a.e(lvaVar);
    }

    final void b() {
        if (this.a == null) {
            this.a = new lvn(this);
            pja pjaVarA = piz.a(this);
            this.b = pjaVarA;
            pjaVarA.a();
            this.e.run();
        }
    }
}
