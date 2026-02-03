package defpackage;

import java.net.URI;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqdt {
    public static final eqdw a(String str) {
        if (fdgn.H(str)) {
            return eqdu.a;
        }
        URI uriCreate = URI.create(str);
        uriCreate.getClass();
        return new eqdv(uriCreate);
    }
}
