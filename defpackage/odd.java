package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class odd implements oal {
    public final oak a;
    public final boolean b;
    public final ScheduledExecutorService c;
    public volatile int d;
    private final Context e;
    private final obt f;
    private final mei g;
    private odl h;
    private int i;

    public odd(Context context, obt obtVar, oak oakVar, mei meiVar, boolean z) {
        mee.c(obtVar.e != -9223372036854775807L);
        int i = obtVar.f;
        mee.c(false);
        this.e = context;
        this.f = obtVar;
        this.a = oakVar;
        this.g = meiVar;
        this.b = z;
        this.c = Executors.newSingleThreadScheduledExecutor();
        this.i = 0;
    }

    public final void a(final Bitmap bitmap, final mau mauVar) {
        try {
            odl odlVar = this.h;
            if (odlVar == null) {
                this.h = ((odu) this.a).j(mauVar);
                this.c.schedule(new Runnable() { // from class: ocy
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a(bitmap, mauVar);
                    }
                }, 10L, TimeUnit.MILLISECONDS);
                return;
            }
            obt obtVar = this.f;
            long j = obtVar.e;
            int i = obtVar.f;
            if (odlVar.h(bitmap, new men(j, -2.14748365E9f)) != 1) {
                this.c.schedule(new Runnable() { // from class: ocz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a(bitmap, mauVar);
                    }
                }, 10L, TimeUnit.MILLISECONDS);
            } else {
                this.d = 100;
                this.h.f();
            }
        } catch (RuntimeException e) {
            this.a.b(new ocp("Asset loader error", e, 1000));
        } catch (ocp e2) {
            this.a.b(e2);
        }
    }

    @Override // defpackage.oal
    public final int e(odj odjVar) {
        if (this.i == 2) {
            odjVar.a = this.d;
        }
        return this.i;
    }

    @Override // defpackage.oal
    public final ekgp f() {
        return ekoj.a;
    }

    @Override // defpackage.oal
    public final void g() {
        this.i = 0;
        this.c.shutdownNow();
    }

    @Override // defpackage.oal
    public final void h() {
        ListenableFuture listenableFutureH;
        this.i = 2;
        oak oakVar = this.a;
        obt obtVar = this.f;
        oakVar.a(obtVar.e);
        oakVar.c(1);
        Context context = this.e;
        mbo mboVar = obtVar.a;
        String strE = oeu.e(context, mboVar);
        if (strE == null || !mgb.X(strE)) {
            listenableFutureH = eork.h(new mby("Attempted to load a Bitmap from unsupported MIME type: ".concat(String.valueOf(strE)), null, false, 1));
        } else {
            mei meiVar = this.g;
            mbl mblVar = mboVar.b;
            mee.f(mblVar);
            final mho mhoVar = (mho) meiVar;
            final Uri uri = mblVar.a;
            listenableFutureH = mhoVar.a.submit(new Callable() { // from class: mhn
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    mho mhoVar2 = mhoVar;
                    mhv mhvVarA = ((mhu) mhoVar2.b).a();
                    Uri uri2 = uri;
                    BitmapFactory.Options options = mhoVar2.c;
                    try {
                        mhvVarA.b(new mht(uri2, 1, null, Collections.EMPTY_MAP, 0L, 0));
                        byte[] bArrCopyOf = new byte[1024];
                        int iA = 0;
                        int i = 0;
                        while (iA != -1) {
                            int length = bArrCopyOf.length;
                            if (i == length) {
                                bArrCopyOf = Arrays.copyOf(bArrCopyOf, length + length);
                            }
                            iA = mhvVarA.a(bArrCopyOf, i, bArrCopyOf.length - i);
                            if (iA != -1) {
                                i += iA;
                            }
                        }
                        byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i);
                        return mhg.a(bArrCopyOf2, bArrCopyOf2.length, options, 4096);
                    } finally {
                        mhvVarA.d();
                    }
                }
            });
        }
        eork.r(listenableFutureH, new odb(this), this.c);
    }
}
