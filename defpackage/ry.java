package defpackage;

import android.graphics.Typeface;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ry {
    private final Typeface a;
    private final String b;
    private final int c;

    public ry(Typeface typeface, String str, int i) {
        this.a = typeface;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ry)) {
            return false;
        }
        ry ryVar = (ry) obj;
        return this.c == ryVar.c && Objects.equals(this.a, ryVar.a) && Objects.equals(this.b, ryVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c));
    }
}
