package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ran extends qzo {
    private static final Object m = new Object();
    private final Object n;
    private qzt o;
    private final Bitmap.Config p;

    public ran(String str, qzt qztVar, Bitmap.Config config, qzs qzsVar) {
        super(str, qzsVar);
        this.n = new Object();
        this.k = new qzd(1000, 2, 2.0f);
        this.o = qztVar;
        this.p = config;
    }

    @Override // defpackage.qzo
    protected final qzu b(qzk qzkVar) {
        qzu qzuVar;
        synchronized (m) {
            try {
                try {
                    byte[] bArr = qzkVar.b;
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inPreferredConfig = this.p;
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                    qzuVar = bitmapDecodeByteArray == null ? new qzu(new qzm(qzkVar)) : new qzu(bitmapDecodeByteArray, raj.b(qzkVar));
                } catch (OutOfMemoryError e) {
                    raa.b("Caught OOM for %d byte image, url=%s", Integer.valueOf(qzkVar.b.length), this.b);
                    return new qzu(new qzm(e));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qzuVar;
    }

    @Override // defpackage.qzo
    public final void e() {
        super.e();
        synchronized (this.n) {
            this.o = null;
        }
    }

    @Override // defpackage.qzo
    protected final /* bridge */ /* synthetic */ void f(Object obj) {
        qzt qztVar;
        Bitmap bitmap = (Bitmap) obj;
        synchronized (this.n) {
            qztVar = this.o;
        }
        if (qztVar != null) {
            qztVar.a(bitmap);
        }
    }

    @Override // defpackage.qzo
    public final int k() {
        return 1;
    }
}
