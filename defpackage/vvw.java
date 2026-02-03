package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.conversation.draft.EditingData;
import j$.time.Instant;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vvw {
    public final String a;
    public final List b;
    public final String c;
    public final boolean d;
    public final MessageId e;
    public final EditingData f;
    public final Instant g;
    public final boolean h;
    public final boolean i;
    public final cilq j;
    public final int k;

    public vvw() {
        this((String) null, (List) null, (String) null, false, (MessageId) null, (EditingData) null, (Instant) null, false, 0, false, 2047);
    }

    public static /* synthetic */ vvw c(vvw vvwVar, String str, List list, String str2, boolean z, MessageId messageId, Instant instant, boolean z2, int i, cilq cilqVar, int i2) {
        String str3 = (i2 & 1) != 0 ? vvwVar.a : str;
        List list2 = (i2 & 2) != 0 ? vvwVar.b : list;
        String str4 = (i2 & 4) != 0 ? vvwVar.c : str2;
        boolean z3 = (i2 & 8) != 0 ? vvwVar.d : z;
        MessageId messageId2 = (i2 & 16) != 0 ? vvwVar.e : messageId;
        EditingData editingData = (i2 & 32) != 0 ? vvwVar.f : null;
        Instant instant2 = (i2 & 64) != 0 ? vvwVar.g : instant;
        boolean z4 = (i2 & 128) != 0 ? vvwVar.h : z2;
        int i3 = (i2 & 256) != 0 ? vvwVar.k : i;
        boolean z5 = (i2 & 512) != 0 ? vvwVar.i : false;
        cilq cilqVar2 = (i2 & 1024) != 0 ? vvwVar.j : cilqVar;
        list2.getClass();
        if (i3 != 0) {
            return new vvw(str3, list2, str4, z3, messageId2, editingData, instant2, z4, i3, z5, cilqVar2);
        }
        throw null;
    }

    public final boolean a() {
        String str = this.a;
        boolean z = (str == null || fdgn.H(str)) ? false : true;
        String str2 = this.c;
        return z || !this.b.isEmpty() || (str2 != null && !fdgn.H(str2)) || this.d || this.e != null;
    }

    public final boolean b() {
        String str = this.a;
        boolean z = (str == null || fdgn.H(str)) ? false : true;
        String str2 = this.c;
        return z || !this.b.isEmpty() || (str2 != null && !fdgn.H(str2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvw)) {
            return false;
        }
        vvw vvwVar = (vvw) obj;
        return fdbq.f(this.a, vvwVar.a) && fdbq.f(this.b, vvwVar.b) && fdbq.f(this.c, vvwVar.c) && this.d == vvwVar.d && fdbq.f(this.e, vvwVar.e) && fdbq.f(this.f, vvwVar.f) && fdbq.f(this.g, vvwVar.g) && this.h == vvwVar.h && this.k == vvwVar.k && this.i == vvwVar.i && fdbq.f(this.j, vvwVar.j);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode();
        String str2 = this.c;
        int iHashCode2 = ((((iHashCode * 31) + (str2 == null ? 0 : str2.hashCode())) * 31) + vvu.a(this.d)) * 31;
        MessageId messageId = this.e;
        int iHashCode3 = (iHashCode2 + (messageId == null ? 0 : messageId.hashCode())) * 31;
        EditingData editingData = this.f;
        int iHashCode4 = (iHashCode3 + (editingData == null ? 0 : editingData.hashCode())) * 31;
        Instant instant = this.g;
        int iHashCode5 = (((((((iHashCode4 + (instant == null ? 0 : instant.hashCode())) * 31) + vvu.a(this.h)) * 31) + this.k) * 31) + vvu.a(this.i)) * 31;
        cilq cilqVar = this.j;
        return iHashCode5 + (cilqVar != null ? cilqVar.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        CharSequence charSequenceC = str != null ? cqcy.c(str) : null;
        List list = this.b;
        String str2 = this.c;
        CharSequence charSequenceC2 = str2 != null ? cqcy.c(str2) : null;
        boolean z = this.d;
        MessageId messageId = this.e;
        EditingData editingData = this.f;
        String string = editingData != null ? editingData.toString() : null;
        Instant instant = this.g;
        boolean z2 = this.h;
        int i = this.k;
        cilq cilqVar = this.j;
        StringBuilder sb = new StringBuilder("DraftData(text=");
        sb.append((Object) charSequenceC);
        sb.append(", attachments=");
        sb.append(list);
        sb.append(", subject=");
        sb.append((Object) charSequenceC2);
        sb.append(", isUrgent=");
        sb.append(z);
        sb.append(", replyToMessageId=");
        sb.append(messageId);
        sb.append(", editingData=");
        sb.append(string);
        sb.append(", scheduledTime=");
        sb.append(instant);
        sb.append(", isEncrypted=");
        sb.append(z2);
        sb.append(", source=");
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "CLEAR" : "REPLACER" : "MERGED" : "PERSISTED" : "INCOMING" : "USER_INPUT"));
        sb.append(", draftMentions=");
        sb.append(cilqVar);
        sb.append(")");
        return sb.toString();
    }

    public vvw(String str, List list, String str2, boolean z, MessageId messageId, EditingData editingData, Instant instant, boolean z2, int i, boolean z3, cilq cilqVar) {
        list.getClass();
        if (i == 0) {
            throw null;
        }
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = z;
        this.e = messageId;
        this.f = editingData;
        this.g = instant;
        this.h = z2;
        this.k = i;
        this.i = z3;
        this.j = cilqVar;
    }

    public /* synthetic */ vvw(String str, List list, String str2, boolean z, MessageId messageId, EditingData editingData, Instant instant, boolean z2, int i, boolean z3, int i2) {
        this(1 == (i2 & 1) ? null : str, (i2 & 2) != 0 ? fcvo.a : list, (i2 & 4) != 0 ? null : str2, ((i2 & 8) == 0) & z, (i2 & 16) != 0 ? null : messageId, (i2 & 32) != 0 ? null : editingData, (i2 & 64) != 0 ? null : instant, ((i2 & 128) == 0) & z2, (i2 & 256) != 0 ? 1 : i, ((i2 & 512) == 0) & z3, (cilq) null);
    }
}
