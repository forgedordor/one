package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bhjv extends dqqf implements dqqj {
    @Deprecated
    public bhjv(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bhjw bhjwVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bhka.a, dqwjVar, dqtmVar, bhjwVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bgzz();
    }

    public final int c() {
        return getInt(cO(60, bhka.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
