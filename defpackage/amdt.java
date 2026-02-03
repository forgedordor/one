package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.message.BugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amdt implements ajmg {
    private final amhc a;
    private final ajmg b;

    public amdt(amhc amhcVar, ajmg ajmgVar) {
        this.a = amhcVar;
        this.b = ajmgVar;
    }

    @Override // defpackage.cqtk
    public final /* bridge */ /* synthetic */ eiju a(Object obj) {
        anat anatVar;
        int iE;
        List list;
        ajmf ajmfVar = (ajmf) obj;
        if ((ajmfVar instanceof anat) && ((iE = (anatVar = (anat) ajmfVar).e()) == 2 || iE == 11 || iE == 5 || iE == 6 || iE == 14 || iE == 1)) {
            amhc amhcVar = this.a;
            MessageIdType messageIdTypeC = ((BugleMessageId) anatVar.b()).c();
            messageIdTypeC.getClass();
            Map map = amhcVar.c;
            synchronized (map) {
                list = (List) map.get(messageIdTypeC);
            }
            if (list == null || list.isEmpty()) {
            } else {
                auvw.k(amhcVar.a, null, null, new amha(messageIdTypeC, amhcVar, list, null), 3);
            }
        }
        return this.b.a(ajmfVar);
    }

    @Override // defpackage.ajmg
    public final eiju b() {
        return this.b.b();
    }
}
