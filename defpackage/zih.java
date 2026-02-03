package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import j$.util.Optional;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zih {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/video2/VideoBubbleUiAdapter");
    public static final dltb b = dltb.a;
    private final whw A;
    public final fdjx c;
    public final Context d;
    public final fcyh e;
    public final fcsu f;
    public final afzc g;
    public final fcsu h;
    public final arma i;
    public final xvb j;
    public final aptj k;
    public final aqzm l;
    public final aqkb m;
    public final vvj n;
    public final arlz o;
    public final aqhi p;
    public final Optional q;
    public final ahax r;
    public final fctc s;
    public final ajmh t;
    public final Set u;
    public final fdax v;
    public final fdap w;
    public final fdap x;
    public final agdt y;
    private final Conversation z;

    public zih(final fdjx fdjxVar, Context context, fcyh fcyhVar, Conversation conversation, fcsu fcsuVar, afzc afzcVar, whw whwVar, agdt agdtVar, fcsu fcsuVar2, arma armaVar, final fcsu fcsuVar3, xvb xvbVar, aptj aptjVar, aqzm aqzmVar, vuc vucVar, aqkb aqkbVar, vvj vvjVar, arlz arlzVar, aqhi aqhiVar, Optional optional, ahax ahaxVar) {
        fdjxVar.getClass();
        context.getClass();
        fcyhVar.getClass();
        conversation.getClass();
        fcsuVar.getClass();
        afzcVar.getClass();
        whwVar.getClass();
        armaVar.getClass();
        fcsuVar3.getClass();
        aqzmVar.getClass();
        vucVar.getClass();
        vvjVar.getClass();
        ahaxVar.getClass();
        this.c = fdjxVar;
        this.d = context;
        this.e = fcyhVar;
        this.z = conversation;
        this.f = fcsuVar;
        this.g = afzcVar;
        this.A = whwVar;
        this.y = agdtVar;
        this.h = fcsuVar2;
        this.i = armaVar;
        this.j = xvbVar;
        this.k = aptjVar;
        this.l = aqzmVar;
        this.m = aqkbVar;
        this.n = vvjVar;
        this.o = arlzVar;
        this.p = aqhiVar;
        this.q = optional;
        this.r = ahaxVar;
        this.s = fctd.a(new fdae() { // from class: zhi
            @Override // defpackage.fdae
            public final Object invoke() {
                return (ahnv) fcsuVar3.b();
            }
        });
        this.t = conversation.c();
        this.u = new LinkedHashSet();
        auvw.k(fdjxVar, null, null, new zhs(this, null), 3);
        final zif zifVar = new zif(this);
        final fdci fdciVar = new fdci();
        this.v = new fdax() { // from class: auwv
            @Override // defpackage.fdax
            public final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                fdci fdciVar2 = fdciVar;
                if (fdciVar2.a == null) {
                    fdciVar2.a = auvw.k(fdjxVar, null, null, new auxg(zifVar, obj, obj2, obj3, obj4, obj5, obj6, fdciVar2, null), 3);
                }
                return fctx.a;
            }
        };
        this.w = auxh.a(new zid(this), 1000L, fdjxVar);
        this.x = auxh.a(new zib(this), 1000L, fdjxVar);
    }

    public final zgr a(zij zijVar, final zgp zgpVar) {
        amvx amvxVarH;
        int iOrdinal;
        if (!crtr.e() || this.q.isEmpty() || !zgpVar.d || (amvxVarH = zgpVar.e.h()) == null || (iOrdinal = amvxVarH.ordinal()) == 0 || iOrdinal == 1) {
            return zijVar;
        }
        if (iOrdinal == 2) {
            return new zgn(zijVar, false, new fdae() { // from class: zhf
                @Override // defpackage.fdae
                public final Object invoke() {
                    zih zihVar = this.a;
                    auvw.k(zihVar.c, null, null, new zhx(zihVar, zgpVar, null), 3);
                    return fctx.a;
                }
            }, null, null, 26);
        }
        if (iOrdinal == 3) {
            return new zgn(zijVar, false, null, this.d.getString(R.string.spatula_warning), new fdae() { // from class: zhg
                @Override // defpackage.fdae
                public final Object invoke() {
                    zih zihVar = this.a;
                    auvw.k(zihVar.c, null, null, new zhy(zihVar, zgpVar, null), 3);
                    return fctx.a;
                }
            }, 6);
        }
        if (iOrdinal == 4) {
            return new zgn(zijVar, false, null, this.d.getString(R.string.spatula_warning), new fdae() { // from class: zhh
                @Override // defpackage.fdae
                public final Object invoke() {
                    final zih zihVar = this.a;
                    final zgp zgpVar2 = zgpVar;
                    zihVar.r.e(new fdap() { // from class: zho
                        /* JADX WARN: Type inference failed for: r1v1, types: [aaef, java.lang.Object] */
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            final ahat ahatVar = (ahat) obj;
                            ahatVar.getClass();
                            final zih zihVar2 = zihVar;
                            ?? r1 = zihVar2.q.get();
                            fdae fdaeVar = new fdae() { // from class: zhm
                                @Override // defpackage.fdae
                                public final Object invoke() {
                                    ahatVar.a();
                                    return fctx.a;
                                }
                            };
                            final zgp zgpVar3 = zgpVar2;
                            return r1.b(new aaee(fdaeVar, new fdae() { // from class: zhn
                                @Override // defpackage.fdae
                                public final Object invoke() {
                                    zih zihVar3 = zihVar2;
                                    auvw.k(zihVar3.c, null, null, new zhz(zihVar3, zgpVar3, null), 3);
                                    ahatVar.a();
                                    return fctx.a;
                                }
                            }, zgpVar3.c));
                        }
                    });
                    return fctx.a;
                }
            }, 6);
        }
        if (iOrdinal == 5) {
            return new zgn(zijVar, true, null, null, null, 28);
        }
        throw new fctg();
    }

    public final void b(aggc aggcVar, vvl vvlVar) {
        doig doigVarA = dohx.a(aggcVar.a);
        if (doigVarA == null) {
            return;
        }
        whw whwVar = this.A;
        if (vvlVar == null) {
            vvlVar = vuc.a();
        }
        whwVar.a(new vvo(vvlVar, doigVarA, aggcVar.b, null, b));
    }
}
