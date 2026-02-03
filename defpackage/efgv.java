package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class efgv {
    public abstract efgw a();

    public abstract ekfi b();

    public abstract ekfw c();

    public final void d(efhb efhbVar) {
        c().h(efhbVar);
    }

    public final void e(String str, String str2) {
        efha efhaVarD = efhb.d();
        efhaVarD.c("urn:ietf:params:cpim-headers:");
        efhaVarD.b(str);
        efhaVarD.d(str2);
        d(efhaVarD.a());
    }

    public final void f(String str, String str2, String str3) {
        efha efhaVarD = efhb.d();
        efhaVarD.c(str);
        efhaVarD.b(str2);
        efhaVarD.d(str3);
        d(efhaVarD.a());
    }

    public final void g(String str, String str2) {
        b().d(str, str2);
    }
}
