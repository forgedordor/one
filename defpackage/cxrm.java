package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxrm implements cxrz {
    final /* synthetic */ String a;
    final /* synthetic */ cxsa b;

    public cxrm(cxsa cxsaVar, String str) {
        this.a = str;
        this.b = cxsaVar;
    }

    @Override // defpackage.cxrz
    public final void a() {
        this.b.t("No pending verification. Skipped.".concat(String.valueOf(this.a)));
    }

    @Override // defpackage.cxrz
    public final void b() {
        this.b.t("Successfully verified: ".concat(String.valueOf(this.a)));
    }
}
