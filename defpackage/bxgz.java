package defpackage;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class bxgz {
    public final String e;
    public int f;
    public long g;
    public final ReentrantLock h;
    public final cogw i;

    public bxgz(String str, cogw cogwVar) {
        new ArrayList();
        this.f = 0;
        this.h = new ReentrantLock();
        this.e = str;
        this.i = cogwVar;
    }

    public abstract int a();

    protected abstract void b();

    public bxgk g(bxgk bxgkVar) {
        return null;
    }

    public boolean h() {
        return true;
    }

    public boolean k() {
        return false;
    }

    public bxgk l() {
        return null;
    }

    public final int n() {
        o();
        try {
            return this.f;
        } finally {
            r();
        }
    }

    public final void o() {
        this.h.lock();
    }

    public final void p() {
        o();
        try {
            this.f++;
            this.g = this.i.a();
        } finally {
            r();
        }
    }

    public final void q() {
        o();
        try {
            int i = this.f - 1;
            this.f = i;
            if (i == 0) {
                b();
            } else if (i < 0) {
                cqaz.c(a.g(i, "RefCountedMediaResource has unbalanced ref. Refcount="));
            }
        } finally {
            r();
        }
    }

    public final void r() {
        this.h.unlock();
    }
}
