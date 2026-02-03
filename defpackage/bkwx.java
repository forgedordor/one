package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bkwx extends dqqf implements dqqj {
    @Deprecated
    public bkwx(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bkwy bkwyVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bkxc.a, dqwjVar, dqtmVar, bkwyVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bkvx();
    }

    public final byte[] c() {
        return getBlob(cO(7, bkxc.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
