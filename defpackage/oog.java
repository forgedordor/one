package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oog {
    public final mr a;
    public final mw b;
    public final fcyh c;
    public int e;
    public final ovn g;
    public final AtomicInteger h;
    public final fdpl i;
    public final fdpl j;
    public final AtomicReference k;
    public final CopyOnWriteArrayList l;
    public final fdap m;
    public final fctc n;
    public final ony o;
    private final fcyh p;
    public final fduf d = fdvf.a(false);
    public final AtomicReference f = new AtomicReference(null);

    public oog(mr mrVar, mw mwVar, fcyh fcyhVar, fcyh fcyhVar2) {
        this.a = mrVar;
        this.b = mwVar;
        this.p = fcyhVar;
        this.c = fcyhVar2;
        ooc oocVar = new ooc(this, fcyhVar);
        this.g = oocVar;
        this.h = new AtomicInteger(0);
        fdui fduiVar = new fdui(new oof(fdpn.a(new fdtj(oocVar.j), -1, 2), null, this));
        fdjq fdjqVar = fdkq.a;
        this.i = fdqc.b(fduiVar, fdzb.a);
        this.j = new fdug(oocVar.k);
        this.k = new AtomicReference(null);
        this.l = new CopyOnWriteArrayList();
        this.m = new fdap() { // from class: onw
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                opc opcVar = (opc) obj;
                opcVar.getClass();
                oog oogVar = this.a;
                if (((Boolean) oogVar.d.c()).booleanValue()) {
                    Handler handler = (Handler) oogVar.n.a();
                    ony onyVar = oogVar.o;
                    handler.removeCallbacks(onyVar);
                    onyVar.a.set(opcVar);
                    handler.post(onyVar);
                } else {
                    Iterator it = oogVar.l.iterator();
                    while (it.hasNext()) {
                        ((fdap) it.next()).invoke(opcVar);
                    }
                }
                return fctx.a;
            }
        };
        this.n = fctd.a(new fdae() { // from class: onx
            @Override // defpackage.fdae
            public final Object invoke() {
                return new Handler(Looper.getMainLooper());
            }
        });
        this.o = new ony(this);
    }
}
