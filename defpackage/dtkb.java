package defpackage;

import android.content.Context;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtkb {
    public static final FontFamily.Builder a(Context context, dtjo dtjoVar, dtju dtjuVar, CancellationSignal cancellationSignal) throws IOException {
        context.getClass();
        dtjoVar.getClass();
        dtjuVar.getClass();
        ParcelFileDescriptor parcelFileDescriptor = ebsv.e(context, dtjoVar.a, cancellationSignal, fdbq.f(context.getPackageName(), "com.google.android.gms") ? ebsu.c : ebsu.a("com.google.android.gms")).getParcelFileDescriptor();
        if (parcelFileDescriptor == null) {
            return null;
        }
        try {
            Font fontBuild = new Font.Builder(parcelFileDescriptor).setWeight(dtjoVar.c).setSlant(dtjoVar.d ? 1 : 0).setTtcIndex(dtjoVar.b).setFontVariationSettings(dtjt.a(dtjuVar.b, context)).build();
            fontBuild.getClass();
            FontFamily.Builder builder = new FontFamily.Builder(fontBuild);
            fczl.a(parcelFileDescriptor, null);
            return builder;
        } finally {
        }
    }
}
