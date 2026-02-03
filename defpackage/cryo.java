package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cryo {
    public final fcsu a;
    public final fcsu b;
    public final fdjx c;

    public cryo(fcsu fcsuVar, fcsu fcsuVar2, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fdjxVar.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fdjxVar;
    }

    static /* synthetic */ void d(cryo cryoVar, ConversationIdType conversationIdType, csnx csnxVar, cryl crylVar, eofr eofrVar, int i, int i2, int i3, int i4) {
        if ((i4 & 32) != 0) {
            i2 = 0;
        }
        if ((i4 & 64) != 0) {
            i3 = 0;
        }
        cryoVar.a(conversationIdType, csnxVar, crylVar, eofrVar, i, i2, i3, null);
    }

    public final void a(ConversationIdType conversationIdType, csnx csnxVar, cryl crylVar, eofr eofrVar, int i, int i2, int i3, eofg eofgVar) {
        if (csds.a().booleanValue() && csnxVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        auvw.k(this.c, null, null, new crym(this, conversationIdType, csnxVar, crylVar, i2, eofrVar, i, i3, eofgVar, null), 3);
    }

    public final void b(ConversationIdType conversationIdType, ParticipantsTable.BindData bindData, bvdk bvdkVar, eofr eofrVar, int i, int i2, int i3) {
        eofrVar.getClass();
        ecem.b();
        c(conversationIdType, csof.b(conversationIdType), ((cryk) this.a.b()).b(bindData, bvdkVar), eofrVar, i, i2, i3);
    }

    public final void c(ConversationIdType conversationIdType, csnx csnxVar, cryl crylVar, eofr eofrVar, int i, int i2, int i3) {
        eofrVar.getClass();
        if (csds.a().booleanValue() && csnxVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (!fcva.g(eofr.REPORTED_SPAM, eofr.REPORTED_NOT_SPAM, eofr.BLOCKED, eofr.UNBLOCKED, eofr.DISMISSED_WARNING_BANNER).contains(eofrVar)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        d(this, conversationIdType, csnxVar, crylVar, eofrVar, i, i2, i3, 128);
    }

    public final void e(final ConversationIdType conversationIdType, csnx csnxVar) {
        cryl crylVar;
        if (csds.a().booleanValue() && csnxVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ecem.b();
        cryk crykVar = (cryk) this.a.b();
        Boolean boolA = csds.a();
        if (boolA.booleanValue() && csnxVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ecem.b();
        bqqz bqqzVarA = bqrg.a();
        bqqzVarA.A("SpamLoggingMetadata#cacheMetadataForConversationDelete");
        bqqzVarA.c(new Function() { // from class: cryg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqrf bqrfVar = (bqrf) obj;
                bqrfVar.b(conversationIdType);
                return bqrfVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (bqqzVarA.b().U()) {
            cryl crylVar2 = new cryl(((cogw) crykVar.g.b()).f().toEpochMilli());
            cryk.j(crylVar2, conversationIdType);
            crykVar.f(crylVar2, conversationIdType);
            crykVar.h(crylVar2, null, conversationIdType);
            crykVar.g(crylVar2, conversationIdType);
            crykVar.e(crylVar2, conversationIdType);
            if (boolA.booleanValue()) {
                crzf crzfVar = (crzf) crykVar.a.b();
                csnxVar.getClass();
                crylVar2.i = crzfVar.j(csnxVar);
            } else {
                crylVar2.h = ((crzf) crykVar.a.b()).i(conversationIdType);
            }
            crylVar = crylVar2;
        } else {
            crylVar = null;
        }
        if (crylVar != null) {
            d(this, conversationIdType, csnxVar, crylVar, eofr.DELETED, 3, 0, 0, 224);
        }
    }
}
