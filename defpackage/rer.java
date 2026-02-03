package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rer {
    public static int a(List list, InputStream inputStream, rig rigVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new rpg(inputStream, rigVar);
        }
        inputStream.mark(5242880);
        return b(list, new rej(inputStream, rigVar));
    }

    public static int b(List list, rep repVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iA = repVar.a((ImageHeaderParser) list.get(i));
            if (iA != -1) {
                return iA;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType c(List list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : e(list, new reg(byteBuffer));
    }

    public static ImageHeaderParser.ImageType d(List list, InputStream inputStream, rig rigVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new rpg(inputStream, rigVar);
        }
        inputStream.mark(5242880);
        return e(list, new ref(inputStream));
    }

    public static ImageHeaderParser.ImageType e(List list, req reqVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType imageTypeA = reqVar.a((ImageHeaderParser) list.get(i));
            if (imageTypeA != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeA;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static boolean f(List list, reo reoVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (reoVar.a((ImageHeaderParser) list.get(i))) {
                return true;
            }
        }
        return false;
    }
}
