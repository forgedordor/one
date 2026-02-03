package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxfr extends bxfp {
    private static Bitmap g;

    public bxfr(Context context, cpbn cpbnVar, bxfq bxfqVar) {
        super(context, cpbnVar, bxfqVar);
    }

    @Override // defpackage.bxfp, defpackage.bxha, defpackage.bxge
    protected final bxgh h(List list) {
        bxgh bxghVarH;
        eieu eieuVarK = eiiy.k("SimSelectorAvatarRequest.loadMediaInternal");
        try {
            ecem.b();
            bxfq bxfqVar = (bxfq) this.b;
            Uri uri = bxfqVar.k;
            if (uri == null || !"s".equals(cpbr.t(uri))) {
                bxghVarH = super.h(list);
            } else {
                int i = bxfqVar.b;
                int i2 = bxfqVar.c;
                String strU = cpbr.u(uri);
                cqaz.l(uri);
                boolean z = Boolean.parseBoolean(uri.getQueryParameter("s"));
                cqaz.l(uri);
                int i3 = Integer.parseInt(ejwk.b(uri.getQueryParameter("c")));
                Context context = this.a;
                Resources resources = context.getResources();
                float f = i / 2;
                float f2 = i2 / 2;
                int color = z ? i3 : context.getResources().getColor(R.color.sim_icon_background_color);
                int color2 = z ? -1 : ((-16777216) & i3) != 0 ? i3 : context.getResources().getColor(R.color.sim_icon_text_color);
                if (true == z) {
                    i3 = -1;
                }
                Bitmap bitmapA = m().a(i, i2, color);
                Paint paint = new Paint(1);
                Canvas canvas = new Canvas(bitmapA);
                if (g == null) {
                    g = ((BitmapDrawable) context.getResources().getDrawable(R.drawable.ic_sim_card_send)).getBitmap();
                    int density = bitmapA.getDensity();
                    if (g.getDensity() != density) {
                        g.setDensity(density);
                    }
                }
                paint.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_ATOP));
                paint.setAlpha(255);
                canvas.drawBitmap(g, f - (r11.getWidth() / 2), f2 - (g.getHeight() / 2), paint);
                paint.setColorFilter(null);
                paint.setAlpha(255);
                if (!TextUtils.isEmpty(strU)) {
                    paint.setTypeface(cpdu.e(context));
                    paint.setTextSize(resources.getDimensionPixelSize(R.dimen.sim_identifier_text_size));
                    paint.setColor(color2);
                    String upperCase = strU.substring(0, 1).toUpperCase(Locale.US);
                    paint.getTextBounds(upperCase, 0, 1, new Rect());
                    canvas.drawText(upperCase, f - r7.centerX(), f2 - r7.centerY(), paint);
                }
                bxghVarH = new bxfz(f(), bitmapA, 1, this.c, this.d);
            }
            eieuVarK.close();
            return bxghVarH;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.bxge
    public final int j() {
        return 2;
    }
}
