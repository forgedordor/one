package defpackage;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.os.Build;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Objects;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nay implements nav {
    private final UUID a;
    private final MediaDrm b;
    private int c;

    private nay(UUID uuid) {
        mee.b(!maf.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.a = uuid;
        MediaDrm mediaDrm = new MediaDrm(q(uuid));
        this.b = mediaDrm;
        this.c = 1;
        if (maf.d.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    public static nay o(UUID uuid) {
        try {
            return new nay(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new nbc(e);
        } catch (Exception e2) {
            throw new nbc(e2);
        }
    }

    private static UUID q(UUID uuid) {
        return r(uuid) ? maf.b : uuid;
    }

    private static boolean r(UUID uuid) {
        return Build.VERSION.SDK_INT < 27 && Objects.equals(uuid, maf.c);
    }

    @Override // defpackage.nav
    public final int a() {
        return 2;
    }

    @Override // defpackage.nav
    public final /* bridge */ /* synthetic */ mir b(byte[] bArr) {
        return new naw(q(this.a), bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01eb  */
    @Override // defpackage.nav
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.nat c(byte[] r13, java.util.List r14, int r15, java.util.HashMap r16) throws android.media.NotProvisionedException {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nay.c(byte[], java.util.List, int, java.util.HashMap):nat");
    }

    @Override // defpackage.nav
    public final nau d() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new nau(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // defpackage.nav
    public final Map e(byte[] bArr) {
        return this.b.queryKeyStatus(bArr);
    }

    @Override // defpackage.nav
    public final void f(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    @Override // defpackage.nav
    public final void g(byte[] bArr) throws DeniedByServerException {
        this.b.provideProvisionResponse(bArr);
    }

    @Override // defpackage.nav
    public final synchronized void h() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.b.release();
        }
    }

    @Override // defpackage.nav
    public final void i(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }

    @Override // defpackage.nav
    public final void j(byte[] bArr, mwx mwxVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                MediaDrm mediaDrm = this.b;
                LogSessionId logSessionIdA = mwxVar.a();
                if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                    return;
                }
                MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
                mee.f(playbackComponent);
                playbackComponent.setLogSessionId(logSessionIdA);
            } catch (UnsupportedOperationException unused) {
                mff.f("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r0.startsWith("16.0") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r0.equals(defpackage.maf.c) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        r0 = r3.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        return r0.requiresSecureDecoder(r5, r0.getSecurityLevel(r4));
     */
    @Override // defpackage.nav
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(byte[] r4, java.lang.String r5) throws java.lang.Throwable {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L49
            java.util.UUID r0 = r3.a
            java.util.UUID r1 = defpackage.maf.d
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L35
            java.lang.String r0 = r3.p()
            java.lang.String r1 = "v5."
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L49
            java.lang.String r1 = "14."
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L49
            java.lang.String r1 = "15."
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L49
            java.lang.String r1 = "16.0"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L49
            goto L3e
        L35:
            java.util.UUID r1 = defpackage.maf.c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3e
            goto L49
        L3e:
            android.media.MediaDrm r0 = r3.b
            int r4 = defpackage.oc$$ExternalSyntheticApiModelOutline0.m(r0, r4)
            boolean r4 = defpackage.kvh$$ExternalSyntheticApiModelOutline1.m(r0, r5, r4)
            return r4
        L49:
            r0 = 0
            android.media.MediaCrypto r1 = new android.media.MediaCrypto     // Catch: java.lang.Throwable -> L62 android.media.MediaCryptoException -> L64
            java.util.UUID r2 = r3.a     // Catch: java.lang.Throwable -> L62 android.media.MediaCryptoException -> L64
            java.util.UUID r2 = q(r2)     // Catch: java.lang.Throwable -> L62 android.media.MediaCryptoException -> L64
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L62 android.media.MediaCryptoException -> L64
            boolean r4 = r1.requiresSecureDecoderComponent(r5)     // Catch: java.lang.Throwable -> L5d android.media.MediaCryptoException -> L60
            r1.release()
            return r4
        L5d:
            r4 = move-exception
            r0 = r1
            goto L74
        L60:
            r0 = r1
            goto L64
        L62:
            r4 = move-exception
            goto L74
        L64:
            java.util.UUID r4 = r3.a     // Catch: java.lang.Throwable -> L62
            java.util.UUID r5 = defpackage.maf.c     // Catch: java.lang.Throwable -> L62
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L62
            r4 = r4 ^ 1
            if (r0 == 0) goto L73
            r0.release()
        L73:
            return r4
        L74:
            if (r0 == 0) goto L79
            r0.release()
        L79:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nay.k(byte[], java.lang.String):boolean");
    }

    @Override // defpackage.nav
    public final byte[] l() {
        return this.b.openSession();
    }

    @Override // defpackage.nav
    public final byte[] m(byte[] bArr, byte[] bArr2) throws JSONException {
        if (maf.c.equals(this.a) && Build.VERSION.SDK_INT < 27) {
            try {
                JSONObject jSONObject = new JSONObject(mgb.J(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(mzg.a(jSONObject2.getString("k")));
                    sb.append("\",\"kid\":\"");
                    sb.append(mzg.a(jSONObject2.getString("kid")));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = mgb.af(sb.toString());
            } catch (JSONException e) {
                mff.d("ClearKeyUtil", "Failed to adjust response data: ".concat(mgb.J(bArr2)), e);
            }
        }
        return this.b.provideKeyResponse(bArr, bArr2);
    }

    @Override // defpackage.nav
    public final void n(final mzq mzqVar) {
        this.b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: nax
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                mzr mzrVar = mzqVar.a.l;
                mee.f(mzrVar);
                mzrVar.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    public final String p() {
        return this.b.getPropertyString(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION);
    }
}
