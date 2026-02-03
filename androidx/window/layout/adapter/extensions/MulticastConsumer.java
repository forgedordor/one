package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import defpackage.lbz;
import defpackage.pxc;
import defpackage.pxq;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class MulticastConsumer implements lbz<WindowLayoutInfo> {
    public final ReentrantLock a = new ReentrantLock();
    public final Set b = new LinkedHashSet();
    private final Context c;
    private pxc d;

    public MulticastConsumer(Context context) {
        this.c = context;
    }

    public final void a(lbz lbzVar) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            pxc pxcVar = this.d;
            if (pxcVar != null) {
                lbzVar.accept(pxcVar);
            }
            this.b.add(lbzVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.lbz
    public void accept(WindowLayoutInfo windowLayoutInfo) {
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            pxc pxcVarB = pxq.b(this.c, windowLayoutInfo);
            this.d = pxcVarB;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((lbz) it.next()).accept(pxcVarB);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
