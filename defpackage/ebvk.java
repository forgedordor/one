package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebvk {
    private final ebvj b;
    public final Set a = new HashSet();
    private final Handler c = new Handler(Looper.getMainLooper());

    public ebvk(Context context) {
        this.b = new ebvj(context);
    }

    public final List a() {
        ArrayList arrayList;
        ebvj ebvjVar = this.b;
        synchronized (ebvjVar) {
            arrayList = new ArrayList(ebvjVar.a());
        }
        return arrayList;
    }

    public final void b(final String str, final boolean z) {
        ebvj ebvjVar = this.b;
        synchronized (ebvjVar) {
            if (!z) {
                ebvjVar.a().remove(str);
                ebvjVar.c();
            } else if (!ebvjVar.a().contains(str)) {
                ebvjVar.a().add(str);
                ebvjVar.c();
            }
            ebvjVar.d(false);
        }
        for (final ebvg ebvgVar : this.a) {
            this.c.post(new Runnable() { // from class: ebvi
                @Override // java.lang.Runnable
                public final void run() {
                    ebvgVar.a(str, z);
                }
            });
        }
    }

    public final void c(boolean z) {
        ebvj ebvjVar = this.b;
        synchronized (ebvjVar) {
            ebvjVar.d(z);
        }
    }

    public final void d(List list) {
        ebvj ebvjVar = this.b;
        synchronized (ebvjVar) {
            if (ebvjVar.a().equals(list)) {
                return;
            }
            ebvjVar.a().clear();
            ebvjVar.a().addAll(list);
            ebvjVar.c();
            for (final ebvg ebvgVar : this.a) {
                Handler handler = this.c;
                ebvgVar.getClass();
                handler.post(new Runnable() { // from class: ebvh
                    @Override // java.lang.Runnable
                    public final void run() {
                        ebvgVar.b();
                    }
                });
            }
        }
    }

    public final boolean e() {
        boolean z;
        ebvj ebvjVar = this.b;
        synchronized (ebvjVar) {
            ebvjVar.b();
            z = ebvjVar.a;
        }
        return z;
    }
}
