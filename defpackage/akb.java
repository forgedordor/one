package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        byte[] byteArray;
        Bundle bundle = parcel.readBundle(getClass().getClassLoader());
        bundle.getClass();
        String string = bundle.getString("propertyName");
        string.getClass();
        ajz ajzVar = new ajz(string);
        String[] stringArray = bundle.getStringArray("stringArray");
        long[] longArray = bundle.getLongArray("longArray");
        double[] doubleArray = bundle.getDoubleArray("doubleArray");
        boolean[] booleanArray = bundle.getBooleanArray("booleanArray");
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("bytesArray");
        Parcelable[] parcelableArray = bundle.getParcelableArray("docArray");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("embeddingArray");
        if (stringArray != null) {
            ajzVar.f(stringArray);
        } else if (longArray != null) {
            ajzVar.e(longArray);
        } else if (doubleArray != null) {
            ajzVar.d(doubleArray);
        } else if (booleanArray != null) {
            ajzVar.b(booleanArray);
        } else {
            int i = 0;
            if (parcelableArrayList != null) {
                byte[][] bArr = new byte[parcelableArrayList.size()][];
                while (i < parcelableArrayList.size()) {
                    Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                    if (bundle2 != null && (byteArray = bundle2.getByteArray("byteArray")) != null) {
                        bArr[i] = byteArray;
                    }
                    i++;
                }
                ajzVar.c(bArr);
            } else if (parcelableArray != null) {
                int length = parcelableArray.length;
                ajp[] ajpVarArr = new ajp[length];
                System.arraycopy(parcelableArray, 0, ajpVarArr, 0, length);
                ajzVar.a = ajpVarArr;
            } else {
                if (parcelableArrayList2 == null) {
                    throw new IllegalArgumentException("property bundle passed in doesn't have any value set.");
                }
                aft[] aftVarArr = new aft[parcelableArrayList2.size()];
                while (i < parcelableArrayList2.size()) {
                    Bundle bundle3 = (Bundle) parcelableArrayList2.get(i);
                    if (bundle3 != null) {
                        float[] floatArray = bundle3.getFloatArray("embeddingValue");
                        String string2 = bundle3.getString("embeddingModelSignature");
                        if (floatArray != null && string2 != null) {
                            aftVarArr[i] = new aft(floatArray, string2);
                        }
                    }
                    i++;
                }
                ajzVar.b = aftVarArr;
            }
        }
        return ajzVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new aka[i];
    }
}
