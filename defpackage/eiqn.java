package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiqn {
    public final eiyh a;
    private eiyi b;

    public eiqn(eiyh eiyhVar) {
        this.a = eiyhVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eiqn) {
            eiqn eiqnVar = (eiqn) obj;
            eiyi eiyiVar = eiqnVar.b;
            if (Objects.equals(null, null) && Objects.equals(this.a, eiqnVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(null, this.a);
    }
}
