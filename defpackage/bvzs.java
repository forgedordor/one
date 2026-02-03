package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvzs extends dqwl {
    public bvzs(dqwv dqwvVar) {
        super(dqwvVar);
    }

    @Override // defpackage.dqwl
    public final /* synthetic */ dqqj a(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar) {
        return new bvzr(dqsyVar, cursor, strArr, dqxeVarArr, dqwjVar, dqtmVar, this);
    }

    @Override // defpackage.dqwl
    protected final Map b() {
        String[] strArr = bvzw.a;
        return new HashMap();
    }

    @Override // defpackage.dqwl
    protected final boolean c() {
        return true;
    }

    @Override // defpackage.dqwl
    protected final String[] d() {
        return new String[]{"remote_user_id_to_registration_id.tachyon_registration_id", "remote_registrations_table.tachyon_registration_id", "contacts.phone_number", "remote_user_id_to_registration_id.remote_user_id"};
    }

    @Override // defpackage.dqwl
    protected final String[] e() {
        return new String[]{"remote_user_id_to_registration_id", "remote_registrations_table", "contacts", "remote_user_id_to_registration_id"};
    }
}
