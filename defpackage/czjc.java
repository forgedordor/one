package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czjc {
    public final eosc a;
    public final rbv b;
    private final Context c;

    public czjc(Context context, eosc eoscVar) {
        this.c = context;
        this.a = eoscVar;
        this.b = raw.c(context);
    }

    public final Uri a(czjb czjbVar) throws IOException {
        Context context = this.c;
        Uri uriD = bxlf.d("jpg", context);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(bxlf.h(uriD, context));
            try {
                czjbVar.a(fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                return uriD;
            } finally {
            }
        } catch (IOException e) {
            bxlf.i(this.c, uriD);
            throw e;
        }
    }
}
