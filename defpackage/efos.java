package defpackage;

import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class efos extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        efiw efiwVar = (efiw) obj;
        cjhh cjhhVar = (cjhh) cjhi.b.createBuilder();
        d(efiwVar, cjhhVar);
        ejvj ejvjVar = efpw.b;
        cjju cjjuVar = (cjju) ejvjVar.fH().fM(efiwVar.b());
        cjhhVar.copyOnWrite();
        cjhi cjhiVar = (cjhi) cjhhVar.instance;
        cjjuVar.getClass();
        cjhiVar.e = cjjuVar;
        cjhiVar.c |= 2;
        if (efiwVar.d().isPresent() && efiwVar.d().isPresent()) {
            cjju cjjuVar2 = (cjju) ejvjVar.fH().fM(efiwVar.d().get());
            cjhhVar.copyOnWrite();
            cjhi cjhiVar2 = (cjhi) cjhhVar.instance;
            cjjuVar2.getClass();
            cjhiVar2.f = cjjuVar2;
            cjhiVar2.c |= 4;
        }
        cjhm cjhmVar = (cjhm) efpw.a.fH().fM(efiwVar.a());
        cjhhVar.copyOnWrite();
        cjhi cjhiVar3 = (cjhi) cjhhVar.instance;
        cjhmVar.getClass();
        cjhiVar3.g = cjhmVar;
        cjhiVar3.c |= 8;
        if (efiwVar.e().isPresent()) {
            e(efiwVar, cjhhVar);
        }
        if (efiwVar.c().isPresent()) {
            c(efiwVar, cjhhVar);
        }
        return (cjhi) cjhhVar.build();
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        RcsDestinationId rcsDestinationId;
        efiv efivVar;
        cjhi cjhiVar = (cjhi) obj;
        efhk efhkVar = new efhk();
        if ((cjhiVar.c & 1) != 0) {
            g(cjhiVar, efhkVar);
        }
        if ((cjhiVar.c & 2) != 0) {
            ejvj ejvjVar = efpw.b;
            cjju cjjuVar = cjhiVar.e;
            if (cjjuVar == null) {
                cjjuVar = cjju.a;
            }
            RcsDestinationId rcsDestinationId2 = (RcsDestinationId) ejvjVar.fM(cjjuVar);
            if (rcsDestinationId2 == null) {
                throw new NullPointerException("Null sender");
            }
            efhkVar.b = rcsDestinationId2;
        }
        if ((cjhiVar.c & 4) != 0) {
            ejvj ejvjVar2 = efpw.b;
            cjju cjjuVar2 = cjhiVar.f;
            if (cjjuVar2 == null) {
                cjjuVar2 = cjju.a;
            }
            efhkVar.c = Optional.of((RcsDestinationId) ejvjVar2.fM(cjjuVar2));
        }
        if ((cjhiVar.c & 8) != 0) {
            ejvj ejvjVar3 = efpw.a;
            cjhm cjhmVar = cjhiVar.g;
            if (cjhmVar == null) {
                cjhmVar = cjhm.a;
            }
            efiv efivVar2 = (efiv) ejvjVar3.fM(cjhmVar);
            if (efivVar2 == null) {
                throw new NullPointerException("Null content");
            }
            efhkVar.d = efivVar2;
        }
        if ((cjhiVar.c & 16) != 0) {
            h(cjhiVar, efhkVar);
        }
        f(cjhiVar, efhkVar);
        String str = efhkVar.a;
        if (str != null && (rcsDestinationId = efhkVar.b) != null && (efivVar = efhkVar.d) != null) {
            return new efhl(str, rcsDestinationId, efhkVar.c, efivVar, efhkVar.e, efhkVar.f);
        }
        StringBuilder sb = new StringBuilder();
        if (efhkVar.a == null) {
            sb.append(" id");
        }
        if (efhkVar.b == null) {
            sb.append(" sender");
        }
        if (efhkVar.d == null) {
            sb.append(" content");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public void c(efiw efiwVar, cjhh cjhhVar) {
        throw null;
    }

    public abstract void d(efiw efiwVar, cjhh cjhhVar);

    public abstract void e(efiw efiwVar, cjhh cjhhVar);

    public void f(cjhi cjhiVar, efit efitVar) {
        throw null;
    }

    public abstract void g(cjhi cjhiVar, efit efitVar);

    public abstract void h(cjhi cjhiVar, efit efitVar);
}
