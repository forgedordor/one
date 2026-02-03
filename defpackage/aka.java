package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aka extends ajn implements Parcelable {
    public static final Parcelable.Creator<aka> CREATOR = new akb();
    public final String a;
    public final String[] b;
    public final long[] c;
    public final double[] d;
    public final boolean[] e;
    public final byte[][] f;
    public final ajp[] g;
    public final aft[] h;
    private final aeu[] i = null;
    private Integer j;

    public aka(String str, String[] strArr, long[] jArr, double[] dArr, boolean[] zArr, byte[][] bArr, ajp[] ajpVarArr, aft[] aftVarArr) {
        this.a = str;
        this.b = strArr;
        this.c = jArr;
        this.d = dArr;
        this.e = zArr;
        this.f = bArr;
        this.g = ajpVarArr;
        this.h = aftVarArr;
        int i = strArr != null ? 1 : 0;
        i = jArr != null ? i + 1 : i;
        i = dArr != null ? i + 1 : i;
        i = zArr != null ? i + 1 : i;
        i = bArr != null ? i + 1 : i;
        i = ajpVarArr != null ? i + 1 : i;
        i = aftVarArr != null ? i + 1 : i;
        if (i == 0 || i > 1) {
            throw new IllegalArgumentException("One and only one type array can be set in PropertyParcel");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aka)) {
            return false;
        }
        aka akaVar = (aka) obj;
        if (this.a.equals(akaVar.a) && Arrays.equals(this.b, akaVar.b) && Arrays.equals(this.c, akaVar.c) && Arrays.equals(this.d, akaVar.d) && Arrays.equals(this.e, akaVar.e) && Arrays.deepEquals(this.f, akaVar.f) && Arrays.equals(this.g, akaVar.g) && Arrays.deepEquals(this.h, akaVar.h)) {
            aeu[] aeuVarArr = akaVar.i;
            if (Arrays.deepEquals(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iDeepHashCode;
        if (this.j == null) {
            String[] strArr = this.b;
            if (strArr != null) {
                iDeepHashCode = Arrays.hashCode(strArr);
            } else {
                long[] jArr = this.c;
                if (jArr != null) {
                    iDeepHashCode = Arrays.hashCode(jArr);
                } else {
                    double[] dArr = this.d;
                    if (dArr != null) {
                        iDeepHashCode = Arrays.hashCode(dArr);
                    } else {
                        boolean[] zArr = this.e;
                        if (zArr != null) {
                            iDeepHashCode = Arrays.hashCode(zArr);
                        } else {
                            byte[][] bArr = this.f;
                            if (bArr != null) {
                                iDeepHashCode = Arrays.deepHashCode(bArr);
                            } else {
                                ajp[] ajpVarArr = this.g;
                                if (ajpVarArr != null) {
                                    iDeepHashCode = Arrays.hashCode(ajpVarArr);
                                } else {
                                    aft[] aftVarArr = this.h;
                                    iDeepHashCode = aftVarArr != null ? Arrays.deepHashCode(aftVarArr) : 0;
                                }
                            }
                        }
                    }
                }
            }
            this.j = Integer.valueOf(Objects.hash(this.a, Integer.valueOf(iDeepHashCode)));
        }
        return this.j.intValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("propertyName", this.a);
        String[] strArr = this.b;
        if (strArr != null) {
            bundle.putStringArray("stringArray", strArr);
        } else {
            long[] jArr = this.c;
            if (jArr != null) {
                bundle.putLongArray("longArray", jArr);
            } else {
                double[] dArr = this.d;
                if (dArr != null) {
                    bundle.putDoubleArray("doubleArray", dArr);
                } else {
                    boolean[] zArr = this.e;
                    if (zArr != null) {
                        bundle.putBooleanArray("booleanArray", zArr);
                    } else {
                        byte[][] bArr = this.f;
                        int i2 = 0;
                        if (bArr != null) {
                            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(bArr.length);
                            while (i2 < bArr.length) {
                                Bundle bundle2 = new Bundle();
                                bundle2.putByteArray("byteArray", bArr[i2]);
                                arrayList.add(bundle2);
                                i2++;
                            }
                            bundle.putParcelableArrayList("bytesArray", arrayList);
                        } else {
                            ajp[] ajpVarArr = this.g;
                            if (ajpVarArr != null) {
                                bundle.putParcelableArray("docArray", ajpVarArr);
                            } else {
                                aft[] aftVarArr = this.h;
                                if (aftVarArr != null) {
                                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(aftVarArr.length);
                                    while (i2 < aftVarArr.length) {
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putFloatArray("embeddingValue", aftVarArr[i2].a);
                                        bundle3.putString("embeddingModelSignature", aftVarArr[i2].b);
                                        arrayList2.add(bundle3);
                                        i2++;
                                    }
                                    bundle.putParcelableArrayList("embeddingArray", arrayList2);
                                }
                            }
                        }
                    }
                }
            }
        }
        parcel.writeBundle(bundle);
    }
}
