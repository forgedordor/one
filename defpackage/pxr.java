package defpackage;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.reflection.Consumer2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pxr implements Consumer2, lbz {
    private final Context a;
    private final ReentrantLock b;
    private pxc c;
    private final Set d;

    public pxr(Context context) {
        context.getClass();
        this.a = context;
        this.b = new ReentrantLock();
        this.d = new LinkedHashSet();
    }

    @Override // androidx.window.reflection.Consumer2, androidx.window.extensions.core.util.function.Consumer
    public void accept(WindowLayoutInfo windowLayoutInfo) {
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            pxc pxcVarB = pxq.b(this.a, windowLayoutInfo);
            this.c = pxcVarB;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((lbz) it.next()).accept(pxcVarB);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void addListener(lbz<pxc> lbzVar) {
        lbzVar.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            pxc pxcVar = this.c;
            if (pxcVar != null) {
                lbzVar.accept(pxcVar);
            }
            this.d.add(lbzVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    public final void removeListener(lbz<pxc> lbzVar) {
        lbzVar.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.d.remove(lbzVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
