package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crui {
    public final boolean a;
    public final ConversationIdType b;
    public final String c;
    public final csdl d;
    public final boolean e;
    public final boolean f;
    public final elka g;
    public final cryl h;
    public final eofr i;
    public final boolean j;
    public final bvdk k;
    public final csdn l;
    public final int m;
    public final int n;
    public final int o;
    private final csny p = null;
    private final csoc q = null;

    public /* synthetic */ crui(boolean z, ConversationIdType conversationIdType, String str, csdl csdlVar, boolean z2, boolean z3, elka elkaVar, cryl crylVar, eofr eofrVar, int i, int i2, int i3, boolean z4, bvdk bvdkVar, csdn csdnVar) {
        this.a = z;
        this.b = conversationIdType;
        this.c = str;
        this.d = csdlVar;
        this.e = z2;
        this.f = z3;
        this.g = elkaVar;
        this.h = crylVar;
        this.i = eofrVar;
        this.m = i;
        this.n = i2;
        this.o = i3;
        this.j = z4;
        this.k = bvdkVar;
        this.l = csdnVar;
        if (conversationIdType != null) {
            if (conversationIdType.b()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        } else if (z2) {
            throw new IllegalArgumentException("This API currently does not support external reporting without a conversation. It's reasonable to implement this, but it's not currently implemented.");
        }
        if (str != null && str.length() <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (conversationIdType == null && str == null) {
            throw new IllegalArgumentException("If we have neither a conversation nor a participant to update, then calling SpamReporter is invalid, as there's no work to do.");
        }
        if (z4) {
            if (csdlVar != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (csdnVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            return;
        }
        if (csdlVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (csdnVar != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crui)) {
            return false;
        }
        crui cruiVar = (crui) obj;
        if (this.a != cruiVar.a || !fdbq.f(this.b, cruiVar.b)) {
            return false;
        }
        csny csnyVar = cruiVar.p;
        if (!fdbq.f(null, null) || !fdbq.f(this.c, cruiVar.c)) {
            return false;
        }
        csoc csocVar = cruiVar.q;
        return fdbq.f(null, null) && this.d == cruiVar.d && this.e == cruiVar.e && this.f == cruiVar.f && this.g == cruiVar.g && fdbq.f(this.h, cruiVar.h) && this.i == cruiVar.i && this.m == cruiVar.m && this.n == cruiVar.n && this.o == cruiVar.o && this.j == cruiVar.j && this.k == cruiVar.k && fdbq.f(this.l, cruiVar.l);
    }

    public final int hashCode() {
        ConversationIdType conversationIdType = this.b;
        int iHashCode = conversationIdType == null ? 0 : conversationIdType.hashCode();
        boolean z = this.a;
        String str = this.c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iA = (crug.a(z) * 31) + iHashCode;
        csdl csdlVar = this.d;
        int iHashCode3 = ((((((((((iA * 961) + iHashCode2) * 961) + (csdlVar == null ? 0 : csdlVar.hashCode())) * 31) + crug.a(this.e)) * 31) + crug.a(this.f)) * 31) + this.g.hashCode()) * 31;
        cryl crylVar = this.h;
        int iHashCode4 = (iHashCode3 + (crylVar == null ? 0 : crylVar.hashCode())) * 31;
        eofr eofrVar = this.i;
        int iHashCode5 = (((((iHashCode4 + (eofrVar == null ? 0 : eofrVar.hashCode())) * 31) + this.m) * 31) + this.n) * 31;
        int i = this.o;
        eofo.b(i);
        int iA2 = (((iHashCode5 + i) * 31) + crug.a(this.j)) * 31;
        bvdk bvdkVar = this.k;
        int iHashCode6 = (iA2 + (bvdkVar == null ? 0 : bvdkVar.hashCode())) * 31;
        csdn csdnVar = this.l;
        return iHashCode6 + (csdnVar != null ? csdnVar.hashCode() : 0);
    }

    public final String toString() {
        return "SpamRequest(spamStatus=" + this.a + ", conversationId=" + this.b + ", conversation=null, targetParticipantId=" + this.c + ", targetParticipant=null, classificationSource=" + this.d + ", allowExternalReporting=" + this.e + ", allowConversationArchiving=" + this.f + ", bugleConversationOrigin=" + this.g + ", metadata=" + this.h + ", userActionType=" + this.i + ", scope=" + ((Object) eofq.c(this.m)) + ", entryPoint=" + ((Object) eofp.a(this.n)) + ", dialog=" + ((Object) eofo.a(this.o)) + ", isUndo=" + this.j + ", archiveStatusForUndo=" + this.k + ", classificationSourcesForUndo=" + this.l + ")";
    }
}
