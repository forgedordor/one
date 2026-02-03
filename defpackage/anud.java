package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anud extends anuf {
    private final ProfilesTable.BindData a;
    private final boolean b;

    public anud(ProfilesTable.BindData bindData, boolean z) {
        this.a = bindData;
        this.b = z;
    }

    @Override // defpackage.anuf
    public final ProfilesTable.BindData a() {
        return this.a;
    }

    @Override // defpackage.anuf
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anuf) {
            anuf anufVar = (anuf) obj;
            ProfilesTable.BindData bindData = this.a;
            if (bindData != null ? bindData.equals(anufVar.a()) : anufVar.a() == null) {
                if (this.b == anufVar.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        ProfilesTable.BindData bindData = this.a;
        return (((bindData == null ? 0 : bindData.hashCode()) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "CreateProfileResult{profile=" + String.valueOf(this.a) + ", newlyCreated=" + this.b + "}";
    }
}
