package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daiw implements lun {
    public static final eksp a = eksp.c("Bugle");
    public final fcsu b;
    final ArrayList c = new ArrayList();
    public volatile boolean d = true;
    private final eosc e;

    public daiw(eosc eoscVar, fcsu fcsuVar) {
        this.e = eoscVar;
        this.b = fcsuVar;
    }

    @Override // defpackage.lun
    public final void fh(lvj lvjVar) {
        this.d = false;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
    }

    public final void g(int i, ViewGroup viewGroup, daiv daivVar) {
        ejwl.a(ecem.g());
        final daiu daiuVar = new daiu();
        daiuVar.b = i;
        daiuVar.a = viewGroup;
        daiuVar.f = daivVar;
        daiuVar.d = new daix(viewGroup.getContext());
        daiuVar.e = this.e.submit(new Runnable() { // from class: dait
            @Override // java.lang.Runnable
            public final void run() {
                final daiw daiwVar = this.a;
                final daiu daiuVar2 = daiuVar;
                if (daiwVar.d) {
                    try {
                        daiuVar2.c = daiuVar2.d.inflate(daiuVar2.b, daiuVar2.a, false);
                    } catch (RuntimeException e) {
                        ((eksl) ((eksl) daiw.a.a(Level.WARNING).g(e)).h("com/google/android/apps/messaging/ui/util/AsyncLayoutInflater", "inflateInternal", 84, "AsyncLayoutInflater.java")).q("Failed to inflate resource in the background! Retrying on the UI thread");
                        ((cden) daiwVar.b.b()).b(e);
                    }
                    ecem.e(new Runnable() { // from class: dais
                        @Override // java.lang.Runnable
                        public final void run() {
                            daiw daiwVar2 = daiwVar;
                            if (daiwVar2.d) {
                                daiu daiuVar3 = daiuVar2;
                                if (daiuVar3.c == null) {
                                    daiuVar3.c = daiuVar3.d.inflate(daiuVar3.b, daiuVar3.a, false);
                                }
                                daiuVar3.f.a(daiuVar3.c);
                                daiwVar2.c.remove(daiuVar3.e);
                            }
                        }
                    });
                }
            }
        });
        this.c.add(daiuVar.e);
    }

    @Override // defpackage.lun
    public final /* synthetic */ void c(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void d(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void f(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gF(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gG(lvj lvjVar) {
    }
}
