package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfhc {
    static final dfny a = dfnv.b("enable_gba_authentication_logging");
    private final Context b;
    private final deyw c;

    public dfhc(Context context, deyw deywVar) {
        this.b = context;
        this.c = deywVar;
    }

    public final void a(int i, ewgv ewgvVar) {
        if (((Boolean) a.a()).booleanValue()) {
            ewig ewigVar = (ewig) ewih.a.createBuilder();
            ewigVar.copyOnWrite();
            ewih ewihVar = (ewih) ewigVar.instance;
            ewihVar.f = 8;
            ewihVar.b |= 2;
            ewigVar.copyOnWrite();
            ewih ewihVar2 = (ewih) ewigVar.instance;
            ewihVar2.g = i - 1;
            ewihVar2.b |= 4;
            ewigVar.copyOnWrite();
            ewih ewihVar3 = (ewih) ewigVar.instance;
            ewgvVar.getClass();
            ewihVar3.d = ewgvVar;
            ewihVar3.c = 11;
            this.c.h(this.b, (ewih) ewigVar.build());
        }
    }
}
