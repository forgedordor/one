package defpackage;

import android.content.Context;
import android.util.Base64;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dutz {
    public static dtrw a(String str) throws duty {
        try {
            return (dtrw) duuj.b(str, dtrw.a.getParserForType());
        } catch (evtj | NullPointerException e) {
            throw new duty("Failed to deserialize key:".concat(String.valueOf(str)), e);
        }
    }

    public static File b(Context context, ejwi ejwiVar) {
        String strConcat = "gms_icing_mdd_garbage_file";
        if (ejwiVar != null && ejwiVar.g()) {
            strConcat = "gms_icing_mdd_garbage_file".concat((String) ejwiVar.c());
        }
        return new File(context.getFilesDir(), strConcat);
    }

    public static String c(dtrw dtrwVar) {
        return Base64.encodeToString(dtrwVar.toByteArray(), 3);
    }
}
