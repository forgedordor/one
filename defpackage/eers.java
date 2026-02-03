package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eers implements eeru {
    private final eeru a;
    private final float b;

    public eers(float f, eeru eeruVar) {
        while (eeruVar instanceof eers) {
            eeruVar = ((eers) eeruVar).a;
            f += ((eers) eeruVar).b;
        }
        this.a = eeruVar;
        this.b = f;
    }

    @Override // defpackage.eeru
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eers)) {
            return false;
        }
        eers eersVar = (eers) obj;
        return this.a.equals(eersVar.a) && this.b == eersVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
