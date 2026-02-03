package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvij extends dviu {
    public int a;

    @Override // defpackage.dviu
    public final dviv a() {
        int i = this.a;
        if (i != 0) {
            return new dvik(i);
        }
        throw new IllegalStateException("Missing required properties: status");
    }
}
