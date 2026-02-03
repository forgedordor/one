package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes4.dex */
class eabs extends eabz {
    private final eabn d;
    private volatile Object e;

    public eabs(String str, String str2, eadc eadcVar, eabn eabnVar) {
        super(str, str2, eadcVar);
        this.d = eabnVar;
    }

    @Override // defpackage.eabc
    protected final Object a(Object obj) {
        return this.d.a((byte[]) obj);
    }

    @Override // defpackage.eabc
    protected final Object b(String str) {
        return this.d.a(Base64.decode(str, 3));
    }

    @Override // defpackage.eabm
    public final Object h() {
        return this.e;
    }

    @Override // defpackage.eabm
    public final void i(Object obj) {
        this.e = obj;
    }
}
