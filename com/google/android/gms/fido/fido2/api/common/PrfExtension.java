package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.dcmw;
import defpackage.dcyn;
import defpackage.elcv;
import defpackage.elcx;
import defpackage.elcz;
import defpackage.eomt;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PrfExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PrfExtension> CREATOR = new dcyn();
    private static final byte[] b = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);
    public final byte[][] a;

    public PrfExtension(byte[][] bArr) {
        dclh.a(bArr != null);
        dclh.a(1 == ((bArr.length & 1) ^ 1));
        int i = 0;
        while (i < bArr.length) {
            dclh.a(i == 0 || bArr[i] != null);
            int i2 = i + 1;
            dclh.a(bArr[i2] != null);
            int length = bArr[i2].length;
            dclh.a(length == 32 || length == 64);
            i += 2;
        }
        this.a = bArr;
    }

    public static PrfExtension a(JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z) {
                    arrayList.add(d(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(e(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    arrayList.add(dcmw.d(next));
                    if (z) {
                        arrayList.add(d(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(e(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new PrfExtension((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    private static JSONObject b(byte[] bArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", dcmw.c(bArr));
            return jSONObject;
        }
        jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    private static byte[] c(byte[] bArr) {
        int i = elcz.a;
        elcv elcvVarF = elcx.a.f();
        elcvVarF.j(b);
        elcvVarF.j(bArr);
        return elcvVarF.r().e();
    }

    private static byte[] d(JSONObject jSONObject) throws JSONException {
        byte[] bArrD = dcmw.d(jSONObject.getString("first"));
        if (bArrD.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return bArrD;
        }
        byte[] bArrD2 = dcmw.d(jSONObject.getString("second"));
        if (bArrD2.length == 32) {
            return eomt.b(bArrD, bArrD2);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    private static byte[] e(JSONObject jSONObject) {
        byte[] bArrC = c(dcmw.d(jSONObject.getString("first")));
        return !jSONObject.has("second") ? bArrC : eomt.b(bArrC, c(dcmw.d(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PrfExtension) {
            return Arrays.deepEquals(this.a, ((PrfExtension) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (byte[] bArr : this.a) {
            if (bArr != null) {
                iHashCode ^= Arrays.hashCode(new Object[]{bArr});
            }
        }
        return iHashCode;
    }

    public final String toString() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            int i = 0;
            JSONObject jSONObject2 = null;
            while (true) {
                byte[][] bArr = this.a;
                if (i >= bArr.length) {
                    return a.b(jSONObject, "PrfExtension{", "}");
                }
                if (bArr[i] == null) {
                    jSONObject.put("eval", b(bArr[i + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(dcmw.c(bArr[i]), b(bArr[i + 1]));
                }
                i += 2;
            }
        } catch (JSONException e) {
            return "PrfExtension{Exception:" + e.getMessage() + "}";
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[][] bArr = this.a;
        int iA = dclw.a(parcel);
        dclw.q(parcel, 1, bArr);
        dclw.c(parcel, iA);
    }
}
