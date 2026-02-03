package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcmm {
    public static final fcmm a = new fcmm(new fbtg[0]);
    public final fbtg[] b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public fcmm(fbtg[] fbtgVarArr) {
        this.b = fbtgVarArr;
    }

    public static fcmm l(fbnm[] fbnmVarArr, fbmw fbmwVar) {
        fcmm fcmmVar = new fcmm(fbnmVarArr);
        for (fbnm fbnmVar : fbnmVarArr) {
            fbnmVar.d(fbmwVar);
        }
        return fcmmVar;
    }

    public static fcmm m(List list) {
        if (list.isEmpty()) {
            return a;
        }
        int size = list.size();
        fbtg[] fbtgVarArr = new fbtg[size];
        for (int i = 0; i < size; i++) {
            fbtgVarArr[i] = ((fbsu) list.get(i)).a();
        }
        return new fcmm(fbtgVarArr);
    }

    public final void a() {
        int i = 0;
        while (true) {
            fbtg[] fbtgVarArr = this.b;
            if (i >= fbtgVarArr.length) {
                return;
            }
            i++;
        }
    }

    public final void b(long j) {
        int i = 0;
        while (true) {
            fbtg[] fbtgVarArr = this.b;
            if (i >= fbtgVarArr.length) {
                return;
            }
            fbtgVarArr[i].b(j);
            i++;
        }
    }

    public final void c(long j) {
        int i = 0;
        while (true) {
            fbtg[] fbtgVarArr = this.b;
            if (i >= fbtgVarArr.length) {
                return;
            }
            fbtgVarArr[i].c(j);
            i++;
        }
    }

    public final void d() {
        int i = 0;
        while (true) {
            fbtg[] fbtgVarArr = this.b;
            if (i >= fbtgVarArr.length) {
                return;
            }
            ((fbnm) fbtgVarArr[i]).a();
            i++;
        }
    }

    public final void e() {
        int i = 0;
        while (true) {
            fbtg[] fbtgVarArr = this.b;
            if (i >= fbtgVarArr.length) {
                return;
            }
            i++;
        }
    }

    public final void f() {
        int i = 0;
        while (true) {
            fbtg[] fbtgVarArr = this.b;
            if (i >= fbtgVarArr.length) {
                return;
            }
            fbtg fbtgVar = fbtgVarArr[i];
            i++;
        }
    }

    public final void g() {
        int i = 0;
        while (true) {
            fbtg[] fbtgVarArr = this.b;
            if (i >= fbtgVarArr.length) {
                return;
            }
            fbtg fbtgVar = fbtgVarArr[i];
            i++;
        }
    }

    public final void h() {
        int i = 0;
        while (true) {
            fbtg[] fbtgVarArr = this.b;
            if (i >= fbtgVarArr.length) {
                return;
            }
            fbtg fbtgVar = fbtgVarArr[i];
            i++;
        }
    }

    public final void i() {
        int i = 0;
        while (true) {
            fbtg[] fbtgVarArr = this.b;
            if (i >= fbtgVarArr.length) {
                return;
            }
            fbtg fbtgVar = fbtgVarArr[i];
            i++;
        }
    }

    public final void j() {
        int i = 0;
        while (true) {
            fbtg[] fbtgVarArr = this.b;
            if (i >= fbtgVarArr.length) {
                return;
            }
            fbtg fbtgVar = fbtgVarArr[i];
            i++;
        }
    }

    public final void k() {
        int i = 0;
        while (true) {
            fbtg[] fbtgVarArr = this.b;
            if (i >= fbtgVarArr.length) {
                return;
            }
            fbtg fbtgVar = fbtgVarArr[i];
            i++;
        }
    }

    public final void n() {
        if (this.c.compareAndSet(false, true)) {
            for (fbtg fbtgVar : this.b) {
                fbtgVar.e();
            }
        }
    }
}
