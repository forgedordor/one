package defpackage;

import android.graphics.Bitmap;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oey implements ocx {
    private final mdd a;
    private final int b;
    private final AtomicLong c = new AtomicLong();

    public oey(mdd mddVar, int i) {
        this.a = mddVar;
        this.b = i;
    }

    @Override // defpackage.odl
    public final int a() {
        return this.a.a(this.b);
    }

    @Override // defpackage.odl
    public final Surface b() {
        return this.a.b(this.b);
    }

    @Override // defpackage.odl
    public final /* synthetic */ mix c() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.odi
    public final void e(obt obtVar, long j, mau mauVar, boolean z) {
        String scheme;
        int i;
        mbl mblVar = obtVar.a.b;
        boolean zEquals = (mblVar == null || (scheme = mblVar.a.getScheme()) == null) ? false : scheme.equals("transformer_surface_asset");
        long jA = obtVar.a(j);
        if (mauVar != null) {
            if (mauVar.A % 180 != 0) {
                mat matVar = new mat(mauVar);
                matVar.t = mauVar.w;
                matVar.u = mauVar.v;
                matVar.y = 0;
                mauVar = new mau(matVar);
            }
            mau mauVar2 = mauVar;
            mdd mddVar = this.a;
            int i2 = this.b;
            if (zEquals) {
                i = 4;
            } else {
                String str = mauVar2.o;
                mee.f(str);
                if (mbw.j(str)) {
                    i = 2;
                } else if (str.equals("video/raw")) {
                    i = 3;
                } else {
                    if (!mbw.l(str)) {
                        throw new IllegalArgumentException("MIME type not supported ".concat(str));
                    }
                    i = 1;
                }
            }
            mddVar.g(i2, i, mauVar2, obtVar.g.c, this.c.get());
        }
        this.c.addAndGet(jA);
    }

    @Override // defpackage.odl
    public final void f() {
        this.a.k(this.b);
    }

    @Override // defpackage.odl
    public final int h(Bitmap bitmap, men menVar) {
        return this.a.n(this.b, bitmap, menVar) ? 1 : 2;
    }

    @Override // defpackage.odl
    public final /* synthetic */ void i() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.odl
    public final boolean j() {
        return this.a.m(this.b);
    }
}
