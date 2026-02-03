package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebww implements ebxq {
    public final ebwv a;
    public final ebwr b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final ebxh d;
    public Runnable e;
    public String f;
    private final ebun g;
    private ListenableFuture h;

    public ebww(ebun ebunVar, ebwr ebwrVar, ebwv ebwvVar, ebxh ebxhVar) {
        this.g = ebunVar;
        this.a = ebwvVar;
        this.b = ebwrVar;
        this.d = ebxhVar;
    }

    public final void a() {
        this.c.removeCallbacks(this.e);
        ListenableFuture listenableFuture = this.h;
        if (listenableFuture != null) {
            listenableFuture.cancel(true);
        }
    }

    public final void b(eryy eryyVar) {
        ListenableFuture listenableFuture = this.h;
        if (listenableFuture != null) {
            listenableFuture.cancel(true);
        }
        if (TextUtils.isEmpty(this.f)) {
            this.b.l(Collections.EMPTY_LIST);
            this.a.a();
            return;
        }
        ebxl ebxlVar = (ebxl) this.a;
        ebxlVar.f.setVisibility(0);
        ebxlVar.g.setVisibility(0);
        ebxlVar.h.setVisibility(8);
        ebxlVar.i.setVisibility(8);
        ebun ebunVar = this.g;
        ListenableFuture listenableFutureF = ebunVar.f(this.f);
        this.h = listenableFutureF;
        eork.r(listenableFutureF, new ebwu(this), ebvf.a);
        ebxr ebxrVarA = ebunVar.a();
        erza erzaVar = (erza) erzb.a.createBuilder();
        erzaVar.copyOnWrite();
        ((erzb) erzaVar.instance).b = eryz.a(21);
        erzaVar.copyOnWrite();
        ((erzb) erzaVar.instance).e = eryyVar.a();
        ((ebxs) ebxrVarA).f((erzb) erzaVar.build());
    }
}
