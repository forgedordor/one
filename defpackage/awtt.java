package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awtt extends axcy {
    private final ParticipantsTable.BindData a;
    private final Optional b;

    public awtt(ParticipantsTable.BindData bindData, Optional optional) {
        if (bindData == null) {
            throw new NullPointerException("Null selfParticipant");
        }
        this.a = bindData;
        this.b = optional;
    }

    @Override // defpackage.axcy
    public final ParticipantsTable.BindData a() {
        return this.a;
    }

    @Override // defpackage.axcy
    public final Optional b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof axcy) {
            axcy axcyVar = (axcy) obj;
            if (this.a.equals(axcyVar.a()) && this.b.equals(axcyVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Optional optional = this.b;
        return "Subscription{selfParticipant=" + this.a.toString() + ", messagingIdentity=" + optional.toString() + "}";
    }
}
