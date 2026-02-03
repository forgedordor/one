package defpackage;

import android.database.Cursor;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmfm extends dqqf implements dqqj {
    @Deprecated
    public bmfm(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bmfn bmfnVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bmfr.a, dqwjVar, dqtmVar, bmfnVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bmet();
    }

    public final Uri c() {
        String string = getString(cO(7, bmfr.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
