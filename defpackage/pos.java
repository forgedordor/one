package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pos extends por {
    private final SparseIntArray d;
    private final Parcel e;
    private final int f;
    private final int g;
    private final String h;
    private int i;
    private int j;
    private int k;

    public pos(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new cvw(), new cvw(), new cvw());
    }

    @Override // defpackage.por
    public final boolean A(int i) {
        while (this.j < this.g) {
            int i2 = this.k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            Parcel parcel = this.e;
            parcel.setDataPosition(this.j);
            int i3 = parcel.readInt();
            this.k = parcel.readInt();
            this.j += i3;
        }
        return this.k == i;
    }

    @Override // defpackage.por
    public final byte[] B() {
        Parcel parcel = this.e;
        int i = parcel.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // defpackage.por
    public final int a() {
        return this.e.readInt();
    }

    @Override // defpackage.por
    public final Parcelable c() {
        return this.e.readParcelable(getClass().getClassLoader());
    }

    @Override // defpackage.por
    protected final por e() {
        Parcel parcel = this.e;
        int iDataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        String str = this.h;
        return new pos(parcel, iDataPosition, i, str.concat("  "), this.a, this.b, this.c);
    }

    @Override // defpackage.por
    protected final CharSequence g() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
    }

    @Override // defpackage.por
    public final String i() {
        return this.e.readString();
    }

    @Override // defpackage.por
    public final void k() {
        int i = this.i;
        if (i >= 0) {
            SparseIntArray sparseIntArray = this.d;
            Parcel parcel = this.e;
            int i2 = sparseIntArray.get(i);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i2);
            parcel.writeInt(iDataPosition - i2);
            parcel.setDataPosition(iDataPosition);
        }
    }

    @Override // defpackage.por
    public final void l(int i) {
        k();
        this.i = i;
        this.d.put(i, this.e.dataPosition());
        r(0);
        r(i);
    }

    @Override // defpackage.por
    public final void m(boolean z) {
        this.e.writeInt(z ? 1 : 0);
    }

    @Override // defpackage.por
    public final void o(byte[] bArr) {
        Parcel parcel = this.e;
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
    }

    @Override // defpackage.por
    protected final void p(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.e, 0);
    }

    @Override // defpackage.por
    public final void r(int i) {
        this.e.writeInt(i);
    }

    @Override // defpackage.por
    public final void t(Parcelable parcelable) {
        this.e.writeParcelable(parcelable, 0);
    }

    @Override // defpackage.por
    public final void v(String str) {
        this.e.writeString(str);
    }

    @Override // defpackage.por
    public final boolean y() {
        return this.e.readInt() != 0;
    }

    private pos(Parcel parcel, int i, int i2, String str, cvw cvwVar, cvw cvwVar2, cvw cvwVar3) {
        super(cvwVar, cvwVar2, cvwVar3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }
}
