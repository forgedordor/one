package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.DataCollectionIdentifierParcelable;
import com.google.android.gms.clearcut.internal.LogVerifierResultParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.phenotype.ExperimentTokens;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbzw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        PlayLoggerContext playLoggerContext = null;
        byte[] bArrE = null;
        int[] iArrH = null;
        String[] strArrK = null;
        int[] iArrH2 = null;
        byte[][] bArrL = null;
        ExperimentTokens[] experimentTokensArr = null;
        LogVerifierResultParcelable logVerifierResultParcelable = null;
        String[] strArrK2 = null;
        DataCollectionIdentifierParcelable dataCollectionIdentifierParcelable = null;
        int iF = 0;
        boolean zD = true;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    playLoggerContext = (PlayLoggerContext) dclv.n(parcel, i, PlayLoggerContext.CREATOR);
                    break;
                case 3:
                    bArrE = dclv.E(parcel, i);
                    break;
                case 4:
                    iArrH = dclv.H(parcel, i);
                    break;
                case 5:
                    strArrK = dclv.K(parcel, i);
                    break;
                case 6:
                    iArrH2 = dclv.H(parcel, i);
                    break;
                case 7:
                    bArrL = dclv.L(parcel, i);
                    break;
                case 8:
                    zD = dclv.D(parcel, i);
                    break;
                case 9:
                    experimentTokensArr = (ExperimentTokens[]) dclv.J(parcel, i, ExperimentTokens.CREATOR);
                    break;
                case 10:
                default:
                    dclv.C(parcel, i);
                    break;
                case 11:
                    logVerifierResultParcelable = (LogVerifierResultParcelable) dclv.n(parcel, i, LogVerifierResultParcelable.CREATOR);
                    break;
                case 12:
                    strArrK2 = dclv.K(parcel, i);
                    break;
                case 13:
                    iF = dclv.f(parcel, i);
                    break;
                case 14:
                    dataCollectionIdentifierParcelable = (DataCollectionIdentifierParcelable) dclv.n(parcel, i, DataCollectionIdentifierParcelable.CREATOR);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new LogEventParcelable(playLoggerContext, bArrE, iArrH, strArrK, iArrH2, bArrL, zD, experimentTokensArr, logVerifierResultParcelable, strArrK2, iF, dataCollectionIdentifierParcelable);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LogEventParcelable[i];
    }
}
