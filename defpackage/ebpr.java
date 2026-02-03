package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebpr extends ebpt {
    @Override // defpackage.ebpt
    public final ebob b() throws ebml {
        ebny ebnyVar = new ebny();
        this.a.a(2090);
        this.a.h();
        this.a.a(58);
        this.a.h();
        String strF = this.a.f();
        this.a.a(10);
        try {
            ebnyVar.e(Integer.parseInt(strF));
            return ebnyVar;
        } catch (NumberFormatException unused) {
            throw f("bad integer format");
        }
    }
}
