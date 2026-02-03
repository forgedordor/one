package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eflh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Optional optionalOf;
        int i = efdf.a;
        efbp efbpVar = new efbp();
        efbpVar.c = ekoj.a;
        efbpVar.b((String) efmp.h(parcel, 1).get());
        efbpVar.a((String) efmp.h(parcel, 2).get());
        if (efmp.s(parcel, 3)) {
            parcel.readInt();
            int i2 = parcel.readInt();
            ekgi ekgiVar = new ekgi();
            for (int i3 = 0; i3 < i2; i3++) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (string != null && string2 != null) {
                    ekgiVar.i(string, string2);
                }
            }
            optionalOf = Optional.of(ekgiVar.c());
        } else {
            optionalOf = Optional.empty();
        }
        efbpVar.c = (ekgp) optionalOf.get();
        efmp.j(parcel);
        String str = efbpVar.a;
        if (str == null) {
            throw new IllegalStateException("Property \"type\" has not been set");
        }
        efbpVar.b(ejuf.c(str));
        String str2 = efbpVar.b;
        if (str2 == null) {
            throw new IllegalStateException("Property \"subType\" has not been set");
        }
        efbpVar.a(ejuf.c(str2));
        ekgi ekgiVar2 = new ekgi();
        ekgp ekgpVar = efbpVar.c;
        if (ekgpVar == null) {
            throw new IllegalStateException("Property \"parameters\" has not been set");
        }
        ekqg ekqgVarListIterator = ekgpVar.keySet().listIterator();
        while (ekqgVarListIterator.hasNext()) {
            String str3 = (String) ekqgVarListIterator.next();
            String str4 = (String) ekgpVar.get(str3);
            if (str4 != null) {
                ekgiVar2.i(ejuf.c(str3), str4);
            }
        }
        efbpVar.c = ekgiVar2.c();
        if (efbpVar.a != null && efbpVar.b != null && efbpVar.c != null) {
            return new efbq(efbpVar.a, efbpVar.b, efbpVar.c);
        }
        StringBuilder sb = new StringBuilder();
        if (efbpVar.a == null) {
            sb.append(" type");
        }
        if (efbpVar.b == null) {
            sb.append(" subType");
        }
        if (efbpVar.c == null) {
            sb.append(" parameters");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new efdf[0];
    }
}
