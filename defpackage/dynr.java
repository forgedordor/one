package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dynr {
    static dybn a(dydh dydhVar) {
        dybx dybxVar = new dybx();
        dydm dydmVar = (dydm) dydhVar;
        dybxVar.b = dydmVar.c;
        dybxVar.c = dydmVar.b;
        dybxVar.a = dydmVar.i;
        dybxVar.d = dydmVar.f;
        ejwi ejwiVar = ((dyii) dydmVar.e).a;
        if (ejwiVar == null) {
            throw new NullPointerException("Null deactivatedAccountsFeature");
        }
        dybxVar.e = ejwiVar;
        dybxVar.f = ejud.a;
        return dybxVar.a();
    }
}
