package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cspl implements csdr {
    public final fcsu a;
    public final MessageIdType b;
    public final cspi c;
    public final ConversationIdType d;
    public final csog e;
    public final int f;
    public final boolean g;
    public final String h;
    public final cspo i;
    public final boolean j;
    private final boolean k;
    private final long l;
    private final boolean m;
    private final boolean n;

    public cspl(fcsu fcsuVar, fcsu fcsuVar2, MessagesTable.BindData bindData) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.a = fcsuVar;
        this.b = bindData.E();
        MessageIdType messageIdTypeE = bindData.E();
        messageIdTypeE.getClass();
        this.c = new cspi(messageIdTypeE);
        this.d = bindData.D();
        ConversationIdType conversationIdTypeD = bindData.D();
        conversationIdTypeD.getClass();
        this.e = csof.a(conversationIdTypeD);
        this.f = bindData.m();
        this.g = baui.e(bindData.s());
        this.k = baui.r(bindData.s());
        this.h = bindData.aa();
        String strAa = bindData.aa();
        cspo cspoVar = null;
        if (strAa != null && strAa.length() != 0) {
            String strAa2 = bindData.aa();
            strAa2.getClass();
            cspoVar = new cspo(strAa2);
        }
        this.i = cspoVar;
        this.l = bindData.w();
        this.m = bindData.o() == 2;
        this.n = avbn.e.contains(Integer.valueOf(bindData.s()));
        this.j = csds.a().booleanValue() ? baui.v(bindData.s()) : false;
    }

    @Override // defpackage.csdr
    public final int a() {
        return this.f;
    }

    @Override // defpackage.csdr
    public final long b() {
        return this.l;
    }

    @Override // defpackage.csdr
    public final ConversationIdType c() {
        return this.d;
    }

    @Override // defpackage.csdr
    public final MessageIdType d() {
        return this.b;
    }

    @Override // defpackage.csdr
    public final /* synthetic */ csnx e() {
        return this.e;
    }

    @Override // defpackage.csdr
    public final /* synthetic */ csnz f() {
        return this.c;
    }

    @Override // defpackage.csdr
    public final String g() {
        return this.h;
    }

    @Override // defpackage.csdr
    public final boolean h() {
        return this.m;
    }

    @Override // defpackage.csdr
    public final boolean i() {
        return this.g;
    }

    @Override // defpackage.csdr
    public final boolean j() {
        return this.k;
    }

    @Override // defpackage.csdr
    public final boolean k() {
        return this.n;
    }
}
