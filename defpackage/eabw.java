package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class eabw extends eabz {
    private volatile long d;

    public eabw(String str, String str2, eadc eadcVar) {
        super(str, str2, eadcVar);
    }

    @Override // defpackage.eabc
    protected final /* synthetic */ Object a(Object obj) {
        return (Long) obj;
    }

    @Override // defpackage.eabc
    protected final /* bridge */ /* synthetic */ Object b(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    @Override // defpackage.eabm
    public final /* bridge */ /* synthetic */ Object h() {
        return Long.valueOf(this.d);
    }

    @Override // defpackage.eabm
    public final /* bridge */ /* synthetic */ void i(Object obj) {
        this.d = ((Long) obj).longValue();
    }
}
