package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpqp {
    private final fcsu a;
    private final appa b;
    private final aukj c;

    public cpqp(fcsu fcsuVar, appa appaVar, aukj aukjVar) {
        this.c = aukjVar;
        this.a = fcsuVar;
        this.b = appaVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [evuh, java.lang.Object] */
    private static evuh b(evqs evqsVar, evuh evuhVar) {
        try {
            return evuhVar.getParserForType().f(evqsVar);
        } catch (evtj e) {
            throw new cpqo(e, "Unable to parse ".concat(String.valueOf(evuhVar.getClass().getName())));
        }
    }

    public final evuh a(epkh epkhVar, evuh evuhVar) {
        byte[] bArrA;
        try {
            eieu eieuVarK = eiiy.k("CmsDecryptor#decrypt");
            try {
                int i = epkhVar.c;
                if (i == -1) {
                    evuh evuhVarB = b(epkhVar.b, evuhVar);
                    eieuVarK.close();
                    return evuhVarB;
                }
                byte[] bArr = (byte[]) this.c.get(Integer.valueOf(i));
                if (bArr == null) {
                    throw new cpqm(a.g(i, "Failed to get encryption key at keyIndex "));
                }
                byte[] bArrI = epkhVar.b.I();
                try {
                    bArrA = cpob.a(bArrI, bArr);
                    e = null;
                } catch (GeneralSecurityException e) {
                    e = e;
                    if (!this.b.a()) {
                        throw e;
                    }
                    bArrA = cpob.a(bArrI, new byte[bArr.length]);
                }
                evuh evuhVarB2 = b(evqs.x(bArrA), evuhVar);
                if (this.b.a() && e != null) {
                    ((aill) this.a.b()).f("Bugle.Cms.Cloudstore.ZeroKeyFallback", 1);
                    throw new cpql(e, evuhVarB2);
                }
                eieuVarK.close();
                return evuhVarB2;
            } catch (Throwable th) {
                try {
                    eieuVarK.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (cpyv e2) {
            throw e2;
        } catch (Exception e3) {
            throw new cpqn(e3, "Unable to decrypt ".concat(String.valueOf(evuhVar.getClass().getName())));
        }
    }
}
