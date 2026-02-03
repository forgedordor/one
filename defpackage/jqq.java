package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqq {
    public static final inz a(int i, hml hmlVar, int i2) {
        TypedValue typedValue;
        boolean z;
        Context context = (Context) hmlVar.e(AndroidCompositionLocals_androidKt.b);
        Resources resources = (Resources) hmlVar.e(AndroidCompositionLocals_androidKt.c);
        jqs jqsVar = (jqs) hmlVar.e(AndroidCompositionLocals_androidKt.e);
        synchronized (jqsVar) {
            cuh cuhVar = jqsVar.a;
            typedValue = (TypedValue) cuhVar.a(i);
            z = true;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                int iC = cuhVar.c(i);
                Object[] objArr = cuhVar.c;
                Object obj = objArr[iC];
                cuhVar.b[iC] = i;
                objArr[iC] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && fdgn.L(charSequence, ".xml")) {
            hmlVar.v(-1771786530);
            Resources.Theme theme = context.getTheme();
            int i3 = typedValue.changingConfigurations;
            jqp jqpVar = (jqp) hmlVar.e(AndroidCompositionLocals_androidKt.d);
            jqo jqoVar = new jqo(theme, i);
            HashMap map = jqpVar.a;
            WeakReference weakReference = (WeakReference) map.get(jqoVar);
            jqn jqnVarA = weakReference != null ? (jqn) weakReference.get() : null;
            if (jqnVarA == null) {
                XmlResourceParser xml = resources.getXml(i);
                ipz.b(xml);
                if (!fdbq.f(xml.getName(), "vector")) {
                    throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                }
                jqnVarA = jqv.a(theme, resources, xml, i3);
                map.put(jqoVar, new WeakReference(jqnVarA));
            }
            ipu ipuVarB = ipv.b(jqnVarA.a, hmlVar);
            hmlVar.o();
            return ipuVarB;
        }
        hmlVar.v(-1771631096);
        Object theme2 = context.getTheme();
        boolean zD = hmlVar.D(charSequence);
        if ((((i2 & 14) ^ 6) <= 4 || !hmlVar.B(i)) && (i2 & 6) != 4) {
            z = false;
        }
        boolean zD2 = zD | z | hmlVar.D(theme2);
        Object objF = hmlVar.f();
        if (zD2 || objF == hmk.a) {
            try {
                objF = jqm.a(resources, i);
                hmlVar.y(objF);
            } catch (Exception e) {
                Objects.toString(charSequence);
                throw new jqt("Error attempting to load resource: ".concat(String.valueOf(charSequence)), e);
            }
        }
        inx inxVar = new inx((ijp) objF);
        hmlVar.o();
        return inxVar;
    }
}
