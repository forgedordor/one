package defpackage;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvbo {
    public final String a;
    public final G3AttributionInfo b;

    public dvbo(String str, G3AttributionInfo g3AttributionInfo) {
        this.a = str;
        this.b = g3AttributionInfo;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dvbo) {
            dvbo dvboVar = (dvbo) obj;
            if (Objects.equals(this.a, dvboVar.a) && Objects.equals(this.b, dvboVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return "{schemaType: " + this.a + ", attributionInfo: " + this.b.toString() + "}";
    }
}
