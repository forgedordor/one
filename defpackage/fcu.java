package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcu {
    public static final hyr a = hxu.a(new fdat() { // from class: fcs
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            fcu fcuVar = (fcu) obj2;
            hyr hyrVar = fcu.a;
            return fcva.g(Float.valueOf(fcuVar.b()), Boolean.valueOf(fcuVar.c() == dwm.a));
        }
    }, new fdap() { // from class: fct
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            List list = (List) obj;
            Object obj2 = list.get(1);
            obj2.getClass();
            dwm dwmVar = ((Boolean) obj2).booleanValue() ? dwm.a : dwm.b;
            Object obj3 = list.get(0);
            obj3.getClass();
            return new fcu(dwmVar, ((Float) obj3).floatValue());
        }
    });
    public long b;
    private ihu c;
    private final hox d;
    private final hrg e;
    private final hrg f;
    private final hri g;

    public fcu() {
        this(dwm.a);
    }

    public final float a() {
        return this.f.c();
    }

    public final float b() {
        return this.e.c();
    }

    public final dwm c() {
        return (dwm) this.d.a();
    }

    public final void d(float f) {
        this.e.h(f);
    }

    public final void e(dwm dwmVar, ihu ihuVar, int i, int i2) {
        float f = i2 - i;
        this.f.h(f);
        ihu ihuVar2 = this.c;
        float f2 = ihuVar2.b;
        float f3 = ihuVar.b;
        if (f3 != f2 || ihuVar.c != ihuVar2.c) {
            boolean z = dwmVar == dwm.a;
            if (z) {
                f3 = ihuVar.c;
            }
            float f4 = z ? ihuVar.e : ihuVar.d;
            float fB = b();
            float f5 = i;
            float f6 = fB + f5;
            d(b() + ((f4 <= f6 && (f3 >= fB || f4 - f3 <= f5)) ? (f3 >= fB || f4 - f3 > f5) ? 0.0f : f3 - fB : f4 - f6));
            this.c = ihuVar;
        }
        d(fddu.e(b(), 0.0f, f));
        this.g.i(i);
    }

    public fcu(dwm dwmVar, float f) {
        this.e = new hpf(f);
        this.f = new hpf(0.0f);
        this.g = new hph(0);
        this.c = ihu.a;
        this.b = jyo.a;
        this.d = new hpl(dwmVar, hsi.a);
    }

    public /* synthetic */ fcu(dwm dwmVar) {
        this(dwmVar, 0.0f);
    }
}
