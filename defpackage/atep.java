package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atep {
    public static final ContentType a(cbqz cbqzVar) {
        cbqzVar.getClass();
        if (arad.a() && cbqzVar.e()) {
            return auby.d(cche.b);
        }
        ContentType contentType = bvug.a;
        contentType.getClass();
        return contentType;
    }

    public static final String b(cbqz cbqzVar) {
        cbqzVar.getClass();
        if (!arad.a() || !cbqzVar.e()) {
            return "encrypted_file";
        }
        String string = UUID.randomUUID().toString();
        string.getClass();
        String strSubstring = string.substring(0, 8);
        strSubstring.getClass();
        return strSubstring;
    }
}
