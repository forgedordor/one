package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euhf extends eulh {
    private final Locale a;
    private final float b;

    public euhf(Locale locale, float f) {
        this.a = locale;
        this.b = f;
    }

    @Override // defpackage.eulh
    public final float a() {
        return this.b;
    }

    @Override // defpackage.eulh
    public final Locale b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eulh) {
            eulh eulhVar = (eulh) obj;
            if (this.a.equals(eulhVar.b()) && Float.floatToIntBits(this.b) == Float.floatToIntBits(eulhVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "LocaleConfidence{locale=" + this.a.toString() + ", confidence=" + this.b + "}";
    }
}
