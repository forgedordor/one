package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kkv {
    public static final kku a = new kku();

    public static final float a(int i) {
        return -i;
    }

    public static final float b(float f) {
        return -f;
    }

    public static final int c(int i) {
        return 1 != i ? 1 : 2;
    }

    public static final void d(View view, jcr jcrVar) {
        long jA = ivz.a(jcrVar.w());
        int iRound = Math.round(Float.intBitsToFloat((int) (jA >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jA & 4294967295L)));
        view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
    }
}
