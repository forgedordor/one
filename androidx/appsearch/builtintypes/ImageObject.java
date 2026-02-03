package androidx.appsearch.builtintypes;

import defpackage.lcg;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ImageObject extends Thing {
    public final List a;
    public final String b;
    public final String c;
    public final byte[] d;

    public ImageObject(String str, String str2, int i, long j, long j2, String str3, List list, String str4, String str5, String str6, List list2, List list3, String str7, String str8, byte[] bArr) {
        super(str, str2, i, j, j2, str3, list, str4, str5, str6, list2);
        lcg.i(list3);
        this.a = list3;
        this.b = str7;
        this.c = str8;
        this.d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ImageObject imageObject = (ImageObject) obj;
            if (this.a.equals(imageObject.a) && Objects.equals(this.b, imageObject.b) && Objects.equals(this.c, imageObject.c) && Arrays.equals(this.d, imageObject.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Integer.valueOf(Arrays.hashCode(this.d)));
    }
}
