package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebpv extends ebpt {
    @Override // defpackage.ebpt
    public final ebob b() throws ebml {
        try {
            ebod ebodVar = new ebod();
            d(2079);
            ebodVar.b(Integer.parseInt(this.a.d()));
            this.a.h();
            this.a.a(10);
            return ebodVar;
        } catch (IllegalArgumentException e) {
            throw f(e.getMessage());
        }
    }
}
