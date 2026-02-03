package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.chat.smartmessaging.penpal.ui.Segment;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejft extends View {
    public final ejfj a;
    public final ekrg b;
    public Bitmap c;
    public Canvas d;
    public ejfe e;
    public boolean f;
    public ValueAnimator g;
    public ejdv h;
    private final Paint i;

    public ejft(Context context, ejfj ejfjVar) {
        super(context);
        this.a = ejfjVar;
        this.b = ekrg.c("com/google/chat/smartmessaging/penpal/ui/SegmentDisplayAndSelectionView");
        this.e = ejfe.a;
        Paint paint = new Paint();
        paint.setAlpha(77);
        paint.setColorFilter(new PorterDuffColorFilter(eehg.e(context, context.getColor(R.color.shimmer_color)), PorterDuff.Mode.SRC_ATOP));
        this.i = paint;
        new Paint().setAntiAlias(true);
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            ValueAnimator valueAnimator2 = this.g;
            ValueAnimator valueAnimator3 = null;
            if (valueAnimator2 == null) {
                fdbq.c("shimmerAnimator");
                valueAnimator2 = null;
            }
            valueAnimator2.removeAllUpdateListeners();
            ValueAnimator valueAnimator4 = this.g;
            if (valueAnimator4 == null) {
                fdbq.c("shimmerAnimator");
            } else {
                valueAnimator3 = valueAnimator4;
            }
            valueAnimator3.removeAllListeners();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        canvas.getClass();
        super.onDraw(canvas);
        if (this.e == ejfe.b && this.f) {
            canvas.drawColor(Color.parseColor("#CC000001"));
            Canvas canvas3 = this.d;
            if (canvas3 == null) {
                fdbq.c("animationCanvas");
                canvas3 = null;
            }
            canvas3.drawColor(0, PorterDuff.Mode.CLEAR);
            ejfj ejfjVar = this.a;
            ArrayList arrayList = ejfjVar.p;
            Object obj = arrayList.get(ejfjVar.o);
            obj.getClass();
            Segment segment = (Segment) obj;
            Canvas canvas4 = this.d;
            if (canvas4 == null) {
                fdbq.c("animationCanvas");
                canvas4 = null;
            }
            Bitmap bitmap = segment.e;
            bitmap.getClass();
            canvas4.drawBitmap(bitmap, (Rect) null, segment.f, (Paint) null);
            Canvas canvas5 = this.d;
            if (canvas5 == null) {
                fdbq.c("animationCanvas");
                canvas2 = null;
            } else {
                canvas2 = canvas5;
            }
            canvas2.getClass();
            float width = canvas2.getWidth();
            float height = canvas2.getHeight();
            ValueAnimator valueAnimator = this.g;
            if (valueAnimator == null) {
                fdbq.c("shimmerAnimator");
                valueAnimator = null;
            }
            Object animatedValue = valueAnimator.getAnimatedValue();
            animatedValue.getClass();
            float fFloatValue = ((Float) animatedValue).floatValue();
            ValueAnimator valueAnimator2 = this.g;
            if (valueAnimator2 == null) {
                fdbq.c("shimmerAnimator");
                valueAnimator2 = null;
            }
            float duration = fFloatValue / valueAnimator2.getDuration();
            float f = width * 3.0f;
            float f2 = height * 3.0f;
            Math.hypot(f, f2);
            float f3 = duration * 3.0f;
            float f4 = (f3 * width) - width;
            float f5 = (f3 * height) - height;
            LinearGradient linearGradient = new LinearGradient(-f4, -f5, f - f4, f2 - f5, new int[]{0, eehg.e(getContext(), getContext().getColor(R.color.shimmer_color)), 0, 0, 0}, new float[]{0.0f, 0.05f, 0.25f, 0.65f, 1.0f}, Shader.TileMode.CLAMP);
            Paint paint = new Paint();
            paint.setShader(linearGradient);
            if (this.f) {
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
            }
            canvas2.drawRect(0.0f, 0.0f, width, height, paint);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (ejfjVar.o != i) {
                    Object obj2 = arrayList.get(i);
                    obj2.getClass();
                    Segment segment2 = (Segment) obj2;
                    Canvas canvas6 = this.d;
                    if (canvas6 == null) {
                        fdbq.c("animationCanvas");
                        canvas6 = null;
                    }
                    Bitmap bitmap2 = segment2.e;
                    bitmap2.getClass();
                    canvas6.drawBitmap(bitmap2, (Rect) null, segment2.f, this.i);
                }
            }
            Bitmap bitmap3 = this.c;
            bitmap3.getClass();
            canvas.drawBitmap(bitmap3, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ejdv ejdvVar;
        motionEvent.getClass();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                return false;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            ((ekrd) this.b.h().h("com/google/chat/smartmessaging/penpal/ui/SegmentDisplayAndSelectionView", "handleTouchUpEvent", 69, "SegmentDisplayAndSelectionView.kt")).t("handleTouchUpEvent - Mode: %s", this.e);
            if (this.e.ordinal() == 1 && (ejdvVar = this.h) != null) {
                ejfj ejfjVar = ejdvVar.a;
                ((ekrd) ejfjVar.e.h().h("com/google/chat/smartmessaging/penpal/ui/EmotifyViewModel", "onTapSubject", 233, "EmotifyViewModel.kt")).q("handleTouchUpEventInSelectingMode");
                ArrayList arrayList = ejfjVar.p;
                int size = arrayList.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj = arrayList.get(i2);
                    obj.getClass();
                    if (true == ((Segment) obj).f.contains((int) x, (int) y)) {
                        i = i2;
                    }
                }
                Rect rect = ((Segment) arrayList.get(i)).f;
                ejfjVar.i.f(new kjb((((Segment) arrayList.get(i)).c[0] << 32) | (((Segment) arrayList.get(i)).c[1] & 4294967295L)));
                ejfjVar.o = i;
            }
        }
        return true;
    }
}
