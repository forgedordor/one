package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csem {
    private final Context a;
    private final fcsu b;

    public csem(Context context, fcsu fcsuVar) {
        context.getClass();
        fcsuVar.getClass();
        this.a = context;
        this.b = fcsuVar;
    }

    public static final csdo c(ConversationIdType conversationIdType, boolean z) {
        Integer num = (Integer) crtr.a.e();
        int iIntValue = num.intValue() - baxe.d(conversationIdType);
        num.getClass();
        float fIntValue = num.intValue();
        return new csdo(((float) Math.max(iIntValue / (fIntValue + fIntValue), 0.0d)) + (true != z ? 0.5f : 0.0f));
    }

    public final String a() {
        return ((crmx) this.b.b()).r();
    }

    public final String b() {
        String string = craf.c(this.a).toString();
        string.getClass();
        return string;
    }
}
