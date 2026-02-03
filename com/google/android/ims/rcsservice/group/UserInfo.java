package com.google.android.ims.rcsservice.group;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dhdo;
import defpackage.ejwk;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class UserInfo implements Parcelable {
    public static final Parcelable.Creator<UserInfo> CREATOR = new dhdo();
    public final String a;
    public String b;
    public int c;
    public boolean d;
    public boolean e;
    private String f;
    private String g;

    public UserInfo(String str) {
        this.a = str;
    }

    public final void a(String str) {
        String strTrim = str.trim();
        if (strTrim.charAt(0) == '\"') {
            int iIndexOf = strTrim.indexOf(34, 1);
            this.b = strTrim.substring(1, iIndexOf);
            strTrim = strTrim.substring(iIndexOf + 1).trim();
        }
        if (strTrim.charAt(0) == '<') {
            strTrim = strTrim.substring(1);
        }
        if (strTrim.charAt(strTrim.length() - 1) == '>') {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        int iIndexOf2 = strTrim.indexOf(59);
        if (iIndexOf2 < 0) {
            this.f = strTrim;
        } else {
            this.f = strTrim.substring(0, iIndexOf2);
            this.g = strTrim.substring(iIndexOf2 + 1);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        String strSubstring;
        String strSubstring2;
        String strSubstring3;
        int iIndexOf;
        if (!(obj instanceof UserInfo)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        String strSubstring4 = ((UserInfo) obj).f;
        if (strSubstring4 == null) {
            return this.f == null;
        }
        int iIndexOf2 = strSubstring4.indexOf(59);
        if (iIndexOf2 >= 0) {
            strSubstring4 = strSubstring4.substring(0, iIndexOf2);
        }
        int iIndexOf3 = strSubstring4.indexOf(58);
        String strSubstring5 = strSubstring4.substring(0, iIndexOf3);
        String strSubstring6 = strSubstring4.substring(iIndexOf3 + 1);
        int iIndexOf4 = strSubstring6.indexOf(64);
        String strSubstring7 = null;
        if (iIndexOf4 >= 0) {
            strSubstring = strSubstring6.substring(iIndexOf4 + 1);
            strSubstring6 = strSubstring6.substring(0, iIndexOf4);
        } else {
            strSubstring = null;
        }
        if (Objects.isNull(this.f)) {
            strSubstring2 = null;
            strSubstring3 = null;
        } else {
            int iIndexOf5 = this.f.indexOf(58);
            strSubstring3 = this.f.substring(0, iIndexOf5);
            strSubstring2 = this.f.substring(iIndexOf5 + 1);
        }
        if (!Objects.isNull(strSubstring2) && (iIndexOf = strSubstring2.indexOf(64)) >= 0) {
            strSubstring7 = strSubstring2.substring(iIndexOf + 1);
            strSubstring2 = strSubstring2.substring(0, iIndexOf);
        }
        return Objects.equals(strSubstring3, strSubstring5) ? Objects.equals(strSubstring2, strSubstring6) && Objects.equals(strSubstring7, strSubstring) : Objects.equals(strSubstring2, strSubstring6);
    }

    public final int hashCode() {
        return String.valueOf(this.f).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.f);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.g);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
    }

    public UserInfo(Parcel parcel) {
        this.a = ejwk.b(parcel.readString());
        this.f = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.g = parcel.readString();
        this.d = parcel.readByte() == 1;
        this.e = parcel.readByte() == 1;
    }
}
