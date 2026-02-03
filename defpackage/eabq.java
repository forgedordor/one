package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class eabq extends eabz {
    private volatile boolean d;

    public eabq(String str, String str2, eadc eadcVar) {
        super(str, str2, eadcVar);
    }

    @Override // defpackage.eabc
    protected final /* synthetic */ Object a(Object obj) {
        return (Boolean) obj;
    }

    @Override // defpackage.eabc
    protected final /* bridge */ /* synthetic */ Object b(String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    @Override // defpackage.eabm
    public final /* bridge */ /* synthetic */ Object h() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.eabm
    public final /* bridge */ /* synthetic */ void i(Object obj) {
        this.d = ((Boolean) obj).booleanValue();
    }
}
