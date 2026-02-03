package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqoj extends dqwl {
    public bqoj(dqwv dqwvVar) {
        super(dqwvVar);
    }

    @Override // defpackage.dqwl
    public final /* synthetic */ dqqj a(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar) {
        return new bqoe(dqsyVar, cursor, strArr, dqxeVarArr, dqwjVar, dqtmVar, this);
    }

    @Override // defpackage.dqwl
    protected final Map b() {
        String[] strArr = bqoo.a;
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
