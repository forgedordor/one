package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebjn extends ebjw {
    public final int a;
    public final String b;

    public ebjn(String str, int i, String str2) {
        super(str);
        this.a = i;
        this.b = str2;
    }

    static ebjn a(ebjw ebjwVar, int i, String str) throws ebjd {
        String strF = ebjwVar.f();
        String strD = ebjwVar.d();
        if (strF == null || strD == null) {
            throw new ebjd("Can't build a response for a message without to & from headers");
        }
        ebjn ebjnVar = new ebjn(ebjwVar.d, i, str);
        ebjnVar.g("To-Path", strD);
        ebjnVar.g("From-Path", strF);
        return ebjnVar;
    }
}
