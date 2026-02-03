package defpackage;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementContentType;
import com.google.android.rcs.client.messaging.data.AutoValue_Conversation;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.GroupMember;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfrg extends dgym implements dgwo {
    private final eosc f;
    private final dgwa g;
    private final crmx h;
    private final eblg i;
    private final fcsu j;
    private final dgzn k;
    private dezn l;
    private dgwm m;
    public static final dfny a = dfnv.b("ignore_group_notifications_with_state_deleted");
    private static final dfny c = dfod.a(177836135);
    private static final dfny d = dfod.a(160405329);
    public static final dfny b = dfnv.b("ignore_group_notifications_after_leaving");
    private static final ekhx e = new ekph("application/conference-info+xml");

    public dfrg(eosc eoscVar, dgwa dgwaVar, crmx crmxVar, eblg eblgVar, fcsu fcsuVar, dgzn dgznVar) {
        this.f = eoscVar;
        this.g = dgwaVar;
        this.h = crmxVar;
        this.i = eblgVar;
        this.j = fcsuVar;
        this.k = dgznVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final dfvb w() throws IOException {
        dgzn dgznVar = this.k;
        Conversation conversationD = dfwf.d(dgznVar);
        dezn deznVar = this.l;
        deznVar.getClass();
        AutoValue_Conversation autoValue_Conversation = (AutoValue_Conversation) conversationD;
        String strA = autoValue_Conversation.a.a();
        String strB = ((Boolean) c.a()).booleanValue() ? (String) deznVar.a.flatMap(new Function() { // from class: dfrb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((dezi) obj).b;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(dgznVar.q) : deznVar.a.isPresent() ? ejwk.b((String) ((dezi) deznVar.a.get()).b.orElse(null)) : "";
        final efhq efhqVar = new efhq();
        efhqVar.d(autoValue_Conversation.b);
        efhqVar.b(strA);
        efhqVar.e(strB);
        deznVar.a.flatMap(new Function() { // from class: dfrc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((dezi) obj).c;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).ifPresent(new Consumer() { // from class: dfrd
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                RcsDestinationId rcsDestinationIdA;
                dfaf dfafVar = (dfaf) obj;
                dfny dfnyVar = dfrg.a;
                final efie efieVar = new efie();
                try {
                    String str = dfafVar.a;
                    if (str.startsWith("sip:")) {
                        efid efidVar = new efid();
                        efidVar.b(str);
                        efidVar.c(2);
                        rcsDestinationIdA = efidVar.a();
                    } else {
                        if (!str.startsWith("tel:")) {
                            throw new IllegalArgumentException("URI format not supported");
                        }
                        efid efidVar2 = new efid();
                        efidVar2.b(str.substring(4));
                        efidVar2.c(1);
                        rcsDestinationIdA = efidVar2.a();
                    }
                    efieVar.b(rcsDestinationIdA);
                } catch (IllegalArgumentException unused) {
                }
                efjc efjcVar = efhqVar;
                dfafVar.b.ifPresent(new Consumer() { // from class: efkw
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        efieVar.c(Instant.ofEpochMilli(((dhie) obj2).a));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                efjcVar.f(efieVar.a());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        dfak dfakVar = deznVar.d;
        int size = dfakVar.size();
        for (int i = 0; i < size; i++) {
            dfaj dfajVar = (dfaj) dfakVar.get(i);
            final efje efjeVarF = GroupMember.f();
            efjeVarF.b(ejwk.b(dfajVar.a));
            efjeVarF.c(dfwf.e(dfajVar.g));
            efjeVarF.f(dfajVar.b().filter(new Predicate() { // from class: dfai
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
                    dezv dezvVar = (dezv) obj;
                    if (dezvVar.c.equals(dezw.PENDING)) {
                        return true;
                    }
                    return ((Boolean) dezk.a.a()).booleanValue() && dezvVar.c.equals(dezw.DISCONNECTED) && dezvVar.f.equals(dezu.FAILED);
                }
            }).isPresent() ? efjf.PENDING : dfajVar.g() ? efjf.PRESENT : efjf.ABSENT);
            if (((Boolean) dfpg.a().a.b.a()).booleanValue()) {
                List list = dfajVar.f;
                (list.isEmpty() ? Optional.empty() : ((dezv) list.get(0)).b.map(new Function() { // from class: dfqx
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        dfny dfnyVar = dfrg.a;
                        return ((dezx) obj).d;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                })).ifPresent(new Consumer() { // from class: dfqy
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        dfny dfnyVar = dfrg.a;
                        efjeVarF.e(dfwf.e((String) obj));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            GroupMember groupMemberA = efjeVarF.a();
            if (efhqVar.a == null) {
                if (efhqVar.b == null) {
                    int i2 = ekgb.d;
                    efhqVar.a = new ekfw();
                } else {
                    int i3 = ekgb.d;
                    efhqVar.a = new ekfw();
                    efhqVar.a.j(efhqVar.b);
                    efhqVar.b = null;
                }
            }
            efhqVar.a.h(groupMemberA);
        }
        if (((Boolean) d.a()).booleanValue()) {
            ekhx ekhxVarAA = dgznVar.aA();
            Optional map = deznVar.a.map(new Function() { // from class: dfre
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((dezi) obj).e;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            efht efhtVar = new efht();
            efhtVar.d(false);
            efhtVar.c(false);
            efhtVar.b(false);
            efht efhtVar2 = new efht(efhtVar.a());
            if (map.isPresent()) {
                if (((String) map.get()).contains("rem-admin")) {
                    efhtVar2.b(true);
                } else if (((String) map.get()).contains("rem-all")) {
                    efhtVar2.c(true);
                }
            }
            efhtVar2.d(ekhxVarAA.contains(GroupManagementContentType.CONTENT_TYPE));
            efhqVar.c(efhtVar2.a());
        }
        dfuy dfuyVar = new dfuy();
        efhs efhsVar = new efhs();
        efhsVar.b(conversationD);
        efhsVar.d(efhqVar.a());
        dfuyVar.a = efhsVar.e();
        return dfuyVar.a();
    }

    private final Optional x(dezn deznVar, String str, byte[] bArr) throws XmlPullParserException, IOException {
        Optional optionalOf;
        if (((Boolean) a.a()).booleanValue()) {
            dezn deznVarA = dezj.a(bArr);
            if (dfae.DELETED.equals(deznVarA.h)) {
                dhja.c("Ignoring conference info with status deleted.", new Object[0]);
                optionalOf = Optional.empty();
            } else {
                optionalOf = Optional.of(dezj.b(Optional.ofNullable(deznVar), deznVarA, this.h));
            }
        } else {
            optionalOf = Optional.of(dezj.c(Optional.ofNullable(deznVar), str, bArr, this.h));
        }
        if (!dfpg.d()) {
            optionalOf.ifPresent(new Consumer() { // from class: dfqz
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((dezn) obj).c();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        return optionalOf;
    }

    private final void y(ListenableFuture listenableFuture) {
        eork.r(listenableFuture, new dfrf(), this.f);
    }

    private final void z() {
        if (dfpc.d() && this.k.bf()) {
            return;
        }
        dgzu dgzuVar = (dgzu) this.g.a(dgzu.class);
        dgzuVar.getClass();
        try {
            dgwm dgwmVar = this.m;
            if (dgwmVar != null) {
                dgwmVar.i(this);
                this.m = null;
            }
            dfys dfysVar = dgzuVar.a;
            eblg eblgVar = this.i;
            dgzn dgznVar = this.k;
            dgwm dgwmVar2 = new dgwm(dfysVar, eblgVar, dgznVar.I, "conference", dgzuVar.d, dgzuVar.e, dgzuVar.f);
            dgwmVar2.f = "application/conference-info+xml";
            if (dfog.E()) {
                dgwmVar2.j = (String[]) Collection.EL.toArray(dgznVar.X.d(), new IntFunction() { // from class: dfra
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i) {
                        dfny dfnyVar = dfrg.a;
                        return new String[i];
                    }
                });
            } else {
                dgwmVar2.j = dhjv.C(dgzuVar.x());
            }
            dgwmVar2.d(this);
            dgwmVar2.m();
            this.m = dgwmVar2;
        } catch (ebmn e2) {
            throw new IllegalStateException("Can't subscribe to conference event.", e2);
        }
    }

    @Override // defpackage.dgym, defpackage.dgzd
    public final void c(dgyx dgyxVar) {
        byte[] bArrI;
        Optional optionalX;
        if (dfpc.d()) {
            String str = dgyxVar.h;
            if ("message/cpim".equals(str)) {
                try {
                    efgz efgzVar = ((efgn) efhe.a(dgyxVar.f)).c;
                    str = (String) efgzVar.g().orElse(str);
                    bArrI = ((efgp) efgzVar).a.I();
                } catch (IOException e2) {
                    dhja.g("Can't parse CPIM message: %s", e2);
                    return;
                }
            } else {
                bArrI = dgyxVar.f;
            }
            if (e.contains(str)) {
                try {
                    optionalX = x(null, str, bArrI);
                } catch (dezm e3) {
                    dhja.i(e3, "Error while updating conference: %s", e3.getMessage());
                } catch (IOException e4) {
                    e = e4;
                    dhja.i(e, "Error while reading conference subscription: %s", e.getMessage());
                } catch (XmlPullParserException e5) {
                    e = e5;
                    dhja.i(e, "Error while reading conference subscription: %s", e.getMessage());
                }
                if (optionalX.isEmpty()) {
                    return;
                }
                this.l = (dezn) optionalX.get();
                y(((dfrs) ((eyig) this.j).a).a(w()));
            }
        }
    }

    @Override // defpackage.dgwo
    public final void d(dgwm dgwmVar, String str, byte[] bArr) {
        if (((Boolean) a.a()).booleanValue() && !dezj.d(str, bArr)) {
            dhja.g("Received invalid conference information contentType:{%s} content:{%s}", str, bArr);
            return;
        }
        if (((Boolean) b.a()).booleanValue()) {
            dgzn dgznVar = this.k;
            if (dgznVar.q() && dgznVar.aw().equals(dgwq.LEAVE)) {
                dhja.k("Received conference info after leaving.", new Object[0]);
                return;
            }
        }
        try {
            Optional optionalX = x(this.l, str, bArr);
            if (optionalX.isEmpty()) {
                return;
            }
            this.l = (dezn) optionalX.get();
            if (((Boolean) dfpk.a().b.t.a()).booleanValue()) {
                dezn deznVar = this.l;
                deznVar.getClass();
                dgzu dgzuVar = (dgzu) this.g.a(dgzu.class);
                dgzuVar.getClass();
                final String strE = dgzuVar.a.e();
                if (!TextUtils.isEmpty(strE)) {
                    Collection.EL.stream(deznVar.d).filter(new Predicate() { // from class: dfqv
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
                            return ((dfaj) obj).i;
                        }
                    }).forEach(new Consumer() { // from class: dfqw
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            dfaj dfajVar = (dfaj) obj;
                            dfny dfnyVar = dfrg.a;
                            String str2 = dfajVar.g;
                            String str3 = strE;
                            if (TextUtils.equals(str2, str3)) {
                                return;
                            }
                            dfajVar.g = str3;
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
            }
            y(((dfrs) ((eyig) this.j).a).a(w()));
        } catch (dezm e2) {
            dhja.i(e2, "Error while updating conference: %s", e2.getMessage());
            z();
        } catch (IOException e3) {
            e = e3;
            dhja.i(e, "Error while reading conference subscription: %s", e.getMessage());
        } catch (XmlPullParserException e4) {
            e = e4;
            dhja.i(e, "Error while reading conference subscription: %s", e.getMessage());
        }
    }

    @Override // defpackage.dgym, defpackage.dgwh
    public final void i() {
        z();
    }

    @Override // defpackage.dgym, defpackage.dgwh
    public final void k() {
        dgwm dgwmVar;
        if (!dfpk.w() || (dgwmVar = this.m) == null) {
            return;
        }
        dgwmVar.n();
    }

    @Override // defpackage.dgym, defpackage.dgwh
    public final void l(dhfu dhfuVar) {
        dgwm dgwmVar;
        if (!dfpk.w() || (dgwmVar = this.m) == null) {
            return;
        }
        dgwmVar.n();
    }

    @Override // defpackage.dgym, defpackage.dgwh
    public final void m() {
        dgwm dgwmVar;
        if (dfpk.w() && (dgwmVar = this.m) != null) {
            dgwmVar.n();
        }
        if (dfpg.n()) {
            dgzn dgznVar = this.k;
            if (dgznVar.aw() == dgwq.GONE) {
                dgzu dgzuVar = (dgzu) this.g.a(dgzu.class);
                dgzuVar.getClass();
                String strE = dgzuVar.a.e();
                efje efjeVarF = GroupMember.f();
                efjeVarF.b(strE);
                efjeVarF.c(dfwf.e(strE));
                efjeVarF.f(efjf.ABSENT);
                efjeVarF.d(true);
                String str = dgznVar.H;
                if (str != null) {
                    efjeVarF.e(dfwf.e(str));
                }
                dfuy dfuyVar = new dfuy();
                efhs efhsVar = new efhs();
                efhsVar.b(dfwf.d(dgznVar));
                efhp efhpVar = new efhp();
                GroupMember groupMemberA = efjeVarF.a();
                if (efhpVar.a == null) {
                    if (efhpVar.b == null) {
                        int i = ekgb.d;
                        efhpVar.a = new ekfw();
                    } else {
                        int i2 = ekgb.d;
                        efhpVar.a = new ekfw();
                        efhpVar.a.j(efhpVar.b);
                        efhpVar.b = null;
                    }
                }
                efhpVar.a.h(groupMemberA);
                efhsVar.c(efhpVar.a());
                dfuyVar.a = efhsVar.e();
                y(((dfrs) ((eyig) this.j).a).a(dfuyVar.a()));
            }
        }
    }

    @Override // defpackage.dgwo
    public final void t() {
    }

    @Override // defpackage.dgwo
    public final void u() {
    }

    @Override // defpackage.dgwo
    public final void r(dhft dhftVar) {
    }

    @Override // defpackage.dgwo
    public final void v(dhft dhftVar) {
    }

    @Override // defpackage.dgwo
    public final void q(int i, String str) {
    }
}
