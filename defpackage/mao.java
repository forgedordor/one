package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mao implements Comparator<man>, Parcelable {
    public static final Parcelable.Creator<mao> CREATOR = new mal();
    public final String a;
    public final int b;
    private final man[] c;
    private int d;

    public mao(Parcel parcel) {
        this.a = parcel.readString();
        man[] manVarArr = (man[]) parcel.createTypedArray(man.CREATOR);
        String str = mgb.a;
        this.c = manVarArr;
        this.b = manVarArr.length;
    }

    public final man a(int i) {
        return this.c[i];
    }

    public final mao b(String str) {
        return Objects.equals(this.a, str) ? this : new mao(str, false, this.c);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(man manVar, man manVar2) {
        man manVar3 = manVar2;
        UUID uuid = maf.a;
        UUID uuid2 = manVar.a;
        return uuid.equals(uuid2) ? !uuid.equals(manVar3.a) ? 1 : 0 : uuid2.compareTo(manVar3.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            mao maoVar = (mao) obj;
            if (Objects.equals(this.a, maoVar.a) && Arrays.equals(this.c, maoVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        String str = this.a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.c);
        this.d = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeTypedArray(this.c, 0);
    }

    public mao(String str, boolean z, man... manVarArr) {
        this.a = str;
        manVarArr = z ? (man[]) manVarArr.clone() : manVarArr;
        this.c = manVarArr;
        this.b = manVarArr.length;
        Arrays.sort(manVarArr, this);
    }
}
