package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tjs extends tlm {
    public Runnable a;
    public ParticipantsTable.BindData b;
    public tlo c;
    public tlp d;
    public int e;
    public int f;
    private tlq g;
    private ConversationIdType h;
    private int i;
    private byte j;
    private int k;

    @Override // defpackage.tlm
    public final tlr a() {
        tlq tlqVar;
        int i;
        Runnable runnable;
        ConversationIdType conversationIdType;
        int i2;
        int i3;
        tlo tloVar;
        tlp tlpVar;
        if (this.j == 1 && (tlqVar = this.g) != null && (i = this.e) != 0 && (runnable = this.a) != null && (conversationIdType = this.h) != null && (i2 = this.k) != 0 && (i3 = this.f) != 0 && (tloVar = this.c) != null && (tlpVar = this.d) != null) {
            return new tjt(tlqVar, i, runnable, conversationIdType, this.b, i2, i3, tloVar, tlpVar, this.i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.g == null) {
            sb.append(" dialogType");
        }
        if (this.e == 0) {
            sb.append(" dialogDoneBehavior");
        }
        if (this.a == null) {
            sb.append(" onPositiveAction");
        }
        if (this.h == null) {
            sb.append(" conversationId");
        }
        if (this.k == 0) {
            sb.append(" scope");
        }
        if (this.f == 0) {
            sb.append(" entryPoint");
        }
        if (this.c == null) {
            sb.append(" dialogLoggingSource");
        }
        if (this.d == null) {
            sb.append(" dialogTarget");
        }
        if (this.j == 0) {
            sb.append(" anchorViewId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.tlm
    public final void b(int i) {
        this.i = i;
        this.j = (byte) 1;
    }

    @Override // defpackage.tlm
    public final void c(ConversationIdType conversationIdType) {
        if (conversationIdType == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.h = conversationIdType;
    }

    @Override // defpackage.tlm
    public final void d(tlq tlqVar) {
        if (tlqVar == null) {
            throw new NullPointerException("Null dialogType");
        }
        this.g = tlqVar;
    }

    @Override // defpackage.tlm
    public final void e() {
        this.k = 3;
    }
}
