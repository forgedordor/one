package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eydf implements eyde {
    private final eycc a;

    public eydf(eycc eyccVar) {
        this.a = eyccVar;
    }

    @Override // defpackage.eyde
    public final eycv a(String str, eycb eycbVar, eydb eydbVar) {
        return new eyct(str, "PUT", null, eycbVar, null, this.a, eydbVar, true);
    }

    @Override // defpackage.eyde
    public final eycv b(String str, eyce eyceVar, eycb eycbVar, String str2, eydb eydbVar) {
        boolean z = true;
        if (!ejuf.e("POST", "put") && !ejuf.e("POST", "post")) {
            z = false;
        }
        ejwl.a(z);
        return (eycbVar.e() == -1 || eycbVar.e() >= eydbVar.b) ? new eyct(str, "POST", eyceVar, eycbVar, str2, this.a, eydbVar, false) : new eycp(str, eyceVar, eycbVar, str2, this.a, eydbVar);
    }
}
