package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cif implements bll {
    public final cir a;
    ListenableFuture b;
    private final bir c;
    private final lvy d;
    private ciq e;
    private boolean f = false;

    public cif(bir birVar, lvy lvyVar, cir cirVar) {
        this.c = birVar;
        this.d = lvyVar;
        this.a = cirVar;
        synchronized (this) {
            this.e = (ciq) lvyVar.a();
        }
    }

    @Override // defpackage.bll
    public final void a(Throwable th) {
        c();
        d(ciq.IDLE);
    }

    @Override // defpackage.bll
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        bit bitVar = (bit) obj;
        if (bitVar == bit.CLOSING || bitVar == bit.CLOSED || bitVar == bit.RELEASING || bitVar == bit.RELEASED) {
            d(ciq.IDLE);
            if (this.f) {
                this.f = false;
                c();
                return;
            }
            return;
        }
        if ((bitVar == bit.OPENING || bitVar == bit.OPEN || bitVar == bit.PENDING_OPEN) && !this.f) {
            final bir birVar = this.c;
            d(ciq.IDLE);
            final ArrayList arrayList = new ArrayList();
            ListenableFuture listenableFutureF = bqk.f(bqk.g(bpw.a(kol.a(new koi() { // from class: cia
                /* JADX WARN: Type inference failed for: r0v0, types: [azd, bir] */
                @Override // defpackage.koi
                public final Object a(kog kogVar) {
                    ?? r0 = birVar;
                    cie cieVar = new cie(kogVar, r0);
                    arrayList.add(cieVar);
                    r0.t(bpc.a(), cieVar);
                    return "waitForCaptureResult";
                }
            })), new bpr() { // from class: cib
                @Override // defpackage.bpr
                public final ListenableFuture a(Object obj2) {
                    return this.a.a.c();
                }
            }, bpc.a()), new akv() { // from class: cic
                @Override // defpackage.akv
                public final Object a(Object obj2) {
                    this.a.d(ciq.STREAMING);
                    return null;
                }
            }, bpc.a());
            this.b = listenableFutureF;
            bqk.i(listenableFutureF, new cid(this, arrayList, birVar), bpc.a());
            this.f = true;
        }
    }

    public final void c() {
        ListenableFuture listenableFuture = this.b;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            this.b = null;
        }
    }

    final void d(ciq ciqVar) {
        synchronized (this) {
            if (this.e.equals(ciqVar)) {
                return;
            }
            this.e = ciqVar;
            Objects.toString(ciqVar);
            bbs.a("StreamStateObserver", "Update Preview stream state to ".concat(String.valueOf(ciqVar)));
            this.d.j(ciqVar);
        }
    }
}
