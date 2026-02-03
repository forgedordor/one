package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dnuk<T> extends View {
    static final /* synthetic */ fdeh[] a;
    public static final TextPaint b;
    public static final dngt c;
    public static final dngt d;
    private static final ekrg j;
    private static final dngt k;
    public fdjx e;
    public volatile CharSequence f;
    public volatile lop[] g;
    public final fctc h;
    public final fctc i;
    private fdlr l;
    private int m;
    private final fdcz n;

    static {
        fdbv fdbvVar = new fdbv(dnuk.class, "content", "getContent()Ljava/lang/Object;", 0);
        int i = fdcj.a;
        a = new fdeh[]{fdbvVar};
        j = ekrg.c("com/google/android/libraries/compose/emoji/ui/views/EmojiView");
        TextPaint textPaint = new TextPaint();
        textPaint.setTextAlign(Paint.Align.CENTER);
        b = textPaint;
        c = new dngt(new fdau() { // from class: dnub
            @Override // defpackage.fdau
            public final Object a(Object obj, Object obj2, Object obj3) {
                int iIntValue = (((Integer) obj).intValue() - ((Integer) obj2).intValue()) - ((Integer) obj3).intValue();
                TextPaint textPaint2 = dnuk.b;
                textPaint2.setTextSize(iIntValue);
                return textPaint2;
            }
        });
        k = new dngt(new fdau() { // from class: dnuc
            @Override // defpackage.fdau
            public final Object a(Object obj, Object obj2, Object obj3) {
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                Integer num2 = (Integer) obj2;
                num2.intValue();
                Integer num3 = (Integer) obj3;
                num3.intValue();
                TextPaint textPaint2 = (TextPaint) dnuk.c.a(num, num2, num3);
                return Float.valueOf((iIntValue / 2.0f) - ((textPaint2.descent() + textPaint2.ascent()) / 2.0f));
            }
        });
        d = new dngt(new fdau() { // from class: dnud
            @Override // defpackage.fdau
            public final Object a(Object obj, Object obj2, Object obj3) {
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                int iIntValue3 = ((Integer) obj3).intValue();
                TextPaint textPaint2 = dnuk.b;
                Path path = new Path();
                float f = iIntValue2;
                float f2 = iIntValue3;
                float f3 = iIntValue;
                float f4 = f2 - f3;
                path.moveTo(f, f4);
                path.lineTo(f - f3, f2);
                path.lineTo(f, f2);
                path.lineTo(f, f4);
                path.close();
                return path;
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnuk(Context context) {
        super(context);
        context.getClass();
        this.m = -1;
        this.n = new dnui(b(), this);
        this.h = fctd.a(new fdae() { // from class: dnue
            @Override // defpackage.fdae
            public final Object invoke() {
                Paint paint = new Paint();
                Context context2 = this.a.getContext();
                context2.getClass();
                TypedValue typedValue = new TypedValue();
                context2.getTheme().resolveAttribute(R.attr.colorOnSurfaceVariant, typedValue, true);
                paint.setColor(typedValue.data);
                paint.setAlpha(168);
                return paint;
            }
        });
        this.i = fctd.a(new fdae() { // from class: dnuf
            @Override // defpackage.fdae
            public final Object invoke() {
                return Integer.valueOf(this.a.getContext().getResources().getDimensionPixelSize(R.dimen.emoji_icon_variant_indicator_size));
            }
        });
    }

    public static /* synthetic */ void g(dnuk dnukVar, Canvas canvas, lop lopVar, CharSequence charSequence) {
        float width = dnukVar.getWidth();
        int iFloatValue = (int) ((Number) k.a(Integer.valueOf(dnukVar.getHeight()), Integer.valueOf(dnukVar.getPaddingLeft()), Integer.valueOf(dnukVar.getPaddingRight()))).floatValue();
        lopVar.getClass();
        charSequence.getClass();
        lopVar.draw(canvas, charSequence, 0, charSequence.length(), width / 2.0f, 0, iFloatValue, 0, (Paint) c.a(Integer.valueOf(dnukVar.getHeight()), Integer.valueOf(dnukVar.getPaddingLeft()), Integer.valueOf(dnukVar.getPaddingRight())));
    }

    private final lok h() {
        lok lokVarB = lok.b();
        if (lokVarB == null) {
            return null;
        }
        this.m = lokVarB.a();
        if (lokVarB.a() == 1) {
            return lokVarB;
        }
        return null;
    }

    private final void i(lok lokVar, Object obj) {
        fdlr fdlrVar = this.l;
        if (fdlrVar != null) {
            fdlrVar.t(null);
        }
        fdjx fdjxVar = this.e;
        if (fdjxVar == null) {
            fdbq.c("cpuBoundScope");
            fdjxVar = null;
        }
        this.l = fdil.d(fdjxVar, null, null, new dnuh(this, lokVar, obj, null), 3);
    }

    public abstract CharSequence a(Object obj);

    public abstract Object b();

    public final Object c() {
        return this.n.c(a[0]);
    }

    public abstract void d(Canvas canvas, lop[] lopVarArr);

    public final void e(Object obj) {
        setContentDescription(a(obj));
        CharSequence contentDescription = getContentDescription();
        contentDescription.getClass();
        if (fdgn.H(contentDescription)) {
            fdlr fdlrVar = this.l;
            if (fdlrVar != null) {
                fdlrVar.t(null);
            }
            this.f = null;
            this.g = null;
            return;
        }
        lok lokVarH = h();
        if (lokVarH != null) {
            i(lokVarH, obj);
        } else {
            ((ekrd) j.j().h("com/google/android/libraries/compose/emoji/ui/views/EmojiView", "onContentChanged", 83, "EmojiView.kt")).r("EmojiCompat was not initialized (status %d)", this.m);
        }
    }

    public final void f(Object obj) {
        this.n.d(a[0], obj);
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fdlr fdlrVar = this.l;
        if (fdlrVar != null) {
            fdlrVar.t(null);
        }
        this.l = null;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        lok lokVarH;
        canvas.getClass();
        lop[] lopVarArr = this.g;
        if (lopVarArr != null) {
            d(canvas, lopVarArr);
            return;
        }
        CharSequence charSequence = this.f;
        if (charSequence != null) {
            canvas.drawText(charSequence, 0, charSequence.length(), getWidth() / 2.0f, ((Number) k.a(Integer.valueOf(getHeight()), Integer.valueOf(getPaddingLeft()), Integer.valueOf(getPaddingRight()))).floatValue(), (Paint) c.a(Integer.valueOf(getHeight()), Integer.valueOf(getPaddingLeft()), Integer.valueOf(getPaddingRight())));
        } else {
            fdlr fdlrVar = this.l;
            if ((fdlrVar == null || !fdlrVar.v()) && (lokVarH = h()) != null) {
                i(lokVarH, c());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnuk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.m = -1;
        this.n = new dnuj(b(), this);
        this.h = fctd.a(new fdae() { // from class: dnue
            @Override // defpackage.fdae
            public final Object invoke() {
                Paint paint = new Paint();
                Context context2 = this.a.getContext();
                context2.getClass();
                TypedValue typedValue = new TypedValue();
                context2.getTheme().resolveAttribute(R.attr.colorOnSurfaceVariant, typedValue, true);
                paint.setColor(typedValue.data);
                paint.setAlpha(168);
                return paint;
            }
        });
        this.i = fctd.a(new fdae() { // from class: dnuf
            @Override // defpackage.fdae
            public final Object invoke() {
                return Integer.valueOf(this.a.getContext().getResources().getDimensionPixelSize(R.dimen.emoji_icon_variant_indicator_size));
            }
        });
    }
}
