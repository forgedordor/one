package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import java.io.InputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class bxge implements bxgk {
    protected final Context a;
    protected final bxgf b;
    public final cogw c;
    public final cqsu d;
    protected int e;
    public int f = 0;
    private final fcsu g;

    /* compiled from: PG */
    public interface a {
        cqsu cL();

        fcsu gn();

        cogw y();
    }

    public bxge(Context context, bxgf bxgfVar) {
        this.a = context;
        this.b = bxgfVar;
        a aVar = (a) ehli.a(context, a.class);
        this.c = aVar.y();
        this.d = aVar.cL();
        this.g = aVar.gn();
    }

    @Override // defpackage.bxgk
    public final int a() {
        return this.f;
    }

    @Override // defpackage.bxgk
    public final int b() {
        return 3;
    }

    @Override // defpackage.bxgk
    public final bxgi c() {
        return ((bxgj) this.g.b()).c(j());
    }

    @Override // defpackage.bxgk
    public final /* synthetic */ bxgl d() {
        return this.b;
    }

    @Override // defpackage.bxgk
    public final /* bridge */ /* synthetic */ bxgz e(List list) {
        cqaz.h();
        bxgh bxghVarH = h(list);
        if (bxghVarH == null) {
            throw new IllegalStateException("Error reading from resources.");
        }
        bxgf bxgfVar = this.b;
        int i = bxgfVar.i;
        boolean z = bxgfVar.h;
        if ((!z && i == 0) || !(bxghVarH instanceof bxfz)) {
            return bxghVarH;
        }
        int i2 = bxgfVar.b;
        int i3 = bxgfVar.c;
        Bitmap bitmapD = bxghVarH.d();
        Bitmap bitmapA = m().a(i2, i3, 0);
        RectF rectF = new RectF(0.0f, 0.0f, i2, i3);
        boolean z2 = false;
        RectF rectF2 = new RectF(0.0f, 0.0f, bitmapD.getWidth(), bitmapD.getHeight());
        Canvas canvas = new Canvas(bitmapA);
        if (i != 0) {
            z2 = true;
        }
        cqsu.q(bitmapD, canvas, rectF2, rectF, z2, i, z);
        return new bxfz(f(), bitmapA, bxghVarH.c(), this.c, this.d);
    }

    @Override // defpackage.bxgk
    public final String f() {
        return this.b.e();
    }

    protected bxgh h(List list) {
        bxgh bxfzVar;
        eieu eieuVarK = eiiy.k("ImageRequest.loadMediaInternal");
        try {
            bxgf bxgfVar = this.b;
            if (bxgfVar.g || !o()) {
                Bitmap bitmapL = l();
                if (bitmapL == null) {
                    throw new RuntimeException("failed decoding bitmap");
                }
                bxfzVar = new bxfz(f(), bitmapL, this.e, this.c, this.d);
            } else {
                InputStream inputStreamI = i();
                if (inputStreamI == null) {
                    bxfzVar = null;
                } else {
                    try {
                        if (bxgfVar.j) {
                            bxfzVar = new bxga(f(), dcnf.b(inputStreamI), this.c);
                        } else {
                            bxfzVar = bxgd.m(f(), inputStreamI, this.c);
                            if (bxfzVar == null) {
                                throw new IllegalStateException("Error decoding gif");
                            }
                        }
                        inputStreamI.close();
                    } finally {
                    }
                }
            }
            eieuVarK.close();
            return bxfzVar;
        } finally {
        }
    }

    protected abstract InputStream i();

    public int j() {
        return 1;
    }

    protected Bitmap k() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected android.graphics.Bitmap l() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxge.l():android.graphics.Bitmap");
    }

    protected final bxgy m() {
        bxgj bxgjVar = (bxgj) this.g.b();
        int iJ = j();
        bxgi bxgiVarC = bxgjVar.c(iJ);
        if (bxgiVarC instanceof bxgx) {
            return ((bxgx) bxgiVarC).d;
        }
        throw new IllegalArgumentException(defpackage.a.g(iJ, "MediaCacheManager: cache id does not correspond to a PoolableImageCache "));
    }

    protected boolean n() {
        return false;
    }

    protected boolean o() {
        return cqsu.k(i());
    }
}
