package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmoq {
    private static final ekrg d = ekrg.c("com/google/android/apps/messaging/shared/sms/MmsDebugUtils");
    public final Context a;
    public final cogw b;
    public final cqjy c;
    private final crqv e;

    public cmoq(Context context, cogw cogwVar, crqv crqvVar, cqjy cqjyVar) {
        this.a = context;
        this.b = cogwVar;
        this.e = crqvVar;
        this.c = cqjyVar;
    }

    public static lx a(byte[] bArr) throws cmor {
        lh lhVarA = null;
        if (bArr != null) {
            try {
                lhVarA = new ls(bArr, true).a();
            } catch (RuntimeException e) {
                ekrw ekrwVarE = d.e();
                ekrwVarE.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarE).g(e)).h("com/google/android/apps/messaging/shared/sms/MmsDebugUtils", "parsePduForAnyCarrier", 'g', "MmsDebugUtils.java")).q("parsePduForAnyCarrier: Failed to parse PDU with content disposition");
            }
            if (lhVarA == null) {
                try {
                    lhVarA = new ls(bArr, false).a();
                } catch (RuntimeException e2) {
                    ekrw ekrwVarE2 = d.e();
                    ekrwVarE2.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarE2).g(e2)).h("com/google/android/apps/messaging/shared/sms/MmsDebugUtils", "parsePduForAnyCarrier", 'n', "MmsDebugUtils.java")).q("parsePduForAnyCarrier: Failed to parse PDU without content disposition");
                }
            }
        }
        if (lhVarA instanceof lx) {
            return (lx) lhVarA;
        }
        ekrw ekrwVarI = d.i();
        ekrwVarI.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarI).h("com/google/android/apps/messaging/shared/sms/MmsDebugUtils", "receiveFromDumpFile", 121, "MmsDebugUtils.java")).q("receiveFromDumpFile: Parsing retrieved PDU failure");
        throw new cmor(2, "Failed reading dump file");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final File b(String str, ekgb ekgbVar) throws IOException {
        File fileA = this.c.a(str, true, this.a);
        ekrw ekrwVarH = d.h();
        ekrwVarH.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/sms/MmsDebugUtils", "writeDumpFile", 212, "MmsDebugUtils.java")).t("dump mms filename: %s", fileA.getAbsolutePath());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileA);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                try {
                    ekqh it = ekgbVar.iterator();
                    while (it.hasNext()) {
                        bufferedOutputStream.write((byte[]) it.next());
                    }
                    bufferedOutputStream.close();
                    cqjo.a(fileA);
                    fileOutputStream.close();
                    return fileA;
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            ekrw ekrwVarI = d.i();
            ekrwVarI.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/shared/sms/MmsDebugUtils", "writeDumpFile", 221, "MmsDebugUtils.java")).t("dumpPdu: %s", e);
            return fileA;
        }
    }

    public final String c(lh lhVar) {
        String str = null;
        if (lhVar instanceof lx) {
            lx lxVar = (lx) lhVar;
            if (lxVar.k() != null) {
                str = new String(lxVar.k());
            } else if (lxVar.l() != null) {
                str = new String(lxVar.l());
            }
        }
        return (TextUtils.isEmpty(str) ? "" : String.valueOf(str).concat("_")).concat(String.valueOf(this.b.g().toString()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(byte[] r14, defpackage.lh r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmoq.d(byte[], lh):void");
    }

    public final boolean e(int i, int i2) throws Resources.NotFoundException {
        Resources resources = this.a.getResources();
        return this.e.q(resources.getString(i), resources.getBoolean(i2));
    }

    public final boolean f() {
        if (this.c.q()) {
            return e(R.string.dump_mms_pref_key, R.bool.dump_mms_pref_default);
        }
        return false;
    }
}
