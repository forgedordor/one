package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eare extends eaoy {
    public static final Parcelable.Creator<eare> CREATOR = new eard();

    public eare(String str, String str2, String str3, String str4, eapp eappVar, List list, eate eateVar, eatb eatbVar, easp easpVar, eatb eatbVar2, eatb eatbVar3, String str5, String str6, Integer num, String str7, String str8, String str9, LatLng latLng, LatLng latLng2, String str10, String str11, String str12, String str13, String str14, easp easpVar2, String str15, String str16, String str17, List list2, List list3, List list4, eatm eatmVar, Integer num2, eatn eatnVar, String str18, String str19, String str20, Double d, eatb eatbVar4, List list5, List list6, eatb eatbVar5, eatb eatbVar6, eatb eatbVar7, eatb eatbVar8, eatb eatbVar9, eatb eatbVar10, eatb eatbVar11, eatb eatbVar12, List list7, Integer num3, Integer num4, Integer num5, LatLngBounds latLngBounds, Uri uri, Uri uri2, eatb eatbVar13, eapm eapmVar, east eastVar, easv easvVar, earz earzVar, eatb eatbVar14, eatb eatbVar15, eatb eatbVar16, eatb eatbVar17, eatb eatbVar18, eatb eatbVar19, eatb eatbVar20, eatb eatbVar21, eatb eatbVar22, eatb eatbVar23, eatb eatbVar24, List list8, easd easdVar, eatb eatbVar25) {
        super(str, str2, str3, str4, eappVar, list, eateVar, eatbVar, easpVar, eatbVar2, eatbVar3, str5, str6, num, str7, str8, str9, latLng, latLng2, str10, str11, str12, str13, str14, easpVar2, str15, str16, str17, list2, list3, list4, eatmVar, num2, eatnVar, str18, str19, str20, d, eatbVar4, list5, list6, eatbVar5, eatbVar6, eatbVar7, eatbVar8, eatbVar9, eatbVar10, eatbVar11, eatbVar12, list7, num3, num4, num5, latLngBounds, uri, uri2, eatbVar13, eapmVar, eastVar, easvVar, earzVar, eatbVar14, eatbVar15, eatbVar16, eatbVar17, eatbVar18, eatbVar19, eatbVar20, eatbVar21, eatbVar22, eatbVar23, eatbVar24, list8, easdVar, eatbVar25);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        if (str == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str);
        }
        String str2 = this.b;
        if (str2 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str2);
        }
        String str3 = this.c;
        if (str3 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str3);
        }
        String str4 = this.d;
        if (str4 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str4);
        }
        parcel.writeParcelable(this.e, i);
        parcel.writeList(this.f);
        parcel.writeParcelable(this.g, i);
        parcel.writeParcelable(this.h, i);
        parcel.writeParcelable(this.i, i);
        parcel.writeParcelable(this.j, i);
        parcel.writeParcelable(this.k, i);
        String str5 = this.l;
        if (str5 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str5);
        }
        String str6 = this.m;
        if (str6 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str6);
        }
        Integer num = this.n;
        if (num == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(num.intValue());
        }
        String str7 = this.o;
        if (str7 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str7);
        }
        String str8 = this.p;
        if (str8 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str8);
        }
        String str9 = this.q;
        if (str9 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str9);
        }
        parcel.writeParcelable(this.r, i);
        parcel.writeParcelable(this.s, i);
        String str10 = this.t;
        if (str10 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str10);
        }
        String str11 = this.u;
        if (str11 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str11);
        }
        String str12 = this.v;
        if (str12 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str12);
        }
        String str13 = this.w;
        if (str13 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str13);
        }
        String str14 = this.x;
        if (str14 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str14);
        }
        parcel.writeParcelable(this.y, i);
        String str15 = this.z;
        if (str15 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str15);
        }
        String str16 = this.A;
        if (str16 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str16);
        }
        String str17 = this.B;
        if (str17 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str17);
        }
        parcel.writeList(this.C);
        parcel.writeList(this.D);
        parcel.writeList(this.E);
        parcel.writeParcelable(this.F, i);
        Integer num2 = this.G;
        if (num2 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeParcelable(this.H, i);
        String str18 = this.I;
        if (str18 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str18);
        }
        String str19 = this.J;
        if (str19 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str19);
        }
        String str20 = this.K;
        if (str20 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str20);
        }
        Double d = this.L;
        if (d == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeParcelable(this.M, i);
        parcel.writeList(this.N);
        parcel.writeList(this.O);
        parcel.writeParcelable(this.P, i);
        parcel.writeParcelable(this.Q, i);
        parcel.writeParcelable(this.R, i);
        parcel.writeParcelable(this.S, i);
        parcel.writeParcelable(this.T, i);
        parcel.writeParcelable(this.U, i);
        parcel.writeParcelable(this.V, i);
        parcel.writeParcelable(this.W, i);
        parcel.writeList(this.X);
        Integer num3 = this.Y;
        if (num3 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.Z;
        if (num4 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(num4.intValue());
        }
        Integer num5 = this.aa;
        if (num5 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(num5.intValue());
        }
        parcel.writeParcelable(this.ab, i);
        parcel.writeParcelable(this.ac, i);
        parcel.writeParcelable(this.ad, i);
        parcel.writeParcelable(this.ae, i);
        parcel.writeParcelable(this.af, i);
        parcel.writeParcelable(this.ag, i);
        parcel.writeParcelable(this.ah, i);
        parcel.writeParcelable(this.ai, i);
        parcel.writeParcelable(this.aj, i);
        parcel.writeParcelable(this.ak, i);
        parcel.writeParcelable(this.al, i);
        parcel.writeParcelable(this.am, i);
        parcel.writeParcelable(this.an, i);
        parcel.writeParcelable(this.ao, i);
        parcel.writeParcelable(this.ap, i);
        parcel.writeParcelable(this.aq, i);
        parcel.writeParcelable(this.ar, i);
        parcel.writeParcelable(this.as, i);
        parcel.writeParcelable(this.at, i);
        parcel.writeList(this.au);
        parcel.writeParcelable(this.av, i);
        parcel.writeParcelable(this.aw, i);
    }
}
