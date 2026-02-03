package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaob extends eapq {
    public String a;
    public String b;
    public String c;

    @Override // defpackage.eapq
    public final eapr a() {
        String str = this.a;
        if (str != null) {
            return new eaqa(str, this.b, this.c);
        }
        throw new IllegalStateException("Missing required properties: name");
    }
}
