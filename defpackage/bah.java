package defpackage;

import android.util.Size;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bah {
    public static final bko a;
    private static final Size b;
    private static final azv c;
    private static final bvc d;

    static {
        Size size = new Size(640, 480);
        b = size;
        azv azvVar = azv.b;
        c = azvVar;
        bvc bvcVar = new bvc(bva.a, new bvd(bsd.c, 1));
        d = bvcVar;
        bag bagVar = new bag();
        bli bliVar = bagVar.a;
        bliVar.c(bku.K, size);
        bliVar.c(bni.t, 1);
        bliVar.c(bku.F, 0);
        bagVar.e(bvcVar);
        if (!Objects.equals(azv.b, azvVar)) {
            throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
        }
        bliVar.c(bkr.o, azvVar);
        a = bagVar.c();
    }
}
