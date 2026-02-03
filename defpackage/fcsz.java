package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcsz implements Serializable, fctc {
    private final Object a;

    public fcsz(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.fctc
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.fctc
    public final boolean b() {
        return true;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
