package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class baxs implements byee, bayb, cqci {
    public static final cczv a = cdag.f(cdag.b, "max_original_message_id_cache_size", 200);
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public final void a(basd basdVar, basd basdVar2) {
        if (basdVar.i()) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        if (concurrentHashMap.size() > ((Long) a.e()).longValue()) {
            concurrentHashMap.clear();
        }
        concurrentHashMap.put(basdVar, basdVar2);
    }

    @Override // defpackage.bayb
    public final /* synthetic */ void d(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bayb
    public final /* synthetic */ void e(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.byee
    public final void fW(MessageCoreData messageCoreData) {
        a(messageCoreData.F(), messageCoreData.E());
    }

    @Override // defpackage.cqci
    public final void i(int i) {
        this.b.clear();
    }

    @Override // defpackage.bayb
    public final void k(MessageCoreData messageCoreData) {
        a(messageCoreData.F(), messageCoreData.E());
    }

    @Override // defpackage.bayb
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.byee
    public final void c(MessageIdType messageIdType, basd basdVar) {
    }
}
