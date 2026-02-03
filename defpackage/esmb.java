package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esmb extends esmq {
    public String a;
    public esmt b;

    @Override // defpackage.esmq
    public final esmu a() {
        String str = this.a;
        if (str != null) {
            return new esmc(str, this.b);
        }
        throw new IllegalStateException("Missing required properties: service");
    }
}
