package defpackage;

import android.content.Context;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzto extends dzfw {
    final /* synthetic */ ejxk e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzto(ejwi ejwiVar, eygg eyggVar, Context context, ejxk ejxkVar) {
        super("StorageMetric", ejwiVar, eyggVar, context);
        this.e = ejxkVar;
    }

    @Override // defpackage.dzfw
    public final ekhx a(feix feixVar) {
        if ((feixVar.b & 128) == 0) {
            return ekon.a;
        }
        ekhv ekhvVar = new ekhv();
        feim feimVar = feixVar.j;
        if (feimVar == null) {
            feimVar = feim.a;
        }
        Iterator<E> it = feimVar.k.iterator();
        while (it.hasNext()) {
            ekhvVar.j(this.e.i(((feil) it.next()).c));
        }
        return ekhvVar.g();
    }
}
