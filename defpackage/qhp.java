package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qhp {
    public final Context a;
    public final Object b;
    public final LinkedHashSet c;
    public Object d;
    private final qmg e;

    protected qhp(Context context, qmg qmgVar) {
        this.e = qmgVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.a = applicationContext;
        this.b = new Object();
        this.c = new LinkedHashSet();
    }

    public abstract Object b();

    public abstract void d();

    public abstract void e();

    public final void f(Object obj) {
        synchronized (this.b) {
            Object obj2 = this.d;
            if (obj2 == null || !fdbq.f(obj2, obj)) {
                this.d = obj;
                final List listAo = fcva.ao(this.c);
                this.e.d.execute(new Runnable() { // from class: qho
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator it = listAo.iterator();
                        while (it.hasNext()) {
                            ((qgw) it.next()).a(this.d);
                        }
                    }
                });
            }
        }
    }
}
