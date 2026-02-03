package org.chromium.net;

import android.os.ParcelFileDescriptor;
import defpackage.fgae;
import defpackage.fgaf;
import defpackage.fgag;
import defpackage.fgai;
import defpackage.fgaj;
import java.io.File;
import java.nio.ByteBuffer;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new fgai(new fgaf(parcelFileDescriptor));
    }

    public static UploadDataProvider create(File file) {
        return new fgai(new fgae(file));
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new fgag(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr) {
        return fgaj.a(bArr, 0, bArr.length);
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return fgaj.a(bArr, i, i2);
    }
}
