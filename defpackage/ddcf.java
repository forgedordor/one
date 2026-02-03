package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.FRDProductSpecificDataEntry;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.ND4CSettings;
import com.google.android.gms.googlehelp.OfflineSuggestion;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import com.google.android.gms.googlehelp.trails.TrailsInteraction;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddcf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        Account account = null;
        Bundle bundleK = null;
        String strT2 = null;
        String strT3 = null;
        Bitmap bitmap = null;
        ArrayList arrayListY = null;
        Bundle bundleK2 = null;
        Bitmap bitmap2 = null;
        byte[] bArrE = null;
        String strT4 = null;
        Uri uri = null;
        ArrayList arrayListZ = null;
        ThemeSettings themeSettings = null;
        ArrayList arrayListZ2 = null;
        ErrorReport errorReport = null;
        TogglingData togglingData = null;
        PendingIntent pendingIntent = null;
        String strT5 = null;
        String strT6 = null;
        ND4CSettings nD4CSettings = null;
        ArrayList arrayListZ3 = null;
        String strT7 = null;
        ArrayList arrayListZ4 = null;
        String strT8 = null;
        Intent intent = null;
        ArrayList arrayListY2 = null;
        int iF = 0;
        boolean zD = false;
        boolean zD2 = false;
        int iF2 = 0;
        int iF3 = 0;
        int iF4 = 0;
        boolean zD3 = false;
        int iF5 = 0;
        int iF6 = 0;
        boolean zD4 = false;
        boolean zD5 = false;
        int iF7 = 0;
        boolean zD6 = false;
        boolean zD7 = false;
        boolean zD8 = false;
        int iF8 = 0;
        int iF9 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    iF = dclv.f(parcel, i);
                    break;
                case 2:
                    strT = dclv.t(parcel, i);
                    break;
                case 3:
                    account = (Account) dclv.n(parcel, i, Account.CREATOR);
                    break;
                case 4:
                    bundleK = dclv.k(parcel, i);
                    break;
                case 5:
                    zD = dclv.D(parcel, i);
                    break;
                case 6:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 7:
                    arrayListY = dclv.y(parcel, i);
                    break;
                case 8:
                case 9:
                case 12:
                case 13:
                case 24:
                case 26:
                case 27:
                case 29:
                case 30:
                default:
                    dclv.C(parcel, i);
                    break;
                case 10:
                    bundleK2 = dclv.k(parcel, i);
                    break;
                case 11:
                    bitmap2 = (Bitmap) dclv.n(parcel, i, Bitmap.CREATOR);
                    break;
                case 14:
                    strT4 = dclv.t(parcel, i);
                    break;
                case 15:
                    uri = (Uri) dclv.n(parcel, i, Uri.CREATOR);
                    break;
                case 16:
                    arrayListZ = dclv.z(parcel, i, OverflowMenuItem.CREATOR);
                    break;
                case 17:
                    iF4 = dclv.f(parcel, i);
                    break;
                case 18:
                    arrayListZ2 = dclv.z(parcel, i, OfflineSuggestion.CREATOR);
                    break;
                case 19:
                    bArrE = dclv.E(parcel, i);
                    break;
                case 20:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 21:
                    iF3 = dclv.f(parcel, i);
                    break;
                case 22:
                    zD3 = dclv.D(parcel, i);
                    break;
                case 23:
                    errorReport = (ErrorReport) dclv.n(parcel, i, ErrorReport.CREATOR);
                    break;
                case 25:
                    themeSettings = (ThemeSettings) dclv.n(parcel, i, ThemeSettings.CREATOR);
                    break;
                case 28:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 31:
                    togglingData = (TogglingData) dclv.n(parcel, i, TogglingData.CREATOR);
                    break;
                case 32:
                    iF5 = dclv.f(parcel, i);
                    break;
                case 33:
                    pendingIntent = (PendingIntent) dclv.n(parcel, i, PendingIntent.CREATOR);
                    break;
                case 34:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 35:
                    bitmap = (Bitmap) dclv.n(parcel, i, Bitmap.CREATOR);
                    break;
                case 36:
                    iF6 = dclv.f(parcel, i);
                    break;
                case 37:
                    zD4 = dclv.D(parcel, i);
                    break;
                case 38:
                    zD5 = dclv.D(parcel, i);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    iF7 = dclv.f(parcel, i);
                    break;
                case 40:
                    strT5 = dclv.t(parcel, i);
                    break;
                case 41:
                    zD6 = dclv.D(parcel, i);
                    break;
                case 42:
                    strT6 = dclv.t(parcel, i);
                    break;
                case 43:
                    zD7 = dclv.D(parcel, i);
                    break;
                case 44:
                    nD4CSettings = (ND4CSettings) dclv.n(parcel, i, ND4CSettings.CREATOR);
                    break;
                case 45:
                    zD8 = dclv.D(parcel, i);
                    break;
                case 46:
                    arrayListZ3 = dclv.z(parcel, i, FRDProductSpecificDataEntry.CREATOR);
                    break;
                case 47:
                    strT7 = dclv.t(parcel, i);
                    break;
                case 48:
                    iF8 = dclv.f(parcel, i);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    iF9 = dclv.f(parcel, i);
                    break;
                case 50:
                    arrayListZ4 = dclv.z(parcel, i, TrailsInteraction.CREATOR);
                    break;
                case 51:
                    strT8 = dclv.t(parcel, i);
                    break;
                case 52:
                    intent = (Intent) dclv.n(parcel, i, Intent.CREATOR);
                    break;
                case 53:
                    arrayListY2 = dclv.y(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new GoogleHelp(iF, strT, account, bundleK, strT2, strT3, bitmap, zD, zD2, arrayListY, bundleK2, bitmap2, bArrE, iF2, iF3, strT4, uri, arrayListZ, iF4, themeSettings, arrayListZ2, zD3, errorReport, togglingData, iF5, pendingIntent, iF6, zD4, zD5, iF7, strT5, zD6, strT6, zD7, nD4CSettings, zD8, arrayListZ3, strT7, iF8, iF9, arrayListZ4, strT8, intent, arrayListY2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleHelp[i];
    }
}
