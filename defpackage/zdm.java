package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.format.Formatter;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zdm {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/richcards/RichCardBubbleUiAdapter");
    public static final dltb b = dltb.a;
    public final Context c;
    public final fdjx d;
    public final ConversationId e;
    public final ajmh f;
    public final afzc g;
    public final vvj h;
    public final aqhi i;
    public final fdap j;
    public final fdat k;
    public final fdap l;
    public final fdap m;
    public final fdap n;
    private final fcsu o;
    private final whw p;

    public zdm(Context context, fdjx fdjxVar, ConversationId conversationId, ajmh ajmhVar, arvk arvkVar, whw whwVar, fcsu fcsuVar, afzc afzcVar, vuc vucVar, vvj vvjVar, aqhi aqhiVar) {
        context.getClass();
        fdjxVar.getClass();
        conversationId.getClass();
        ajmhVar.getClass();
        arvkVar.getClass();
        whwVar.getClass();
        fcsuVar.getClass();
        afzcVar.getClass();
        vucVar.getClass();
        vvjVar.getClass();
        this.c = context;
        this.d = fdjxVar;
        this.e = conversationId;
        this.f = ajmhVar;
        this.p = whwVar;
        this.o = fcsuVar;
        this.g = afzcVar;
        this.h = vvjVar;
        this.i = aqhiVar;
        this.j = auxh.a(new zde(this), 1000L, fdjxVar);
        this.k = auxh.d(new zdf(this), fdjxVar);
        this.l = auxh.a(new zdj(this), 1000L, fdjxVar);
        this.m = auxh.a(new zdl(this), 1000L, fdjxVar);
        this.n = auxh.a(new zcx(this), 1000L, fdjxVar);
    }

    private final dkvz d(zcl zclVar, final amuy amuyVar) {
        amuf amufVar = (amuf) amuyVar;
        final amvy amvyVar = amufVar.c;
        amte amteVar = (amte) amvyVar;
        Uri uri = amteVar.b;
        if (!fdbq.f(uri, Uri.EMPTY)) {
            if (!le.z(amteVar.a)) {
                return new dkvw(uri, new fdae() { // from class: zcw
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        this.a.n.invoke(amuyVar);
                        return fctx.a;
                    }
                }, new fdae() { // from class: zcm
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        this.a.l.invoke(amvyVar);
                        return fctx.a;
                    }
                });
            }
            Optional optional = amteVar.c;
            final fdap fdapVar = new fdap() { // from class: zcs
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    return ((Long) obj).toString();
                }
            };
            Optional map = optional.map(new Function() { // from class: zct
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return fdapVar.invoke(obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            map.getClass();
            return new dkvx(uri, (String) fdct.b(map), new fdae() { // from class: zcu
                @Override // defpackage.fdae
                public final Object invoke() {
                    this.a.n.invoke(amuyVar);
                    return fctx.a;
                }
            }, new fdae() { // from class: zcv
                @Override // defpackage.fdae
                public final Object invoke() {
                    this.a.m.invoke(amvyVar);
                    return fctx.a;
                }
            });
        }
        amyb amybVar = amteVar.e;
        if (amybVar != null && ((amxm) amybVar).b) {
            dkvs dkvsVarG = g(amuyVar);
            amvy amvyVar2 = amufVar.b;
            return new dkvy(dkvsVarG, amvyVar2 != null ? amvyVar2.e() : null, null, new fdae() { // from class: zcq
                @Override // defpackage.fdae
                public final Object invoke() {
                    zdm zdmVar = this.a;
                    auvw.k(zdmVar.d, null, null, new zda(zdmVar, amuyVar, null), 3);
                    return fctx.a;
                }
            });
        }
        if (amybVar == null || !((amxm) amybVar).c) {
            final MessageId messageIdB = zclVar.a.b();
            dkvs dkvsVarG2 = g(amuyVar);
            amvy amvyVar3 = amufVar.b;
            return new dkvt(dkvsVarG2, amvyVar3 != null ? amvyVar3.e() : null, Formatter.formatShortFileSize(this.c, amufVar.a.longValue()), new fdae() { // from class: zco
                @Override // defpackage.fdae
                public final Object invoke() {
                    zdm zdmVar = this.a;
                    auvw.k(zdmVar.d, null, null, new zcy(zdmVar, messageIdB, amuyVar, null), 3);
                    return fctx.a;
                }
            });
        }
        final MessageId messageIdB2 = zclVar.a.b();
        dkvs dkvsVarG3 = g(amuyVar);
        amvy amvyVar4 = amufVar.b;
        return new dkvu(dkvsVarG3, amvyVar4 != null ? amvyVar4.e() : null, new fdae() { // from class: zcn
            @Override // defpackage.fdae
            public final Object invoke() {
                zdm zdmVar = this.a;
                auvw.k(zdmVar.d, null, null, new zcz(zdmVar, messageIdB2, amuyVar, null), 3);
                return fctx.a;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [dkuh] */
    /* JADX WARN: Type inference failed for: r5v7, types: [dkuk] */
    /* JADX WARN: Type inference failed for: r5v9, types: [dkui] */
    private final List e(List list) {
        dkuj dkukVar;
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dlfg dlfgVarA = ((zrc) this.o.b()).a((aldp) it.next());
            dkuj dkujVar = null;
            if (dlfgVarA instanceof dlfr) {
                dlfr dlfrVar = (dlfr) dlfgVarA;
                String strC = dlfrVar.c();
                strC.getClass();
                if (dlfrVar instanceof dlfq) {
                    dlfp dlfpVar = ((dlfq) dlfrVar).a;
                    if (dlfpVar instanceof dlfn) {
                        dkukVar = new dkui(((dlfn) dlfpVar).a);
                    } else {
                        if (!(dlfpVar instanceof dlfo)) {
                            throw new fctg();
                        }
                        dkukVar = new dkuk(((dlfo) dlfpVar).a);
                    }
                    dkujVar = dkukVar;
                } else {
                    if (!(dlfrVar instanceof dlfk)) {
                        throw new fctg();
                    }
                    djrr djrrVar = ((dlfk) dlfrVar).a;
                    if (djrrVar != null) {
                        dkujVar = new dkuj(djrrVar);
                    }
                }
                dkujVar = new dkuh(strC, dkujVar, dlfrVar.a());
            }
            arrayList.add(dkujVar);
        }
        return fcva.ae(arrayList);
    }

    private static final amuy f(amuz amuzVar) {
        return amuzVar.a();
    }

    private static final dkvs g(amuy amuyVar) {
        return le.z(((amte) ((amuf) amuyVar).c).a) ? dkvs.b : dkvs.a;
    }

    public final auyl a(fdjx fdjxVar, zcl zclVar) {
        amyb amybVar;
        amvz amvzVar = zclVar.b;
        dkxv dkxvVarB = b(zclVar, null);
        amuz amuzVarA = amvzVar.a();
        amuy amuyVarF = amuzVarA != null ? f(amuzVarA) : null;
        return auyp.a(fdtg.b((amuyVarF == null || (amybVar = ((amte) ((amuf) amuyVarF).c).e) == null) ? new fdpu(dkxvVarB) : new zdd(fdtg.a(anov.a(((amxm) amybVar).a), fdjxVar, fdur.a, 1), this, zclVar), fdjxVar, fdur.a, dkxvVarB));
    }

    public final dkxv b(zcl zclVar, amxz amxzVar) {
        dkvq dkvqVar;
        dkvp dkvpVar;
        amvz amvzVar = zclVar.b;
        dkvq dkvqVar2 = null;
        if (amvzVar instanceof amuc) {
            amwf amwfVarD = amvzVar.d();
            String str = amwfVarD != null ? ((amth) amwfVarD).a : null;
            amwf amwfVarC = amvzVar.c();
            String str2 = amwfVarC != null ? ((amth) amwfVarC).a : null;
            amuc amucVar = (amuc) amvzVar;
            amub amubVar = amucVar.a;
            if (amubVar != null) {
                final amuy amuyVarF = f(amubVar);
                if (amxzVar == null) {
                    dkvpVar = new dkvp(d(zclVar, amuyVarF));
                } else {
                    dkvs dkvsVarG = g(amuyVarF);
                    amvy amvyVar = ((amuf) amuyVarF).b;
                    dkvpVar = new dkvp(new dkvy(dkvsVarG, amvyVar != null ? amvyVar.e() : null, Float.valueOf(amxzVar.a() / amxzVar.b()), new fdae() { // from class: zcr
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            zdm zdmVar = this.a;
                            auvw.k(zdmVar.d, null, null, new zdg(zdmVar, amuyVarF, null), 3);
                            return fctx.a;
                        }
                    }));
                }
            } else {
                dkvpVar = null;
            }
            return new dkxr(str, str2, dkvpVar, e(amvzVar.e()), amucVar.b + (-1) != 0 ? 2 : 1, zclVar.c, new fdae() { // from class: dkxp
                @Override // defpackage.fdae
                public final Object invoke() {
                    return fctx.a;
                }
            }, zclVar.d);
        }
        if (!(amvzVar instanceof amux)) {
            throw new fctg();
        }
        amwf amwfVarD2 = amvzVar.d();
        String str3 = amwfVarD2 != null ? ((amth) amwfVarD2).a : null;
        amwf amwfVarC2 = amvzVar.c();
        String str4 = amwfVarC2 != null ? ((amth) amwfVarC2).a : null;
        amuw amuwVar = ((amux) amvzVar).a;
        if (true != (amuwVar instanceof amuw)) {
            amuwVar = null;
        }
        if (amuwVar != null) {
            int i = amuwVar.a - 1;
            int i2 = i != 0 ? i != 1 ? 264 : 168 : 112;
            final amuy amuyVarF2 = f(amuwVar);
            if (amxzVar == null) {
                dkvqVar2 = new dkvq(d(zclVar, amuyVarF2), i2);
                dkvqVar = dkvqVar2;
            } else {
                dkvs dkvsVarG2 = g(amuyVarF2);
                amvy amvyVar2 = ((amuf) amuyVarF2).b;
                dkvqVar = new dkvq(new dkvy(dkvsVarG2, amvyVar2 != null ? amvyVar2.e() : null, Float.valueOf(amxzVar.a() / amxzVar.b()), new fdae() { // from class: zcp
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        zdm zdmVar = this.a;
                        auvw.k(zdmVar.d, null, null, new zdh(zdmVar, amuyVarF2, null), 3);
                        return fctx.a;
                    }
                }), i2);
            }
        } else {
            dkvqVar = dkvqVar2;
        }
        return new dkxu(str3, str4, dkvqVar, e(amvzVar.e()), zclVar.c, zclVar.d, 68);
    }

    public final void c(aggc aggcVar, vvl vvlVar) {
        String str = aggcVar.a;
        doig doigVarA = dohx.a(str);
        if (doigVarA == null) {
            return;
        }
        whw whwVar = this.p;
        if (vvlVar == null) {
            vvlVar = vuc.a();
        }
        Uri uri = aggcVar.b;
        whwVar.a(new vvo(vvlVar, doigVarA, uri, null, b));
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleRbmRichCard");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/richcards/RichCardBubbleUiAdapter", "processMediaViewerResult", 477, "RichCardBubbleUiAdapter.kt")).D("Draft attachment added with uri: %s media type: %s", uri, str);
    }
}
