package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.AdditionalConsentConfig;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcwl implements Parcelable.Creator {
    public static void a(FeedbackOptions feedbackOptions, Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 2, feedbackOptions.a, false);
        dclw.p(parcel, 3, feedbackOptions.b);
        dclw.m(parcel, 5, feedbackOptions.c, false);
        dclw.k(parcel, 6, feedbackOptions.d, i, false);
        dclw.m(parcel, 7, feedbackOptions.e, false);
        dclw.k(parcel, 8, feedbackOptions.f, i, false);
        dclw.m(parcel, 9, feedbackOptions.g, false);
        dclw.n(parcel, 10, feedbackOptions.h, false);
        dclw.d(parcel, 11, feedbackOptions.i);
        dclw.k(parcel, 12, feedbackOptions.j, i, false);
        dclw.k(parcel, 13, feedbackOptions.k, i, false);
        dclw.d(parcel, 14, feedbackOptions.l);
        dclw.k(parcel, 15, feedbackOptions.m, i, false);
        dclw.m(parcel, 16, feedbackOptions.n, false);
        dclw.d(parcel, 17, feedbackOptions.o);
        dclw.j(parcel, 18, feedbackOptions.p);
        dclw.d(parcel, 19, feedbackOptions.q);
        dclw.m(parcel, 20, feedbackOptions.r, false);
        dclw.k(parcel, 21, feedbackOptions.s, i, false);
        dclw.c(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        Bundle bundleK = null;
        String strT2 = null;
        ApplicationErrorReport applicationErrorReport = null;
        String strT3 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String strT4 = null;
        ArrayList arrayListZ = null;
        ThemeSettings themeSettings = null;
        LogOptions logOptions = null;
        Bitmap bitmap = null;
        String strT5 = null;
        String strT6 = null;
        AdditionalConsentConfig additionalConsentConfig = null;
        boolean zD = false;
        boolean zD2 = false;
        boolean zD3 = false;
        boolean zD4 = false;
        long jI = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    strT = dclv.t(parcel, i);
                    break;
                case 3:
                    bundleK = dclv.k(parcel, i);
                    break;
                case 4:
                default:
                    dclv.C(parcel, i);
                    break;
                case 5:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 6:
                    applicationErrorReport = (ApplicationErrorReport) dclv.n(parcel, i, ApplicationErrorReport.CREATOR);
                    break;
                case 7:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 8:
                    bitmapTeleporter = (BitmapTeleporter) dclv.n(parcel, i, BitmapTeleporter.CREATOR);
                    break;
                case 9:
                    strT4 = dclv.t(parcel, i);
                    break;
                case 10:
                    arrayListZ = dclv.z(parcel, i, FileTeleporter.CREATOR);
                    break;
                case 11:
                    zD = dclv.D(parcel, i);
                    break;
                case 12:
                    themeSettings = (ThemeSettings) dclv.n(parcel, i, ThemeSettings.CREATOR);
                    break;
                case 13:
                    logOptions = (LogOptions) dclv.n(parcel, i, LogOptions.CREATOR);
                    break;
                case 14:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 15:
                    bitmap = (Bitmap) dclv.n(parcel, i, Bitmap.CREATOR);
                    break;
                case 16:
                    strT5 = dclv.t(parcel, i);
                    break;
                case 17:
                    zD3 = dclv.D(parcel, i);
                    break;
                case 18:
                    jI = dclv.i(parcel, i);
                    break;
                case 19:
                    zD4 = dclv.D(parcel, i);
                    break;
                case 20:
                    strT6 = dclv.t(parcel, i);
                    break;
                case 21:
                    additionalConsentConfig = (AdditionalConsentConfig) dclv.n(parcel, i, AdditionalConsentConfig.CREATOR);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new FeedbackOptions(strT, bundleK, strT2, applicationErrorReport, strT3, bitmapTeleporter, strT4, arrayListZ, zD, themeSettings, logOptions, zD2, bitmap, strT5, zD3, jI, zD4, strT6, additionalConsentConfig);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FeedbackOptions[i];
    }
}
