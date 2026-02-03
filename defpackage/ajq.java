package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Bundle bundle = parcel.readBundle(getClass().getClassLoader());
        String string = bundle.getString("namespace");
        String string2 = bundle.getString("id");
        String string3 = bundle.getString("schemaType");
        if (string == null || string2 == null || string3 == null) {
            throw new IllegalArgumentException("GenericDocumentParcel bundle doesn't have namespace, id, or schemaType.");
        }
        ajo ajoVar = new ajo(string, string2, string3);
        ArrayList<String> stringArrayList = bundle.getStringArrayList("parentTypes");
        if (stringArrayList != null) {
            ajoVar.c(stringArrayList);
        }
        ajoVar.b = bundle.getInt("score");
        ajoVar.a = bundle.getLong("creationTimestampMillis");
        ajoVar.d(bundle.getLong("ttlMillis"));
        Bundle bundle2 = bundle.getBundle("properties");
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                ajoVar.b(str, (aka) bundle2.getParcelable(str));
            }
        }
        return ajoVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ajp[i];
    }
}
