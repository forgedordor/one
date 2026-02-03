package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adde implements addh {
    public final Context a;
    public final String b;
    public float c = 1.0f;
    private final eosc d;

    public adde(Context context, eosc eoscVar, String str) {
        this.a = context;
        this.d = eoscVar;
        this.b = str;
    }

    @Override // defpackage.addh
    public final float a() {
        return this.c;
    }

    @Override // defpackage.addh
    public final Drawable b() {
        final qof qofVar = new qof();
        Callable callable = new Callable() { // from class: addc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                adde addeVar = this.a;
                return qnu.a(addeVar.a, addeVar.b);
            }
        };
        eosc eoscVar = this.d;
        eijx.g(callable, eoscVar).k(auvh.c(new Consumer() { // from class: addd
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                adde addeVar = this.a;
                float f = addeVar.a.getResources().getDisplayMetrics().density * 48.0f;
                Object obj2 = ((qol) obj).a;
                if (obj2 != null) {
                    qofVar.v((qnm) obj2);
                    addeVar.c = f / r4.i.right;
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }), eoscVar);
        return qofVar;
    }

    @Override // defpackage.addh
    public final void c(Drawable drawable, int i) {
        ((qof) drawable).g(new qst("**"), qok.a, new qxc(Integer.valueOf(i)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0012 A[PHI: r4
      0x0012: PHI (r4v4 float) = (r4v2 float), (r4v3 float) binds: [B:7:0x0010, B:10:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.addh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.graphics.drawable.Drawable r2, float r3, boolean r4) {
        /*
            r1 = this;
            qof r2 = (defpackage.qof) r2
            r0 = 1
            if (r0 == r4) goto L8
            r4 = 1065353216(0x3f800000, float:1.0)
            goto Lb
        L8:
            r4 = 1058642330(0x3f19999a, float:0.6)
        Lb:
            defpackage.ejwl.a(r0)
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 <= 0) goto L14
        L12:
            r3 = r4
            goto L1a
        L14:
            r4 = 0
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 >= 0) goto L1a
            goto L12
        L1a:
            r2.s(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adde.d(android.graphics.drawable.Drawable, float, boolean):void");
    }
}
