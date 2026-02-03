package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddcl implements Parcelable.Creator {
    public static void a(InProductHelp inProductHelp, Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, inProductHelp.a, i, false);
        dclw.m(parcel, 2, inProductHelp.b, false);
        dclw.m(parcel, 3, inProductHelp.c, false);
        dclw.i(parcel, 4, inProductHelp.d);
        dclw.m(parcel, 5, inProductHelp.e, false);
        dclw.i(parcel, 6, inProductHelp.f);
        dclw.m(parcel, 7, inProductHelp.g, false);
        dclw.c(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        GoogleHelp googleHelp = null;
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        int iF = 0;
        int iF2 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    googleHelp = (GoogleHelp) dclv.n(parcel, i, GoogleHelp.CREATOR);
                    break;
                case 2:
                    strT = dclv.t(parcel, i);
                    break;
                case 3:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 4:
                    iF = dclv.f(parcel, i);
                    break;
                case 5:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 6:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 7:
                    strT4 = dclv.t(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new InProductHelp(googleHelp, strT, strT2, iF, strT3, iF2, strT4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new InProductHelp[i];
    }
}
