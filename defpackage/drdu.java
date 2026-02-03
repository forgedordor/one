package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drdu extends drdw {
    private String a;
    private ejwi b = ejud.a;

    @Override // defpackage.drdw
    public final drdx a() {
        String str = this.a;
        if (str != null) {
            return new drdv(str, this.b);
        }
        throw new IllegalStateException("Missing required properties: key");
    }

    @Override // defpackage.drdw
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null key");
        }
        this.a = str;
    }

    @Override // defpackage.drdw
    public final void c(Long l) {
        this.b = ejwi.j(l);
    }
}
