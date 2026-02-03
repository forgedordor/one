package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axly extends aydf {
    public final alqm a;
    public final ParticipantsTable.BindData b;

    public axly(alqm alqmVar, ParticipantsTable.BindData bindData) {
        this.a = alqmVar;
        if (bindData == null) {
            throw new NullPointerException("Null rawSender");
        }
        this.b = bindData;
    }

    @Override // defpackage.aydf
    public final alqm a() {
        return this.a;
    }

    @Override // defpackage.aydf
    public final ParticipantsTable.BindData b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aydf) {
            aydf aydfVar = (aydf) obj;
            if (this.a.equals(aydfVar.a()) && this.b.equals(aydfVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SenderInfo{messagingIdentity=" + ((alqk) this.a).o() + ", rawSender=" + this.b.toString() + "}";
    }
}
