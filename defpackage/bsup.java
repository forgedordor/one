package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsup extends dqye {
    public bsup() {
        super("profiles_table");
    }

    @Override // defpackage.dqye
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bsuo b() {
        ah();
        return new bsuo(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(String str) {
        int iIntValue = ProfilesTable.c().intValue();
        int iIntValue2 = ProfilesTable.c().intValue();
        if (iIntValue2 < 60170) {
            dqru.x("person_id", iIntValue2);
        }
        if (iIntValue >= 60170) {
            dqru.v(this.a, "person_id", str);
        }
    }

    public final void d(String str) {
        int iIntValue = ProfilesTable.c().intValue();
        int iIntValue2 = ProfilesTable.c().intValue();
        if (iIntValue2 < 60170) {
            dqru.x("profile_access_token", iIntValue2);
        }
        if (iIntValue >= 60170) {
            dqru.v(this.a, "profile_access_token", str);
        }
    }

    public final void e(String str) {
        int iIntValue = ProfilesTable.c().intValue();
        int iIntValue2 = ProfilesTable.c().intValue();
        if (iIntValue2 < 60170) {
            dqru.x("sender_last_updated_time", iIntValue2);
        }
        if (iIntValue >= 60170) {
            dqru.v(this.a, "sender_last_updated_time", str);
        }
    }

    public final void f(String str) {
        int iIntValue = ProfilesTable.c().intValue();
        int iIntValue2 = ProfilesTable.c().intValue();
        if (iIntValue2 < 60200) {
            dqru.x("sender_last_updated_time_from_rcs", iIntValue2);
        }
        if (iIntValue >= 60200) {
            dqru.v(this.a, "sender_last_updated_time_from_rcs", str);
        }
    }
}
