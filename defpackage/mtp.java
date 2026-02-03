package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mtp {
    public static final mtp a = new mtp(new mto());
    public final ekhx b;
    public final Double c = null;
    public final Double d = null;

    private mtp(mto mtoVar) {
        this.b = mtoVar.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mtp)) {
            return false;
        }
        mtp mtpVar = (mtp) obj;
        if (this.b.equals(mtpVar.b)) {
            Double d = mtpVar.c;
            if (Objects.equals(null, null)) {
                Double d2 = mtpVar.d;
                if (Objects.equals(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, null, null);
    }
}
