package defpackage;

import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rdi implements ejvr {
    final /* synthetic */ rbv a;
    final /* synthetic */ cegt b;

    public rdi(cegt cegtVar, rbv rbvVar) {
        this.b = cegtVar;
        this.a = rbvVar;
    }

    @Override // defpackage.ejvr
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        rdn rdnVar = (rdn) obj;
        try {
            cegt cegtVar = this.b;
            Object obj2 = rdnVar.b;
            cehg cehgVar = cegtVar.a;
            AtomicReference atomicReference = cegtVar.b;
            evqs evqsVar = evqs.b;
            evqr evqrVar = new evqr();
            evqs evqsVarB = ((Bitmap) obj2).compress(cehgVar.x, ((Integer) cehg.c.e()).intValue(), evqrVar) ? evqrVar.b() : null;
            if (evqsVarB != null) {
                atomicReference.set(evqsVarB);
            }
            return null;
        } finally {
            this.a.l(rdnVar.a);
        }
    }
}
