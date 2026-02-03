package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class cjtv implements egps<evwl<cjtu>, Void> {
    final /* synthetic */ cqce a;

    public cjtv(cqce cqceVar) {
        this.a = cqceVar;
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        this.a.m("Successfully stored PhoneNumberRecord");
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
        this.a.r(String.format("Error while trying to store PhoneNumberRecord, Failure: %s", th.getMessage()));
    }

    @Override // defpackage.egps
    public final /* synthetic */ void b(Object obj) {
    }
}
