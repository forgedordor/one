package defpackage;

import android.content.Context;
import com.google.android.libraries.glide.fife.module.FifeGlideModule;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rbp {
    public static void a(Context context, raw rawVar, rbn rbnVar, List list, rso rsoVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FifeGlideModule fifeGlideModule = (FifeGlideModule) it.next();
            try {
                rbnVar.j(String.class, InputStream.class, new drfv());
                rbnVar.j(String.class, ByteBuffer.class, new drfu());
                rbnVar.g(drfl.class, ByteBuffer.class, new drfr());
                rbnVar.g(drfl.class, InputStream.class, new drfs());
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(String.valueOf(fifeGlideModule.getClass().getName())), e);
            }
        }
        if (rsoVar != null) {
            rsoVar.d(context, rawVar, rbnVar);
        }
    }
}
