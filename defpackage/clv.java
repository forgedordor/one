package defpackage;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class clv implements lun {
    final /* synthetic */ clw a;

    public clv(clw clwVar) {
        this.a = clwVar;
    }

    @Override // defpackage.lun
    public final void c(lvj lvjVar) {
        clu cluVar = (clu) this.a.a.peek();
        if (cluVar == null) {
            Log.e("CarApp", "Screen stack was empty during lifecycle onPause");
        } else {
            cluVar.b(lva.ON_PAUSE);
        }
    }

    @Override // defpackage.lun
    public final void d(lvj lvjVar) {
        clu cluVar = (clu) this.a.a.peek();
        if (cluVar == null) {
            Log.e("CarApp", "Screen stack was empty during lifecycle onResume");
        } else {
            cluVar.b(lva.ON_RESUME);
        }
    }

    @Override // defpackage.lun
    public final void f(lvj lvjVar) {
        clu cluVar = (clu) this.a.a.peek();
        if (cluVar == null) {
            Log.e("CarApp", "Screen stack was empty during lifecycle onStop");
        } else {
            cluVar.b(lva.ON_STOP);
        }
    }

    @Override // defpackage.lun
    public final void fh(lvj lvjVar) {
        Deque deque = this.a.a;
        Iterator it = new ArrayDeque(deque).iterator();
        while (it.hasNext()) {
            clw.c((clu) it.next(), true);
        }
        deque.clear();
        lvjVar.P().d(this);
    }

    @Override // defpackage.lun
    public final void gG(lvj lvjVar) {
        clu cluVar = (clu) this.a.a.peek();
        if (cluVar == null) {
            Log.e("CarApp", "Screen stack was empty during lifecycle onStart");
        } else {
            cluVar.b(lva.ON_START);
        }
    }

    @Override // defpackage.lun
    public final void gF(lvj lvjVar) {
    }
}
