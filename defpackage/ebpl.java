package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebpl extends ebpt {
    @Override // defpackage.ebpt
    public final ebob b() throws ebml {
        this.a.a(2116);
        this.a.h();
        this.a.a(58);
        this.a.h();
        this.a.h();
        String strC = this.a.c();
        if (strC != null) {
            return new ebnq(strC.trim());
        }
        throw new ebml("Rest is null");
    }
}
