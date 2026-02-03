package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.AdditionalConsentConfig;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ServiceDump;
import com.google.android.gms.feedback.ThemeSettings;
import com.sun.jna.Function;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcwb implements Parcelable.Creator {
    public static final ErrorReport a(Parcel parcel) {
        int iH = dclv.h(parcel);
        ApplicationErrorReport applicationErrorReport = null;
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        String strT5 = null;
        String strT6 = null;
        String strT7 = null;
        String strT8 = null;
        String strT9 = null;
        String strT10 = null;
        String strT11 = null;
        String strT12 = null;
        String strT13 = null;
        String[] strArrK = null;
        String[] strArrK2 = null;
        String[] strArrK3 = null;
        String strT14 = null;
        String strT15 = null;
        byte[] bArrE = null;
        String strT16 = null;
        String strT17 = null;
        String strT18 = null;
        Bundle bundleK = null;
        String strT19 = null;
        String strT20 = null;
        String strT21 = null;
        String strT22 = null;
        String strT23 = null;
        String strT24 = null;
        String strT25 = null;
        String strT26 = null;
        String strT27 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String strT28 = null;
        FileTeleporter[] fileTeleporterArr = null;
        String[] strArrK4 = null;
        String strT29 = null;
        ThemeSettings themeSettings = null;
        LogOptions logOptions = null;
        String strT30 = null;
        Bundle bundleK2 = null;
        ArrayList arrayListZ = null;
        Bitmap bitmap = null;
        String strT31 = null;
        ArrayList arrayListY = null;
        String[] strArrK5 = null;
        String[] strArrK6 = null;
        String[] strArrK7 = null;
        String strT32 = null;
        AdditionalConsentConfig additionalConsentConfig = null;
        ServiceDump[] serviceDumpArr = null;
        int iF = 0;
        int iF2 = 0;
        int iF3 = 0;
        int iF4 = 0;
        int iF5 = 0;
        int iF6 = 0;
        boolean zD = false;
        int iF7 = 0;
        int iF8 = 0;
        boolean zD2 = false;
        int iF9 = 0;
        boolean zD3 = false;
        boolean zD4 = false;
        boolean zD5 = false;
        int iF10 = 0;
        int iF11 = 0;
        boolean zD6 = false;
        boolean zD7 = false;
        while (parcel.dataPosition() < iH) {
            int iE = dclv.e(parcel);
            switch (dclv.d(iE)) {
                case 2:
                    applicationErrorReport = (ApplicationErrorReport) dclv.n(parcel, iE, ApplicationErrorReport.CREATOR);
                    break;
                case 3:
                    strT = dclv.t(parcel, iE);
                    break;
                case 4:
                    iF = dclv.f(parcel, iE);
                    break;
                case 5:
                    strT2 = dclv.t(parcel, iE);
                    break;
                case 6:
                    strT3 = dclv.t(parcel, iE);
                    break;
                case 7:
                    strT4 = dclv.t(parcel, iE);
                    break;
                case 8:
                    strT5 = dclv.t(parcel, iE);
                    break;
                case 9:
                    strT6 = dclv.t(parcel, iE);
                    break;
                case 10:
                    strT7 = dclv.t(parcel, iE);
                    break;
                case 11:
                    strT8 = dclv.t(parcel, iE);
                    break;
                case 12:
                    iF2 = dclv.f(parcel, iE);
                    break;
                case 13:
                    strT9 = dclv.t(parcel, iE);
                    break;
                case 14:
                    strT10 = dclv.t(parcel, iE);
                    break;
                case 15:
                    strT11 = dclv.t(parcel, iE);
                    break;
                case 16:
                    strT12 = dclv.t(parcel, iE);
                    break;
                case 17:
                    strT13 = dclv.t(parcel, iE);
                    break;
                case 18:
                    strArrK = dclv.K(parcel, iE);
                    break;
                case 19:
                    strArrK2 = dclv.K(parcel, iE);
                    break;
                case 20:
                    strArrK3 = dclv.K(parcel, iE);
                    break;
                case 21:
                    strT14 = dclv.t(parcel, iE);
                    break;
                case 22:
                    strT15 = dclv.t(parcel, iE);
                    break;
                case 23:
                    bArrE = dclv.E(parcel, iE);
                    break;
                case 24:
                    iF3 = dclv.f(parcel, iE);
                    break;
                case 25:
                    iF4 = dclv.f(parcel, iE);
                    break;
                case 26:
                    iF5 = dclv.f(parcel, iE);
                    break;
                case 27:
                    iF6 = dclv.f(parcel, iE);
                    break;
                case 28:
                    strT16 = dclv.t(parcel, iE);
                    break;
                case 29:
                    strT17 = dclv.t(parcel, iE);
                    break;
                case 30:
                    strT18 = dclv.t(parcel, iE);
                    break;
                case 31:
                    bundleK = dclv.k(parcel, iE);
                    break;
                case 32:
                    zD = dclv.D(parcel, iE);
                    break;
                case 33:
                    iF7 = dclv.f(parcel, iE);
                    break;
                case 34:
                    iF8 = dclv.f(parcel, iE);
                    break;
                case 35:
                    zD2 = dclv.D(parcel, iE);
                    break;
                case 36:
                    strT19 = dclv.t(parcel, iE);
                    break;
                case 37:
                    strT20 = dclv.t(parcel, iE);
                    break;
                case 38:
                    iF9 = dclv.f(parcel, iE);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    strT21 = dclv.t(parcel, iE);
                    break;
                case 40:
                    strT22 = dclv.t(parcel, iE);
                    break;
                case 41:
                    strT23 = dclv.t(parcel, iE);
                    break;
                case 42:
                    strT24 = dclv.t(parcel, iE);
                    break;
                case 43:
                    strT25 = dclv.t(parcel, iE);
                    break;
                case 44:
                    strT26 = dclv.t(parcel, iE);
                    break;
                case 45:
                    strT27 = dclv.t(parcel, iE);
                    break;
                case 46:
                    bitmapTeleporter = (BitmapTeleporter) dclv.n(parcel, iE, BitmapTeleporter.CREATOR);
                    break;
                case 47:
                    strT28 = dclv.t(parcel, iE);
                    break;
                case 48:
                    fileTeleporterArr = (FileTeleporter[]) dclv.J(parcel, iE, FileTeleporter.CREATOR);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    strArrK4 = dclv.K(parcel, iE);
                    break;
                case 50:
                    zD3 = dclv.D(parcel, iE);
                    break;
                case 51:
                    strT29 = dclv.t(parcel, iE);
                    break;
                case 52:
                    themeSettings = (ThemeSettings) dclv.n(parcel, iE, ThemeSettings.CREATOR);
                    break;
                case 53:
                    logOptions = (LogOptions) dclv.n(parcel, iE, LogOptions.CREATOR);
                    break;
                case 54:
                    strT30 = dclv.t(parcel, iE);
                    break;
                case 55:
                    zD4 = dclv.D(parcel, iE);
                    break;
                case 56:
                    bundleK2 = dclv.k(parcel, iE);
                    break;
                case 57:
                    arrayListZ = dclv.z(parcel, iE, RectF.CREATOR);
                    break;
                case 58:
                    zD5 = dclv.D(parcel, iE);
                    break;
                case 59:
                    bitmap = (Bitmap) dclv.n(parcel, iE, Bitmap.CREATOR);
                    break;
                case 60:
                    strT31 = dclv.t(parcel, iE);
                    break;
                case 61:
                    arrayListY = dclv.y(parcel, iE);
                    break;
                case 62:
                    iF10 = dclv.f(parcel, iE);
                    break;
                case Function.ALT_CONVENTION /* 63 */:
                    iF11 = dclv.f(parcel, iE);
                    break;
                case 64:
                    strArrK5 = dclv.K(parcel, iE);
                    break;
                case 65:
                    strArrK6 = dclv.K(parcel, iE);
                    break;
                case 66:
                    strArrK7 = dclv.K(parcel, iE);
                    break;
                case 67:
                    zD6 = dclv.D(parcel, iE);
                    break;
                case 68:
                    zD7 = dclv.D(parcel, iE);
                    break;
                case 69:
                    strT32 = dclv.t(parcel, iE);
                    break;
                case 70:
                    additionalConsentConfig = (AdditionalConsentConfig) dclv.n(parcel, iE, AdditionalConsentConfig.CREATOR);
                    break;
                case 71:
                    serviceDumpArr = (ServiceDump[]) dclv.J(parcel, iE, ServiceDump.CREATOR);
                    break;
                default:
                    dclv.C(parcel, iE);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new ErrorReport(applicationErrorReport, strT, iF, strT2, strT3, strT4, strT5, strT6, strT7, strT8, iF2, strT9, strT10, strT11, strT12, strT13, strArrK, strArrK2, strArrK3, strT14, strT15, bArrE, iF3, iF4, iF5, iF6, strT16, strT17, strT18, bundleK, zD, iF7, iF8, zD2, strT19, strT20, iF9, strT21, strT22, strT23, strT24, strT25, strT26, strT27, bitmapTeleporter, strT28, fileTeleporterArr, strArrK4, zD3, strT29, themeSettings, logOptions, strT30, zD4, bundleK2, arrayListZ, zD5, bitmap, strT31, arrayListY, iF10, iF11, strArrK5, strArrK6, strArrK7, zD6, zD7, strT32, additionalConsentConfig, serviceDumpArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ErrorReport[i];
    }
}
