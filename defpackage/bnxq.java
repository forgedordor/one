package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ConversationNotificationSettingsTable;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bnxq extends dqpg {
    public ConversationIdType a;
    public Instant b;
    public cgra c;
    public cgrc d;

    public bnxq() {
        super(ConversationNotificationSettingsTable.b());
        this.a = barn.a;
        this.b = bart.b(0L);
        this.c = cgra.e;
        this.d = cgrc.e;
    }

    public final ConversationNotificationSettingsTable.BindData a() {
        bnxp bnxpVar = new bnxp();
        bnxpVar.aD(aB());
        bnxpVar.a = this.a;
        bnxpVar.b = this.b;
        bnxpVar.c = this.c;
        bnxpVar.d = this.d;
        bnxpVar.cM = aC();
        return bnxpVar;
    }

    public final void b(ConversationIdType conversationIdType) {
        aE(0);
        this.a = conversationIdType;
    }

    public final void c(cgra cgraVar) {
        aE(2);
        this.c = cgraVar;
    }

    public final void d(cgrc cgrcVar) {
        aE(3);
        this.d = cgrcVar;
    }

    public final void e(Instant instant) {
        aE(1);
        this.b = instant;
    }
}
