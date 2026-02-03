package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import com.android.vcard.VCardConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmos {
    public static final cqce a = cqce.g("Bugle", "MmsSender");
    public final cmtt b;
    public final cmum c;
    public final crny d;
    protected final cldu e;
    public final eygg f;
    public final ky g;
    private final cqbm h;
    private final crmx i;
    private final cqjy j;
    private final aprr k;

    public cmos(cmtt cmttVar, cmum cmumVar, cqbm cqbmVar, crmx crmxVar, crny crnyVar, cldu clduVar, eygg eyggVar, cqjy cqjyVar, ky kyVar, aprr aprrVar) {
        this.b = cmttVar;
        this.c = cmumVar;
        this.h = cqbmVar;
        this.i = crmxVar;
        this.d = crnyVar;
        this.e = clduVar;
        this.f = eyggVar;
        this.j = cqjyVar;
        this.g = kyVar;
        this.k = aprrVar;
    }

    public final int a(int i, int i2, int i3) {
        cqaz.f(i == -1);
        cqbm cqbmVar = this.h;
        if (!((cqey) cqbmVar.a()).x() && (this.i.E() || this.d.a() <= 0)) {
            return 2;
        }
        if (i == 3) {
            if (!((cqey) cqbmVar.a()).x() || ((cqey) cqbmVar.a()).e(i3) != cqgk.UNAVAILABLE) {
                return 2;
            }
            i = 3;
        }
        if (i != 3) {
            if (i == 4) {
                if (i2 == 404) {
                    return 3;
                }
                cqbd cqbdVarE = a.e();
                cqbdVarE.I("Platform returned HTTP failure, returning message send status AUTO_RETRY");
                cqbdVarE.y("httpStatusCode", i2);
                cqbdVarE.r();
                return 1;
            }
            if (i != 5) {
                return i != 13 ? i != 112 ? 2 : 1 : this.k.a() ? 1 : 2;
            }
        }
        cqbd cqbdVarE2 = a.e();
        cqbdVarE2.I("Platform returned transient error, returning message send status AUTO_RETRY");
        cqbdVarE2.y("resultCode", i);
        cqbdVarE2.r();
        return 1;
    }

    protected final Uri b(Context context, lh lhVar, int i) throws cmor, IOException {
        Uri uriD = bxlh.d(context);
        File fileE = bxlh.e(context, uriD);
        if (fileE == null) {
            a.n("Cannot create temp file");
            throw new cmor(1, "Cannot create mms temp file");
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileE);
            try {
                File parentFile = fileE.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                byte[] bArrB = new ceal(context, lhVar).b();
                if (bArrB == null) {
                    throw new cmor(3, "Failed to compose PDU");
                }
                int iB = this.c.a(i).b();
                int length = bArrB.length;
                if (length <= iB) {
                    fileOutputStream.write(bArrB);
                    fileOutputStream.close();
                    return uriD;
                }
                cqbd cqbdVarB = a.b();
                cqbdVarB.I("pdu size exceeds limit.");
                cqbdVarB.I("pduBytes:");
                cqbdVarB.G(length);
                cqbdVarB.I("limit:");
                cqbdVarB.G(iB);
                cqbdVarB.m(i);
                cqbdVarB.r();
                throw new cmor(3);
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            fileE.delete();
            cqbd cqbdVarB2 = a.b();
            cqbdVarB2.I("Cannot create temporary file");
            cqbdVarB2.I(fileE);
            cqbdVarB2.s(e);
            throw new cmor(1, "Cannot create raw mms file");
        } catch (OutOfMemoryError e2) {
            fileE.delete();
            cqbd cqbdVarB3 = a.b();
            cqbdVarB3.I("Out of memory in composing PDU");
            cqbdVarB3.s(e2);
            throw new cmor(2);
        }
    }

    public final void c(Context context, int i, String str, String str2, int i2, long j) {
        try {
            cqce cqceVar = a;
            if (cqceVar.t(3)) {
                cqbd cqbdVarA = cqceVar.a();
                cqbdVarA.I("Sending M-NotifyResp.ind for received MMS. status: 0X");
                cqbdVarA.v(Integer.toHexString(i2));
                cqbdVarA.r();
            }
            if (str2 == null) {
                cqceVar.r("Can't send NotifyResp; contentLocation is null");
                return;
            }
            if (str == null) {
                cqceVar.r("Can't send NotifyResp; transaction id is null");
                return;
            }
            lm lmVar = new lm(str.getBytes(StandardCharsets.UTF_8), i2);
            Uri uri = Uri.parse(str2);
            cqbd cqbdVarC = cqceVar.c();
            cqbdVarC.I("sendNotifyResponseForMmsDownload");
            cqbdVarC.m(i);
            cqbdVarC.l(uri);
            cqbdVarC.r();
            if (true != this.c.a(i).q()) {
                str2 = null;
            }
            d(context, i, uri, str2, lmVar, false, null, j);
        } catch (cmor | li e) {
            a.o("safeSendNotifyResponseForMmsDownload failed to retrieve message", e);
        }
    }

    public final void d(Context context, int i, Uri uri, String str, lh lhVar, boolean z, Bundle bundle, long j) throws cmor, PendingIntent.CanceledException, IOException {
        Uri uriB = b(context, lhVar, i);
        Intent intentC = this.e.c(context, uri, uriB, z, bundle, j);
        cqjy cqjyVar = this.j;
        if (cqjyVar.m != -2) {
            try {
                PendingIntent.getBroadcast(context, 0, intentC, crag.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS)).send(context, cqjyVar.m, new Intent());
                return;
            } catch (PendingIntent.CanceledException e) {
                a.s("Not able to force MMS send result status", e);
            }
        }
        ajft ajftVarE = ((ajhd) this.f.b()).e();
        if ((lhVar instanceof lz) && ajftVarE != null) {
            ajftVarE.c(1, uriB);
        }
        ky kyVar = this.g;
        intentC.putExtra("mms_api", 1);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intentC, crag.a | VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
        cqbd cqbdVarC = ky.a.c();
        cqbdVarC.I("sending MMS. ");
        cqbdVarC.w(j);
        cqbdVarC.r();
        int iA = la.a(i);
        SmsManager smsManagerForSubscriptionId = SmsManager.getSmsManagerForSubscriptionId(iA);
        if (craf.e) {
            smsManagerForSubscriptionId.sendMultimediaMessage(context, uriB, str, kyVar.a(iA), broadcast, j);
        } else {
            smsManagerForSubscriptionId.sendMultimediaMessage(context, uriB, str, kyVar.a(iA), broadcast);
        }
    }
}
