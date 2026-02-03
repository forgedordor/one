package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpbi extends cpcg implements cpbm {
    private static final eksp a = eksp.c("BugleImage");

    /* compiled from: PG */
    public interface a {
        arvh ay();

        cphu cB();

        crpr cQ();

        cpbn cz();

        cpeo iv();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c0  */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.graphics.Bitmap b(android.net.Uri r25, int r26, int r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1007
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpbi.b(android.net.Uri, int, int):android.graphics.Bitmap");
    }

    @Override // defpackage.cpcg
    protected final Bitmap a(Uri uri) throws Throwable {
        Bitmap bitmap;
        List list;
        String str;
        String str2;
        Context context = getContext();
        context.getClass();
        String str3 = "Rejecting unsafe uri";
        String str4 = "AvatarContentProvider.java";
        if (!cpbr.z(context, uri)) {
            eksl ekslVar = (eksl) a.i();
            ekslVar.X(bxhf.i, cqcv.b(uri.toString()));
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/ui/avatar/AvatarContentProvider$AvatarContentProviderInner", "generateBitmap", 98, "AvatarContentProvider.java")).q("Rejecting unsafe uri");
            return null;
        }
        int dimension = (int) getContext().getResources().getDimension(R.dimen.contact_icon_view_xlarge_size);
        int dimension2 = (int) getContext().getResources().getDimension(R.dimen.contact_icon_view_xlarge_size);
        if (!"g".equals(cpbr.t(uri))) {
            return b(uri, dimension2, dimension);
        }
        cpbn cpbnVarCz = ((a) cqtf.a(a.class)).cz();
        String strT = cpbr.t(uri);
        Bitmap bitmapG = g(dimension2, dimension, 0);
        Canvas canvas = new Canvas(bitmapG);
        cqaz.k("g".equals(strT));
        List listW = cpbr.w(uri);
        RectF[] rectFArrC = cpbnVarCz.c(dimension2, dimension, listW.size());
        int i = 0;
        while (i < rectFArrC.length) {
            try {
                RectF rectF = rectFArrC[i];
                Uri uri2 = Uri.parse((String) listW.get(i));
                Context context2 = getContext();
                context2.getClass();
                if (cpbr.z(context2, uri2)) {
                    Bitmap bitmapB = b(uri2, dimension2, dimension);
                    try {
                        list = listW;
                        RectF rectF2 = new RectF(0.0f, 0.0f, bitmapB.getWidth(), bitmapB.getHeight());
                        Bitmap bitmapG2 = g(Math.round(rectF.width()), Math.round(rectF.height()), 0);
                        str = str3;
                        str2 = str4;
                        RectF rectF3 = new RectF(0.0f, 0.0f, bitmapG2.getWidth(), bitmapG2.getHeight());
                        cqsu.q(bitmapB, new Canvas(bitmapG2), rectF2, rectF3, false, 0, true);
                        Matrix matrix = new Matrix();
                        matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.FILL);
                        canvas.drawBitmap(bitmapG2, matrix, new Paint(1));
                        if (bitmapB != null) {
                            bitmapB.recycle();
                        }
                    } catch (Throwable th) {
                        th = th;
                        bitmap = bitmapB;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        throw th;
                    }
                } else {
                    eksl ekslVar2 = (eksl) a.i();
                    ekslVar2.X(bxhf.i, cqcv.b(uri2.toString()));
                    ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/ui/avatar/AvatarContentProvider$AvatarContentProviderInner", "getGroupAvatarBitmap", 146, str4)).q(str3);
                    list = listW;
                    str = str3;
                    str2 = str4;
                }
                i++;
                listW = list;
                str3 = str;
                str4 = str2;
            } catch (Throwable th2) {
                th = th2;
                bitmap = null;
            }
        }
        return bitmapG;
    }

    @Override // defpackage.cpbm
    public final Bitmap g(int i, int i2, int i3) {
        OutOfMemoryError outOfMemoryError;
        Bitmap bitmapCreateBitmap;
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            try {
                bitmapCreateBitmap.eraseColor(i3);
                return bitmapCreateBitmap;
            } catch (OutOfMemoryError e) {
                outOfMemoryError = e;
                ((eksl) ((eksl) ((eksl) a.j()).g(outOfMemoryError)).h("com/google/android/apps/messaging/shared/ui/avatar/AvatarContentProvider$AvatarContentProviderInner", "createOrReuseBitmap", (char) 439, "AvatarContentProvider.java")).q("Error while creating bitmap");
                ((a) cqtf.a(a.class)).iv().a(15, 1);
                return bitmapCreateBitmap;
            }
        } catch (OutOfMemoryError e2) {
            outOfMemoryError = e2;
            bitmapCreateBitmap = null;
        }
    }
}
