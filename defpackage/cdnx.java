package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdnx implements Runnable {
    final /* synthetic */ cdoa a;
    final /* synthetic */ cdnk b;

    public cdnx(cdoa cdoaVar, cdnk cdnkVar) {
        this.a = cdoaVar;
        this.b = cdnkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fcsu fcsuVar = this.a.h;
        cdnk cdnkVar = this.b;
        cdmg.d(cdnkVar.b);
        ecem.b();
        Iterator it = cdnkVar.a.iterator();
        while (it.hasNext()) {
            cdmg.b((ConversationIdType) it.next());
        }
    }
}
