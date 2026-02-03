package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.server.response.FastJsonResponse;
import defpackage.a;
import defpackage.dclh;
import defpackage.dclu;
import defpackage.dclv;
import defpackage.dclw;
import defpackage.dcms;
import defpackage.dcmv;
import defpackage.dcmw;
import defpackage.dcng;
import defpackage.dcnh;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new dcms();
    public final int a;
    public final FieldMappingDictionary b;
    private final Parcel c;
    private final String d;
    private int e;
    private int f;

    public SafeParcelResponse(int i, Parcel parcel, FieldMappingDictionary fieldMappingDictionary) {
        this.a = i;
        dclh.m(parcel);
        this.c = parcel;
        this.b = fieldMappingDictionary;
        this.d = fieldMappingDictionary == null ? null : fieldMappingDictionary.b;
        this.e = 2;
    }

    private final void h(StringBuilder sb, Map map, Parcel parcel) {
        BigInteger[] bigIntegerArr;
        BigDecimal[] bigDecimalArr;
        boolean[] zArrCreateBooleanArray;
        Parcel[] parcelArr;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) entry.getValue()).g, entry);
        }
        sb.append('{');
        int iH = dclv.h(parcel);
        boolean z = false;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get(dclv.d(i));
            if (entry2 != null) {
                if (z) {
                    sb.append(",");
                }
                String str = (String) entry2.getKey();
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry2.getValue();
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (field.k != null) {
                    int i2 = field.d;
                    switch (i2) {
                        case 0:
                            j(sb, field, e(field, Integer.valueOf(dclv.f(parcel, i))));
                            break;
                        case 1:
                            j(sb, field, e(field, dclv.v(parcel, i)));
                            break;
                        case 2:
                            j(sb, field, e(field, Long.valueOf(dclv.i(parcel, i))));
                            break;
                        case 3:
                            j(sb, field, e(field, Float.valueOf(dclv.c(parcel, i))));
                            break;
                        case 4:
                            j(sb, field, e(field, Double.valueOf(dclv.b(parcel, i))));
                            break;
                        case 5:
                            j(sb, field, e(field, dclv.u(parcel, i)));
                            break;
                        case 6:
                            j(sb, field, e(field, Boolean.valueOf(dclv.D(parcel, i))));
                            break;
                        case 7:
                            j(sb, field, e(field, dclv.t(parcel, i)));
                            break;
                        case 8:
                        case 9:
                            j(sb, field, e(field, dclv.E(parcel, i)));
                            break;
                        case 10:
                            Bundle bundleK = dclv.k(parcel, i);
                            HashMap map2 = new HashMap();
                            for (String str2 : bundleK.keySet()) {
                                String string = bundleK.getString(str2);
                                dclh.m(string);
                                map2.put(str2, string);
                            }
                            j(sb, field, e(field, map2));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException(a.g(i2, "Unknown field out type = "));
                    }
                } else if (field.e) {
                    sb.append("[");
                    switch (field.d) {
                        case 0:
                            int[] iArrH = dclv.H(parcel, i);
                            int length = iArrH.length;
                            for (int i3 = 0; i3 < length; i3++) {
                                if (i3 != 0) {
                                    sb.append(",");
                                }
                                sb.append(iArrH[i3]);
                            }
                            break;
                        case 1:
                            int iG = dclv.g(parcel, i);
                            int iDataPosition = parcel.dataPosition();
                            if (iG == 0) {
                                bigIntegerArr = null;
                            } else {
                                int i4 = parcel.readInt();
                                bigIntegerArr = new BigInteger[i4];
                                for (int i5 = 0; i5 < i4; i5++) {
                                    bigIntegerArr[i5] = new BigInteger(parcel.createByteArray());
                                }
                                parcel.setDataPosition(iDataPosition + iG);
                            }
                            dcmv.a(sb, bigIntegerArr);
                            break;
                        case 2:
                            long[] jArrI = dclv.I(parcel, i);
                            int length2 = jArrI.length;
                            for (int i6 = 0; i6 < length2; i6++) {
                                if (i6 != 0) {
                                    sb.append(",");
                                }
                                sb.append(jArrI[i6]);
                            }
                            break;
                        case 3:
                            float[] fArrG = dclv.G(parcel, i);
                            int length3 = fArrG.length;
                            for (int i7 = 0; i7 < length3; i7++) {
                                if (i7 != 0) {
                                    sb.append(",");
                                }
                                sb.append(fArrG[i7]);
                            }
                            break;
                        case 4:
                            double[] dArrF = dclv.F(parcel, i);
                            int length4 = dArrF.length;
                            for (int i8 = 0; i8 < length4; i8++) {
                                if (i8 != 0) {
                                    sb.append(",");
                                }
                                sb.append(dArrF[i8]);
                            }
                            break;
                        case 5:
                            int iG2 = dclv.g(parcel, i);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iG2 == 0) {
                                bigDecimalArr = null;
                            } else {
                                int i9 = parcel.readInt();
                                bigDecimalArr = new BigDecimal[i9];
                                for (int i10 = 0; i10 < i9; i10++) {
                                    bigDecimalArr[i10] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
                                }
                                parcel.setDataPosition(iDataPosition2 + iG2);
                            }
                            dcmv.a(sb, bigDecimalArr);
                            break;
                        case 6:
                            int iG3 = dclv.g(parcel, i);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iG3 == 0) {
                                zArrCreateBooleanArray = null;
                            } else {
                                zArrCreateBooleanArray = parcel.createBooleanArray();
                                parcel.setDataPosition(iDataPosition3 + iG3);
                            }
                            int length5 = zArrCreateBooleanArray.length;
                            for (int i11 = 0; i11 < length5; i11++) {
                                if (i11 != 0) {
                                    sb.append(",");
                                }
                                sb.append(zArrCreateBooleanArray[i11]);
                            }
                            break;
                        case 7:
                            String[] strArrK = dclv.K(parcel, i);
                            int length6 = strArrK.length;
                            for (int i12 = 0; i12 < length6; i12++) {
                                if (i12 != 0) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(strArrK[i12]);
                                sb.append("\"");
                            }
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            int iG4 = dclv.g(parcel, i);
                            int iDataPosition4 = parcel.dataPosition();
                            if (iG4 == 0) {
                                parcelArr = null;
                            } else {
                                int i13 = parcel.readInt();
                                Parcel[] parcelArr2 = new Parcel[i13];
                                for (int i14 = 0; i14 < i13; i14++) {
                                    int i15 = parcel.readInt();
                                    if (i15 != 0) {
                                        int iDataPosition5 = parcel.dataPosition();
                                        Parcel parcelObtain = Parcel.obtain();
                                        parcelObtain.appendFrom(parcel, iDataPosition5, i15);
                                        parcelArr2[i14] = parcelObtain;
                                        parcel.setDataPosition(iDataPosition5 + i15);
                                    } else {
                                        parcelArr2[i14] = null;
                                    }
                                }
                                parcel.setDataPosition(iDataPosition4 + iG4);
                                parcelArr = parcelArr2;
                            }
                            int length7 = parcelArr.length;
                            for (int i16 = 0; i16 < length7; i16++) {
                                if (i16 > 0) {
                                    sb.append(",");
                                }
                                parcelArr[i16].setDataPosition(0);
                                h(sb, field.b(), parcelArr[i16]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (field.d) {
                        case 0:
                            sb.append(dclv.f(parcel, i));
                            break;
                        case 1:
                            sb.append(dclv.v(parcel, i));
                            break;
                        case 2:
                            sb.append(dclv.i(parcel, i));
                            break;
                        case 3:
                            sb.append(dclv.c(parcel, i));
                            break;
                        case 4:
                            sb.append(dclv.b(parcel, i));
                            break;
                        case 5:
                            sb.append(dclv.u(parcel, i));
                            break;
                        case 6:
                            sb.append(dclv.D(parcel, i));
                            break;
                        case 7:
                            String strT = dclv.t(parcel, i);
                            sb.append("\"");
                            sb.append(dcng.a(strT));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] bArrE = dclv.E(parcel, i);
                            sb.append("\"");
                            sb.append(dcmw.a(bArrE));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] bArrE2 = dclv.E(parcel, i);
                            sb.append("\"");
                            sb.append(dcmw.b(bArrE2));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle bundleK2 = dclv.k(parcel, i);
                            Set<String> setKeySet = bundleK2.keySet();
                            sb.append("{");
                            boolean z2 = true;
                            for (String str3 : setKeySet) {
                                if (!z2) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(str3);
                                sb.append("\":\"");
                                sb.append(dcng.a(bundleK2.getString(str3)));
                                sb.append("\"");
                                z2 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel parcelM = dclv.m(parcel, i);
                            parcelM.setDataPosition(0);
                            h(sb, field.b(), parcelM);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() != iH) {
            throw new dclu(a.g(iH, "Overread allowed size end="), parcel);
        }
        sb.append('}');
    }

    private static final void i(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                dclh.m(obj);
                sb.append(dcng.a(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(dcmw.a((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(dcmw.b((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                dclh.m(obj);
                dcnh.a(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException(a.g(i, "Unknown type = "));
        }
    }

    private static final void j(StringBuilder sb, FastJsonResponse.Field field, Object obj) {
        if (!field.c) {
            i(sb, field.b, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                sb.append(",");
            }
            i(sb, field.b, arrayList.get(i));
        }
        sb.append("]");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map b() {
        FieldMappingDictionary fieldMappingDictionary = this.b;
        if (fieldMappingDictionary == null) {
            return null;
        }
        String str = this.d;
        dclh.m(str);
        return fieldMappingDictionary.a(str);
    }

    public final Parcel d() {
        int i = this.e;
        if (i == 0) {
            Parcel parcel = this.c;
            int iA = dclw.a(parcel);
            this.f = iA;
            dclw.c(parcel, iA);
            this.e = 2;
        } else if (i == 1) {
            dclw.c(this.c, this.f);
            this.e = 2;
        }
        return this.c;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final void f() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final void g() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final String toString() {
        FieldMappingDictionary fieldMappingDictionary = this.b;
        dclh.n(fieldMappingDictionary, "Cannot convert to JSON on client side.");
        Parcel parcelD = d();
        parcelD.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        String str = this.d;
        dclh.m(str);
        Map mapA = fieldMappingDictionary.a(str);
        dclh.m(mapA);
        h(sb, mapA, parcelD);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, i2);
        Parcel parcelD = d();
        int iB = dclw.b(parcel, 2);
        parcel.appendFrom(parcelD, 0, parcelD.dataSize());
        dclw.c(parcel, iB);
        dclw.k(parcel, 3, this.b, i, false);
        dclw.c(parcel, iA);
    }
}
