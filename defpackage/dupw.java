package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dupw implements eyif {
    private final dupu a;
    private final eyik b;
    private final eyik c;
    private final eyik d;
    private final eyik e;
    private final eyik f;
    private final eyik g;

    public dupw(dupu dupuVar, eyik eyikVar, eyik eyikVar2, eyik eyikVar3, eyik eyikVar4, eyik eyikVar5, eyik eyikVar6) {
        this.a = dupuVar;
        this.b = eyikVar;
        this.c = eyikVar2;
        this.d = eyikVar3;
        this.e = eyikVar4;
        this.f = eyikVar5;
        this.g = eyikVar6;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        Context contextB = ((duoq) this.b).b();
        Uri uri = (Uri) this.c.b();
        durk durkVar = (durk) this.e.b();
        dult dultVarB = ((dulu) this.f).b();
        ejwi ejwiVar = (ejwi) this.g.b();
        ecji ecjiVarH = ecjj.h();
        ecjiVarH.f(uri);
        ecjiVarH.e(dtsk.a);
        ecjiVarH.g(false);
        dupu dupuVar = this.a;
        ecjiVarH.h(duuf.b(contextB, dupuVar.a, durkVar, dultVarB, ejwiVar));
        return dupuVar.b.a(ecjiVarH.a());
    }
}
