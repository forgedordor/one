package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcqh extends fcql {
    private final fcqg d;
    private final fcqg e;
    private final fcqg f;
    private final fcqg g;
    private final int h;

    public fcqh(fcqg fcqgVar, fcqg fcqgVar2, fcqg fcqgVar3, fcqg fcqgVar4, Provider provider, int i) {
        super(provider);
        this.d = fcqgVar;
        this.e = fcqgVar2;
        this.f = fcqgVar3;
        this.g = fcqgVar4;
        this.h = i;
    }

    @Override // defpackage.fcql
    public final String a(SSLSocket sSLSocket) {
        byte[] bArr;
        fcqg fcqgVar = this.f;
        if (fcqgVar.b(sSLSocket) && (bArr = (byte[]) fcqgVar.a(sSLSocket, new Object[0])) != null) {
            return new String(bArr, fcqo.b);
        }
        return null;
    }

    @Override // defpackage.fcql
    public final void b(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (str != null) {
            this.d.c(sSLSocket, true);
            this.e.c(sSLSocket, str);
        }
        fcqg fcqgVar = this.g;
        if (fcqgVar.b(sSLSocket)) {
            fcqgVar.a(sSLSocket, e(list));
        }
    }

    @Override // defpackage.fcql
    public final int c() {
        return this.h;
    }
}
