package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtxj extends dtyk {
    public String a;
    public String b;

    @Override // defpackage.dtyk
    public final dtyl a() {
        String str = this.a;
        if (str != null) {
            return new dtxm(str, this.b);
        }
        throw new IllegalStateException("Missing required properties: action");
    }
}
