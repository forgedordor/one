package defpackage;

import android.view.Choreographer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jki implements Choreographer.FrameCallback, Runnable {
    final /* synthetic */ jkj a;

    public jki(jkj jkjVar) {
        this.a = jkjVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        jkj jkjVar = this.a;
        jkjVar.d.removeCallbacks(this);
        jkjVar.b();
        synchronized (jkjVar.e) {
            if (jkjVar.h) {
                jkjVar.h = false;
                List list = jkjVar.f;
                jkjVar.f = jkjVar.g;
                jkjVar.g = list;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) list.get(i)).doFrame(j);
                }
                list.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        jkj jkjVar = this.a;
        jkjVar.b();
        synchronized (jkjVar.e) {
            if (jkjVar.f.isEmpty()) {
                jkjVar.c.removeFrameCallback(this);
                jkjVar.h = false;
            }
        }
    }
}
