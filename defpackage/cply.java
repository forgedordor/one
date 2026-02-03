package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cply extends cpua {
    private final ParticipantsTable.BindData a;
    private final long b;
    private final btxd c;

    public cply(ParticipantsTable.BindData bindData, long j, btxd btxdVar) {
        this.a = bindData;
        this.b = j;
        this.c = btxdVar;
    }

    @Override // defpackage.cpua
    public final long a() {
        return this.b;
    }

    @Override // defpackage.cpua
    public final ParticipantsTable.BindData b() {
        return this.a;
    }

    @Override // defpackage.cpua
    public final btxd c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        btxd btxdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cpua) {
            cpua cpuaVar = (cpua) obj;
            if (this.a.equals(cpuaVar.b()) && this.b == cpuaVar.a() && ((btxdVar = this.c) != null ? btxdVar.equals(cpuaVar.c()) : cpuaVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        btxd btxdVar = this.c;
        int iHashCode2 = btxdVar == null ? 0 : btxdVar.hashCode();
        long j = this.b;
        return (((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ iHashCode2;
    }

    public final String toString() {
        btxd btxdVar = this.c;
        return "CmsParticipantData{participant=" + this.a.toString() + ", linkPreviewCount=" + this.b + ", selfParticipantData=" + String.valueOf(btxdVar) + "}";
    }
}
