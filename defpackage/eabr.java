package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eabr extends eabs {
    private volatile boolean d;
    private Object e;

    public eabr(String str, String str2, eadc eadcVar, eabn eabnVar, String str3) {
        super(str, str2, eadcVar, eabnVar);
        this.e = str3;
        this.d = true;
    }

    @Override // defpackage.eabc
    public final Object d() {
        if (this.d) {
            synchronized (this) {
                if (this.d) {
                    Object objGY = gY((String) this.e);
                    objGY.getClass();
                    this.e = objGY;
                    this.d = false;
                }
            }
        }
        return this.e;
    }
}
