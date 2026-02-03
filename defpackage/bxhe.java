package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxhe extends bxge {
    private final cqsu g;

    /* compiled from: PG */
    public interface a {
        cqsu cL();
    }

    public bxhe(Context context, bxhb bxhbVar) {
        super(context, bxhbVar);
        this.g = ((a) ehli.a(context, a.class)).cL();
    }

    @Override // defpackage.bxge
    protected final InputStream i() {
        return null;
    }

    @Override // defpackage.bxge
    protected final Bitmap k() {
        Bitmap bitmapD;
        bxgf bxgfVar = this.b;
        bxhb bxhbVar = (bxhb) bxgfVar;
        Uri uriA = bxhbVar.a();
        if (uriA != null) {
            bitmapD = this.g.d(uriA, bxhbVar.b, bxhbVar.c);
        } else {
            bitmapD = null;
        }
        if (bitmapD != null) {
            bxgfVar.b(bitmapD.getWidth(), bitmapD.getHeight());
        }
        return bitmapD;
    }

    @Override // defpackage.bxge
    protected final boolean n() {
        return true;
    }
}
