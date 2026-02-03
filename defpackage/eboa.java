package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eboa extends ebnk {
    static {
        new eboa();
    }

    public eboa() {
        super("From");
    }

    public final void e(String str) {
        super.k("tag", str);
    }

    @Override // defpackage.ebnk, defpackage.ebog, defpackage.ebob
    public final boolean equals(Object obj) {
        if (obj == null || this.a == null) {
            return false;
        }
        if (obj.getClass().equals(getClass())) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // defpackage.ebnk, defpackage.ebog, defpackage.ebob
    public final int hashCode() {
        return 5678;
    }
}
