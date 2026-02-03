package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class odx {
    public final int a;
    public final String b;
    public final String c;
    public final int d;

    public odx(int i, String str, String str2, int i2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odx)) {
            return false;
        }
        odx odxVar = (odx) obj;
        return this.a == odxVar.a && Objects.equals(this.b, odxVar.b) && Objects.equals(this.c, odxVar.c) && this.d == odxVar.d;
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i = this.a;
        String str2 = this.c;
        return (((((i * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.d;
    }

    public final String toString() {
        return "TransformationRequest{outputHeight=" + this.a + ", audioMimeType='" + this.b + "', videoMimeType='" + this.c + "', hdrMode=" + this.d + "}";
    }
}
