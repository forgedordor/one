package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgng extends fgnm implements Cloneable, Serializable, fgni {
    private static final long serialVersionUID = 2852608688135209575L;

    public fgng() {
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }

    public fgng(fgmz fgmzVar) {
        super(0L, fgoi.O(fgmzVar));
    }
}
