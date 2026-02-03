package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bkwz extends dqws {
    public bkwz(String[] strArr) {
        super("remote_user_id_to_registration_id JOIN remote_registrations_table ON (remote_registrations_table.tachyon_registration_id=remote_user_id_to_registration_id.tachyon_registration_id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bkwy b() {
        l();
        return new bkwy(this.a.a());
    }

    public final void c(Function function) {
        String[] strArr = bkxc.a;
        k(new bkxa((bkxb) function.apply(new bkxb())));
    }
}
