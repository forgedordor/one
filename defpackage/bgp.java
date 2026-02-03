package defpackage;

import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgp implements bgk, baa, bgu {
    public bfl b;
    public bge c;
    public final List d;
    final baw f;
    public final Deque a = new ArrayDeque();
    public boolean e = false;

    public bgp(baw bawVar) {
        box.b();
        this.f = bawVar;
        this.d = new ArrayList();
    }

    @Override // defpackage.bgk
    public final void a() {
        box.b();
        bbg bbgVar = new bbg("Camera is closed.", null);
        Deque deque = this.a;
        Iterator it = deque.iterator();
        while (it.hasNext()) {
            ((bgv) it.next()).m(bbgVar);
        }
        deque.clear();
        ArrayList arrayList = new ArrayList(this.d);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bge bgeVar = (bge) arrayList.get(i);
            box.b();
            if (!bgeVar.c.isDone()) {
                bgeVar.b(bbgVar);
                bgeVar.f(bbgVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        bhr bhrVar;
        bjz bjzVar;
        box.b();
        Log.d("TakePictureManagerImpl", "Issue the next TakePictureRequest.");
        if (d()) {
            Log.d("TakePictureManagerImpl", "There is already a request in-flight.");
            return;
        }
        if (this.e) {
            Log.d("TakePictureManagerImpl", "The class is paused.");
            return;
        }
        bfl bflVar = this.b;
        box.b();
        if (bflVar.d.a() == 0) {
            Log.d("TakePictureManagerImpl", "Too many acquire images. Close image to be able to process next.");
            return;
        }
        bgv bgvVar = (bgv) this.a.poll();
        if (bgvVar == null) {
            Log.d("TakePictureManagerImpl", "No new request.");
            return;
        }
        final bge bgeVar = new bge(bgvVar, this);
        int i = 1;
        lcg.c(!d());
        this.c = bgeVar;
        bgeVar.a().b(new Runnable() { // from class: bgm
            @Override // java.lang.Runnable
            public final void run() {
                bgp bgpVar = this.a;
                bgpVar.c = null;
                bgpVar.b();
            }
        }, bpc.a());
        this.d.add(bgeVar);
        box.b();
        bgeVar.c.b(new Runnable() { // from class: bgn
            @Override // java.lang.Runnable
            public final void run() {
                this.a.d.remove(bgeVar);
            }
        }, bpc.a());
        bfl bflVar2 = this.b;
        ListenableFuture listenableFutureA = bgeVar.a();
        box.b();
        int i2 = 0;
        bji bjiVar = (bji) blz.c(bflVar2.b, bkp.c, new azs(Arrays.asList(new bjm())));
        bjiVar.getClass();
        int i3 = bfl.a;
        bfl.a = i3 + 1;
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(bjiVar.hashCode());
        List<bjm> listA = bjiVar.a();
        listA.getClass();
        for (bjm bjmVar : listA) {
            bjj bjjVar = new bjj();
            bjl bjlVar = bflVar2.c;
            int i4 = i2;
            bjjVar.b = bjlVar.f;
            bjjVar.f(bjlVar.e);
            bjjVar.c(bgvVar.h());
            bfd bfdVar = bflVar2.e;
            bjjVar.g(bfdVar.i());
            bee beeVar = (bee) bfdVar;
            bfl bflVar3 = bflVar2;
            List list = beeVar.c;
            if (list.size() > i && (bjzVar = bfdVar.l) != null) {
                bjjVar.g(bjzVar);
            }
            bjz bjzVar2 = bfdVar.m;
            boolean z = i;
            if (bjzVar2 == null) {
                z = i4;
            }
            if (z != 0) {
                bjzVar2.getClass();
                bjjVar.g(bjzVar2);
            }
            bjjVar.c = z;
            int i5 = beeVar.b;
            if (bsc.d(i5) || bsc.e(i5)) {
                if (brv.a()) {
                    bjjVar.e(bjl.a, Integer.valueOf(bgvVar.c()));
                }
                bjjVar.e(bjl.b, Integer.valueOf(boy.m(bgvVar.e(), beeVar.a) ? bgvVar.a() == 0 ? 100 : 95 : bgvVar.b()));
            }
            bjjVar.f(bjmVar.a.e);
            bjjVar.h(strValueOf, Integer.valueOf(i4));
            bjjVar.e.b("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i3));
            bjjVar.d(bfdVar.i);
            i = 1;
            if (list.size() > 1 && (bhrVar = bfdVar.j) != null) {
                bjjVar.d(bhrVar);
            }
            arrayList.add(bjjVar.b());
            i2 = i4;
            bflVar2 = bflVar3;
        }
        int i6 = i2;
        lcb lcbVar = new lcb(new beq(arrayList, bgeVar), new bgb(bjiVar, bgvVar, bgeVar, listenableFutureA, i3));
        beq beqVar = (beq) lcbVar.a;
        beqVar.getClass();
        bgb bgbVar = (bgb) lcbVar.b;
        bgbVar.getClass();
        bfl bflVar4 = this.b;
        box.b();
        ((bee) bflVar4.e).g.accept(bgbVar);
        box.b();
        bbf bbfVar = this.f.a;
        AtomicReference atomicReference = bbfVar.b;
        synchronized (atomicReference) {
            if (atomicReference.get() == null) {
                atomicReference.set(Integer.valueOf(bbfVar.b()));
            }
        }
        baw bawVar = this.f;
        List list2 = beqVar.a;
        bbf bbfVar2 = bawVar.a;
        box.b();
        ListenableFuture listenableFutureF = bqk.f(bbfVar2.E().l(list2, bbfVar2.a, bbfVar2.c), new akv() { // from class: bav
            @Override // defpackage.akv
            public final Object a(Object obj) {
                int i7 = bbf.i;
                return null;
            }
        }, bpc.a());
        bqk.i(listenableFutureF, new bgo(this, beqVar), bpn.a());
        box.b();
        boolean z2 = i;
        if (bgeVar.h != null) {
            z2 = i6;
        }
        lcg.d(z2, "CaptureRequestFuture can only be set once.");
        bgeVar.h = listenableFutureF;
    }

    @Override // defpackage.bgu
    public final void c(bgv bgvVar) {
        box.b();
        bbs.a("TakePictureManagerImpl", "Add a new request for retrying.");
        this.a.addFirst(bgvVar);
        b();
    }

    public final boolean d() {
        return this.c != null;
    }

    @Override // defpackage.baa
    public final void k(bbm bbmVar) {
        bpn.a().execute(new Runnable() { // from class: bgl
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b();
            }
        });
    }
}
