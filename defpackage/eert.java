package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eert implements eeru {
    private final float a;

    public eert(float f) {
        this.a = f;
    }

    @Override // defpackage.eeru
    public final float a(RectF rectF) {
        return kzz.a(this.a, 0.0f, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eert) && this.a == ((eert) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
