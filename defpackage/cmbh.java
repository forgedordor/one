package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import j$.time.Instant;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class cmbh extends dqpg {
    public String a;
    public MessageIdType b;
    public ConversationIdType c;
    public Instant d;
    public cmct e;
    public Instant f;

    public cmbh() {
        super(ScheduledSendTable.f());
        this.b = bary.a;
        this.c = barn.a;
        this.d = bart.b(0L);
        this.e = cmct.SCHEDULED;
        this.f = bart.b(0L);
    }

    public final ScheduledSendTable.BindData a() {
        return b(new Supplier() { // from class: cmbg
            @Override // java.util.function.Supplier
            public final Object get() {
                return new cmbe();
            }
        });
    }

    public final ScheduledSendTable.BindData b(Supplier supplier) {
        ScheduledSendTable.BindData bindData = (ScheduledSendTable.BindData) supplier.get();
        bindData.aD(aB());
        bindData.a = this.a;
        bindData.b = this.b;
        bindData.c = this.c;
        bindData.d = this.d;
        bindData.e = this.e;
        bindData.f = this.f;
        bindData.cM = aC();
        return bindData;
    }

    public final void c(ConversationIdType conversationIdType) {
        aE(2);
        this.c = conversationIdType;
    }

    public final void d(Instant instant) {
        int i = this.aB;
        if (i < 58020) {
            dqru.x("creation_time", i);
        }
        aE(5);
        this.f = instant;
    }

    public final void e(String str) {
        aE(0);
        this.a = str;
    }

    public final void f(MessageIdType messageIdType) {
        aE(1);
        this.b = messageIdType;
    }

    public final void g(Instant instant) {
        aE(3);
        this.d = instant;
    }

    public final void h(cmct cmctVar) {
        aE(4);
        this.e = cmctVar;
    }
}
