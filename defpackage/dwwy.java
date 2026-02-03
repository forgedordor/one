package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dwwy {
    private ejwi a;
    public final Handler e;
    protected final Set f;

    public dwwy() {
        this.e = new Handler(Looper.getMainLooper());
        this.f = new HashSet();
        this.a = ejud.a;
    }

    private final synchronized void d(int i) {
        Set set = this.f;
        int size = set.size() - i;
        if (size != 0) {
            if (set.size() == size) {
                a();
            } else if (set.isEmpty()) {
                b();
            }
        }
    }

    protected synchronized void a() {
    }

    protected synchronized void b() {
    }

    protected synchronized void c(Object obj) {
        if (this.a.g() && obj.equals(this.a.c())) {
            return;
        }
        this.a = ejwi.j(obj);
        h(obj);
    }

    public final synchronized ejwi e() {
        return this.a;
    }

    protected final synchronized void f() {
        this.a = ejud.a;
    }

    public final void g() {
        j(new dwww(this));
    }

    protected final synchronized void h(final Object obj) {
        final ekhx ekhxVarO = ekhx.o(this.f);
        i(new Runnable() { // from class: dwwu
            @Override // java.lang.Runnable
            public final void run() {
                ekqg ekqgVarListIterator = ekhxVarO.listIterator();
                while (ekqgVarListIterator.hasNext()) {
                    ((dwwx) ekqgVarListIterator.next()).a(obj);
                }
            }
        });
    }

    protected final void i(Runnable runnable) {
        this.e.post(runnable);
    }

    public final synchronized void j(final dwwx dwwxVar) {
        Set set = this.f;
        int size = set.size();
        set.add(dwwxVar);
        if (this.a.g()) {
            final Object objC = this.a.c();
            i(new Runnable() { // from class: dwwt
                @Override // java.lang.Runnable
                public final void run() {
                    dwwxVar.a(objC);
                }
            });
        }
        d(size);
    }

    public final void k(dwwx dwwxVar) {
        j(new dwwv(this, dwwxVar));
    }

    public final synchronized void l(dwwx dwwxVar) {
        Set set = this.f;
        int size = set.size();
        set.remove(dwwxVar);
        d(size);
    }

    public dwwy(Object obj) {
        this.e = new Handler(Looper.getMainLooper());
        this.f = new HashSet();
        this.a = ejwi.j(obj);
    }
}
