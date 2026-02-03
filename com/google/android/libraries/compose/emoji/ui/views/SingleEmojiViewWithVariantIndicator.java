package com.google.android.libraries.compose.emoji.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import defpackage.dnjr;
import defpackage.dnmh;
import defpackage.dnug;
import defpackage.dnuk;
import defpackage.dnum;
import defpackage.fcur;
import defpackage.lop;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class SingleEmojiViewWithVariantIndicator extends dnum<dnug> {
    public static final dnug j;

    static {
        dnjr dnjrVar = new dnjr("");
        j = new dnug(dnjrVar, new dnmh(dnjrVar));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleEmojiViewWithVariantIndicator(Context context) {
        super(context);
        context.getClass();
    }

    @Override // defpackage.dnuk
    public final /* bridge */ /* synthetic */ CharSequence a(Object obj) {
        ((dnug) obj).getClass();
        return ((dnug) c()).a.a();
    }

    @Override // defpackage.dnuk
    public final /* synthetic */ Object b() {
        return j;
    }

    @Override // defpackage.dnuk
    public final void d(Canvas canvas, lop[] lopVarArr) {
        dnuk.g(this, canvas, (lop) fcur.H(lopVarArr), ((dnug) c()).a.a());
        if (((dnug) c()).b.i().isEmpty()) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        canvas.drawPath((Path) dnuk.d.a(Integer.valueOf(((Number) this.i.a()).intValue()), Integer.valueOf(width), Integer.valueOf(height)), (Paint) this.h.a());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleEmojiViewWithVariantIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
