package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvzt extends dqws {
    public bvzt(String[] strArr) {
        super("remote_registrations_table INNER JOIN remote_user_id_to_registration_id ON (remote_user_id_to_registration_id.tachyon_registration_id=remote_registrations_table.tachyon_registration_id) INNER JOIN contacts ON (contacts.phone_number=remote_user_id_to_registration_id.remote_user_id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bvzs b() {
        l();
        return new bvzs(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = bvzw.a;
        k(new bvzu((bvzv) function.apply(new bvzv())));
    }
}
