package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabase;
import java.io.File;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dewd extends dewf {
    public final int a;
    private final BusinessInfoDatabase e;
    private final dgfu f;

    public dewd(String str, Context context, int i, BusinessInfoDatabase businessInfoDatabase, dgfu dgfuVar) {
        super(str, context, !TextUtils.isEmpty(businessInfoDatabase.getLocalMediaPath(str, i)) ? dewi.INFO_LOCALLY_AVAILABLE : dewi.AVAILABILITY_UNKNOWN);
        this.e = businessInfoDatabase;
        this.a = i;
        this.f = dgfuVar;
    }

    private static final void g(File file) {
        dhja.k("Deleting business media temp file %s", dhja.a(file));
        if (file.delete()) {
            return;
        }
        dhja.g("Unable to delete temporary business media file %s", dhja.a(file));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008c A[Catch: all -> 0x00cc, PHI: r0
      0x008c: PHI (r0v12 dewi) = (r0v10 dewi), (r0v15 dewi) binds: [B:20:0x00b3, B:14:0x008a] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00cc, blocks: (B:5:0x0016, B:15:0x008c, B:34:0x00cb, B:33:0x00c8, B:6:0x001a, B:13:0x0087, B:19:0x00b0, B:27:0x00bf, B:26:0x00bc, B:7:0x0027, B:9:0x002d, B:10:0x0031, B:12:0x006c, B:18:0x0095, B:23:0x00b7, B:30:0x00c3), top: B:46:0x0016, inners: #0, #2 }] */
    @Override // defpackage.dewf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final defpackage.dewi a(javax.net.ssl.HttpsURLConnection r14) throws java.io.IOException {
        /*
            r13 = this;
            dgfu r0 = r13.f
            j$.util.Optional r1 = defpackage.dfhq.d(r0)
            boolean r2 = r1.isEmpty()
            r3 = 1
            r4 = 0
            if (r2 != 0) goto Ld3
            java.lang.Object r1 = r1.get()
            r2 = 20480(0x5000, float:2.8699E-41)
            byte[] r2 = new byte[r2]
            java.io.InputStream r14 = r14.getInputStream()     // Catch: java.lang.Throwable -> Lcc
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> Lc0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lc0
            r7 = r1
            java.io.File r7 = (java.io.File) r7     // Catch: java.lang.Throwable -> Lc0
            r6.<init>(r7, r3)     // Catch: java.lang.Throwable -> Lc0
            r5.<init>(r6)     // Catch: java.lang.Throwable -> Lc0
        L27:
            int r6 = r14.read(r2)     // Catch: java.lang.Throwable -> Lb6
            if (r6 < 0) goto L31
            r5.write(r2, r4, r6)     // Catch: java.lang.Throwable -> Lb6
            goto L27
        L31:
            android.content.Context r2 = r13.c     // Catch: java.lang.Throwable -> Lb6
            android.content.res.Resources r6 = r2.getResources()     // Catch: java.lang.Throwable -> Lb6
            android.content.res.Configuration r6 = r6.getConfiguration()     // Catch: java.lang.Throwable -> Lb6
            lah r6 = defpackage.lad.a(r6)     // Catch: java.lang.Throwable -> Lb6
            java.util.Locale r6 = r6.f(r4)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r7 = "%s_%d"
            java.lang.String r8 = r13.b     // Catch: java.lang.Throwable -> Lb6
            int r9 = r13.a     // Catch: java.lang.Throwable -> Lb6
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> Lb6
            r11 = 2
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> Lb6
            r12[r4] = r8     // Catch: java.lang.Throwable -> Lb6
            r12[r3] = r10     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r6 = java.lang.String.format(r6, r7, r12)     // Catch: java.lang.Throwable -> Lb6
            r7 = r1
            java.io.File r7 = (java.io.File) r7     // Catch: java.lang.Throwable -> Lb6
            android.net.Uri r0 = defpackage.dfhq.b(r2, r6, r7, r0)     // Catch: java.lang.Throwable -> Lb6
            com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabase r2 = r13.e     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Throwable -> Lb6
            boolean r2 = r2.updateLocalUri(r8, r6, r9)     // Catch: java.lang.Throwable -> Lb6
            r6 = 3
            if (r2 == 0) goto L95
            java.lang.String r2 = "Business info updated for botId %s saved in %s for media type %d"
            java.lang.String r7 = defpackage.dhja.a(r8)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r0 = defpackage.dhja.a(r0)     // Catch: java.lang.Throwable -> Lb6
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Lb6
            r6[r4] = r7     // Catch: java.lang.Throwable -> Lb6
            r6[r3] = r0     // Catch: java.lang.Throwable -> Lb6
            r6[r11] = r10     // Catch: java.lang.Throwable -> Lb6
            defpackage.dhja.k(r2, r6)     // Catch: java.lang.Throwable -> Lb6
            dewi r0 = defpackage.dewi.INFO_LOCALLY_AVAILABLE     // Catch: java.lang.Throwable -> Lb6
            r5.close()     // Catch: java.lang.Throwable -> Lc0
            if (r14 == 0) goto L8f
        L8c:
            r14.close()     // Catch: java.lang.Throwable -> Lcc
        L8f:
            java.io.File r1 = (java.io.File) r1
            g(r1)
            return r0
        L95:
            java.lang.String r2 = "Business info update failed for botId %s saved in %s for media type %d"
            java.lang.String r7 = defpackage.dhja.a(r8)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r0 = defpackage.dhja.a(r0)     // Catch: java.lang.Throwable -> Lb6
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Lb6
            r6[r4] = r7     // Catch: java.lang.Throwable -> Lb6
            r6[r3] = r0     // Catch: java.lang.Throwable -> Lb6
            r6[r11] = r10     // Catch: java.lang.Throwable -> Lb6
            defpackage.dhja.g(r2, r6)     // Catch: java.lang.Throwable -> Lb6
            dewi r0 = defpackage.dewi.CLIENT_ERROR     // Catch: java.lang.Throwable -> Lb6
            r5.close()     // Catch: java.lang.Throwable -> Lc0
            if (r14 == 0) goto L8f
            goto L8c
        Lb6:
            r0 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> Lbb
            goto Lbf
        Lbb:
            r2 = move-exception
            r0.addSuppressed(r2)     // Catch: java.lang.Throwable -> Lc0
        Lbf:
            throw r0     // Catch: java.lang.Throwable -> Lc0
        Lc0:
            r0 = move-exception
            if (r14 == 0) goto Lcb
            r14.close()     // Catch: java.lang.Throwable -> Lc7
            goto Lcb
        Lc7:
            r14 = move-exception
            r0.addSuppressed(r14)     // Catch: java.lang.Throwable -> Lcc
        Lcb:
            throw r0     // Catch: java.lang.Throwable -> Lcc
        Lcc:
            r14 = move-exception
            java.io.File r1 = (java.io.File) r1
            g(r1)
            throw r14
        Ld3:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r0 = r13.b
            java.lang.String r0 = defpackage.dhja.a(r0)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r4] = r0
            java.lang.String r0 = "Unable to obtain temporary business media file for %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dewd.a(javax.net.ssl.HttpsURLConnection):dewi");
    }

    @Override // defpackage.dewf
    public final String b() {
        return String.format(lad.a(this.c.getResources().getConfiguration()).f(0), "%s_%d", this.b, Integer.valueOf(this.a));
    }

    @Override // defpackage.dewf
    public final String c() {
        return this.e.getRemoteMediaPath(this.b, this.a);
    }

    @Override // defpackage.dewf
    protected final boolean e() {
        return false;
    }

    @Override // defpackage.dewf
    protected final void d(HttpsURLConnection httpsURLConnection) {
    }
}
