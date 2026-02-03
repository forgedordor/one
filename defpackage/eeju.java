package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeju extends Property {
    final /* synthetic */ eejv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eeju(eejv eejvVar, Class cls) {
        super(cls, "LABEL_OPACITY_PROPERTY");
        this.a = eejvVar;
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
        int iAlpha = Color.alpha(extendedFloatingActionButton.t.getColorForState(extendedFloatingActionButton.getDrawableState(), this.a.a.t.getDefaultColor()));
        float fAlpha = Color.alpha(extendedFloatingActionButton.getCurrentTextColor());
        TimeInterpolator timeInterpolator = eecd.a;
        return Float.valueOf(((fAlpha / 255.0f) / iAlpha) + 0.0f);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
        Float f = (Float) obj2;
        int colorForState = extendedFloatingActionButton.t.getColorForState(extendedFloatingActionButton.getDrawableState(), this.a.a.t.getDefaultColor());
        float fAlpha = Color.alpha(colorForState);
        float fFloatValue = f.floatValue();
        TimeInterpolator timeInterpolator = eecd.a;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.argb((int) (((fFloatValue * ((fAlpha / 255.0f) + 0.0f)) + 0.0f) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
        if (f.floatValue() == 1.0f) {
            extendedFloatingActionButton.t(extendedFloatingActionButton.t);
        } else {
            extendedFloatingActionButton.t(colorStateListValueOf);
        }
    }
}
