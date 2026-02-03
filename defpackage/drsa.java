package defpackage;

import android.os.Trace;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drsa {
    static ekgb a(droa droaVar, ekgb ekgbVar, int i, drsj drsjVar, boolean z, boolean z2) {
        return b(droaVar, ekgbVar, i, drsjVar, z, z2, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ekgb b(droa droaVar, ekgb ekgbVar, int i, drsj drsjVar, boolean z, boolean z2, int i2) {
        int i3;
        int i4 = ekgb.d;
        ekfw ekfwVar = new ekfw();
        drso.a();
        int size = ekgbVar.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            drto drtoVar = (drto) ekgbVar.get(i6);
            if (i2 != -1 && i5 >= i2) {
                break;
            }
            if (drtoVar.b() != 1) {
                drtoVar.b();
                if (drtoVar.b() == 4) {
                    i3 = i5 + 1;
                    ekfwVar.h(new drrp(i, i5, drtoVar.c()));
                } else if (drtoVar.b() == 3) {
                    i3 = i5 + 1;
                    drtoVar.d();
                    ekfwVar.h(new droz(i, i5));
                } else if (drtoVar.b() == 5) {
                    ekfwVar.h(new drsb(i, i5));
                    i5++;
                } else {
                    drtoVar.b();
                }
                i5 = i3;
            } else if (drso.c(drtoVar.a(), drsjVar)) {
                int i7 = i5 + 1;
                ekgb ekgbVarD = drso.d(droaVar.c(drtoVar.a()), drsjVar);
                if (!z2 || ((ekoe) ekgbVarD).c <= 1) {
                    ekgbVarD = ekoe.a;
                }
                ekfwVar.h(new drrn(i, i5, drtoVar.a(), ekgbVarD, z));
                i5 = i7;
            }
        }
        return ekfwVar.g();
    }

    static ListenableFuture c(final droa droaVar, dros drosVar, final drsj drsjVar, final int i, final boolean z, final Optional optional) {
        plm.a("ItemViewDataUtils.getRecentItemViewData");
        try {
            final ListenableFuture listenableFutureB = drosVar.b();
            return eork.b(listenableFutureB, ((drnf) droaVar).k).a(new Callable() { // from class: drrz
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i2 = ekgb.d;
                    ekgb ekgbVar = (ekgb) drnm.a(listenableFutureB, ekoe.a);
                    optional.isPresent();
                    return drsa.b(droaVar, ekgbVar, 0, drsjVar, false, z, i);
                }
            }, eoqg.a);
        } finally {
            Trace.endSection();
        }
    }
}
