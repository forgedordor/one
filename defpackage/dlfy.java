package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlfy implements kfp {
    @Override // defpackage.kfp
    public final kfm a(juo juoVar) {
        juoVar.getClass();
        if (juoVar.a() > 0) {
            String str = juoVar.b;
            if (dlfz.b.matcher(str).matches()) {
                String strB = lbo.a().b(str);
                strB.getClass();
                int iO = fdgn.O(strB, str, 0, false, 6);
                if (iO >= 0) {
                    return new kfm(new juo(strB), new dlfx(iO, juoVar));
                }
                throw new IllegalStateException("Check failed.");
            }
        }
        return new kfm(juoVar, kek.a);
    }
}
