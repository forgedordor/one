package defpackage;

import android.content.Context;
import java.text.Collator;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpfe implements Comparator {
    private final Collator a;

    public cpfe(Context context) {
        Collator collator = Collator.getInstance(lad.a(context.getResources().getConfiguration()).f(0));
        this.a = collator;
        collator.setStrength(0);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        qxf qxfVar = (qxf) obj;
        long j = qxfVar.f;
        boolean zA = cpdz.a(j);
        qxf qxfVar2 = (qxf) obj2;
        long j2 = qxfVar2.f;
        if (zA != cpdz.a(j2)) {
            return zA ? -1 : 1;
        }
        int iCompare = this.a.compare(qxfVar.b, qxfVar2.b);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Long.compare(j, j2);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        boolean z = qxfVar.a;
        if (z != qxfVar2.a) {
            return z ? -1 : 1;
        }
        return 0;
    }
}
