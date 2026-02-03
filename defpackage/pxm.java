package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pxm extends pxk {
    public final WindowLayoutComponent a;
    private final prm b;
    private final ReentrantLock c = new ReentrantLock();
    private final Map d = new LinkedHashMap();
    private final Map e = new LinkedHashMap();
    private final Map f = new LinkedHashMap();

    public pxm(WindowLayoutComponent windowLayoutComponent, prm prmVar) {
        this.a = windowLayoutComponent;
        this.b = prmVar;
    }

    @Override // defpackage.pxk, defpackage.pxi
    public void a(Context context, Executor executor, lbz lbzVar) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            Map map = this.d;
            MulticastConsumer multicastConsumer = (MulticastConsumer) map.get(context);
            if (multicastConsumer != null) {
                multicastConsumer.a(lbzVar);
                this.e.put(lbzVar, context);
            } else {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                map.put(context, multicastConsumer2);
                this.e.put(lbzVar, context);
                multicastConsumer2.a(lbzVar);
                prm prmVar = this.b;
                WindowLayoutComponent windowLayoutComponent = this.a;
                int i = fdcj.a;
                Object objC = prmVar.c(new fdbi(WindowLayoutInfo.class), new pxl(multicastConsumer2));
                windowLayoutComponent.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, prmVar.b()).invoke(windowLayoutComponent, context, objC);
                this.f.put(multicastConsumer2, new prl(windowLayoutComponent.getClass().getMethod("removeWindowLayoutInfoListener", prmVar.b()), windowLayoutComponent, objC));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.pxk, defpackage.pxi
    public void b(lbz lbzVar) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            Context context = (Context) this.e.get(lbzVar);
            if (context == null) {
                return;
            }
            MulticastConsumer multicastConsumer = (MulticastConsumer) this.d.get(context);
            if (multicastConsumer != null) {
                ReentrantLock reentrantLock2 = multicastConsumer.a;
                reentrantLock2.lock();
                try {
                    multicastConsumer.b.remove(lbzVar);
                    reentrantLock2.unlock();
                    this.e.remove(lbzVar);
                    if (multicastConsumer.b.isEmpty()) {
                        this.d.remove(context);
                        prl prlVar = (prl) this.f.remove(multicastConsumer);
                        if (prlVar != null) {
                            prlVar.a.invoke(prlVar.b, prlVar.c);
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
