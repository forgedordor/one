package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebpq extends ebpw {
    @Override // defpackage.ebpt
    public final ebob b() throws ebml {
        try {
            d(2111);
            this.a.h();
            ebnx ebnxVar = new ebnx();
            this.a.a(4095);
            String str = this.a.e.a;
            if (str == null) {
                throw new IllegalArgumentException("The eventType must not be null");
            }
            ebnxVar.a = str;
            super.c(ebnxVar);
            this.a.h();
            this.a.a(10);
            return ebnxVar;
        } catch (ebml e) {
            throw f(e.getMessage());
        }
    }
}
