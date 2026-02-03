package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awsa extends dqwl {
    public awsa(dqwv dqwvVar) {
        super(dqwvVar);
    }

    @Override // defpackage.dqwl
    public final /* synthetic */ dqqj a(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar) {
        return new awrv(dqsyVar, cursor, strArr, dqxeVarArr, dqwjVar, dqtmVar, this);
    }

    @Override // defpackage.dqwl
    protected final Map b() {
        String[] strArr = awse.a;
        return new HashMap();
    }

    @Override // defpackage.dqwl
    protected final boolean c() {
        return false;
    }

    @Override // defpackage.dqwl
    protected final String[] d() {
        return new String[0];
    }

    @Override // defpackage.dqwl
    protected final String[] e() {
        return new String[0];
    }
}
