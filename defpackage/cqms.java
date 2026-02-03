package defpackage;

import android.content.Context;
import android.net.Uri;
import android.system.ErrnoException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqms {
    private final Context a;

    public cqms(Context context) {
        context.getClass();
        this.a = context;
    }

    public final InputStream a(Uri uri) throws IOException, ErrnoException {
        String str;
        ebsu ebsuVarA;
        uri.getClass();
        if (cqmu.a(uri)) {
            String string = uri.toString();
            string.getClass();
            if (fdgn.G(string, "content://mms", false)) {
                str = "com.android.providers.telephony";
            } else {
                String string2 = uri.toString();
                string2.getClass();
                if (fdgn.G(string2, "contacts", false)) {
                    str = "com.android.providers.contacts";
                } else {
                    String string3 = uri.toString();
                    string3.getClass();
                    str = fdgn.G(string3, "content://com.google.android.gms.people.gal.provider/people_photo", false) ? "com.google.android.gms" : "com.android.providers.";
                }
            }
            ebsuVarA = ebsu.a(str);
        } else {
            ebsuVarA = ebsu.c;
        }
        InputStream inputStreamB = ebsv.b(this.a, uri, ebsuVarA);
        inputStreamB.getClass();
        return inputStreamB;
    }
}
