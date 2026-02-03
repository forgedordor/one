package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dewm {
    public static final ekgb a;
    public static final dfny b;
    private final Context c;
    private final deyw d;

    static {
        int i = ekgb.d;
        a = ekoe.a;
        b = dfnv.b("enable_tuple_info_logging_for_request_availability_api");
        dfnv.b("enable_tuple_info_logging_for_request_capability_api");
    }

    public dewm(Context context, deyw deywVar) {
        this.c = context;
        this.d = deywVar;
    }

    public final void a(ewih ewihVar) {
        this.d.h(this.c, ewihVar);
    }

    public final void b(long j, int i, long j2) {
        ewiw ewiwVar = (ewiw) ewjd.a.createBuilder();
        ewiwVar.copyOnWrite();
        ewjd ewjdVar = (ewjd) ewiwVar.instance;
        ewjdVar.b |= 2;
        ewjdVar.d = i;
        if (j2 > 0) {
            ewiwVar.copyOnWrite();
            ewjd ewjdVar2 = (ewjd) ewiwVar.instance;
            ewjdVar2.b |= 4;
            ewjdVar2.e = j2;
        }
        ewig ewigVar = (ewig) ewih.a.createBuilder();
        ewigVar.copyOnWrite();
        ewih ewihVar = (ewih) ewigVar.instance;
        ewihVar.b |= 1;
        ewihVar.e = j;
        ewigVar.copyOnWrite();
        ewih ewihVar2 = (ewih) ewigVar.instance;
        ewihVar2.f = 2;
        ewihVar2.b |= 2;
        ewigVar.copyOnWrite();
        ewih ewihVar3 = (ewih) ewigVar.instance;
        ewihVar3.g = 3;
        ewihVar3.b |= 4;
        ewigVar.copyOnWrite();
        ewih ewihVar4 = (ewih) ewigVar.instance;
        ewjd ewjdVar3 = (ewjd) ewiwVar.build();
        ewjdVar3.getClass();
        ewihVar4.d = ewjdVar3;
        ewihVar4.c = 3;
        a((ewih) ewigVar.build());
    }
}
