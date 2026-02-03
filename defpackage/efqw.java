package defpackage;

import com.google.android.rcs.client.messaging.data.RcsDestinationId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efqw extends efpa {
    @Override // defpackage.efpa, defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        RcsDestinationId rcsDestinationId = (RcsDestinationId) obj;
        if (rcsDestinationId.b() - 1 != 0) {
            cjjs cjjsVar = (cjjs) cjju.a.createBuilder();
            cjmd cjmdVar = (cjmd) cjme.a.createBuilder();
            String strA = rcsDestinationId.a();
            cjmdVar.copyOnWrite();
            cjme cjmeVar = (cjme) cjmdVar.instance;
            cjmeVar.b = 1 | cjmeVar.b;
            cjmeVar.c = strA;
            cjme cjmeVar2 = (cjme) cjmdVar.build();
            cjjsVar.copyOnWrite();
            cjju cjjuVar = (cjju) cjjsVar.instance;
            cjmeVar2.getClass();
            cjjuVar.c = cjmeVar2;
            cjjuVar.b = 2;
            return (cjju) cjjsVar.build();
        }
        cjjs cjjsVar2 = (cjjs) cjju.a.createBuilder();
        cjjo cjjoVar = (cjjo) cjjp.a.createBuilder();
        String strA2 = rcsDestinationId.a();
        cjjoVar.copyOnWrite();
        cjjp cjjpVar = (cjjp) cjjoVar.instance;
        cjjpVar.b |= 1;
        cjjpVar.c = strA2;
        cjjp cjjpVar2 = (cjjp) cjjoVar.build();
        cjjsVar2.copyOnWrite();
        cjju cjjuVar2 = (cjju) cjjsVar2.instance;
        cjjpVar2.getClass();
        cjjuVar2.c = cjjpVar2;
        cjjuVar2.b = 1;
        return (cjju) cjjsVar2.build();
    }

    @Override // defpackage.efpa, defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        cjju cjjuVar = (cjju) obj;
        int iA = cjjt.a(cjjuVar.b);
        if (iA == 0) {
            throw null;
        }
        int i = iA - 1;
        if (i == 0) {
            efid efidVar = new efid();
            efidVar.c(1);
            efidVar.b((cjjuVar.b == 1 ? (cjjp) cjjuVar.c : cjjp.a).c);
            return efidVar.a();
        }
        if (i != 1) {
            throw new IllegalArgumentException("No valid destination case value set in from.");
        }
        efid efidVar2 = new efid();
        efidVar2.c(2);
        efidVar2.b((cjjuVar.b == 2 ? (cjme) cjjuVar.c : cjme.a).c);
        return efidVar2.a();
    }
}
