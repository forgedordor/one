package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bjjl extends dqqf implements dqqj {
    @Deprecated
    public bjjl(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bjjn bjjnVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bjju.a, dqwjVar, dqtmVar, bjjnVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bjdn();
    }

    public final MessageIdType c() {
        return new MessageIdType(getLong(cO(0, bjju.a)));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
