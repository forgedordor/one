package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwoe extends dwsb {
    public dwsa a;

    @Override // defpackage.dwsb
    public final dwsc a() {
        dwsa dwsaVar = this.a;
        if (dwsaVar != null) {
            return new dwof(dwsaVar);
        }
        throw new IllegalStateException("Missing required properties: content");
    }
}
