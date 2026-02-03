package defpackage;

import android.os.AsyncTask;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euwq extends AsyncTask {
    final /* synthetic */ euwr a;

    public euwq(euwr euwrVar) {
        this.a = euwrVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        ByteBuffer byteBuffer = (ByteBuffer) objArr[0];
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr, 0, byteBuffer.limit());
        long jLongValue = ((Long) objArr[1]).longValue();
        euwr euwrVar = this.a;
        euwrVar.f.c(bArr, jLongValue);
        Object obj = euwrVar.b;
        synchronized (obj) {
            euwrVar.c--;
            obj.notifyAll();
        }
        return null;
    }
}
