package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tjl extends tjm {
    public final ParticipantsTable.BindData a;

    public tjl(ParticipantsTable.BindData bindData) {
        this.a = bindData;
    }

    @Override // defpackage.tjm, defpackage.tlp
    public final ParticipantsTable.BindData a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tlp) {
            tlp tlpVar = (tlp) obj;
            tlpVar.b();
            if (this.a.equals(tlpVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DialogTarget{participant=" + this.a.toString() + "}";
    }

    @Override // defpackage.tlp
    public final void b() {
    }
}
