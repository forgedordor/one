package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.ImageWriter;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class bak implements bkv {
    public volatile int a;
    public volatile boolean c;
    public volatile boolean d;
    public bco e;
    ByteBuffer f;
    ByteBuffer g;
    ByteBuffer h;
    ByteBuffer i;
    ByteBuffer j;
    ByteBuffer k;
    public final Object l;
    protected boolean m;
    private volatile int n;
    private ImageWriter o;
    private Matrix q;
    public volatile int b = 1;
    private Rect p = new Rect();

    public bak() {
        new Rect();
        this.q = new Matrix();
        new Matrix();
        this.l = new Object();
        this.m = true;
    }

    @Override // defpackage.bkv
    public final void a(bkw bkwVar) {
        try {
            bbm bbmVarB = b(bkwVar);
            if (bbmVarB != null) {
                e(bbmVarB);
            }
        } catch (IllegalStateException e) {
            bbs.d("ImageAnalysisAnalyzer", "Failed to acquire image.", e);
        }
    }

    public abstract bbm b(bkw bkwVar);

    final ListenableFuture c(bbm bbmVar) {
        bco bcoVar;
        int i = this.c ? this.a : 0;
        synchronized (this.l) {
            if (this.c && i != 0 && (bcoVar = this.e) != null) {
                bcoVar.k();
                int iC = bbmVar.c();
                int iB = bbmVar.b();
                int iB2 = this.e.b();
                int iC2 = this.e.c();
                boolean z = i == 90 || i == 270;
                int i2 = true != z ? iC : iB;
                if (true != z) {
                    iC = iB;
                }
                this.e = new bco(bbo.a(i2, iC, iB2, iC2));
                if (this.b == 1) {
                    ImageWriter imageWriter = this.o;
                    if (imageWriter != null) {
                        imageWriter.close();
                    }
                    this.o = ImageWriter.newInstance(this.e.e(), this.e.c());
                }
            }
            if (this.c || this.b == 3) {
                if (this.b == 1 || this.b == 3) {
                    if (this.g == null) {
                        this.g = ByteBuffer.allocateDirect(bbmVar.c() * bbmVar.b());
                    }
                    this.g.position(0);
                    if (this.h == null) {
                        this.h = ByteBuffer.allocateDirect((bbmVar.c() * bbmVar.b()) / 4);
                    }
                    this.h.position(0);
                    if (this.i == null) {
                        this.i = ByteBuffer.allocateDirect((bbmVar.c() * bbmVar.b()) / 4);
                    }
                    this.i.position(0);
                    if (this.b == 3) {
                        if (this.j == null) {
                            this.j = ByteBuffer.allocateDirect(bbmVar.c() * bbmVar.b());
                        }
                        this.j.position(0);
                        if (this.k == null) {
                            this.k = ByteBuffer.allocateDirect((bbmVar.c() * bbmVar.b()) / 2);
                        }
                        this.k.position(0);
                    }
                } else if (this.b == 2 && this.f == null) {
                    this.f = ByteBuffer.allocateDirect(bbmVar.c() * bbmVar.b() * 4);
                }
            }
        }
        return new bql(new laj("No analyzer or executor currently set."));
    }

    public abstract void d();

    public abstract void e(bbm bbmVar);

    final void f(Matrix matrix) {
        synchronized (this.l) {
            this.q = matrix;
            new Matrix(this.q);
        }
    }

    final void g(Rect rect) {
        synchronized (this.l) {
            this.p = rect;
            new Rect(this.p);
        }
    }
}
