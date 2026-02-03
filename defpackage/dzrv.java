package defpackage;

import android.content.Context;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzrv extends dzfw {
    final /* synthetic */ ejxk e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzrv(ejwi ejwiVar, eygg eyggVar, Context context, ejxk ejxkVar) {
        super("NetworkMetric", ejwiVar, eyggVar, context);
        this.e = ejxkVar;
    }

    @Override // defpackage.dzfw
    public final ekhx a(feix feixVar) {
        if ((feixVar.b & 32) == 0) {
            return ekon.a;
        }
        ekhv ekhvVar = new ekhv();
        fefb fefbVar = feixVar.h;
        if (fefbVar == null) {
            fefbVar = fefb.a;
        }
        Iterator<E> it = fefbVar.b.iterator();
        while (it.hasNext()) {
            ekhvVar.j(this.e.g(((feez) it.next()).u));
        }
        return ekhvVar.g();
    }
}
