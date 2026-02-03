package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebqe extends ebpt {
    @Override // defpackage.ebpt
    public final ebob b() throws ebml {
        this.a.a(2118);
        this.a.h();
        this.a.a(58);
        this.a.h();
        this.a.h();
        String strC = this.a.c();
        if (strC != null) {
            return new ebop(strC.trim());
        }
        throw new ebml("Rest is null");
    }
}
