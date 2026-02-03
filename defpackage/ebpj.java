package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebpj extends ebpt {
    @Override // defpackage.ebpt
    public final ebob b() throws ebml {
        this.a.a(2088);
        this.a.h();
        this.a.a(58);
        this.a.h();
        ebno ebnoVar = new ebno();
        this.a.h();
        String strC = this.a.c();
        if (strC == null) {
            throw new ebml("Rest is null");
        }
        ebnoVar.b(strC.trim());
        return ebnoVar;
    }
}
