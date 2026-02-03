package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sga extends inz implements hqt {
    public final Drawable a;
    public final hox b;
    public final hox c;
    private final fctc d;

    public sga(Drawable drawable) {
        this.a = drawable;
        hsi hsiVar = hsi.a;
        this.b = new hpl(0, hsiVar);
        this.c = new hpl(new ihz(sgc.a(drawable)), hsiVar);
        this.d = fctd.a(new fdae() { // from class: sfy
            @Override // defpackage.fdae
            public final Object invoke() {
                return new sfz(this.a);
            }
        });
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // defpackage.inz
    public final long a() {
        return ((ihz) this.c.a()).a;
    }

    @Override // defpackage.inz
    protected final void b(imz imzVar) {
        ijb ijbVarB = imzVar.t().b();
        j();
        int iB = fdcu.b(Float.intBitsToFloat((int) (imzVar.b() >> 32)));
        int iB2 = fdcu.b(Float.intBitsToFloat((int) (imzVar.b() & 4294967295L)));
        Drawable drawable = this.a;
        drawable.setBounds(0, 0, iB, iB2);
        try {
            ijbVarB.l();
            drawable.draw(iid.a(ijbVarB));
        } finally {
            ijbVarB.j();
        }
    }

    @Override // defpackage.inz
    protected final void c(float f) {
        this.a.setAlpha(fddu.i(fdcu.b(f * 255.0f), 0, 255));
    }

    @Override // defpackage.inz
    protected final void d(ijf ijfVar) {
        this.a.setColorFilter(ijfVar != null ? ijfVar.b : null);
    }

    @Override // defpackage.inz
    protected final void f(kji kjiVar) {
        int i;
        kjiVar.getClass();
        int iOrdinal = kjiVar.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                throw new fctg();
            }
        } else {
            i = 0;
        }
        this.a.setLayoutDirection(i);
    }

    @Override // defpackage.hqt
    public final void g() {
        h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hqt
    public final void h() {
        Drawable drawable = this.a;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hqt
    public final void i() {
        Drawable.Callback callback = (Drawable.Callback) this.d.a();
        Drawable drawable = this.a;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    public final int j() {
        return ((Number) this.b.a()).intValue();
    }
}
