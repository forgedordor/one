package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ojc {
    public final Context a;
    public final ona b = new ona(this, new fdae() { // from class: oit
        @Override // defpackage.fdae
        public final Object invoke() {
            ojc ojcVar = this.a;
            boolean z = false;
            if (ojcVar.g) {
                fcuq fcuqVar = ojcVar.b.f;
                if (!fcuqVar.isEmpty()) {
                    Iterator<E> it = fcuqVar.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        if (!(((oip) it.next()).a instanceof oka) && (i = i + 1) < 0) {
                            fcva.l();
                        }
                    }
                    if (i > 1) {
                        z = true;
                    }
                }
            }
            ojcVar.f.h(z);
            return fctx.a;
        }
    });
    public final omn c;
    public Activity d;
    public boolean e;
    public final abs f;
    public boolean g;
    private final fctc h;

    public ojc(Context context) {
        Object next;
        this.a = context;
        this.c = new omn(context);
        Iterator itA = fdey.e(context, new fdap() { // from class: oiu
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Context context2 = (Context) obj;
                context2.getClass();
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            }
        }).a();
        while (true) {
            if (!itA.hasNext()) {
                next = null;
                break;
            } else {
                next = itA.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.d = (Activity) next;
        this.f = new ojb(this);
        this.g = true;
        ola olaVar = this.b.p;
        olaVar.c(new okb(olaVar));
        this.b.p.c(new ohv(this.a));
        this.h = fctd.a(new fdae() { // from class: oiv
            @Override // defpackage.fdae
            public final Object invoke() {
                ojc ojcVar = this.a;
                return new oke(ojcVar.a, ojcVar.b.p);
            }
        });
    }

    public final oiz a(oky okyVar) {
        okyVar.getClass();
        return new oiz(this, okyVar);
    }

    public final ojx b() {
        return this.b.e();
    }

    public final oka c() {
        return this.b.f();
    }

    public final oke d() {
        return (oke) this.h.a();
    }

    public final ola e() {
        return this.b.p;
    }

    public final void f(oja ojaVar) {
        ona onaVar = this.b;
        onaVar.m.add(ojaVar);
        fcuq fcuqVar = onaVar.f;
        if (fcuqVar.isEmpty()) {
            return;
        }
        oip oipVar = (oip) fcuqVar.e();
        ojc ojcVar = onaVar.a;
        ojaVar.a(oipVar.a, oipVar.a());
    }

    public final void g(int i) {
        this.b.l(d().a(i), null);
    }

    public final void i(ojx ojxVar, Bundle bundle, okg okgVar) {
        this.b.r(ojxVar, bundle, okgVar);
    }
}
