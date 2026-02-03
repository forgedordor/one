package defpackage;

import android.net.Uri;
import android.os.Process;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class echl implements ecer {
    public ecfo[] a;
    private final evuh b;

    public echl(evuh evuhVar) {
        this.b = evuhVar;
    }

    @Override // defpackage.ecer
    public final /* synthetic */ Object a(eceq eceqVar) throws IOException {
        AtomicLong atomicLong = echk.a;
        String str = ".mobstore_tmp-" + Process.myPid() + "-" + Thread.currentThread().getId() + "-" + System.currentTimeMillis() + "-" + echk.a.getAndIncrement();
        Uri uri = eceqVar.f;
        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(str)).build();
        echo echoVar = eceqVar.b;
        List listA = eceqVar.a(echoVar.g(uriBuild));
        ecfo[] ecfoVarArr = this.a;
        if (ecfoVarArr != null) {
            for (int i = 0; i <= 0; i++) {
                ecfoVarArr[i].a(listA);
            }
        }
        try {
            OutputStream outputStream = (OutputStream) listA.get(0);
            try {
                this.b.writeTo(outputStream);
                ecfo[] ecfoVarArr2 = this.a;
                if (ecfoVarArr2 != null) {
                    for (int i2 = 0; i2 <= 0; i2++) {
                        ecfoVarArr2[i2].b();
                    }
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                echoVar.m(uriBuild, uri);
                return null;
            } finally {
            }
        } catch (Exception e) {
            try {
                eceqVar.b.l(uriBuild);
            } catch (FileNotFoundException unused) {
            }
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            throw new IOException(e);
        }
    }
}
