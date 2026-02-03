package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bfq implements bth {
    private static bib b(bbm bbmVar) {
        return bbmVar.e() instanceof bqv ? ((bqv) bbmVar.e()).a : new bia();
    }

    @Override // defpackage.bth
    public final /* bridge */ /* synthetic */ Object a(Object obj) throws bbg {
        bob bobVarC;
        bfz bfzVar = (bfz) obj;
        bbm bbmVarA = bfzVar.a();
        bgb bgbVarB = bfzVar.b();
        if (bsc.d(bbmVarA.a())) {
            try {
                String str = bob.a;
                ByteBuffer byteBufferC = bbmVarA.f()[0].c();
                byteBufferC.rewind();
                byte[] bArr = new byte[byteBufferC.capacity()];
                byteBufferC.get(bArr);
                bobVarC = bob.c(new ByteArrayInputStream(bArr));
                bbmVarA.f()[0].c().rewind();
            } catch (IOException e) {
                throw new bbg("Failed to extract EXIF data.", e);
            }
        } else {
            bobVarC = null;
        }
        if (!brv.a() || !bsc.d(bbmVarA.a())) {
            return bti.j(bbmVarA, bobVarC, new Size(bbmVarA.c(), bbmVarA.b()), bgbVarB.d, bgbVarB.e, bgbVarB.g, b(bbmVarA));
        }
        lcg.j(bobVarC, "JPEG image must have exif.");
        Size size = new Size(bbmVarA.c(), bbmVarA.b());
        int iB = bgbVarB.e - bobVarC.b();
        Size size2 = boy.n(boy.b(iB)) ? new Size(size.getHeight(), size.getWidth()) : size;
        Matrix matrixC = boy.c(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, size2.getWidth(), size2.getHeight()), iB);
        RectF rectF = new RectF(bgbVarB.d);
        matrixC.mapRect(rectF);
        rectF.sort();
        Rect rect = new Rect();
        rectF.round(rect);
        Size size3 = size2;
        int iB2 = bobVarC.b();
        Matrix matrix = new Matrix(bgbVarB.g);
        matrix.postConcat(matrixC);
        return bti.j(bbmVarA, bobVarC, size3, rect, iB2, matrix, b(bbmVarA));
    }
}
