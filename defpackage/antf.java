package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.DefaultRecipient;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class antf implements anty, cqto {
    private static final ekrg j = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/recipient/DefaultRecipientRepository");
    public final Context a;
    public final eosc b;
    public final cqtq c;
    public final alrj d;
    public final anqr e;
    public final fcsu f;
    public final fcsu g;
    public final Optional h;
    public final fcsu i;
    private final eosc k;
    private final aokp l;
    private final anuh m;
    private final fcsu n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;
    private final fcsu r;
    private final fcsu s;
    private final fcsu t;
    private final fcsu u;
    private final Optional v;

    public antf(Context context, eosc eoscVar, eosc eoscVar2, aokp aokpVar, cqtp cqtpVar, alrj alrjVar, anqr anqrVar, anuh anuhVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, Optional optional, Optional optional2, fcsu fcsuVar11) {
        this.a = context;
        this.b = eoscVar;
        this.k = eoscVar2;
        this.l = aokpVar;
        this.c = cqtpVar.a(this);
        this.d = alrjVar;
        this.e = anqrVar;
        this.m = anuhVar;
        this.n = fcsuVar;
        this.p = fcsuVar2;
        this.q = fcsuVar3;
        this.r = fcsuVar4;
        this.s = fcsuVar5;
        this.t = fcsuVar6;
        this.u = fcsuVar7;
        this.f = fcsuVar8;
        this.g = fcsuVar9;
        this.o = fcsuVar10;
        this.h = optional;
        this.v = optional2;
        this.i = fcsuVar11;
    }

    public static bsbm k(ConversationId conversationId) {
        final BugleConversationId bugleConversationId = new BugleConversationId(conversationId.b());
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("getActiveRecipientParticipantsQuery");
        bsum bsumVarB = ProfilesTable.a().b();
        bstk bstkVar = ProfilesTable.c.b;
        brzh brzhVar = ParticipantsTable.c;
        dqtr dqtrVarI = dqts.i(bsumVarB, bstkVar, brzhVar.a);
        ((dqos) dqtrVarI).e = "profiles_table_join_tag";
        bsboVarE.H(dqtrVarI.g());
        bnfb bnfbVarA = bnfe.a();
        bnfbVarA.d(new Function() { // from class: ansg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bndv bndvVar = (bndv) obj;
                return new bndw[]{bndvVar.h, bndvVar.b, bndvVar.a, bndvVar.i};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dqtr dqtrVarI2 = dqts.i(bnfbVarA.b(), bnfe.c.b, brzhVar.q);
        ((dqos) dqtrVarI2).e = "contacts_table_join_tag";
        bsboVarE.H(dqtrVarI2.g());
        bsboVarE.h(new Function() { // from class: ansh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                bsbxVar.v(-2);
                brdr brdrVarD = MessagesTable.d();
                brdrVarD.f(new Function() { // from class: ansj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((bran) obj2).c;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                final BugleConversationId bugleConversationId2 = bugleConversationId;
                brdrVarD.h(new Function() { // from class: ansl
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        brec brecVar = (brec) obj2;
                        brecVar.m(bugleConversationId2.a);
                        return brecVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bsbxVar.l(brdrVarD.b());
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return bsboVarE.b();
    }

    public static bsbm l(final ekgb ekgbVar) {
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("getAllRecipientParticipantsByIdQuery");
        bsboVarE.h(new Function() { // from class: anse
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                bsbxVar.v(-2);
                Stream map = Collection.EL.stream(ekgbVar).map(new Function() { // from class: anre
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((anue) obj2).a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = ekgb.d;
                bsbxVar.m((Iterable) map.collect(ekcv.a));
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dqtr dqtrVarI = dqts.i(ProfilesTable.a().b(), ProfilesTable.c.b, ParticipantsTable.c.a);
        ((dqos) dqtrVarI).e = "profiles_table_join_tag";
        bsboVarE.H(dqtrVarI.g());
        return bsboVarE.b();
    }

    public static bsbm m(ConversationId conversationId) {
        final BugleConversationId bugleConversationId = new BugleConversationId(conversationId.b());
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("getAllRecipientParticipantsForConversationQuery");
        bsum bsumVarB = ProfilesTable.a().b();
        bstk bstkVar = ProfilesTable.c.b;
        brzh brzhVar = ParticipantsTable.c;
        dqtr dqtrVarI = dqts.i(bsumVarB, bstkVar, brzhVar.a);
        ((dqos) dqtrVarI).e = "profiles_table_join_tag";
        bsboVarE.H(dqtrVarI.g());
        bnfb bnfbVarA = bnfe.a();
        bnfbVarA.d(new Function() { // from class: anrt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bndv bndvVar = (bndv) obj;
                return new bndw[]{bndvVar.h, bndvVar.b, bndvVar.a, bndvVar.i};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dqtr dqtrVarI2 = dqts.i(bnfbVarA.b(), bnfe.c.b, brzhVar.q);
        ((dqos) dqtrVarI2).e = "contacts_table_join_tag";
        bsboVarE.H(dqtrVarI2.g());
        bsboVarE.h(new Function() { // from class: anru
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                bsbxVar.v(-2);
                String[] strArr = boiv.a;
                boiq boiqVar = new boiq(boiv.a);
                boiqVar.e(new Function() { // from class: ansp
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((boic) obj2).b;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                final BugleConversationId bugleConversationId2 = bugleConversationId;
                boiqVar.f(new Function() { // from class: ansq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        boiu boiuVar = (boiu) obj2;
                        boiuVar.b(bugleConversationId2.a);
                        return boiuVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bsbxVar.l(boiqVar.b());
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return bsboVarE.b();
    }

    public static bsbm n(final ekgb ekgbVar) {
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("getRecipientsByMessagingIdentityQuery");
        bsboVarE.h(new Function() { // from class: ansf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                bsbxVar.v(-2);
                final ekgb ekgbVar2 = ekgbVar;
                bsbxVar.b(new Function() { // from class: anrx
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bsbx bsbxVar2 = (bsbx) obj2;
                        Stream streamFilter = Collection.EL.stream(ekgbVar2).map(new Function() { // from class: anrf
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                return ((alqm) obj3).l();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).filter(new Predicate() { // from class: anrg
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
                            public final boolean test(Object obj3) {
                                return Objects.nonNull((String) obj3);
                            }
                        });
                        int i = ekgb.d;
                        bsbxVar2.s((Iterable) streamFilter.collect(ekcv.a));
                        return bsbxVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: anry
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bsbx bsbxVar2 = (bsbx) obj2;
                        Stream map = Collection.EL.stream(ekgbVar2).map(new Function() { // from class: anrv
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                return ((alqm) obj3).j();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int i = ekgb.d;
                        bsbxVar2.ap(new dqpm("participants.send_destination", 3, bsbx.as((Iterable) map.collect(ekcv.a)), false));
                        return bsbxVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dqtr dqtrVarI = dqts.i(ProfilesTable.a().b(), ProfilesTable.c.b, ParticipantsTable.c.a);
        ((dqos) dqtrVarI).e = "profiles_table_join_tag";
        bsboVarE.H(dqtrVarI.g());
        return bsboVarE.b();
    }

    public final ekgb A(ekgb ekgbVar) {
        Stream map = Collection.EL.stream(((LinkedHashMap) Collection.EL.stream(ekgbVar).collect(Collectors.toMap(new Function() { // from class: anri
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ParticipantsTable.BindData) obj).R();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, Function$CC.identity(), new BinaryOperator() { // from class: anrj
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return (ParticipantsTable.BindData) obj;
            }
        }, new Supplier() { // from class: anrk
            @Override // java.util.function.Supplier
            public final Object get() {
                return new LinkedHashMap();
            }
        }))).values()).map(new Function() { // from class: anrl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.j((ParticipantsTable.BindData) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        return (ekgb) map.collect(ekcv.a);
    }

    public final ekgp B(ekgb ekgbVar) {
        final ekgi ekgiVar = new ekgi();
        Collection.EL.stream(ekgbVar).forEach(new Consumer() { // from class: anta
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                anue anueVar = new anue(bindData.R());
                bindData.getClass();
                ekgiVar.i(anueVar, this.a.j(bindData));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return ekgiVar.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ekgp C(ekgb ekgbVar) {
        HashSet hashSet = new HashSet();
        ekgi ekgiVar = new ekgi();
        int size = ekgbVar.size();
        for (int i = 0; i < size; i++) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) ekgbVar.get(i);
            alqm alqmVarQ = this.d.q(bindData);
            if (hashSet.add(alqmVarQ)) {
                ekgiVar.i(alqmVarQ, this.e.a(bindData, alqmVarQ));
            } else {
                ekrw ekrwVarJ = j.j();
                ekrwVarJ.X(eksq.a, "BugleRecipients");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/api/messaging/recipient/DefaultRecipientRepository", "getRecipientsByMessagingIdentityFromParticipantRows", 757, "DefaultRecipientRepository.java")).q("Error: duplicate recipient found using getRecipientsByMessagingIdentityFromParticipantRows");
            }
        }
        return ekgiVar.c();
    }

    @Override // defpackage.anty
    public final anpj D(ekgb ekgbVar, int i) {
        Stream map = Collection.EL.stream(ekgbVar).map(new Function() { // from class: ansd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Recipient) obj).g();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i2 = ekgb.d;
        ekgb ekgbVar2 = (ekgb) map.collect(ekcv.a);
        anxz anxzVar = (anxz) this.s.b();
        eosc eoscVar = (eosc) anxzVar.a.b();
        eoscVar.getClass();
        eosc eoscVar2 = (eosc) anxzVar.b.b();
        eoscVar2.getClass();
        awlc awlcVar = (awlc) anxzVar.c.b();
        awlcVar.getClass();
        awhr awhrVar = (awhr) anxzVar.d.b();
        awhrVar.getClass();
        awhr awhrVar2 = (awhr) anxzVar.e.b();
        awhrVar2.getClass();
        cqtp cqtpVar = (cqtp) anxzVar.f.b();
        cqtpVar.getClass();
        ekgbVar2.getClass();
        return new anxy(eoscVar, eoscVar2, awlcVar, awhrVar, awhrVar2, cqtpVar, ekgbVar2, i);
    }

    @Override // defpackage.anty
    public final eiju E(final anue anueVar, chpb chpbVar, chpc chpcVar) {
        try {
            eieu eieuVarK = eiiy.k("updatePhotoUriAndSource");
            try {
                Uri uriA = chpcVar.a;
                if (uriA != null && !uriA.toString().isEmpty() && chpcVar.b == chpq.PROFILE_PEOPLE_SHARING_SOURCE) {
                    uriA = ((drjk) this.u.b()).a(160, uriA);
                }
                bsbs bsbsVarF = ParticipantsTable.f();
                bsbsVarF.ap("updatePhotoUriAndSource");
                bsbsVarF.U(new Function() { // from class: ansy
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsbx bsbxVar = (bsbx) obj;
                        bsbxVar.k(anueVar.a);
                        return bsbxVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bsbsVarF.M(uriA);
                String str = chpbVar.e;
                bsbsVarF.r(str);
                bsbsVarF.v(str);
                bsbsVarF.J(chpcVar.b);
                eiju eijuVarH = bsbsVarF.b().i().h(new ejvr() { // from class: ansz
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return Boolean.valueOf(((Integer) obj).intValue() == 1);
                    }
                }, this.b);
                eieuVarK.b(eijuVarH);
                eieuVarK.close();
                return eijuVarH;
            } finally {
            }
        } catch (drji unused) {
            return eijx.e(false);
        }
    }

    @Override // defpackage.anty
    public final eiju F(final efwo efwoVar, final anue anueVar, final chpm chpmVar) {
        final eieu eieuVarK = eiiy.k("updatePhotoPreference");
        try {
            eiju eijuVar = (eiju) this.h.map(new Function() { // from class: anqx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    final aoay aoayVar = (aoay) obj;
                    bsbs bsbsVarF = ParticipantsTable.f();
                    bsbsVarF.ap("updatePhotoPreference");
                    final anue anueVar2 = anueVar;
                    bsbsVarF.U(new Function() { // from class: ansr
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            bsbx bsbxVar = (bsbx) obj2;
                            bsbxVar.k(anueVar2.a);
                            return bsbxVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int iIntValue = ParticipantsTable.i().intValue();
                    int iIntValue2 = ParticipantsTable.i().intValue();
                    if (iIntValue2 < 60060) {
                        dqru.x("profile_photo_user_preference", iIntValue2);
                    }
                    if (iIntValue >= 60060) {
                        chpm chpmVar2 = chpmVar;
                        if (chpmVar2 == null) {
                            bsbsVarF.a.putNull("profile_photo_user_preference");
                        } else {
                            bsbsVarF.a.put("profile_photo_user_preference", Integer.valueOf(chpmVar2.a()));
                        }
                    }
                    final efwo efwoVar2 = efwoVar;
                    eieu eieuVar = eieuVarK;
                    final antf antfVar = this.a;
                    eiju eijuVarI = bsbsVarF.b().i().i(new eooz() { // from class: anss
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            Integer num = (Integer) obj2;
                            if (num == null || num.intValue() != 1) {
                                return eijx.e(false);
                            }
                            anue anueVar3 = anueVar2;
                            return aoayVar.a(efwoVar2, antfVar, anueVar3);
                        }
                    }, antfVar.b);
                    eieuVar.b(eijuVarI);
                    return eijuVarI;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElseGet(new Supplier() { // from class: anqy
                @Override // java.util.function.Supplier
                public final Object get() {
                    return eijx.e(false);
                }
            });
            eieuVarK.close();
            return eijuVar;
        } finally {
        }
    }

    @Override // defpackage.anty
    public final eiju G(final anue anueVar, chpc chpcVar) {
        try {
            eieu eieuVarK = eiiy.k("updatePhotoUriAndSource");
            try {
                Uri uriA = chpcVar.a;
                if (uriA != null && !uriA.toString().isEmpty() && chpcVar.b == chpq.PROFILE_PEOPLE_SHARING_SOURCE) {
                    uriA = ((drjk) this.u.b()).a(160, uriA);
                }
                bsbs bsbsVarF = ParticipantsTable.f();
                bsbsVarF.ap("updatePhotoUriAndSource");
                bsbsVarF.U(new Function() { // from class: anqz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsbx bsbxVar = (bsbx) obj;
                        bsbxVar.k(anueVar.a);
                        return bsbxVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bsbsVarF.M(uriA);
                bsbsVarF.J(chpcVar.b);
                eiju eijuVarH = bsbsVarF.b().i().h(new ejvr() { // from class: anra
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return Boolean.valueOf(((Integer) obj).intValue() == 1);
                    }
                }, this.b);
                eieuVarK.b(eijuVarH);
                eieuVarK.close();
                return eijuVarH;
            } finally {
            }
        } catch (drji unused) {
            return eijx.e(false);
        }
    }

    @Override // defpackage.anty
    public final eiju H(final anue anueVar, final antu antuVar) {
        eieu eieuVarK = eiiy.k("updateProfileReceivingMetadata");
        try {
            eiju eijuVarG = eijx.g(new Callable() { // from class: ansx
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final antf antfVar = this.a;
                    dqsn dqsnVar = (dqsn) antfVar.g.b();
                    final anue anueVar2 = anueVar;
                    final antu antuVar2 = antuVar;
                    return (Boolean) dqsnVar.c("updateProfileReceivingMetadata", new ejxr() { // from class: anrb
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.ejxr
                        public final Object get() {
                            antf antfVar2 = antfVar;
                            final ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) ((bbca) antfVar2.f.b()).f(anueVar2.a).get(0);
                            ProfilesTable.BindData bindDataA = anur.a(bindData);
                            bsrs bsrsVarS = bindDataA.s();
                            antu antuVar3 = antuVar2;
                            bsrsVarS.m(antuVar3.a);
                            bsrsVarS.p(antuVar3.c);
                            String str = antuVar3.b;
                            bsrsVarS.j(str);
                            if (!TextUtils.equals(bindDataA.y(), str)) {
                                bsrsVarS.o("0");
                            }
                            return Boolean.valueOf(bsrsVarS.a().H(new Function() { // from class: ansi
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    bsur bsurVar = (bsur) obj;
                                    bsurVar.b(Long.parseLong(bindData.R()));
                                    return bsurVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }));
                        }
                    });
                }
            }, this.k);
            eieuVarK.close();
            return eijuVarG;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.anty
    public final eiju I(final anue anueVar, alwm alwmVar) {
        eieu eieuVarK = eiiy.k("updateUINormStatus");
        try {
            bsbs bsbsVarF = ParticipantsTable.f();
            bsbsVarF.ap("updateUINormStatus");
            bsbsVarF.U(new Function() { // from class: anrd
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsbx bsbxVar = (bsbx) obj;
                    bsbxVar.k(anueVar.a);
                    return bsbxVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bsbsVarF.G(alwmVar);
            eiju eijuVarH = bsbsVarF.b().i().h(new ejvr() { // from class: anro
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return Boolean.valueOf(((Integer) obj).intValue() == 1);
                }
            }, this.b);
            eieuVarK.b(eijuVarH);
            eieuVarK.close();
            return eijuVarH;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.anty
    public final eiju J(final ekgb ekgbVar, final SelfIdentityId selfIdentityId, final int i, final evvp evvpVar) {
        return eijx.g(new Callable() { // from class: anqs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final antf antfVar = this.a;
                dqsn dqsnVar = (dqsn) antfVar.g.b();
                final ekgb ekgbVar2 = ekgbVar;
                final int i2 = i;
                final evvp evvpVar2 = evvpVar;
                final SelfIdentityId selfIdentityId2 = selfIdentityId;
                return (Boolean) dqsnVar.c("bulkUpdateProfileSendingState", new ejxr() { // from class: ansn
                    @Override // defpackage.ejxr
                    public final Object get() {
                        bsbo bsboVarE = ParticipantsTable.e();
                        bsboVarE.A("bulkUpdateProfileSendingState");
                        final ekgb ekgbVar3 = ekgbVar2;
                        bsboVarE.h(new Function() { // from class: anrm
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bsbx bsbxVar = (bsbx) obj;
                                bsbxVar.m((Iterable) Collection.EL.stream(ekgbVar3).map(new Function() { // from class: ansv
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        return ((anue) obj2).a;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).collect(ekcv.a));
                                return bsbxVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        brzj brzjVar = (brzj) bsboVarE.b().p();
                        antf antfVar2 = antfVar;
                        SelfIdentityId selfIdentityId3 = selfIdentityId2;
                        boolean zH = true;
                        while (true) {
                            try {
                                final ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) brzjVar.cS();
                                if (bindData == null) {
                                    Boolean boolValueOf = Boolean.valueOf(zH);
                                    brzjVar.close();
                                    return boolValueOf;
                                }
                                ProfilesTable.BindData bindDataA = anur.a(bindData);
                                chpw chpwVar = (chpw) Optional.ofNullable(bindDataA.t()).orElse(chpw.a);
                                chpx chpxVar = (chpx) chpy.a.createBuilder();
                                chpxVar.copyOnWrite();
                                ((chpy) chpxVar.instance).c = i2 - 2;
                                evvp evvpVar3 = evvpVar2;
                                if (evvpVar3 != null) {
                                    chpxVar.copyOnWrite();
                                    chpy chpyVar = (chpy) chpxVar.instance;
                                    chpyVar.d = evvpVar3;
                                    chpyVar.b |= 1;
                                }
                                chpy chpyVar2 = (chpy) chpxVar.build();
                                bsrs bsrsVarS = bindDataA.s();
                                chpu chpuVar = (chpu) chpwVar.toBuilder();
                                String strB = selfIdentityId3.b();
                                chpyVar2.getClass();
                                chpuVar.copyOnWrite();
                                chpw chpwVar2 = (chpw) chpuVar.instance;
                                evub evubVar = chpwVar2.b;
                                if (!evubVar.b) {
                                    chpwVar2.b = evubVar.a();
                                }
                                chpwVar2.b.put(strB, chpyVar2);
                                bsrsVarS.n((chpw) chpuVar.build());
                                zH &= bsrsVarS.a().H(new Function() { // from class: anrn
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        bsur bsurVar = (bsur) obj;
                                        bsurVar.b(Long.parseLong(bindData.R()));
                                        return bsurVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                            } catch (Throwable th) {
                                try {
                                    brzjVar.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    }
                });
            }
        }, this.k);
    }

    @Override // defpackage.anty
    public final eiju K(int i) {
        Optional optional = this.h;
        if (optional.isEmpty()) {
            return eijx.e(false);
        }
        aobn aobnVar = (aobn) optional.get();
        fdjx fdjxVar = aobnVar.c;
        fcyi fcyiVar = fcyi.a;
        return auvw.a(fdin.b(fdjxVar, eicg.a(fcyiVar), fdjz.a, new aobh(null, aobnVar, this, i)));
    }

    @Override // defpackage.anty
    public final anpj a(ekgb ekgbVar, Duration duration) {
        ahkz ahkzVar = (ahkz) this.t.b();
        Stream map = Collection.EL.stream(ekgbVar).map(new Function() { // from class: anrw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Recipient) obj).g();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        ekgb ekgbVar2 = (ekgb) map.collect(ekcv.a);
        ahkn ahknVar = ahkzVar.a.a;
        ahnh ahnhVar = ahknVar.a;
        return new anyj((awlc) ahnhVar.xB.b(), ahnhVar.cT(), (cqtp) ahknVar.dK.b(), (fdjx) ahnhVar.m.b(), (cogw) ahknVar.cD.b(), ekgbVar2, duration);
    }

    @Override // defpackage.anty
    public final anpj d(final ConversationId conversationId) {
        return ((antp) this.r.b()).a(new fdat() { // from class: answ
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                return Boolean.valueOf(((Set) obj).contains(conversationId));
            }
        }, new ante(this, conversationId));
    }

    @Override // defpackage.anty
    public final anpj e(final ConversationId conversationId) {
        return ((antp) this.r.b()).a(new fdat() { // from class: ansb
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                return Boolean.valueOf(((Set) obj).contains(conversationId));
            }
        }, new antd(this, conversationId));
    }

    @Override // defpackage.anty
    public final anpj f(ekgb ekgbVar) {
        return ((antp) this.p.b()).a(new fdat() { // from class: anso
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                return Boolean.valueOf(!((Set) obj).isEmpty());
            }
        }, new antc(this, ekgbVar));
    }

    @Override // defpackage.cqto
    public final void fJ() {
        boolean z;
        Uri uriH = bace.h(this.a);
        anqw anqwVar = new anqw(this);
        aokp aokpVar = this.l;
        Object obj = aokpVar.d;
        synchronized (obj) {
            synchronized (obj) {
                z = aokpVar.e != null;
            }
        }
        ejwl.b(!z, "Already registered");
        ContentResolver contentResolver = aokpVar.a.getContentResolver();
        aokpVar.e = new aoko(aokpVar, anqwVar);
        contentResolver.registerContentObserver(uriH, true, aokpVar.e);
    }

    @Override // defpackage.cqto
    public final void fK() {
        aokp aokpVar = this.l;
        synchronized (aokpVar.d) {
            ContentResolver contentResolver = aokpVar.a.getContentResolver();
            ContentObserver contentObserver = aokpVar.e;
            if (contentObserver != null) {
                contentResolver.unregisterContentObserver(contentObserver);
                aokpVar.e = null;
            }
        }
    }

    @Override // defpackage.anty
    public final anpj g(ekgb ekgbVar) {
        ejwl.b(!ekgbVar.isEmpty(), "Set of input MIs for getRecipientsByMessagingIdentity cannot be empty.");
        return ((antp) this.q.b()).a(new fdat() { // from class: ansk
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                return Boolean.valueOf(!((Set) obj).isEmpty());
            }
        }, new antb(this, ekgbVar));
    }

    @Override // defpackage.anty
    public final Recipient h(alqm alqmVar) {
        return this.e.a(this.m.a(alqmVar), alqmVar);
    }

    @Override // defpackage.anty
    public final Recipient i(qxf qxfVar) {
        alrj alrjVar = this.d;
        return this.e.a(this.m.b(qxfVar), alrjVar.s(qxfVar));
    }

    public final ResolvedRecipient j(ParticipantsTable.BindData bindData) {
        return this.e.a(bindData, this.d.q(bindData));
    }

    @Override // defpackage.anty
    public final cquc o(antx antxVar, String str) {
        return this.c.a(antxVar, "Subscribe Recipient updates", str, "Unsubscribe Recipient updates");
    }

    @Override // defpackage.anty
    public final eiju p(final alqm alqmVar) {
        eieu eieuVarK = eiiy.k("getRecipientByMessagingIdentity");
        try {
            eiju eijuVarH = q(ekgb.r(alqmVar)).h(new ejvr() { // from class: ansu
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return (ResolvedRecipient) ((ekgp) obj).get(alqmVar);
                }
            }, this.b);
            eieuVarK.b(eijuVarH);
            eieuVarK.close();
            return eijuVarH;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final eiju q(ekgb ekgbVar) {
        eieu eieuVarK = eiiy.k("getRecipientsByMessagingIdentity");
        try {
            ejwl.b(!ekgbVar.isEmpty(), "Set of input MIs for getRecipientsByMessagingIdentity cannot be empty.");
            eiju eijuVarH = n(ekgbVar).x().h(new ejvr() { // from class: anrc
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ekgb ekgbVar2 = (ekgb) obj;
                    return ekgbVar2.isEmpty() ? ekoj.a : this.a.C(ekgbVar2);
                }
            }, this.b);
            eieuVarK.b(eijuVarH);
            eieuVarK.close();
            return eijuVarH;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.anty
    public final eiju r(Recipient recipient) {
        eieu eieuVarK = eiiy.k("resolveRecipient");
        try {
            eiju eijuVarH = s(ekgb.r(recipient)).h(new ejvr() { // from class: anrs
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return (ResolvedRecipient) ((ekgb) obj).get(0);
                }
            }, this.b);
            eieuVarK.close();
            return eijuVarH;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.anty
    public final eiju s(final ekgb ekgbVar) {
        eieu eieuVarK = eiiy.k("resolveRecipients");
        try {
            eiju eijuVarG = eijx.g(new Callable() { // from class: anqu
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final antf antfVar = this.a;
                    dqsn dqsnVar = (dqsn) antfVar.g.b();
                    final ekgb ekgbVar2 = ekgbVar;
                    return (ekgb) dqsnVar.c("DefaultRecipientRepository#resolveRecipients", new ejxr() { // from class: anqv
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.ejxr
                        public final Object get() {
                            int i = ekgb.d;
                            ekfw ekfwVar = new ekfw();
                            ekgb ekgbVar3 = ekgbVar2;
                            int size = ekgbVar3.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                antf antfVar2 = antfVar;
                                ParticipantsTable.BindData bindData = ((DefaultRecipient) ((Recipient) ekgbVar3.get(i2))).b;
                                fcsu fcsuVar = antfVar2.f;
                                ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) ((bbca) fcsuVar.b()).f(((bbca) fcsuVar.b()).i(bindData)).get(0);
                                ekfwVar.h(antfVar2.e.a(bindData2, antfVar2.d.q(bindData2)));
                            }
                            return ekfwVar.g();
                        }
                    });
                }
            }, this.k);
            eieuVarK.close();
            return eijuVarG;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.anty
    public final eiju t() {
        Optional optional = this.h;
        if (optional.isEmpty()) {
            return eijx.e(false);
        }
        aobn aobnVar = (aobn) optional.get();
        return auvw.c(aobnVar.c, fcyi.a, fdjz.a, new aobg(aobnVar, this, null));
    }

    @Override // defpackage.anty
    public final eiju u(ConversationId conversationId, ekgb ekgbVar) {
        anvt anvtVar = (anvt) this.n.b();
        BugleConversationId bugleConversationId = new BugleConversationId(conversationId.b());
        ekgbVar.getClass();
        return auvw.c(anvtVar.a, fcyi.a, fdjz.a, new anvs(anvtVar, bugleConversationId, ekgbVar, null));
    }

    @Override // defpackage.anty
    public final eiju v(ekgb ekgbVar) {
        eieu eieuVarK = eiiy.k("syncRecipientsWithChangedContacts");
        try {
            eiju eijuVarA = ((anzv) this.o.b()).a(ekgbVar);
            eieuVarK.b(eijuVarA);
            eieuVarK.close();
            return eijuVarA;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.anty
    public final eiju w(ekhx ekhxVar) {
        eieu eieuVarK = eiiy.k("syncRecipientsWithDeletedContacts");
        try {
            eiju eijuVarB = ((anzv) this.o.b()).b(ekhxVar);
            eieuVarK.b(eijuVarB);
            eieuVarK.close();
            return eijuVarB;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final eiju x(efwo efwoVar, ekgb ekgbVar, boolean z) {
        Optional optional = this.h;
        if (optional.isEmpty()) {
            return eijx.e(ekoj.a);
        }
        Object obj = optional.get();
        ekgbVar.getClass();
        aobn aobnVar = (aobn) obj;
        fdjx fdjxVar = aobnVar.c;
        fcyi fcyiVar = fcyi.a;
        return auvw.a(fdin.b(fdjxVar, eicg.a(fcyiVar), fdjz.a, new aobl(null, aobnVar, this, efwoVar, ekgbVar, z)));
    }

    @Override // defpackage.anty
    public final eiju y(final efwo efwoVar, ConversationId conversationId) {
        return e(conversationId).b().i(new eooz() { // from class: anqt
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.x(efwoVar, (ekgb) obj, false);
            }
        }, this.b);
    }

    @Override // defpackage.anty
    public final eiju z(final ekgb ekgbVar) {
        ejwl.a(Collection.EL.stream(ekgbVar).allMatch(new Predicate() { // from class: anrp
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
                return ((ResolvedRecipient) obj) instanceof anug;
            }
        }));
        this.v.ifPresent(new Consumer() { // from class: anrq
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                csyy csyyVar = (csyy) ((fcsu) obj).b();
                Stream map = Collection.EL.stream(ekgbVar).map(new Function() { // from class: ansm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((anug) ((ResolvedRecipient) obj2)).n();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = ekgb.d;
                csyyVar.c((List) map.collect(ekcv.a));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return eijx.e(null);
    }
}
