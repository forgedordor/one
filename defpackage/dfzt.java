package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfzt {
    public static ebmr a(dfzs dfzsVar, dgis dgisVar) {
        String strV = dfzsVar.b().hasTransport(0) ? dgisVar.v() : dgisVar.A();
        return "SIPoUDP".equals(strV) ? ebmr.UDP : "SIPoTLS".equals(strV) ? ebmr.TLS : ebmr.TCP;
    }
}
