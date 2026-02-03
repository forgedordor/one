package defpackage;

import android.content.res.AssetFileDescriptor;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euhk extends AssetFileDescriptor implements Closeable {
    private euhk() {
        super(null, 0L, 0L);
    }

    public static euhk a(AssetFileDescriptor assetFileDescriptor) {
        if (assetFileDescriptor == null) {
            return null;
        }
        return new euhk(assetFileDescriptor);
    }

    private euhk(AssetFileDescriptor assetFileDescriptor) {
        super(assetFileDescriptor.getParcelFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }
}
