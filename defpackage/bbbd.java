package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.LruCache;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbbd {
    public static final /* synthetic */ int a = 0;
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/datamodel/data/participant/ParticipantData");
    private static final LruCache c = new LruCache(1000);

    /* compiled from: PG */
    public interface a {
        fcsu D();

        Context S();

        bacb bw();

        crmx cO();

        cmum cv();

        cmvy cw();

        fcsu gk();

        fcsu gp();

        fcsu gq();

        fcsu gt();

        fcsu gx();

        crny m();

        ains w();
    }

    public static ParticipantsTable.BindData a(String str, String str2, String str3) {
        return e(str, str2, str3).a();
    }

    public static ParticipantsTable.BindData b(String str) {
        return f(str).a();
    }

    public static ParticipantsTable.BindData c(alqm alqmVar, int i) {
        return h(alqmVar, null, i).a();
    }

    public static ParticipantsTable.BindData d(Context context, ParticipantsTable.BindData bindData, String str) {
        ParticipantsTable.BindData bindDataA;
        eieu eieuVarK = eiiy.k("ParticipantData.lookupCequint");
        try {
            bacb bacbVarBw = ((a) cqtf.a(a.class)).bw();
            ParticipantsTable.BindData bindData2 = null;
            if (bindData == null || bindData.u() == -1 || bindData.u() == -2 || bindData.u() == -3 || (bindData.u() == -4 && TextUtils.isEmpty(bindData.Q()))) {
                if (bacbVarBw.b(context)) {
                    baca bacaVarA = bacbVarBw.a(context, str);
                    if (bacaVarA == null || bindData == null) {
                        bindData2 = bindData;
                    } else {
                        if (bacaVarA.d) {
                            brvp brvpVarC = bindData.C();
                            brvpVarC.l(-3L);
                            bindDataA = brvpVarC.a();
                        } else {
                            if (!TextUtils.isEmpty(bacaVarA.a)) {
                                brvp brvpVarC2 = bindData.C();
                                brvpVarC2.N(bacaVarA.b);
                                brvpVarC2.l(-4L);
                                brvpVarC2.u(bacaVarA.a);
                                brvpVarC2.t(bacaVarA.a);
                                bindDataA = brvpVarC2.a();
                            }
                            bindData2 = bindData;
                        }
                        bindData2 = bindDataA;
                    }
                }
            } else if (bindData.u() == -1) {
                ekrw ekrwVarE = b.e();
                ekrwVarE.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/datamodel/data/participant/ParticipantData", "lookupCequint", 755, "ParticipantData.java")).q("lookupCequint skipped because participant is PARTICIPANT_CONTACT_ID_NOT_RESOLVED");
            } else if (bindData.u() == -1) {
                ekrw ekrwVarE2 = b.e();
                ekrwVarE2.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/apps/messaging/shared/datamodel/data/participant/ParticipantData", "lookupCequint", 759, "ParticipantData.java")).q("lookupCequint skipped because participant is PARTICIPANT_CONTACT_ID_NOT_RESOLVED");
            } else if (bindData.u() == -2) {
                ekrw ekrwVarE3 = b.e();
                ekrwVarE3.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarE3).h("com/google/android/apps/messaging/shared/datamodel/data/participant/ParticipantData", "lookupCequint", 762, "ParticipantData.java")).q("lookupCequint skipped because participant is PARTICIPANT_CONTACT_ID_NOT_FOUND");
            } else if (bindData.u() == -4) {
                ekrw ekrwVarE4 = b.e();
                ekrwVarE4.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarE4).h("com/google/android/apps/messaging/shared/datamodel/data/participant/ParticipantData", "lookupCequint", 765, "ParticipantData.java")).q("lookupCequint skipped because participant is PARTICIPANT_CEQUINT_ID and name not null");
            }
            eieuVarK.close();
            return bindData2;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public static brvp e(String str, String str2, String str3) {
        cqce cqceVar = cmvy.a;
        cqaz.k(alwh.i(str));
        if (TextUtils.isEmpty(str2)) {
            a aVar = (a) cqtf.a(a.class);
            String strB = ((chvg) aVar.gq().b()).b();
            ekrw ekrwVarJ = b.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/data/participant/ParticipantData", "buildFromBotInfo", 464, "ParticipantData.java")).t("Participant data was populated with default business name. Bot id: %s", cqcv.b(str));
            aspz aspzVar = (aspz) aVar.gp().b();
            elrm elrmVar = (elrm) elrn.a.createBuilder();
            if (str != null) {
                elrmVar.copyOnWrite();
                elrn elrnVar = (elrn) elrmVar.instance;
                elrnVar.b |= 1;
                elrnVar.c = str;
            }
            elre elreVar = (elre) elrl.a.createBuilder();
            elreVar.copyOnWrite();
            elrl elrlVar = (elrl) elreVar.instance;
            elrlVar.h = 2;
            elrlVar.b |= 32;
            elreVar.copyOnWrite();
            elrl elrlVar2 = (elrl) elreVar.instance;
            elrn elrnVar2 = (elrn) elrmVar.build();
            elrnVar2.getClass();
            elrlVar2.c = elrnVar2;
            elrlVar2.b |= 1;
            elrl elrlVar3 = (elrl) elreVar.build();
            ellg ellgVar = (ellg) ellh.a.createBuilder();
            ellf ellfVar = ellf.BUGLE_RBM_BUSINESS_INFO;
            ellgVar.copyOnWrite();
            ellh ellhVar = (ellh) ellgVar.instance;
            ellhVar.j = ellfVar.f11do;
            ellhVar.b |= 1;
            ellgVar.copyOnWrite();
            ellh ellhVar2 = (ellh) ellgVar.instance;
            elrlVar3.getClass();
            ellhVar2.x = elrlVar3;
            ellhVar2.b |= 131072;
            ((aill) aspzVar.b.b()).j(ellgVar);
            str2 = strB;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = bajp.a();
        }
        brvp brvpVarU = u(str);
        brvpVarU.I(str);
        brvpVarU.q(str2);
        brvpVarU.J(1);
        bbax.d(brvpVarU, ParticipantColor.b(str3));
        return brvpVarU;
    }

    public static brvp f(String str) {
        alrj alrjVar = (alrj) ((a) cqtf.a(a.class)).D().b();
        brvp brvpVarU = u(str);
        String str2 = brvpVarU.g;
        cqce cqceVar = cmvy.a;
        boolean zI = alwh.i(str2);
        alqm alqmVarN = alrjVar.n(brvpVarU.g);
        cczv cczvVar = alvx.a;
        brvpVarU.I(zI ? brvpVarU.g : alrjVar.k(alqmVarN).m(aqbd.a()));
        brvpVarU.q(zI ? brvpVarU.f : j(alrjVar.c(brvpVarU.f, new ejxr() { // from class: bbbb
            @Override // defpackage.ejxr
            public final Object get() {
                return Optional.empty();
            }
        }), alrjVar));
        v(brvpVarU, -1);
        return brvpVarU;
    }

    public static brvp g(final int i, alqm alqmVar) {
        final cmue cmueVarA;
        cmug cmugVar = ((a) cqtf.a(a.class)).cv().a(i).c;
        if (cmugVar != null && (cmueVarA = cmugVar.a(alqmVar)) != null) {
            brvp brvpVar = (brvp) cmueVarA.b.filter(new Predicate() { // from class: bbay
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo538negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    int i2 = bbbd.a;
                    cczv cczvVar = alvx.a;
                    return !TextUtils.isEmpty(((alqm) obj).p(((Boolean) new alvj().get()).booleanValue()));
                }
            }).map(new Function() { // from class: bbaz
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return bbbd.h((alqm) obj, cmueVarA.a, i);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).or(new Supplier() { // from class: bbba
                @Override // java.util.function.Supplier
                public final Object get() {
                    int i2 = bbbd.a;
                    String str = cmueVarA.a;
                    return !TextUtils.isEmpty(str) ? Optional.of(bbbe.a(str)) : Optional.empty();
                }
            }).orElse(null);
            if (brvpVar != null) {
                return brvpVar;
            }
            ekrw ekrwVarJ = b.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/data/participant/ParticipantData", "buildFromMessagingIdentityWithHiddenContacts", 705, "ParticipantData.java")).q("Invalid hidden contacts entry");
        }
        cczv cczvVar = alvx.a;
        if (!((Boolean) new alvm().get()).booleanValue()) {
            boolean zA = ((apzt) ((a) cqtf.a(a.class)).gt().b()).a();
            String strJ = alqmVar.j();
            String strM = zA ? alqmVar.m(((Boolean) alrj.a.e()).booleanValue()) : alqmVar.p(((Boolean) alrj.a.e()).booleanValue());
            strJ.getClass();
            strM.getClass();
            brvp brvpVarU = u(strJ);
            brvpVarU.I(strM);
            brvpVarU.q(ejwk.b(alqmVar.F().a));
            v(brvpVarU, -1);
            return brvpVarU;
        }
        String strN = alqmVar.n();
        strN.getClass();
        brvp brvpVarU2 = u(strN);
        String strL = alqmVar.l();
        strL.getClass();
        brvpVarU2.I(strL);
        String str = alqmVar.F().a;
        str.getClass();
        brvpVarU2.q(str);
        v(brvpVarU2, -1);
        return brvpVarU2;
    }

    public static brvp h(alqm alqmVar, String str, int i) {
        String strP;
        String strL;
        String str2;
        a aVar = (a) cqtf.a(a.class);
        crny crnyVarM = aVar.m();
        crmx crmxVarCO = aVar.cO();
        boolean zA = ((apzt) aVar.gt().b()).a();
        if (zA) {
            cczv cczvVar = alvx.a;
            ((Boolean) new alux().get()).booleanValue();
            strP = alqmVar.k(false);
        } else {
            cczv cczvVar2 = alvx.a;
            ((Boolean) new alux().get()).booleanValue();
            strP = alqmVar.p(false);
        }
        brvp brvpVarU = u(strP);
        String str3 = brvpVarU.g;
        cqce cqceVar = cmvy.a;
        boolean zI = alwh.i(str3);
        alqm alqmVarH = crnyVarM.h(i).h(brvpVarU.g);
        if (zA) {
            strL = alqmVar.l();
            str2 = alqmVar.F().a;
        } else {
            String strN = zI ? brvpVarU.g : alqmVarH.n();
            String strP2 = zI ? strN : ((Boolean) new alvi().get()).booleanValue() ? alqmVarH.F().a : crmxVarCO.p(strN);
            strL = strN;
            str2 = strP2;
        }
        if (true == TextUtils.isEmpty(str)) {
            str = str2;
        }
        bbcf.d(strL, 2);
        bbcf.d(str, 3);
        if (true != zA) {
            str2 = str;
        }
        brvpVarU.I(strL);
        brvpVarU.q(str2);
        brvpVarU.u(str);
        v(brvpVarU, i);
        return brvpVarU;
    }

    public static brvp i(int i, String str) {
        cmue cmueVarA;
        a aVar = (a) cqtf.a(a.class);
        cmum cmumVarCv = aVar.cv();
        alrj alrjVar = (alrj) aVar.D().b();
        cmuh cmuhVarA = cmumVarCv.a(i);
        cmug cmugVar = cmuhVarA.c;
        int i2 = cmuhVarA.a;
        if (cmugVar != null && (cmueVarA = cmugVar.a(aVar.m().h(i2).h(str))) != null) {
            String str2 = (String) cmueVarA.b.map(new Function() { // from class: bbbc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i3 = bbbd.a;
                    cczv cczvVar = alvx.a;
                    return ((alqm) obj).p(((Boolean) new alvj().get()).booleanValue());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(null);
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            String str3 = cmueVarA.a;
            if (!zIsEmpty) {
                brvp brvpVarH = h(alrjVar.n(str2), str3, i);
                p(brvpVarH, str2, 1, aVar);
                return brvpVarH;
            }
            if (!TextUtils.isEmpty(str3)) {
                brvp brvpVarA = bbbe.a(str3);
                p(brvpVarA, str3, 2, aVar);
                return brvpVarA;
            }
            cqaz.c("Invalid hidden contacts entry");
        }
        brvp brvpVarH2 = h(alrjVar.n(str), null, i);
        p(brvpVarH2, str, 3, aVar);
        return brvpVarH2;
    }

    public static String j(alqm alqmVar, alrj alrjVar) {
        cczv cczvVar = alvx.a;
        boolean zA = aqbd.a();
        return alrjVar.i(alqmVar, !zA).G(zA).toString();
    }

    public static Collection k(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((ParticipantsTable.BindData) it.next()).V());
        }
        return arrayList;
    }

    static boolean l(brvp brvpVar, boolean z) {
        return TextUtils.equals(brvpVar.g, true != z ? "EMERGENCY+SERVICE+PROVIDER" : "EMERGENCY+SERVICE+PROVIDER+DEMO");
    }

    public static boolean m(ParticipantsTable.BindData bindData) {
        return n(bindData.V());
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00da A[EDGE_INSN: B:40:0x00be->B:49:0x00da BREAK  A[LOOP:0: B:25:0x006c->B:41:0x00c4, LOOP_LABEL: LOOP:0: B:25:0x006c->B:41:0x00c4]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean n(java.lang.String r11) {
        /*
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            android.util.LruCache r1 = defpackage.bbbd.c
            java.lang.Object r2 = r1.get(r11)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 != 0) goto Le3
            java.lang.Class<bbbd$a> r2 = bbbd.a.class
            java.lang.Object r2 = defpackage.cqtf.a(r2)
            bbbd$a r2 = (bbbd.a) r2
            cmum r3 = r2.cv()
            cmvy r4 = r2.cw()
            fcsu r2 = r2.gk()
            java.lang.Object r2 = r2.b()
            aqbh r2 = (defpackage.aqbh) r2
            boolean r2 = r2.a()
            if (r2 == 0) goto L3c
            boolean r2 = defpackage.alpd.a(r11)
            if (r2 != 0) goto Ldb
            boolean r2 = defpackage.alpd.b(r11)
            if (r2 == 0) goto L3c
            goto Ldb
        L3c:
            boolean r2 = android.text.TextUtils.isEmpty(r11)
            if (r2 != 0) goto Ldb
            java.lang.String r2 = "ʼUNKNOWN_SENDER!ʼ"
            boolean r2 = android.text.TextUtils.equals(r11, r2)
            r5 = 1
            if (r2 != 0) goto Lda
            java.lang.String r2 = "ʼWAP_PUSH_SI!ʼ"
            boolean r2 = android.text.TextUtils.equals(r11, r2)
            if (r2 != 0) goto Lda
            boolean r2 = android.text.TextUtils.isEmpty(r11)
            if (r2 == 0) goto L5b
            goto Lcc
        L5b:
            cmuo r2 = r3.d
            r2.b()
            java.util.concurrent.locks.Lock r3 = r2.b
            r3.lock()
            android.util.SparseArray r3 = r2.d     // Catch: java.lang.Throwable -> Ld3
            int r6 = r3.size()     // Catch: java.lang.Throwable -> Ld3
            r7 = r0
        L6c:
            if (r7 >= r6) goto Lc7
            java.lang.Object r8 = r3.valueAt(r7)     // Catch: java.lang.Throwable -> Ld3
            cmuh r8 = (defpackage.cmuh) r8     // Catch: java.lang.Throwable -> Ld3
            cmug r8 = r8.c     // Catch: java.lang.Throwable -> Ld3
            if (r8 == 0) goto Lc4
            boolean r9 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> Ld3
            if (r9 == 0) goto L7f
            goto Lc4
        L7f:
            java.util.List r8 = r8.a     // Catch: java.lang.Throwable -> Ld3
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Ld3
        L85:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> Ld3
            if (r9 == 0) goto Lc4
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> Ld3
            cmue r9 = (defpackage.cmue) r9     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r10 = r9.a     // Catch: java.lang.Throwable -> Ld3
            boolean r10 = r11.equals(r10)     // Catch: java.lang.Throwable -> Ld3
            if (r10 == 0) goto L85
            j$.util.Optional r9 = r9.b     // Catch: java.lang.Throwable -> Ld3
            boolean r10 = r9.isEmpty()     // Catch: java.lang.Throwable -> Ld3
            if (r10 != 0) goto Lbe
            java.lang.Object r9 = r9.get()     // Catch: java.lang.Throwable -> Ld3
            alqm r9 = (defpackage.alqm) r9     // Catch: java.lang.Throwable -> Ld3
            cczv r10 = defpackage.alvx.a     // Catch: java.lang.Throwable -> Ld3
            alvj r10 = new alvj     // Catch: java.lang.Throwable -> Ld3
            r10.<init>()     // Catch: java.lang.Throwable -> Ld3
            java.lang.Object r10 = r10.get()     // Catch: java.lang.Throwable -> Ld3
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> Ld3
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> Ld3
            boolean r9 = r9.x(r10)     // Catch: java.lang.Throwable -> Ld3
            if (r9 == 0) goto L85
        Lbe:
            java.util.concurrent.locks.Lock r0 = r2.b
            r0.unlock()
            goto Lda
        Lc4:
            int r7 = r7 + 1
            goto L6c
        Lc7:
            java.util.concurrent.locks.Lock r2 = r2.b
            r2.unlock()
        Lcc:
            boolean r2 = r4.k(r11)
            if (r2 != 0) goto Ldb
            goto Lda
        Ld3:
            r11 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.b
            r0.unlock()
            throw r11
        Lda:
            r0 = r5
        Ldb:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r1.put(r11, r2)
            return r0
        Le3:
            boolean r11 = r2.booleanValue()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbbd.n(java.lang.String):boolean");
    }

    public static boolean o(ParticipantsTable.BindData bindData) {
        bvdz bvdzVarD;
        return !TextUtils.isEmpty(bindData.S()) || bbbe.d(bindData) || bbdl.k(bindData) || (bvdzVarD = bindData.D()) == bvdz.VERIFICATION_IN_PROGRESS || bvdzVarD == bvdz.VERIFICATION_VERIFIED;
    }

    public static void p(brvp brvpVar, String str, int i, a aVar) {
        if (bbcf.c(str) || !bbcf.c(brvpVar.g)) {
            return;
        }
        ekrw ekrwVarJ = b.j();
        ekrwVarJ.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/data/participant/ParticipantData", "checkSendDestination", 645, "ParticipantData.java")).t("buildFromRawPhoneBySimCountryWithHiddenContacts encountered empty/whitespace send destination and non-empty/whitespace input destination. EmptyDestinationSource: %s", i != 1 ? i != 2 ? "VISIBLE_CONTACT" : "HIDDEN_CONTACT_WITH_DISPLAY_NAME" : "HIDDEN_CONTACT_WITH_RETURN_NUMBER");
        aVar.w().e("Bugle.Datamodel.ParticipantData.BuildFromRawPhoneBySimCountryWithHiddenContacts.EmptySendDestination", i);
    }

    public static int q(ParticipantsTable.BindData bindData) {
        cmvy cmvyVarCw = ((a) cqtf.a(a.class)).cw();
        String strV = bindData.V();
        if (alwh.k(strV)) {
            return 2;
        }
        return cmvyVarCw.j(strV) ? 3 : 4;
    }

    @Deprecated
    public static ParticipantsTable.BindData r(qxf qxfVar) {
        a aVar = (a) cqtf.a(a.class);
        fcsu fcsuVarD = aVar.D();
        boolean zA = ((apzt) aVar.gt().b()).a();
        String[] strArr = ParticipantsTable.a;
        brvq brvqVar = new brvq();
        s(brvqVar);
        brvqVar.T(-2);
        brvqVar.S(-1);
        brvqVar.R(cssr.b(qxfVar.c));
        alqm alqmVarS = ((alrj) fcsuVarD.b()).s(qxfVar);
        brvqVar.I(zA ? alqmVarS.l() : alqmVarS.o());
        brvqVar.q(alqmVarS.F().a);
        brvqVar.u(qxfVar.b);
        brvqVar.t(null);
        brvqVar.N(qxfVar.i);
        brvqVar.l(qxfVar.f);
        if (brvqVar.q < 0) {
            brvqVar.l(-1L);
        }
        brvqVar.D(qxfVar.k);
        brvqVar.e(false);
        brvqVar.U(0);
        brvqVar.V(null);
        brvqVar.p(qxfVar.g.longValue());
        v(brvqVar, -1);
        return brvqVar.a();
    }

    public static void s(brvp brvpVar) {
        brvpVar.v(null);
    }

    public static String t(Collection collection) {
        return TextUtils.join(" ", k(collection));
    }

    private static brvp u(String str) {
        bbcf.d(str, 1);
        String[] strArr = ParticipantsTable.a;
        brvq brvqVar = new brvq();
        s(brvqVar);
        brvqVar.T(-2);
        brvqVar.S(-1);
        brvqVar.R(cssr.b(str));
        brvqVar.u(null);
        brvqVar.t(null);
        brvqVar.N(null);
        brvqVar.l(-1L);
        brvqVar.D(null);
        brvqVar.e(false);
        brvqVar.U(0);
        brvqVar.V(null);
        return brvqVar;
    }

    private static void v(brvp brvpVar, int i) {
        a aVar = (a) cqtf.a(a.class);
        Resources resources = aVar.S().getResources();
        fcsu fcsuVarGk = aVar.gk();
        if (TextUtils.equals(brvpVar.g, "ʼUNKNOWN_SENDER!ʼ")) {
            brvpVar.q(resources.getString(R.string.unknown_sender));
            brvpVar.u(brvpVar.h);
            brvpVar.l(-2L);
            return;
        }
        if (TextUtils.equals(brvpVar.g, "ʼWAP_PUSH_SI!ʼ")) {
            brvpVar.q(resources.getString(R.string.wap_push_from));
            brvpVar.u(brvpVar.h);
            brvpVar.l(-2L);
            return;
        }
        if (TextUtils.equals(brvpVar.g, ((a) cqtf.a(a.class)).cv().a(i).i())) {
            brvpVar.q(resources.getString(R.string.spam_reporting_from));
            brvpVar.u(brvpVar.h);
            brvpVar.l(-2L);
            return;
        }
        if (((aqbh) fcsuVarGk.b()).a() && l(brvpVar, false)) {
            brvpVar.q(resources.getString(R.string.recipient_title_satellite));
            brvpVar.u(brvpVar.h);
            brvpVar.l(-2L);
            return;
        }
        if (((aqbh) fcsuVarGk.b()).a() && l(brvpVar, true)) {
            brvpVar.q(resources.getString(R.string.recipient_title_satellite_demo));
            brvpVar.u(brvpVar.h);
            brvpVar.l(-2L);
        } else if (((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue()) {
            Optional optional = (Optional) ((a) cqtf.a(a.class)).gx().b();
            if (optional.isPresent() && ((cgsa) optional.get()).r().equals(brvpVar.g)) {
                cgsa cgsaVar = (cgsa) ((Optional) aVar.gx().b()).get();
                brvpVar.q(cgsaVar.s());
                brvpVar.u(cgsaVar.s());
                brvpVar.N(cgsaVar.c());
                brvpVar.J(3);
                brvpVar.l(-2L);
            }
        }
    }
}
