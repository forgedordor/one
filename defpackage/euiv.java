package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euiv implements Parcelable {
    public static final Parcelable.Creator<euiv> CREATOR = new euis();
    public static final ekgp a;
    private final String b;
    private final Uri c;
    private final ekfn d;
    private final String e;

    static {
        ekgi ekgiVar = new ekgi();
        for (euit euitVar : euit.values()) {
            ekgiVar.i(Integer.valueOf(euitVar.o), euitVar);
        }
        a = ekgiVar.c();
    }

    public euiv(String str, Uri uri, ekfn ekfnVar, String str2) {
        this.b = str;
        this.c = uri;
        this.d = ekfnVar;
        this.e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("textclassifier.extras.KgDeeplink.PACKAGE_ID", this.b);
        bundle.putParcelable("textclassifier.extras.KgDeeplink.URI", this.c);
        ArrayList<Integer> arrayList = new ArrayList<>();
        ekqh it = ((ekgb) this.d).iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((euit) it.next()).o));
        }
        bundle.putIntegerArrayList("textclassifier.extras.KgDeeplink.ACTIONS", arrayList);
        bundle.putString("textclassifier.extras.KgDeeplink.DISPLAY_LABEL", this.e);
        bundle.writeToParcel(parcel, i);
    }

    public euiv(Parcel parcel) {
        Bundle bundle = new Bundle();
        bundle.readFromParcel(parcel);
        this.b = bundle.getString("textclassifier.extras.KgDeeplink.PACKAGE_ID");
        this.c = (Uri) bundle.getParcelable("textclassifier.extras.KgDeeplink.URI");
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("textclassifier.extras.KgDeeplink.ACTIONS");
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        int size = integerArrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Integer num = integerArrayList.get(i2);
            ekgp ekgpVar = a;
            if (!ekgpVar.containsKey(num)) {
                Objects.toString(num);
                throw new IllegalArgumentException("Unknown action value: ".concat(String.valueOf(num)));
            }
            ekfwVar.h((euit) ekgpVar.get(num));
        }
        this.d = ekfwVar.g();
        this.e = bundle.getString("textclassifier.extras.KgDeeplink.DISPLAY_LABEL");
    }
}
