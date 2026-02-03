package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgbu {
    private final Context a;
    private final deyw b;

    public dgbu(Context context, deyw deywVar) {
        this.a = context;
        this.b = deywVar;
    }

    final void a(String str, String str2, int i) {
        ewis ewisVar = (ewis) ewit.a.createBuilder();
        ewisVar.copyOnWrite();
        ewit ewitVar = (ewit) ewisVar.instance;
        str.getClass();
        ewitVar.b |= 2;
        ewitVar.d = str;
        ewisVar.copyOnWrite();
        ewit ewitVar2 = (ewit) ewisVar.instance;
        str2.getClass();
        ewitVar2.b |= 1;
        ewitVar2.c = str2;
        ewil ewilVar = (ewil) ewin.a.createBuilder();
        ewilVar.copyOnWrite();
        ewin ewinVar = (ewin) ewilVar.instance;
        ewinVar.b |= 1;
        ewinVar.c = i;
        ewilVar.copyOnWrite();
        ewin ewinVar2 = (ewin) ewilVar.instance;
        ewinVar2.d = 3;
        ewinVar2.b |= 2;
        ewisVar.copyOnWrite();
        ewit ewitVar3 = (ewit) ewisVar.instance;
        ewin ewinVar3 = (ewin) ewilVar.build();
        ewinVar3.getClass();
        ewitVar3.i = ewinVar3;
        ewitVar3.b |= 64;
        b((ewit) ewisVar.build());
    }

    public final void b(ewit ewitVar) {
        ewig ewigVar = (ewig) ewih.a.createBuilder();
        ewigVar.copyOnWrite();
        ewih ewihVar = (ewih) ewigVar.instance;
        ewihVar.f = 4;
        ewihVar.b |= 2;
        ewigVar.copyOnWrite();
        ewih ewihVar2 = (ewih) ewigVar.instance;
        ewihVar2.g = 2;
        ewihVar2.b = 4 | ewihVar2.b;
        ewigVar.copyOnWrite();
        ewih ewihVar3 = (ewih) ewigVar.instance;
        ewitVar.getClass();
        ewihVar3.d = ewitVar;
        ewihVar3.c = 6;
        this.b.h(this.a, (ewih) ewigVar.build());
    }
}
