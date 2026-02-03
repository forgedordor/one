package defpackage;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class echj implements ecer {
    @Override // defpackage.ecer
    public final /* bridge */ /* synthetic */ Object a(eceq eceqVar) throws FileNotFoundException {
        ArrayDeque arrayDeque = new ArrayDeque();
        Uri uriBuild = eceqVar.e.buildUpon().fragment(null).build();
        ecev ecevVar = eceqVar.a;
        ekis.o(arrayDeque, ecevVar.b(uriBuild));
        long jA = 0;
        while (!arrayDeque.isEmpty()) {
            Uri uri = (Uri) arrayDeque.remove();
            if (ecevVar.i(uri)) {
                ekis.o(arrayDeque, ecevVar.b(uri));
            } else {
                if (!ecevVar.h(uri)) {
                    throw new FileNotFoundException(String.format("Child %s could not be opened", uri));
                }
                jA += ecevVar.a(uri);
            }
        }
        return Long.valueOf(jA);
    }
}
