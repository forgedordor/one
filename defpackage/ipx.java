package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ipx {
    public final XmlPullParser a;
    private int c = 0;
    public final ipi b = new ipi();

    public ipx(XmlPullParser xmlPullParser) {
        this.a = xmlPullParser;
    }

    public final float a(TypedArray typedArray, String str, int i, float f) {
        float fA = kyz.a(typedArray, this.a, str, i, f);
        e(typedArray.getChangingConfigurations());
        return fA;
    }

    public final int b(TypedArray typedArray, String str, int i, int i2) {
        int iC = kyz.c(typedArray, this.a, str, i, i2);
        e(typedArray.getChangingConfigurations());
        return iC;
    }

    public final TypedArray c(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        TypedArray typedArrayE = kyz.e(resources, theme, attributeSet, iArr);
        e(typedArrayE.getChangingConfigurations());
        return typedArrayE;
    }

    public final String d(TypedArray typedArray, int i) {
        String string = typedArray.getString(i);
        e(typedArray.getChangingConfigurations());
        return string;
    }

    public final void e(int i) {
        this.c = i | this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ipx)) {
            return false;
        }
        ipx ipxVar = (ipx) obj;
        return fdbq.f(this.a, ipxVar.a) && this.c == ipxVar.c;
    }

    public final float f(TypedArray typedArray, int i) {
        float dimension = typedArray.getDimension(i, 0.0f);
        e(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float g(TypedArray typedArray, int i) {
        float f = typedArray.getFloat(i, 0.0f);
        e(typedArray.getChangingConfigurations());
        return f;
    }

    public final kyk h(TypedArray typedArray, Resources.Theme theme, String str, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        kyk kykVarO = kyz.o(typedArray, this.a, theme, str, i);
        e(typedArray.getChangingConfigurations());
        return kykVarO;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.c;
    }

    public final String toString() {
        return "AndroidVectorParser(xmlParser=" + this.a + ", config=" + this.c + ')';
    }
}
