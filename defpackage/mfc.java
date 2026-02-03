package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mfc {
    public final mew a;
    public final mfa b;
    public final CopyOnWriteArraySet c;
    private final mej d;
    private final ArrayDeque e;
    private final ArrayDeque f;
    private final Object g;
    private boolean h;
    private boolean i;

    public mfc(Looper looper, mej mejVar, mfa mfaVar) {
        this(new CopyOnWriteArraySet(), looper, mejVar, mfaVar, true);
    }

    public final mfc a(Looper looper, mfa mfaVar) {
        return new mfc(this.c, looper, this.d, mfaVar, this.i);
    }

    public final void b(Object obj) {
        synchronized (this.g) {
            if (this.h) {
                return;
            }
            this.c.add(new mfb(obj));
        }
    }

    public final void c() {
        g();
        ArrayDeque arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        mew mewVar = this.a;
        if (!mewVar.f()) {
            mewVar.k(mewVar.c(1));
        }
        ArrayDeque arrayDeque2 = this.e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void d(final int i, final mez mezVar) {
        g();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.c);
        this.f.add(new Runnable() { // from class: mey
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    mfb mfbVar = (mfb) it.next();
                    if (!mfbVar.d) {
                        int i2 = i;
                        if (i2 != -1) {
                            mfbVar.b.b(i2);
                        }
                        mez mezVar2 = mezVar;
                        mfbVar.c = true;
                        mezVar2.a(mfbVar.a);
                    }
                }
            }
        });
    }

    public final void e() {
        g();
        synchronized (this.g) {
            this.h = true;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.c;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((mfb) it.next()).a(this.b);
        }
        copyOnWriteArraySet.clear();
    }

    public final void f(int i, mez mezVar) {
        d(i, mezVar);
        c();
    }

    public final void g() {
        if (this.i) {
            mee.c(Thread.currentThread() == ((mfw) this.a).b.getLooper().getThread());
        }
    }

    private mfc(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, mej mejVar, mfa mfaVar, boolean z) {
        this.d = mejVar;
        this.c = copyOnWriteArraySet;
        this.b = mfaVar;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.a = mejVar.b(looper, new Handler.Callback() { // from class: mex
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                mfc mfcVar = this.a;
                Iterator it = mfcVar.c.iterator();
                while (it.hasNext()) {
                    mfb mfbVar = (mfb) it.next();
                    mfa mfaVar2 = mfcVar.b;
                    if (!mfbVar.d && mfbVar.c) {
                        mar marVarA = mfbVar.b.a();
                        mfbVar.b = new maq();
                        mfbVar.c = false;
                        mfaVar2.a(mfbVar.a, marVarA);
                    }
                    if (mfcVar.a.f()) {
                        return true;
                    }
                }
                return true;
            }
        });
        this.i = z;
    }
}
