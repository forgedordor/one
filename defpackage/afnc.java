package defpackage;

import com.google.android.apps.messaging.multishare.chip.ChipData;
import com.google.android.apps.messaging.multishare.chip.ChipId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afnc implements afmy {
    private final List a;
    private final Set b;
    private final ChipData c;
    private final ChipData d;

    /* JADX WARN: Multi-variable type inference failed */
    public afnc() {
        this(null, 0 == true ? 1 : 0, 15);
    }

    @Override // defpackage.afmy
    public final ChipData a() {
        return this.c;
    }

    @Override // defpackage.afmy
    public final ChipData b() {
        return this.d;
    }

    @Override // defpackage.afmy
    public final List c() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afmy
    public final boolean d(ajou ajouVar) {
        ekqh it = ajouVar.b().iterator();
        it.getClass();
        while (it.hasNext()) {
            if (f(((ajpk) it.next()).a)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.afmy
    public final boolean e(ConversationId conversationId) {
        Set set = this.b;
        if (set.isEmpty()) {
            return false;
        }
        return set.contains(new ChipId.Conversation(conversationId));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afnc)) {
            return false;
        }
        afnc afncVar = (afnc) obj;
        return fdbq.f(this.a, afncVar.a) && fdbq.f(this.b, afncVar.b) && fdbq.f(this.c, afncVar.c) && fdbq.f(this.d, afncVar.d);
    }

    @Override // defpackage.afmy
    public final boolean f(alqm alqmVar) {
        Set set = this.b;
        if (set.isEmpty()) {
            return false;
        }
        return set.contains(new ChipId.Identity(alqmVar));
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        ChipData chipData = this.c;
        int iHashCode2 = ((iHashCode * 31) + (chipData == null ? 0 : chipData.hashCode())) * 31;
        ChipData chipData2 = this.d;
        return iHashCode2 + (chipData2 != null ? chipData2.hashCode() : 0);
    }

    public final String toString() {
        return "ContactSelectionStateImpl(allChipList=" + this.a + ", allIdentities=" + this.b + ", lastAddedChip=" + this.c + ", lastRemovedChip=" + this.d + ")";
    }

    public afnc(List list, Set set, ChipData chipData, ChipData chipData2) {
        list.getClass();
        set.getClass();
        this.a = list;
        this.b = set;
        this.c = chipData;
        this.d = chipData2;
    }

    public /* synthetic */ afnc(List list, Set set, int i) {
        this((i & 1) != 0 ? fcvo.a : list, (i & 2) != 0 ? fcvq.a : set, null, null);
    }
}
