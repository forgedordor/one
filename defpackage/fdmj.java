package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdmj extends fdyu implements fdll {
    public final String c(String str) {
        StringBuilder sb = new StringBuilder("List{");
        sb.append(str);
        sb.append("}[");
        Object objF = f();
        objF.getClass();
        boolean z = true;
        for (fdyw fdywVarH = (fdyw) objF; !fdbq.f(fdywVarH, this); fdywVarH = fdywVarH.h()) {
            if (fdywVarH instanceof fdlx) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(fdywVarH);
                z = false;
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.fdll
    public final boolean hA() {
        return true;
    }

    @Override // defpackage.fdyw
    public final String toString() {
        return fdkb.a ? c("Active") : super.toString();
    }

    @Override // defpackage.fdll
    public final fdmj hy() {
        return this;
    }
}
