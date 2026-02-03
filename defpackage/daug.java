package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daug {
    public static final ctcj a(Intent intent) {
        ctcj ctcjVar = ctcj.WELCOME_FLOW_UNSPECIFIED;
        ctcj ctcjVarB = ctcj.b(intent.getIntExtra("INTENT_EXTRA_WELCOME_FLOW_TRIGGER_SOURCE", ctcjVar.g));
        return ctcjVarB == null ? ctcjVar : ctcjVarB;
    }
}
