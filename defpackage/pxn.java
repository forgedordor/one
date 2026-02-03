package defpackage;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pxn extends pxm {
    private final ReentrantLock b;
    private final Map c;
    private final Map d;

    public pxn(WindowLayoutComponent windowLayoutComponent, prm prmVar) {
        super(windowLayoutComponent, prmVar);
        this.b = new ReentrantLock();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    @Override // defpackage.pxm, defpackage.pxk, defpackage.pxi
    public final void a(Context context, Executor executor, lbz lbzVar) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            Map map = this.c;
            pxr pxrVar = (pxr) map.get(context);
            if (pxrVar != null) {
                pxrVar.addListener(lbzVar);
                this.d.put(lbzVar, context);
            } else {
                pxr pxrVar2 = new pxr(context);
                map.put(context, pxrVar2);
                this.d.put(lbzVar, context);
                pxrVar2.addListener(lbzVar);
                this.a.addWindowLayoutInfoListener(context, pxrVar2);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.pxm, defpackage.pxk, defpackage.pxi
    public final void b(lbz lbzVar) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            Map map = this.d;
            Context context = (Context) map.get(lbzVar);
            if (context == null) {
                return;
            }
            Map map2 = this.c;
            pxr pxrVar = (pxr) map2.get(context);
            if (pxrVar == null) {
                return;
            }
            pxrVar.removeListener(lbzVar);
            map.remove(lbzVar);
            if (pxrVar.isEmpty()) {
                map2.remove(context);
                this.a.removeWindowLayoutInfoListener(pxrVar);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
