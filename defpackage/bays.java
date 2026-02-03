package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bays {
    public static final ejxr a = cdag.w(184269564, "enable_outgoing_message_insertion_listeners");
    public final fcyh b;
    public final fcyh c;
    public final fdjx d;
    private final fctc e;
    private final fctc f;

    public bays(fcyh fcyhVar, fcyh fcyhVar2, fdjx fdjxVar, final eygg eyggVar) {
        fcyhVar.getClass();
        fcyhVar2.getClass();
        fdjxVar.getClass();
        eyggVar.getClass();
        this.b = fcyhVar;
        this.c = fcyhVar2;
        this.d = fdjxVar;
        this.e = fctd.a(new fdae() { // from class: bayl
            @Override // defpackage.fdae
            public final Object invoke() {
                return (Boolean) ((cczi) bays.a.get()).e();
            }
        });
        this.f = fctd.a(new fdae() { // from class: baym
            @Override // defpackage.fdae
            public final Object invoke() {
                if (!this.a.a().booleanValue()) {
                    return fcvq.a;
                }
                Object objB = eyggVar.b();
                objB.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj : (Iterable) objB) {
                    if (((bayk) obj).j()) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        });
    }

    public final Boolean a() {
        return (Boolean) this.e.a();
    }

    public final Collection b() {
        return (Collection) this.f.a();
    }

    public final void c(MessageCoreData messageCoreData) throws IOException {
        messageCoreData.getClass();
        eieu eieuVarH = eiiy.h("OutgoingMessageInsertionListenersManager::onSplitIntoMessage");
        try {
            Iterator it = b().iterator();
            while (it.hasNext()) {
                ((bayk) it.next()).i(messageCoreData);
            }
            fczl.a(eieuVarH, null);
        } finally {
        }
    }
}
