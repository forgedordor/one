package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tjt extends tlr {
    public final tlq a;
    public final Runnable b;
    public final ConversationIdType c;
    public final ParticipantsTable.BindData d;
    public final tlo e;
    public final tlp f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    public tjt(tlq tlqVar, int i, Runnable runnable, ConversationIdType conversationIdType, ParticipantsTable.BindData bindData, int i2, int i3, tlo tloVar, tlp tlpVar, int i4) {
        this.a = tlqVar;
        this.h = i;
        this.b = runnable;
        this.c = conversationIdType;
        this.d = bindData;
        this.i = i2;
        this.j = i3;
        this.e = tloVar;
        this.f = tlpVar;
        this.g = i4;
    }

    @Override // defpackage.tlr
    public final int a() {
        return this.g;
    }

    @Override // defpackage.tlr
    public final tlo b() {
        return this.e;
    }

    @Override // defpackage.tlr
    public final tlp c() {
        return this.f;
    }

    @Override // defpackage.tlr
    public final tlq d() {
        return this.a;
    }

    @Override // defpackage.tlr
    public final ConversationIdType e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        ParticipantsTable.BindData bindData;
        if (obj == this) {
            return true;
        }
        if (obj instanceof tlr) {
            tlr tlrVar = (tlr) obj;
            if (this.a.equals(tlrVar.d()) && this.h == tlrVar.h() && this.b.equals(tlrVar.g()) && this.c.equals(tlrVar.e()) && ((bindData = this.d) != null ? bindData.equals(tlrVar.f()) : tlrVar.f() == null) && this.i == tlrVar.j() && this.j == tlrVar.i() && this.e.equals(tlrVar.b()) && this.f.equals(tlrVar.c()) && this.g == tlrVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tlr
    public final ParticipantsTable.BindData f() {
        return this.d;
    }

    @Override // defpackage.tlr
    public final Runnable g() {
        return this.b;
    }

    @Override // defpackage.tlr
    public final int h() {
        return this.h;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.h) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        ParticipantsTable.BindData bindData = this.d;
        return (((((((((((iHashCode * 1000003) ^ (bindData == null ? 0 : bindData.hashCode())) * 1000003) ^ this.i) * 1000003) ^ this.j) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g;
    }

    @Override // defpackage.tlr
    public final int i() {
        return this.j;
    }

    @Override // defpackage.tlr
    public final int j() {
        return this.i;
    }

    public final String toString() {
        int i = this.h;
        String string = this.a.toString();
        String str = i != 1 ? "EXIT_TO_HOME" : "SHOW_UNDO_UX";
        Runnable runnable = this.b;
        ConversationIdType conversationIdType = this.c;
        ParticipantsTable.BindData bindData = this.d;
        int i2 = this.i;
        int i3 = this.j;
        tlo tloVar = this.e;
        tlp tlpVar = this.f;
        int i4 = this.g;
        return "DialogRequest{dialogType=" + string + ", dialogDoneBehavior=" + str + ", onPositiveAction=" + runnable.toString() + ", conversationId=" + conversationIdType.toString() + ", targetParticipant=" + String.valueOf(bindData) + ", scope=" + eofq.c(i2) + ", entryPoint=" + eofp.a(i3) + ", dialogLoggingSource=" + tloVar.toString() + ", dialogTarget=" + tlpVar.toString() + ", anchorViewId=" + i4 + "}";
    }
}
