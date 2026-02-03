package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exko {
    public static void a(exkm exkmVar, exkn exknVar) {
        if (exkmVar != null) {
            exkmVar.hv(exknVar);
        } else {
            exknVar.a(0L);
        }
    }

    public static void b(final List list, final long[] jArr, final exkd exkdVar, final int i) {
        exkn exknVar = new exkn() { // from class: exkl
            @Override // defpackage.exkn
            public final void a(long j) {
                long[] jArr2 = jArr;
                int i2 = i;
                jArr2[i2] = j;
                List list2 = list;
                int size = list2.size() - 1;
                exkd exkdVar2 = exkdVar;
                if (i2 == size) {
                    exkdVar2.a(jArr2);
                } else {
                    exko.b(list2, jArr2, exkdVar2, i2 + 1);
                }
            }
        };
        exkm exkmVar = (exkm) list.get(i);
        if (exkmVar != null) {
            exkmVar.hv(exknVar);
        } else {
            exknVar.a(0L);
        }
    }
}
