package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drgs extends fbnl {
    public drgq b;
    public final dzrm d;
    public final Object a = new Object();
    public boolean c = false;

    public drgs(dzrm dzrmVar) {
        this.d = dzrmVar;
        dzrmVar.c("application/grpc");
    }

    @Override // defpackage.fbnl
    public final fbnm a() {
        synchronized (this.a) {
            if (this.b != null) {
                return new drgr();
            }
            drgq drgqVar = new drgq(this.d);
            this.b = drgqVar;
            return drgqVar;
        }
    }
}
