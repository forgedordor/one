package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mib extends mhf implements mhl {
    private final String a;
    private final mii b;
    private final mii c;
    private mht d;
    private HttpURLConnection e;
    private InputStream f;
    private boolean g;
    private int h;
    private long i;
    private long j;

    public mib(String str, mii miiVar) {
        super(true);
        this.a = str;
        this.b = miiVar;
        this.c = new mii();
    }

    private final void k() {
        HttpURLConnection httpURLConnection = this.e;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                mff.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    @Override // defpackage.mah
    public final int a(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.i;
            if (j != -1) {
                long j2 = j - this.j;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.f;
            String str = mgb.a;
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 == -1) {
                return -1;
            }
            this.j += i3;
            g(i3);
            return i3;
        } catch (IOException e) {
            String str2 = mgb.a;
            throw mif.a(e, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bf  */
    @Override // defpackage.mhl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(defpackage.mht r27) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mib.b(mht):long");
    }

    @Override // defpackage.mhl
    public final Uri c() {
        HttpURLConnection httpURLConnection = this.e;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        mht mhtVar = this.d;
        if (mhtVar != null) {
            return mhtVar.a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mhl
    public final void d() {
        try {
            InputStream inputStream = this.f;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    String str = mgb.a;
                    throw new mif(e, 2000, 3);
                }
            }
        } finally {
            this.f = null;
            k();
            if (this.g) {
                this.g = false;
                h();
            }
            this.e = null;
            this.d = null;
        }
    }

    @Override // defpackage.mhf, defpackage.mhl
    public final Map e() {
        HttpURLConnection httpURLConnection = this.e;
        return httpURLConnection == null ? ekoj.a : new mia(httpURLConnection.getHeaderFields());
    }
}
