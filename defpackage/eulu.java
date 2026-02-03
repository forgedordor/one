package defpackage;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eulu {
    @Deprecated
    public static ekgb a(eugm eugmVar) {
        try {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            Iterator<E> it = eugmVar.c.iterator();
            while (it.hasNext()) {
                byte[] bArrDecode = Base64.decode((String) it.next(), 0);
                evrr evrrVar = evrr.a;
                evuq evuqVar = evuq.a;
                ekfwVar.h((dbbu) evsn.parseFrom(dbbu.a, bArrDecode, evrr.a));
            }
            return ekfwVar.g();
        } catch (evtj e) {
            throw new IllegalStateException("Invalid model data.", e);
        }
    }

    public static String b(ParcelFileDescriptor parcelFileDescriptor) {
        return ((Uri) ecfj.a(parcelFileDescriptor).first).toString();
    }
}
