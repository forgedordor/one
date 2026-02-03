package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qtl implements qtk {
    public final List a;

    public qtl(List list) {
        this.a = list;
    }

    @Override // defpackage.qtk
    public final List b() {
        return this.a;
    }

    @Override // defpackage.qtk
    public final boolean c() {
        List list = this.a;
        if (list.isEmpty()) {
            return true;
        }
        return list.size() == 1 && ((qxa) list.get(0)).e();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        List list = this.a;
        if (!list.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(list.toArray()));
        }
        return sb.toString();
    }
}
