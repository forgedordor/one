package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atrs {
    public static final eksp a = eksp.c("BugleGroupManagement");
    public final atqv b;
    public final atqx c;
    public final attv d;
    public final atuh e;
    public final atsm f;
    public final atue g;
    public final eosc h;
    public final atrh i;
    public final atuj j;
    public final fcsu k;

    public atrs(atqv atqvVar, atqx atqxVar, attv attvVar, atuh atuhVar, atsm atsmVar, atue atueVar, eosc eoscVar, atrh atrhVar, atuj atujVar, fcsu fcsuVar) {
        this.b = atqvVar;
        this.c = atqxVar;
        this.d = attvVar;
        this.e = atuhVar;
        this.f = atsmVar;
        this.g = atueVar;
        this.h = eoscVar;
        this.i = atrhVar;
        this.j = atujVar;
        this.k = fcsuVar;
    }

    public static eiju a(atru atruVar, ConversationIdType conversationIdType, auey aueyVar, cbcw cbcwVar) {
        return cbcwVar.e() ? atruVar.a(conversationIdType, aueyVar) : eijx.e(cbcwVar);
    }
}
