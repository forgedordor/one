package com.google.android.libraries.compose.emoji.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import defpackage.dnjr;
import defpackage.dnkf;
import defpackage.dnuk;
import defpackage.dnul;
import defpackage.fcur;
import defpackage.lop;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class SingleEmojiView extends dnul<dnkf> {
    private static final dnjr j = new dnjr("");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleEmojiView(Context context) {
        super(context);
        context.getClass();
    }

    @Override // defpackage.dnuk
    public final /* bridge */ /* synthetic */ CharSequence a(Object obj) {
        ((dnkf) obj).getClass();
        return ((dnkf) c()).a();
    }

    @Override // defpackage.dnuk
    public final /* synthetic */ Object b() {
        return j;
    }

    @Override // defpackage.dnuk
    public final void d(Canvas canvas, lop[] lopVarArr) {
        dnuk.g(this, canvas, (lop) fcur.H(lopVarArr), ((dnkf) c()).a());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleEmojiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
