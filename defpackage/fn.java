package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fn implements fm {
    final String a;
    final int b;
    final /* synthetic */ fr c;

    public fn(fr frVar, String str, int i) {
        this.c = frVar;
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.fm
    public final boolean h(ArrayList arrayList, ArrayList arrayList2) {
        fr frVar = this.c;
        ea eaVar = frVar.r;
        if (eaVar == null || this.b >= 0 || this.a != null || !eaVar.I().ah()) {
            return frVar.aj(arrayList, arrayList2, this.a, this.b, 1);
        }
        return false;
    }
}
