package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dacd implements dacs {
    private static final cqce e = cqce.g("BugleSearch", "LocationCardPresenterImpl");
    public final crqx a;
    public final lvy b;
    public final lvy c;
    public final lvy d;
    private final bxuy f;
    private final eosc g;
    private final daig h;
    private final cogw i;
    private final ajsn j;
    private eiju k;
    private eiju l;
    private final lvy m;

    public dacd(Context context, eosc eoscVar, daig daigVar, crqx crqxVar, cogw cogwVar, ajsn ajsnVar, bxuy bxuyVar) {
        this.g = eoscVar;
        context.getResources();
        this.h = daigVar;
        this.a = crqxVar;
        this.i = cogwVar;
        this.j = ajsnVar;
        this.b = new lvy();
        this.c = new lvy();
        this.m = new lvy();
        this.d = new lvy();
        this.f = bxuyVar;
    }

    private final eiju p() {
        return !TextUtils.isEmpty(j(g().u())) ? eijx.e(Optional.empty()) : eijx.e(Optional.empty());
    }

    @Override // defpackage.dacs
    public final lvv a() {
        return this.c;
    }

    @Override // defpackage.dacs
    public final lvv b() {
        return this.d;
    }

    @Override // defpackage.dacs
    public final lvv c() {
        return this.m;
    }

    @Override // defpackage.dacs
    public final lvv d() {
        return this.b;
    }

    @Override // defpackage.dacs
    public final ConversationId e() {
        bxuy bxuyVar = this.f;
        return this.j.a(bxuyVar.c(), bxuyVar.p(), bxuyVar.q());
    }

    @Override // defpackage.dacs
    public final MessageIdType f() {
        return this.f.d();
    }

    public final bxuy g() {
        eiju eijuVar = this.k;
        if (eijuVar != null && eijuVar.isDone() && !this.k.isCancelled()) {
            try {
                bxuy bxuyVar = (bxuy) eork.q(this.k);
                if (bxuyVar != null) {
                    return bxuyVar;
                }
            } catch (Exception e2) {
                cqbd cqbdVarE = e.e();
                cqbdVarE.v("Failed to get fetch place data.");
                cqbdVarE.s(e2);
            }
        }
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4 A[Catch: IllegalArgumentException -> 0x0136, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IllegalArgumentException -> 0x0136, blocks: (B:27:0x004f, B:29:0x0053, B:30:0x0055, B:47:0x00f5, B:49:0x00fa, B:51:0x00fe, B:52:0x0100, B:54:0x0106, B:55:0x0108, B:37:0x00c4, B:38:0x00ca, B:39:0x00d2, B:42:0x00da, B:44:0x00e0, B:56:0x0121, B:57:0x0126, B:58:0x0127, B:59:0x012c, B:61:0x012e, B:62:0x0135), top: B:82:0x004f, inners: #3 }] */
    @Override // defpackage.dacs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String h() {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dacd.h():java.lang.String");
    }

    public final String i() {
        ezbd ezbdVarS = g().s();
        if (ezbdVarS == null) {
            return "";
        }
        int i = ezbdVarS.b;
        if ((i & 1) == 0) {
            if ((i & 8) == 0) {
                return "";
            }
            ezha ezhaVar = ezbdVarS.f;
            if (ezhaVar == null) {
                ezhaVar = ezha.a;
            }
            return ezhaVar.b;
        }
        ezev ezevVar = ezbdVarS.c;
        if (ezevVar == null) {
            ezevVar = ezev.a;
        }
        ejwc ejwcVar = new ejwc(", ");
        ejvz ejvzVar = new ejvz(ejwcVar, ejwcVar);
        String strA = ejwk.a(ezevVar.e);
        String strA2 = ejwk.a(ezevVar.f);
        ejwc ejwcVar2 = new ejwc(" ");
        return ejvzVar.f(new String[]{strA, strA2, ejwk.a(new ejvz(ejwcVar2, ejwcVar2).f(new String[]{ejwk.a(ezevVar.g), ejwk.a(ezevVar.h)}))});
    }

    public final String j(ezdm ezdmVar) {
        if (ezdmVar == null || ezdmVar.d.isEmpty() || ezdmVar.e <= this.i.f().toEpochMilli()) {
            return null;
        }
        return ezdmVar.d;
    }

    @Override // defpackage.dacs
    public final String k() {
        String strL = l();
        String strI = i();
        String strH = h();
        ejwc ejwcVar = new ejwc("\n");
        String strG = new ejvz(ejwcVar, ejwcVar).g(ejwk.a(strL), ejwk.a(strI), new Object[0]);
        return (TextUtils.isEmpty(strH) || strH.equals(strL)) ? strG : a.q(strH, strG, "\n\n");
    }

    public final String l() {
        bxuy bxuyVarG = g();
        ezbd ezbdVarS = bxuyVarG.s();
        if (ezbdVarS != null && (ezbdVarS.b & 2) != 0) {
            ezer ezerVar = ezbdVarS.d;
            if (ezerVar == null) {
                ezerVar = ezer.a;
            }
            if (!ezerVar.d.isEmpty()) {
                ezer ezerVar2 = ezbdVarS.d;
                if (ezerVar2 == null) {
                    ezerVar2 = ezer.a;
                }
                return ezerVar2.d;
            }
        }
        ezdm ezdmVarU = bxuyVarG.u();
        if (ezdmVarU != null && !ezdmVarU.b.isEmpty()) {
            return ezdmVarU.b;
        }
        if (ezbdVarS != null && (ezbdVarS.b & 1) != 0) {
            ezev ezevVar = ezbdVarS.c;
            if (ezevVar == null) {
                ezevVar = ezev.a;
            }
            ejwc ejwcVar = new ejwc(", ");
            String strF = new ejvz(ejwcVar, ejwcVar).f(new String[]{ejwk.a(ezevVar.b), ejwk.a(ezevVar.c), ejwk.a(ezevVar.d)});
            if (!TextUtils.isEmpty(strF)) {
                return strF;
            }
        }
        return ejwk.b(h());
    }

    @Override // defpackage.dacs
    public final void m() {
        eiju eijuVar = this.k;
        if (eijuVar != null && !eijuVar.isDone()) {
            this.k.cancel(false);
            this.k = null;
        }
        eiju eijuVar2 = this.l;
        if (eijuVar2 == null || eijuVar2.isDone()) {
            return;
        }
        this.l.cancel(false);
        this.l = null;
    }

    @Override // defpackage.dacs
    public final void n() {
        boolean z;
        ecem.c();
        eiju eijuVar = this.k;
        if (eijuVar == null || eijuVar.isCancelled()) {
            this.k = eijx.e(this.f);
            this.l = p();
            z = false;
        } else {
            z = true;
        }
        eiju eijuVar2 = this.l;
        if (eijuVar2 == null || eijuVar2.isCancelled()) {
            this.l = p();
        } else if (z) {
            return;
        }
        this.b.m(l());
        this.c.m(i());
        lvy lvyVar = this.m;
        daig daigVar = this.h;
        bxuy bxuyVar = this.f;
        lvyVar.m(daigVar.d(bxuyVar.a(), bxuyVar.o(), bxuyVar.g(), bxuyVar.b()));
        eiju eijuVar3 = this.l;
        Runnable runnable = new Runnable() { // from class: dacb
            @Override // java.lang.Runnable
            public final void run() {
                dacd dacdVar = this.a;
                if (dacdVar.a.f()) {
                    String strJ = dacdVar.j(dacdVar.g().u());
                    if (TextUtils.isEmpty(strJ)) {
                        return;
                    }
                    dacdVar.d.j(new dacr(strJ));
                }
            }
        };
        eosc eoscVar = this.g;
        eijuVar3.b(runnable, eoscVar);
        this.k.k(auvh.c(new Consumer() { // from class: dacc
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                dacd dacdVar = this.a;
                dacdVar.b.j(dacdVar.l());
                dacdVar.c.j(dacdVar.i());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }), eoscVar);
    }

    @Override // defpackage.dacs
    public final boolean o() {
        return this.f.r();
    }
}
