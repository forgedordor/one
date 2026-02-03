package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyvk {
    private final Context a;

    public dyvk(Context context) {
        this.a = context;
    }

    public static boolean b(dyvl dyvlVar) {
        return ((dyvb) dyvlVar).d;
    }

    public final Bitmap a(dyvl dyvlVar, int i) {
        ejwl.b(i >= 0, "Size must be bigger or equal to 0");
        ejwl.b(b(dyvlVar), "handles(key) must be true");
        ArrayList arrayList = new ArrayList();
        dyvb dyvbVar = (dyvb) dyvlVar;
        String str = dyvbVar.b;
        if (str != null) {
            arrayList.add(str);
        }
        if (i == 0) {
            i = 120;
        }
        String str2 = dyvbVar.a;
        arrayList.add(str2);
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        ecxb ecxbVar = new ecxb(new ecxi(this.a.getApplicationContext(), new eoqh()));
        int[] iArr = ecxc.a;
        ecxd ecxdVar = new ecxd(ecxbVar);
        ebtu ebtuVar = ecxj.a;
        ecxdVar.a(null);
        ecxd.b(null);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        int iB = ecxd.b(str2);
        CharSequence charSequenceA = ecxdVar.a(new dyvj(strArr));
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int height = bitmapCreateBitmap.getHeight();
        int width = bitmapCreateBitmap.getWidth();
        ebtu ebtuVar2 = ecxj.a;
        Paint paint = (Paint) ebtuVar2.a();
        synchronized (ebtuVar2) {
            paint.setColor(iB);
            int height2 = canvas.getHeight();
            int width2 = canvas.getWidth();
            canvas.drawCircle(width2 / 2, height2 / 2, Math.min(width2, height2) / 2, paint);
            if (charSequenceA != null) {
                paint.setColor(-1);
                paint.setTextSize(Math.min(height, width) * 0.47f);
                String string = charSequenceA.toString();
                int length = charSequenceA.length();
                Rect rect = ecxj.b;
                paint.getTextBounds(string, 0, length, rect);
                canvas.drawText(charSequenceA, 0, charSequenceA.length(), width / 2, (height / 2) - rect.exactCenterY(), paint);
            }
        }
        return bitmapCreateBitmap;
    }
}
