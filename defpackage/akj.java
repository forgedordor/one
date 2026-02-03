package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akj extends akm {
    public static final Executor a = new akh();
    public static final Executor b = new aki();
    private static volatile akj d;
    public final akm c;
    private final akm e;

    private akj() {
        akl aklVar = new akl();
        this.e = aklVar;
        this.c = aklVar;
    }

    public static akj a() {
        if (d == null) {
            synchronized (akj.class) {
                if (d == null) {
                    d = new akj();
                }
            }
        }
        return d;
    }

    @Override // defpackage.akm
    public final void b(Runnable runnable) {
        akm akmVar = this.c;
        akl aklVar = (akl) akmVar;
        if (aklVar.c == null) {
            synchronized (aklVar.a) {
                if (((akl) akmVar).c == null) {
                    ((akl) akmVar).c = akl.a(Looper.getMainLooper());
                }
            }
        }
        aklVar.c.post(runnable);
    }

    @Override // defpackage.akm
    public final boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
