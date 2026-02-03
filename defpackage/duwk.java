package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duwk implements eora {
    final /* synthetic */ String a;
    final /* synthetic */ ejwi b;

    public duwk(String str, ejwi ejwiVar) {
        this.a = str;
        this.b = ejwiVar;
    }

    @Override // defpackage.eora
    public final /* synthetic */ void b(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            durt.d("%s: Added file group %s with account: %s, variant: %s", "ManifestConfigHelper", this.a, String.valueOf(this.b.f()), "null");
        } else {
            durt.d("%s: Failed to add file group %s with account: %s, variant: %s", "ManifestConfigHelper", this.a, String.valueOf(this.b.f()), "null");
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        durt.k(th, "%s: Failed to add file group %s with account: %s, variant: %s", "ManifestConfigHelper", this.a, String.valueOf(this.b.f()), "null");
    }
}
