package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ektz extends eksy {
    final /* synthetic */ Set a;
    private final ektl b;

    public ektz(Set set) {
        this.a = set;
        this.b = ekto.a(set);
    }

    @Override // defpackage.eksy
    public final String a(eksx eksxVar, ektv ektvVar) {
        if (!ekua.c(eksxVar, ektvVar, this.a)) {
            return ekua.b(eksxVar);
        }
        StringBuilder sb = new StringBuilder();
        ekss.c(eksxVar, sb);
        ekua.d(ektvVar, this.b, sb);
        return sb.toString();
    }
}
