package defpackage;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iib {
    public static final BlendMode a(int i) {
        return iis.b(i, 0) ? BlendMode.CLEAR : iis.b(i, 1) ? BlendMode.SRC : iis.b(i, 2) ? BlendMode.DST : iis.b(i, 3) ? BlendMode.SRC_OVER : iis.b(i, 4) ? BlendMode.DST_OVER : iis.b(i, 5) ? BlendMode.SRC_IN : iis.b(i, 6) ? BlendMode.DST_IN : iis.b(i, 7) ? BlendMode.SRC_OUT : iis.b(i, 8) ? BlendMode.DST_OUT : iis.b(i, 9) ? BlendMode.SRC_ATOP : iis.b(i, 10) ? BlendMode.DST_ATOP : iis.b(i, 11) ? BlendMode.XOR : iis.b(i, 12) ? BlendMode.PLUS : iis.b(i, 13) ? BlendMode.MODULATE : iis.b(i, 14) ? BlendMode.SCREEN : iis.b(i, 15) ? BlendMode.OVERLAY : iis.b(i, 16) ? BlendMode.DARKEN : iis.b(i, 17) ? BlendMode.LIGHTEN : iis.b(i, 18) ? BlendMode.COLOR_DODGE : iis.b(i, 19) ? BlendMode.COLOR_BURN : iis.b(i, 20) ? BlendMode.HARD_LIGHT : iis.b(i, 21) ? BlendMode.SOFT_LIGHT : iis.b(i, 22) ? BlendMode.DIFFERENCE : iis.b(i, 23) ? BlendMode.EXCLUSION : iis.b(i, 24) ? BlendMode.MULTIPLY : iis.b(i, 25) ? BlendMode.HUE : iis.b(i, 26) ? BlendMode.SATURATION : iis.b(i, 27) ? BlendMode.COLOR : iis.b(i, 28) ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final PorterDuff.Mode b(int i) {
        return iis.b(i, 0) ? PorterDuff.Mode.CLEAR : iis.b(i, 1) ? PorterDuff.Mode.SRC : iis.b(i, 2) ? PorterDuff.Mode.DST : iis.b(i, 3) ? PorterDuff.Mode.SRC_OVER : iis.b(i, 4) ? PorterDuff.Mode.DST_OVER : iis.b(i, 5) ? PorterDuff.Mode.SRC_IN : iis.b(i, 6) ? PorterDuff.Mode.DST_IN : iis.b(i, 7) ? PorterDuff.Mode.SRC_OUT : iis.b(i, 8) ? PorterDuff.Mode.DST_OUT : iis.b(i, 9) ? PorterDuff.Mode.SRC_ATOP : iis.b(i, 10) ? PorterDuff.Mode.DST_ATOP : iis.b(i, 11) ? PorterDuff.Mode.XOR : iis.b(i, 12) ? PorterDuff.Mode.ADD : iis.b(i, 14) ? PorterDuff.Mode.SCREEN : iis.b(i, 15) ? PorterDuff.Mode.OVERLAY : iis.b(i, 16) ? PorterDuff.Mode.DARKEN : iis.b(i, 17) ? PorterDuff.Mode.LIGHTEN : iis.b(i, 13) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
