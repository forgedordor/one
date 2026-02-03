package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajr extends ajn implements Parcelable {
    public static final Parcelable.Creator<ajr> CREATOR = new ajs();
    public final String a;
    public final byte[] b;

    public ajr(String str, byte[] bArr) {
        lcg.i(str);
        this.a = str;
        lcg.i(bArr);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajr)) {
            return false;
        }
        ajr ajrVar = (ajr) obj;
        return this.a.equals(ajrVar.a) && Arrays.equals(this.b, ajrVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(Arrays.hashCode(this.b)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("packageName", this.a);
        bundle.putByteArray("sha256Certificate", this.b);
        parcel.writeBundle(bundle);
    }
}
