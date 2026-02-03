package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kpo implements hqt {
    public final kph a;
    public Handler b;
    public final iao c = new iao(new fdap() { // from class: kpk
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            final fdae fdaeVar = (fdae) obj;
            if (fdbq.f(Looper.myLooper(), Looper.getMainLooper())) {
                fdaeVar.invoke();
            } else {
                kpo kpoVar = this.a;
                Handler handler = kpoVar.b;
                if (handler == null) {
                    handler = new Handler(Looper.getMainLooper());
                    kpoVar.b = handler;
                }
                handler.post(new Runnable() { // from class: kpn
                    @Override // java.lang.Runnable
                    public final void run() {
                        fdaeVar.invoke();
                    }
                });
            }
            return fctx.a;
        }
    });
    public boolean d = true;
    public final fdap e = new fdap() { // from class: kpl
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            this.a.d = true;
            return fctx.a;
        }
    };
    public final List f = new ArrayList();

    public kpo(kph kphVar) {
        this.a = kphVar;
    }

    public final void a() {
        this.d = true;
    }

    @Override // defpackage.hqt
    public final void h() {
        iao iaoVar = this.c;
        iaoVar.e();
        iaoVar.a();
    }

    @Override // defpackage.hqt
    public final void i() {
        this.c.d();
    }

    @Override // defpackage.hqt
    public final void g() {
    }
}
