package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xms {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public String e;
    public djmn f;
    public ahat g;
    public final dkep h;

    public xms(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = "";
        this.h = new dkep(str5, "", new fdae() { // from class: xmn
            @Override // defpackage.fdae
            public final Object invoke() {
                xms xmsVar = this.a;
                xmsVar.e = "";
                ahat ahatVar = xmsVar.g;
                if (ahatVar == null) {
                    fdbq.c("popupController");
                    ahatVar = null;
                }
                djmn djmnVar = xmsVar.f;
                djmnVar.getClass();
                ahatVar.b(xmsVar.a(djmnVar));
                return fctx.a;
            }
        }, new fdap() { // from class: xmo
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                String str6 = (String) obj;
                str6.getClass();
                xms xmsVar = this.a;
                xmsVar.e = str6;
                ahat ahatVar = xmsVar.g;
                if (ahatVar == null) {
                    fdbq.c("popupController");
                    ahatVar = null;
                }
                djmn djmnVar = xmsVar.f;
                djmnVar.getClass();
                ahatVar.b(xmsVar.a(djmnVar));
                return fctx.a;
            }
        }, 1);
    }

    public final djmn a(djmn djmnVar) {
        return djmn.b(djmnVar, null, fcva.b(dkep.a(this.h, this.e, null, null, 29)), null, null, null, null, 509);
    }
}
