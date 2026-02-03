package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lys extends lyp {
    public lys() {
        this((byte[]) null);
    }

    @Override // defpackage.lyp
    public final Object a(lyo lyoVar) {
        return this.b.get(lyoVar);
    }

    public final void b(lyo lyoVar, Object obj) {
        this.b.put(lyoVar, obj);
    }

    public lys(lyp lypVar) {
        lypVar.getClass();
        this.b.putAll(lypVar.b);
    }

    public /* synthetic */ lys(byte[] bArr) {
        this(lyn.a);
    }
}
