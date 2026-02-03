package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class eabu extends eabz {
    private volatile double d;

    public eabu(String str, eadc eadcVar) {
        super("com.google.android.libraries.user.profile.photopicker", str, eadcVar);
    }

    @Override // defpackage.eabc
    protected final /* synthetic */ Object a(Object obj) {
        return (Double) obj;
    }

    @Override // defpackage.eabc
    protected final /* bridge */ /* synthetic */ Object b(String str) {
        return Double.valueOf(Double.parseDouble(str));
    }

    @Override // defpackage.eabm
    public final /* bridge */ /* synthetic */ Object h() {
        return Double.valueOf(this.d);
    }

    @Override // defpackage.eabm
    public final /* bridge */ /* synthetic */ void i(Object obj) {
        this.d = ((Double) obj).doubleValue();
    }
}
