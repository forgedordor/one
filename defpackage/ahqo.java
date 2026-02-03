package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahqo implements ahqh {
    public final MessageIdType a;
    public final evvp b;
    public final ahqn c;
    public final ahqj d;
    public final ahqg e;

    public ahqo(MessageIdType messageIdType, MessagesTable.BindData bindData, ParticipantsTable.BindData bindData2, List list, bpvd bpvdVar) {
        evvp evvpVarC = evxc.c(bindData.w());
        evvpVarC.getClass();
        ahqn ahqnVar = new ahqn(bindData2);
        if (list.isEmpty()) {
            throw new IllegalArgumentException("[PresentRepliedToMessage] partsData is empty");
        }
        if (list.size() > 1) {
            eksl ekslVar = (eksl) ahqi.a.j();
            ekrz ekrzVar = ahrb.a;
            ekslVar.X(ahrb.c, messageIdType.toString());
            int size = list.size();
            ArrayList arrayList = new ArrayList(fcva.p(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((PartsTable.BindData) it.next()).I());
            }
            ekslVar.w("[PresentRepliedToMessage] Replied-to message has %d parts with content types: %s", size, arrayList);
        }
        ahqj ahqjVar = new ahqj((PartsTable.BindData) list.get(0));
        ahqg ahqgVar = bpvdVar != null ? new ahqg(bpvdVar) : null;
        this.a = messageIdType;
        this.b = evvpVarC;
        this.c = ahqnVar;
        this.d = ahqjVar;
        this.e = ahqgVar;
    }

    public final Uri a() {
        return this.d.b;
    }

    public final ahrj b() {
        return (ahrj) this.c.i.a();
    }

    public final String c() {
        return this.d.c;
    }

    public final String d() {
        return this.d.a;
    }
}
