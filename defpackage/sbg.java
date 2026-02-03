package defpackage;

import com.android.vcard.VCardBuilder;
import java.io.BufferedOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sbg {
    public static final byte[] a = VCardBuilder.VCARD_END_OF_LINE.getBytes();

    public static final void a(String str, BufferedOutputStream bufferedOutputStream) throws IOException {
        for (int i = 0; i < str.length(); i++) {
            bufferedOutputStream.write(str.charAt(i));
        }
        bufferedOutputStream.write(a);
    }
}
