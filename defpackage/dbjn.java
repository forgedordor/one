package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentId;
import com.google.android.gms.appdatasearch.UsageInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbjn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        DocumentId documentId = null;
        String strT = null;
        DocumentContents documentContents = null;
        String strT2 = null;
        int iF = 0;
        boolean zD = false;
        int iF2 = 0;
        int iF3 = -1;
        long jI = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    documentId = (DocumentId) dclv.n(parcel, i, DocumentId.CREATOR);
                    break;
                case 2:
                    jI = dclv.i(parcel, i);
                    break;
                case 3:
                    iF = dclv.f(parcel, i);
                    break;
                case 4:
                    strT = dclv.t(parcel, i);
                    break;
                case 5:
                    documentContents = (DocumentContents) dclv.n(parcel, i, DocumentContents.CREATOR);
                    break;
                case 6:
                    zD = dclv.D(parcel, i);
                    break;
                case 7:
                    iF3 = dclv.f(parcel, i);
                    break;
                case 8:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 9:
                    strT2 = dclv.t(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new UsageInfo(documentId, jI, iF, strT, documentContents, zD, iF3, iF2, strT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UsageInfo[i];
    }
}
