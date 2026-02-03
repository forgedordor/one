package defpackage;

import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avnf extends avnk {
    private ConversationIdType a;
    private long b;
    private elka c;
    private SuperSortLabel d;
    private boolean e;
    private byte f;

    @Override // defpackage.avnk
    public final avnl a() {
        ConversationIdType conversationIdType;
        elka elkaVar;
        SuperSortLabel superSortLabel;
        if (this.f == 3 && (conversationIdType = this.a) != null && (elkaVar = this.c) != null && (superSortLabel = this.d) != null) {
            return new avng(conversationIdType, this.b, elkaVar, superSortLabel, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" conversationId");
        }
        if ((this.f & 1) == 0) {
            sb.append(" deleteTimestamp");
        }
        if (this.c == null) {
            sb.append(" origin");
        }
        if (this.d == null) {
            sb.append(" filter");
        }
        if ((this.f & 2) == 0) {
            sb.append(" onlyIfEmpty");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.avnk
    public final void b(ConversationIdType conversationIdType) {
        if (conversationIdType == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.a = conversationIdType;
    }

    @Override // defpackage.avnk
    public final void c(long j) {
        this.b = j;
        this.f = (byte) (this.f | 1);
    }

    @Override // defpackage.avnk
    public final void d(SuperSortLabel superSortLabel) {
        if (superSortLabel == null) {
            throw new NullPointerException("Null filter");
        }
        this.d = superSortLabel;
    }

    @Override // defpackage.avnk
    public final void e(boolean z) {
        this.e = z;
        this.f = (byte) (this.f | 2);
    }

    @Override // defpackage.avnk
    public final void f(elka elkaVar) {
        if (elkaVar == null) {
            throw new NullPointerException("Null origin");
        }
        this.c = elkaVar;
    }
}
