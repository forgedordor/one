package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mhe extends mhf {
    private final AssetManager a;
    private Uri b;
    private InputStream c;
    private long d;
    private boolean e;

    public mhe(Context context) {
        super(false);
        this.a = context.getAssets();
    }

    @Override // defpackage.mah
    public final int a(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.d;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new mhd(e, 2000);
            }
        }
        InputStream inputStream = this.c;
        String str = mgb.a;
        int i3 = inputStream.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        long j2 = this.d;
        if (j2 != -1) {
            this.d = j2 - i3;
        }
        g(i3);
        return i3;
    }

    @Override // defpackage.mhl
    public final long b(mht mhtVar) throws IOException {
        try {
            Uri uri = mhtVar.a;
            this.b = uri;
            String path = uri.getPath();
            mee.f(path);
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            j();
            InputStream inputStreamOpen = this.a.open(path, 1);
            this.c = inputStreamOpen;
            long j = mhtVar.e;
            if (inputStreamOpen.skip(j) < j) {
                throw new mhd(null, 2008);
            }
            long j2 = mhtVar.f;
            long jAvailable = this.c.available();
            this.d = jAvailable;
            if (jAvailable == 2147483647L) {
                this.d = -1L;
            }
            this.e = true;
            i(mhtVar);
            return this.d;
        } catch (mhd e) {
            throw e;
        } catch (IOException e2) {
            throw new mhd(e2, true != (e2 instanceof FileNotFoundException) ? 2000 : 2005);
        }
    }

    @Override // defpackage.mhl
    public final Uri c() {
        return this.b;
    }

    @Override // defpackage.mhl
    public final void d() {
        this.b = null;
        try {
            try {
                InputStream inputStream = this.c;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.c = null;
                if (this.e) {
                    this.e = false;
                    h();
                }
            } catch (IOException e) {
                throw new mhd(e, 2000);
            }
        } catch (Throwable th) {
            this.c = null;
            if (this.e) {
                this.e = false;
                h();
            }
            throw th;
        }
    }
}
