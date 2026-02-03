package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bayn extends fcyz implements fdat {
    int a;
    final /* synthetic */ bays b;
    final /* synthetic */ MessageCoreData c;
    final /* synthetic */ MessageIdType d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bayn(fcxy fcxyVar, bays baysVar, MessageCoreData messageCoreData, MessageIdType messageIdType) {
        super(2, fcxyVar);
        this.b = baysVar;
        this.c = messageCoreData;
        this.d = messageIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bayn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Closeable closeable;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            closeable = (Closeable) this.e;
            try {
                fctl.b(obj);
            } catch (Throwable th) {
                th = th;
                try {
                    throw th;
                } catch (Throwable th2) {
                    fczl.a(closeable, th);
                    throw th2;
                }
            }
        } else {
            fctl.b(obj);
            fdjx fdjxVar = (fdjx) this.e;
            eieu eieuVarH = eiiy.h("OutgoingMessageInsertionListenersManager::onAfterInsertion");
            try {
                bays baysVar = this.b;
                Collection<bayk> collectionB = baysVar.b();
                ArrayList arrayList = new ArrayList(fcva.p(collectionB, 10));
                for (bayk baykVar : collectionB) {
                    fcyh fcyhVar = baysVar.b;
                    arrayList.add(fdin.b(fdjxVar, eicg.a(fcyhVar), fdjz.a, new bayo(null, baykVar, this.c, this.d)));
                }
                this.e = eieuVarH;
                this.a = 1;
                obj = fdii.a(arrayList, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
                closeable = eieuVarH;
            } catch (Throwable th3) {
                th = th3;
                closeable = eieuVarH;
                throw th;
            }
        }
        List list = (List) obj;
        fczl.a(closeable, null);
        return list;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bayn baynVar = new bayn(fcxyVar, this.b, this.c, this.d);
        baynVar.e = obj;
        return baynVar;
    }
}
