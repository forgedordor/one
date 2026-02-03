package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.dcmw;
import defpackage.dcwz;
import defpackage.dcyq;
import defpackage.dcyv;
import defpackage.dczj;
import defpackage.ekhx;
import defpackage.evqs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialDescriptor> CREATOR;
    public final List a;
    private final PublicKeyCredentialType b;
    private final evqs c;

    static {
        ekhx.r(dczj.a, dczj.b);
        CREATOR = new dcyq();
    }

    public PublicKeyCredentialDescriptor(String str, byte[] bArr, List list) {
        evqs evqsVarX = evqs.x(bArr);
        dclh.m(str);
        try {
            this.b = PublicKeyCredentialType.a(str);
            this.c = evqsVarX;
            this.a = list;
        } catch (dcyv e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static PublicKeyCredentialDescriptor a(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
        byte[] bArrDecode = Base64.decode(jSONObject.getString("id"), 11);
        ArrayList arrayList = null;
        if (jSONObject.has("transports")) {
            JSONArray jSONArray = jSONObject.getJSONArray("transports");
            Transport transport = Transport.BLUETOOTH_CLASSIC;
            if (jSONArray != null) {
                HashSet hashSet = new HashSet(jSONArray.length());
                for (int i = 0; i < jSONArray.length(); i++) {
                    String string2 = jSONArray.getString(i);
                    if (string2 != null && !string2.isEmpty()) {
                        try {
                            hashSet.add(Transport.a(string2));
                        } catch (dcwz unused) {
                            Log.w("Transport", "Ignoring unrecognized transport ".concat(string2));
                        }
                    }
                }
                arrayList = new ArrayList(hashSet);
            }
        }
        return new PublicKeyCredentialDescriptor(string, bArrDecode, arrayList);
    }

    public final byte[] b() {
        return this.c.I();
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
        if (!this.b.equals(publicKeyCredentialDescriptor.b) || !dclc.a(this.c, publicKeyCredentialDescriptor.c)) {
            return false;
        }
        List list2 = this.a;
        if (list2 == null && publicKeyCredentialDescriptor.a == null) {
            return true;
        }
        return list2 != null && (list = publicKeyCredentialDescriptor.a) != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.a});
    }

    public final String toString() {
        return "PublicKeyCredentialDescriptor{\n type=" + String.valueOf(this.b) + ", \n id=" + dcmw.c(b()) + ", \n transports=" + String.valueOf(this.a) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b.b;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 2, str, false);
        dclw.f(parcel, 3, b(), false);
        dclw.n(parcel, 4, this.a, false);
        dclw.c(parcel, iA);
    }
}
