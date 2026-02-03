package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eddo {
    public final eddr a;

    public eddo(eddr eddrVar) {
        this.a = eddrVar;
    }

    public final Bitmap a(Uri uri) {
        DataInputStream dataInputStream = new DataInputStream(ebsv.b(this.a.a, uri, ebsu.c));
        try {
            byte[] bArr = new byte[dataInputStream.readInt()];
            int i = dataInputStream.readInt();
            int i2 = dataInputStream.readInt();
            Bitmap.Config configValueOf = Bitmap.Config.valueOf(dataInputStream.readUTF());
            dataInputStream.read(bArr);
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, configValueOf);
            bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferWrap);
            dataInputStream.close();
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(Bitmap bitmap, Uri uri) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
        bitmap.copyPixelsToBuffer(byteBufferAllocate);
        byte[] bArrArray = byteBufferAllocate.array();
        DataOutputStream dataOutputStream = new DataOutputStream(this.a.a(uri));
        try {
            dataOutputStream.writeInt(bArrArray.length);
            dataOutputStream.writeInt(bitmap.getWidth());
            dataOutputStream.writeInt(bitmap.getHeight());
            dataOutputStream.writeUTF(bitmap.getConfig().toString());
            dataOutputStream.write(bArrArray);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
