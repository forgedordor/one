package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpkh {
    public final Boolean a;
    public final Boolean b;
    public final csdl c;
    public final ConversationId d;
    public final String e;
    public final ResolvedRecipient f;
    public final boolean g;
    public final elka h;
    public final eofr i;
    public final boolean j;
    public final cpkr k;
    public final int l;
    public final int m;
    public final int n;
    private final ConversationIdType o;
    private final csny p;
    private final csoc q;

    public /* synthetic */ cpkh(Boolean bool, Boolean bool2, csdl csdlVar, ConversationId conversationId, String str, ResolvedRecipient resolvedRecipient, boolean z, elka elkaVar, int i, int i2, int i3, eofr eofrVar, boolean z2, cpkr cpkrVar, int i4) {
        csdl csdlVar2 = (i4 & 4) != 0 ? csdl.b : csdlVar;
        ConversationId conversationId2 = (i4 & 8) != 0 ? null : conversationId;
        String str2 = (i4 & 64) != 0 ? null : str;
        ResolvedRecipient resolvedRecipient2 = (i4 & 128) != 0 ? null : resolvedRecipient;
        boolean z3 = (!((i4 & 512) == 0)) | z;
        elka elkaVar2 = (i4 & 1024) != 0 ? null : elkaVar;
        int i5 = (i4 & 8192) != 0 ? 2 : i3;
        int i6 = i4 & 1;
        Boolean bool3 = (i4 & 2) != 0 ? null : bool2;
        Boolean bool4 = 1 == i6 ? null : bool;
        eofr eofrVar2 = (i4 & 16384) != 0 ? null : eofrVar;
        boolean z4 = ((32768 & i4) == 0) & z2;
        cpkr cpkrVar2 = (i4 & 65536) != 0 ? null : cpkrVar;
        this.a = bool4;
        this.b = bool3;
        this.c = csdlVar2;
        this.d = conversationId2;
        this.o = null;
        this.p = null;
        this.e = str2;
        this.f = resolvedRecipient2;
        this.q = null;
        this.g = z3;
        this.h = elkaVar2;
        this.l = i;
        this.m = i2;
        this.n = i5;
        this.i = eofrVar2;
        this.j = z4;
        this.k = cpkrVar2;
        if (bool4 == null && bool3 == null) {
            throw new IllegalArgumentException("At least one status must be updated");
        }
        if (bool4 != null && bool3 != null && !z4 && !fdbq.f(bool4, bool3)) {
            throw new IllegalArgumentException("This API does not support blocking & reporting-not-spam, nor unblocking & reporting spam. Both operations have to move in the same direction.");
        }
        if (str2 != null && str2.length() <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (conversationId2 == null && ((str2 == null || str2.length() == 0) && resolvedRecipient2 == null)) {
            throw new IllegalArgumentException("We must have a conversation and/or a participant/recipient to update statuses.");
        }
        if (bool3 != null) {
            if (elkaVar2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (z4) {
                if (csdlVar2 != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } else if (csdlVar2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        if (z4 && cpkrVar2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpkh)) {
            return false;
        }
        cpkh cpkhVar = (cpkh) obj;
        if (!fdbq.f(this.a, cpkhVar.a) || !fdbq.f(this.b, cpkhVar.b) || this.c != cpkhVar.c || !fdbq.f(this.d, cpkhVar.d)) {
            return false;
        }
        ConversationIdType conversationIdType = cpkhVar.o;
        if (!fdbq.f(null, null)) {
            return false;
        }
        csny csnyVar = cpkhVar.p;
        if (!fdbq.f(null, null) || !fdbq.f(this.e, cpkhVar.e) || !fdbq.f(this.f, cpkhVar.f)) {
            return false;
        }
        csoc csocVar = cpkhVar.q;
        return fdbq.f(null, null) && this.g == cpkhVar.g && this.h == cpkhVar.h && this.l == cpkhVar.l && this.m == cpkhVar.m && this.n == cpkhVar.n && this.i == cpkhVar.i && this.j == cpkhVar.j && fdbq.f(this.k, cpkhVar.k);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.b;
        int iHashCode2 = bool2 == null ? 0 : bool2.hashCode();
        csdl csdlVar = this.c;
        int iHashCode3 = ((((iHashCode * 31) + iHashCode2) * 31) + (csdlVar == null ? 0 : csdlVar.hashCode())) * 31;
        ConversationId conversationId = this.d;
        int iHashCode4 = iHashCode3 + (conversationId == null ? 0 : conversationId.hashCode());
        String str = this.e;
        int iHashCode5 = ((iHashCode4 * 29791) + (str == null ? 0 : str.hashCode())) * 31;
        ResolvedRecipient resolvedRecipient = this.f;
        int iHashCode6 = (((iHashCode5 + (resolvedRecipient == null ? 0 : resolvedRecipient.hashCode())) * 961) + cpkf.a(this.g)) * 31;
        elka elkaVar = this.h;
        int iHashCode7 = (((((iHashCode6 + (elkaVar == null ? 0 : elkaVar.hashCode())) * 31) + this.l) * 31) + this.m) * 31;
        int i = this.n;
        eofo.b(i);
        int i2 = (iHashCode7 + i) * 31;
        eofr eofrVar = this.i;
        int iHashCode8 = (((i2 + (eofrVar == null ? 0 : eofrVar.hashCode())) * 31) + cpkf.a(this.j)) * 31;
        cpkr cpkrVar = this.k;
        return iHashCode8 + (cpkrVar != null ? cpkrVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlockAndReportSpamRequest(blockStatus=");
        sb.append(this.a);
        sb.append(", spamStatus=");
        sb.append(this.b);
        sb.append(", classificationSource=");
        sb.append(this.c);
        sb.append(", mapiConversationId=");
        sb.append(this.d);
        sb.append(", conversationId=null, conversation=null, targetParticipantId=");
        sb.append(this.e);
        sb.append(", targetRecipient=");
        sb.append(this.f);
        sb.append(", targetParticipant=null, allowExternalReporting=");
        sb.append(this.g);
        sb.append(", bugleConversationOrigin=");
        sb.append(this.h);
        sb.append(", scope=");
        sb.append((Object) eofq.c(this.l));
        sb.append(", entryPoint=");
        sb.append((Object) eofp.a(this.m));
        sb.append(", dialog=");
        int i = this.n;
        sb.append((Object) (i != 0 ? eofo.a(i) : "null"));
        sb.append(", spamUserActionType=");
        sb.append(this.i);
        sb.append(", isUndo=");
        sb.append(this.j);
        sb.append(", undoBlockAndReportSpamRequest=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }
}
