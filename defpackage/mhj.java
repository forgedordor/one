package defpackage;

import android.net.Uri;
import android.util.Base64;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import j$.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mhj extends mhf {
    private mht a;
    private byte[] b;
    private int c;
    private int d;

    public mhj() {
        super(false);
    }

    @Override // defpackage.mah
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.d;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.b;
        String str = mgb.a;
        System.arraycopy(bArr2, this.c, bArr, i, iMin);
        this.c += iMin;
        this.d -= iMin;
        g(iMin);
        return iMin;
    }

    @Override // defpackage.mhl
    public final long b(mht mhtVar) throws mhp, mby {
        j();
        this.a = mhtVar;
        Uri uriNormalizeScheme = mhtVar.a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        mee.b(GroupManagementRequest.DATA_TAG.equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String[] strArrAh = mgb.ah(uriNormalizeScheme.getSchemeSpecificPart(), ",");
        if (strArrAh.length != 2) {
            throw new mby("Unexpected URI format: ".concat(String.valueOf(String.valueOf(uriNormalizeScheme))), null, true, 0);
        }
        String str = strArrAh[1];
        if (strArrAh[0].contains(";base64")) {
            try {
                this.b = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw new mby("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e, true, 0);
            }
        } else {
            this.b = mgb.af(URLDecoder.decode(str, StandardCharsets.US_ASCII.name()));
        }
        long j = mhtVar.e;
        int length = this.b.length;
        if (j > length) {
            this.b = null;
            throw new mhp(2008);
        }
        int i = (int) j;
        this.c = i;
        this.d = length - i;
        long j2 = mhtVar.f;
        i(mhtVar);
        return this.d;
    }

    @Override // defpackage.mhl
    public final Uri c() {
        mht mhtVar = this.a;
        if (mhtVar != null) {
            return mhtVar.a;
        }
        return null;
    }

    @Override // defpackage.mhl
    public final void d() {
        if (this.b != null) {
            this.b = null;
            h();
        }
        this.a = null;
    }
}
