package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Instant;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atuj implements atru {
    private final eosc a;

    public atuj(eosc eoscVar) {
        this.a = eoscVar;
    }

    @Override // defpackage.atru
    public final eiju a(final ConversationIdType conversationIdType, auey aueyVar) {
        final audz audzVar = aueyVar.k;
        if (audzVar == null) {
            audzVar = audz.a;
        }
        return audz.a.equals(audzVar) ? eijx.e(cbcw.i()) : eijx.g(new Callable() { // from class: atui
            @Override // java.util.concurrent.Callable
            public final Object call() {
                evvp evvpVar = audzVar.c;
                if (evvpVar == null) {
                    evvpVar = evvp.a;
                }
                ConversationIdType conversationIdType2 = conversationIdType;
                Instant instantD = evwz.d(evvpVar);
                eksp ekspVar = cigh.a;
                ecem.b();
                String[] strArr = botm.a;
                bote boteVar = new bote();
                boteVar.al();
                boteVar.ap("updateRcsGroupLastSyncTimestamp");
                boteVar.R(Optional.of(instantD));
                return boteVar.f(conversationIdType2) ? cbcw.i() : cbcw.k();
            }
        }, this.a);
    }
}
