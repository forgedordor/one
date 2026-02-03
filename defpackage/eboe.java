package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eboe extends ebmd implements Cloneable {
    protected String a;
    protected String b;

    @Override // defpackage.ebmd
    public final String c() {
        return this.a + "/" + this.b;
    }

    @Override // defpackage.ebmd
    public final Object clone() {
        eboe eboeVar = new eboe();
        String str = this.a;
        if (str != null) {
            eboeVar.a = str;
        }
        String str2 = this.b;
        if (str2 != null) {
            eboeVar.b = str2;
        }
        return eboeVar;
    }
}
