package defpackage;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.GlobalSearchCorpusConfig;
import com.google.android.gms.appdatasearch.RegisterCorpusIMEInfo;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbiw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        boolean zD = false;
        int iF = 0;
        String strT = null;
        Uri uri = null;
        RegisterSectionInfo[] registerSectionInfoArr = null;
        GlobalSearchCorpusConfig globalSearchCorpusConfig = null;
        Account account = null;
        RegisterCorpusIMEInfo registerCorpusIMEInfo = null;
        String strT2 = null;
        boolean zD2 = true;
        String strT3 = "0";
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    strT = dclv.t(parcel, i);
                    break;
                case 2:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 3:
                    uri = (Uri) dclv.n(parcel, i, Uri.CREATOR);
                    break;
                case 4:
                    registerSectionInfoArr = (RegisterSectionInfo[]) dclv.J(parcel, i, RegisterSectionInfo.CREATOR);
                    break;
                case 5:
                case 6:
                default:
                    dclv.C(parcel, i);
                    break;
                case 7:
                    globalSearchCorpusConfig = (GlobalSearchCorpusConfig) dclv.n(parcel, i, GlobalSearchCorpusConfig.CREATOR);
                    break;
                case 8:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 9:
                    account = (Account) dclv.n(parcel, i, Account.CREATOR);
                    break;
                case 10:
                    registerCorpusIMEInfo = (RegisterCorpusIMEInfo) dclv.n(parcel, i, RegisterCorpusIMEInfo.CREATOR);
                    break;
                case 11:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 12:
                    zD = dclv.D(parcel, i);
                    break;
                case 13:
                    iF = dclv.f(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new RegisterCorpusInfo(strT, strT3, uri, registerSectionInfoArr, globalSearchCorpusConfig, zD2, account, registerCorpusIMEInfo, strT2, zD, iF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RegisterCorpusInfo[i];
    }
}
