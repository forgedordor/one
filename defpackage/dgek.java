package defpackage;

import android.os.Message;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgek extends dgdq {
    public dgek(dgfg dgfgVar) {
        super(dgfgVar);
    }

    @Override // defpackage.dfna, defpackage.dfmy
    public final String a() {
        return "DisabledState";
    }

    @Override // defpackage.dgdq, defpackage.dfna, defpackage.dfmy
    public final boolean e(Message message) {
        int i = message.what;
        if (i == 4 || i == 7 || i == 8) {
            return true;
        }
        return super.e(message);
    }
}
