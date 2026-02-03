package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebpi extends ebpt {
    @Override // defpackage.ebpt
    public final ebob b() throws ebml {
        try {
            ebnn ebnnVar = new ebnn();
            this.a.a(2094);
            this.a.h();
            this.a.a(58);
            this.a.h();
            ebnnVar.g(Integer.parseInt(this.a.d()));
            this.a.h();
            ebnnVar.f(g());
            this.a.h();
            this.a.a(10);
            return ebnnVar;
        } catch (NumberFormatException unused) {
            throw f("Number format exception");
        }
    }
}
