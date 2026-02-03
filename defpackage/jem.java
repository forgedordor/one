package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jem extends fdbr implements fdat {
    final /* synthetic */ jer a;
    final /* synthetic */ fdae b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jem(jer jerVar, fdae fdaeVar) {
        super(2);
        this.a = jerVar;
        this.b = fdaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        boolean z;
        jer jerVar = this.a;
        ijb ijbVar = (ijb) obj;
        ini iniVar = (ini) obj2;
        if (jerVar.t.f()) {
            jerVar.C = ijbVar;
            jerVar.B = iniVar;
            jerVar.ah().d(jerVar, jer.p, this.b);
            z = false;
        } else {
            z = true;
        }
        jerVar.D = z;
        return fctx.a;
    }
}
