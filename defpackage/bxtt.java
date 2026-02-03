package defpackage;

import android.content.pm.Signature;
import com.google.android.apps.messaging.shared.datamodel.search.appsearch.schema.v2.ConversationV2;
import com.google.android.apps.messaging.shared.datamodel.search.appsearch.schema.v2.MessageV2;
import com.google.android.apps.messaging.shared.datamodel.search.appsearch.schema.v2.ParticipantV2;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxtt implements bxtq {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/search/appsearch/session/AppSearchSessionManagerImpl");
    public static final Map b;
    private static final Set e;
    public final fdjx c;
    public final bxtp d;
    private final fctc f;

    static {
        Set setD = fcwm.d(new agd("com.google.android.apps.pixel.psi", new Signature("d439bedff4c060a637ffc07c33ea9fa04a091165c40ee883717c2a89bd5a908f").toByteArray()), new agd("com.google.android.apps.pixel.psi", new Signature("9311c8d7198d1be7a7fc1152c8c300921a904858f5aebc787f9cecc5e41468fa").toByteArray()));
        e = setD;
        b = fcwa.g(new fcti(MessageV2.class, setD), new fcti(ConversationV2.class, setD), new fcti(ParticipantV2.class, setD));
    }

    public bxtt(fdjx fdjxVar, bxtp bxtpVar) {
        fdjxVar.getClass();
        this.c = fdjxVar;
        this.d = bxtpVar;
        this.f = fctd.a(new fdae() { // from class: bxtr
            @Override // defpackage.fdae
            public final Object invoke() {
                if (!craf.f) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                bxtt bxttVar = this.a;
                ekrw ekrwVarH = bxtt.a.h();
                ekrwVarH.X(eksq.a, "BugleSearch");
                ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/datamodel/search/appsearch/session/AppSearchSessionManagerImpl", "appSearchSession_delegate$lambda$0", 46, "AppSearchSessionManagerImpl.kt")).q("Initializing platform app search session.");
                return fdil.c(bxttVar.c, null, new bxts(bxttVar, null), 3);
            }
        });
    }

    @Override // defpackage.bxtq
    public final Object a(fcxy fcxyVar) {
        return ((fdkf) this.f.a()).c(fcxyVar);
    }
}
