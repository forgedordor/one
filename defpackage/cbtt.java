package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbtt {
    private final Set a;
    private final arnu b;

    public cbtt(Set set, arnu arnuVar) {
        set.getClass();
        this.a = set;
        this.b = arnuVar;
    }

    private final boolean d(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((cbqv) it.next()).c(str)) {
                return true;
            }
        }
        return false;
    }

    public final cbqz a(Bundle bundle) {
        Object next;
        String string = bundle.getString("chat.extra.wrappingContentType");
        if (string == null) {
            return cbqz.a;
        }
        if (!this.b.a()) {
            return d(string) ? cbqz.b : cbqz.a;
        }
        Set set = this.a;
        ArrayList arrayList = new ArrayList(fcva.p(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((cbqv) it.next()).a(string));
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (!fdbq.f((cbqz) next, cbqz.a)) {
                break;
            }
        }
        cbqz cbqzVar = (cbqz) next;
        return cbqzVar == null ? cbqz.a : cbqzVar;
    }

    public final void b(MessageCoreData messageCoreData, Bundle bundle) {
        arnu arnuVar = this.b;
        String string = bundle.getString("chat.extra.wrappingContentType");
        if (arnuVar.a()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((cbqv) it.next()).b(messageCoreData, string);
            }
        } else if (string != null && d(string)) {
            messageCoreData.by();
        }
        String string2 = bundle.getString("chat.extra.customDeliveryReceiptContentType");
        byte[] byteArray = bundle.getByteArray("chat.extra.customDeliveryReceipt");
        if (string2 == null || byteArray == null) {
            return;
        }
        bquu bquuVar = ((MessageData) messageCoreData).j;
        bquuVar.o(byteArray);
        bquuVar.p(string2);
    }

    public final boolean c(Bundle bundle) {
        String string = bundle.getString("chat.extra.wrappingContentType");
        if (string == null) {
            return false;
        }
        return d(string);
    }
}
