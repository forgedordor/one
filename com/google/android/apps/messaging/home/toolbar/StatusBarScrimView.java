package com.google.android.apps.messaging.home.toolbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.messaging.home.toolbar.StatusBarScrimView;
import defpackage.addr;
import defpackage.fdbv;
import defpackage.fdcj;
import defpackage.fdcz;
import defpackage.fdeh;
import defpackage.ldn;
import defpackage.len;
import defpackage.ley;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class StatusBarScrimView extends View {
    public static final /* synthetic */ fdeh[] a;
    public final fdcz b;

    static {
        fdbv fdbvVar = new fdbv(StatusBarScrimView.class, "topInset", "getTopInset()I", 0);
        int i = fdcj.a;
        a = new fdeh[]{fdbvVar};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusBarScrimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.b = new addr(0, this);
        ldn ldnVar = new ldn() { // from class: addq
            @Override // defpackage.ldn
            public final lgt ez(View view, lgt lgtVar) {
                int i = lgtVar.f(519).c;
                this.a.b.d(StatusBarScrimView.a[0], Integer.valueOf(i));
                return lgtVar;
            }
        };
        int[] iArr = ley.a;
        len.k(this, ldnVar);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(((Number) this.b.c(a[0])).intValue(), 1073741824));
    }
}
