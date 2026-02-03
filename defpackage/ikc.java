package defpackage;

import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ikc {
    public static /* synthetic */ void a(ikd ikdVar, ihu ihuVar) {
        iik iikVar = (iik) ikdVar;
        if (iikVar.b == null) {
            iikVar.b = new RectF();
        }
        RectF rectF = iikVar.b;
        rectF.getClass();
        rectF.set(ihuVar.b, ihuVar.c, ihuVar.d, ihuVar.e);
        Path path = iikVar.a;
        RectF rectF2 = iikVar.b;
        rectF2.getClass();
        path.addOval(rectF2, Path.Direction.CCW);
    }
}
