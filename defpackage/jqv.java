package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqv {
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.jqn a(android.content.res.Resources.Theme r39, android.content.res.Resources r40, android.content.res.XmlResourceParser r41, int r42) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jqv.a(android.content.res.Resources$Theme, android.content.res.Resources, android.content.res.XmlResourceParser, int):jqn");
    }

    public static final ioi b(int i, hml hmlVar) {
        Context context = (Context) hmlVar.e(AndroidCompositionLocals_androidKt.b);
        Resources resources = (Resources) hmlVar.e(AndroidCompositionLocals_androidKt.c);
        Resources.Theme theme = context.getTheme();
        Object configuration = resources.getConfiguration();
        boolean zD = hmlVar.D(configuration) | hmlVar.B(i) | hmlVar.D(resources) | hmlVar.D(theme);
        Object objF = hmlVar.f();
        if (zD || objF == hmk.a) {
            TypedValue typedValue = new TypedValue();
            resources.getValue(i, typedValue, true);
            XmlResourceParser xml = resources.getXml(i);
            ipz.b(xml);
            objF = a(theme, resources, xml, typedValue.changingConfigurations).a;
            hmlVar.y(objF);
        }
        return (ioi) objF;
    }
}
