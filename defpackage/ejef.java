package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.google.chat.smartmessaging.penpal.ui.Segment;

/* compiled from: PG */
/* loaded from: classes5.dex */
final /* synthetic */ class ejef extends fdbo implements fdae {
    public ejef(Object obj) {
        super(0, obj, ejfj.class, "onSelectEmote", "onSelectEmote()V", 0);
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        ejfj ejfjVar = (ejfj) this.g;
        ((ekrd) ejfjVar.e.h().h("com/google/chat/smartmessaging/penpal/ui/EmotifyViewModel", "onSelectEmote", 287, "EmotifyViewModel.kt")).q("ViewModel  onClipSticker called");
        ejfjVar.f.f(ejfe.c);
        if (!ejfjVar.q) {
            Bitmap bitmap = ((Segment) ejfjVar.p.get(ejfjVar.o)).e;
            bitmap.getClass();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.getClass();
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawARGB(0, 0, 0, 0);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float fMax = Math.max(width, height);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            float f = 512.0f / fMax;
            canvas.drawBitmap(Bitmap.createScaledBitmap(bitmap, (int) (width * f), (int) (height * f), true), (512 - r5) / 2.0f, (512 - r6) / 2.0f, paint);
            ejfjVar.q = true;
            Object objB = ejfjVar.b.b();
            objB.getClass();
            fdil.d((fdjx) objB, null, null, new ejfg(ejfjVar, bitmapCreateBitmap, null), 3);
        }
        return fctx.a;
    }
}
