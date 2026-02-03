package defpackage;

import j$.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bmp implements Runnable {
    private static final Object b = new Object();
    private final Executor c;
    private final bll d;
    private final AtomicReference e;
    public final AtomicBoolean a = new AtomicBoolean(true);
    private Object f = b;
    private int g = -1;
    private boolean h = false;

    public bmp(AtomicReference atomicReference, Executor executor, bll bllVar) {
        this.e = atomicReference;
        this.c = executor;
        this.d = bllVar;
    }

    final void a(int i) {
        synchronized (this) {
            if (this.a.get()) {
                if (i <= this.g) {
                    return;
                }
                this.g = i;
                if (this.h) {
                    return;
                }
                this.h = true;
                try {
                    this.c.execute(this);
                } catch (Throwable unused) {
                    synchronized (this) {
                        this.h = false;
                    }
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            if (!this.a.get()) {
                this.h = false;
                return;
            }
            Object obj = this.e.get();
            int i = this.g;
            while (true) {
                if (!Objects.equals(this.f, obj)) {
                    this.f = obj;
                    if (obj instanceof bmo) {
                        this.d.a(((bmo) obj).a());
                    } else {
                        this.d.b(obj);
                    }
                }
                synchronized (this) {
                    if (i == this.g || !this.a.get()) {
                        break;
                    }
                    obj = this.e.get();
                    i = this.g;
                }
            }
            this.h = false;
        }
    }
}
