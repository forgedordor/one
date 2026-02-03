package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzjn {
    public Handler e;
    public dzfh h;
    public int a = 0;
    public int b = 0;
    public boolean c = true;
    public boolean d = true;
    public final Set g = new HashSet();
    public final Runnable f = new Runnable() { // from class: dzjk
        @Override // java.lang.Runnable
        public final void run() {
            dzjn dzjnVar = this.a;
            dzfh dzfhVar = dzjnVar.h;
            dzfhVar.getClass();
            if (dzjnVar.b == 0) {
                dzjnVar.c = true;
                Iterator it = dzjnVar.g.iterator();
                while (it.hasNext()) {
                    ((dziw) it.next()).k(dzfhVar);
                }
            }
            dzjnVar.h.getClass();
            dzjnVar.a();
        }
    };

    public dzjn(Context context) {
        this.e = null;
        this.e = new Handler(context.getMainLooper());
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new dzjl(this));
    }

    public final void a() {
        if (this.a == 0 && this.c) {
            for (dziw dziwVar : this.g) {
            }
            this.d = true;
        }
    }
}
