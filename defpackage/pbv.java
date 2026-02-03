package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pbv implements wf, pcl {
    public final pce a;
    public boolean b = false;
    private final pcw c;
    private final pbg d;
    private final pbu e;

    public pbv(pcw pcwVar, pbu pbuVar, pbg pbgVar, pce pceVar) {
        lcg.a(true);
        lcg.a(true);
        lcg.a(true);
        lcg.a(true);
        lcg.a(true);
        this.c = pcwVar;
        this.e = pbuVar;
        this.d = pbgVar;
        this.a = pceVar;
    }

    private final void a() {
        this.b = false;
        this.d.a();
        pce pceVar = this.a;
        synchronized (pceVar.c) {
            int i = pceVar.b;
            if (i == 0) {
                return;
            }
            int i2 = i - 1;
            pceVar.b = i2;
            if (i2 == 0) {
                pceVar.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    @Override // defpackage.wf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.support.v7.widget.RecyclerView r10, android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pbv.d(android.support.v7.widget.RecyclerView, android.view.MotionEvent):void");
    }

    @Override // defpackage.pcl
    public final void g() {
        this.b = false;
        this.d.a();
    }

    @Override // defpackage.wf
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.b) {
            d(recyclerView, motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 2) {
            return this.b;
        }
        return false;
    }

    @Override // defpackage.pcl
    public final boolean k() {
        return this.b;
    }

    @Override // defpackage.wf
    public final void c(boolean z) {
    }
}
