package defpackage;

import android.os.Handler;
import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvpm {
    public int c = 0;
    public int d = 0;
    public final Set a = DesugarCollections.synchronizedSet(new HashSet());
    private final Handler e = new Handler(Looper.getMainLooper());
    public final AtomicBoolean b = new AtomicBoolean(false);

    public final void a() {
        AtomicBoolean atomicBoolean = this.b;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.e.postDelayed(new Runnable() { // from class: dvpl
            @Override // java.lang.Runnable
            public final void run() {
                dvpm dvpmVar = this.a;
                int i = dvpmVar.d != 3 ? dvpmVar.c : 3;
                Iterator it = dvpmVar.a.iterator();
                while (it.hasNext()) {
                    ((dvix) it.next()).h(i);
                }
                dvpmVar.b.set(false);
            }
        }, 500L);
    }
}
